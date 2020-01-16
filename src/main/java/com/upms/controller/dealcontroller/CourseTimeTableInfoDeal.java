package com.upms.controller.dealcontroller;

import com.alibaba.fastjson.JSON;
import com.upms.tools.ExcelUtil;
import org.apache.commons.io.FilenameUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @description 课程表
 */
@RestController
@RequestMapping("/CourseTimeTableInfoDeal")
public class CourseTimeTableInfoDeal {

    @RequestMapping("/addCourseTimeTable")
    public Map<String, Object> addCourseTimeTable(HttpServletRequest request, @RequestParam("file") MultipartFile file){
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("status", 0);
        if(file == null){
            resultMap.put("msg", "无文件");
            return resultMap;
        }
        String courseNo = request.getParameter("courseNo");
        String courseYear = request.getParameter("courseYear");
        int semester = Integer.valueOf(request.getParameter("semester"));
        String filename = UUID.randomUUID().toString().replaceAll("-","");
        String ext = FilenameUtils.getExtension(file.getOriginalFilename());
        String path = request.getServletContext().getRealPath("/excelFile");
        if(!filename.contains(".xls") && !filename.contains(".xlsx")){
            resultMap.put("msg","文件格式不正确");
            return  resultMap;
        }
        File uploadFile = new File(path,filename);
        try {
            file.transferTo(uploadFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            LinkedHashMap<String, String> excelJson = ExcelUtil.excel2json(file);
            System.out.println(JSON.toJSON(excelJson));
        } catch (IOException e) {
            e.printStackTrace();
        }
        resultMap.put("status",1);
        return resultMap;
    }

    @RequestMapping("/getCourseTimeTableList")
    public Object getCourseTimeTableList(@RequestBody  Map<String, Object> map){

        return null;
    }
}
