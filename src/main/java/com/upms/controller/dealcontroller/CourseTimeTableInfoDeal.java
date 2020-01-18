package com.upms.controller.dealcontroller;

import cn.hutool.core.map.MapUtil;
import com.alibaba.fastjson.JSON;
import com.upms.service.CourseTimeTableService;
import com.upms.tools.ExcelUtil;
import org.apache.commons.io.FilenameUtils;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * @description 课程表
 */
@RestController
@RequestMapping("/Sys/CourseTimeTableInfoDeal")
public class CourseTimeTableInfoDeal {

    @Autowired
    CourseTimeTableService courseTimeTableService;

    @RequestMapping("/addCourseTimeTable")
    public Map<String, Object> addCourseTimeTable(HttpServletRequest request, @RequestParam("file") MultipartFile file){
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("status", 0);
        if(file == null){
            resultMap.put("msg", "无文件");
            return resultMap;
        }
        String classNo = request.getParameter("classNo");
        String courseYear = request.getParameter("courseYear");
        int semester = Integer.valueOf(request.getParameter("semester"));
        String filename = file.getOriginalFilename();
        String ext = FilenameUtils.getExtension(filename);
        if(!ext.equals("xls") && !ext.equals("xlsx")){
            resultMap.put("msg","文件格式不正确");
            return  resultMap;
        }
        try {
            Map<String, Object> excelMap = ExcelUtil.excel2json(file);
            List<Map<String, Object>> maps = JSON.parseObject(excelMap.get("Sheet1").toString(),List.class);
            for (Map<String, Object> map : maps) {
                int jieci = MapUtil.getInt(map,"节次");
                int weekDay = 1;
                String content = null;
                if(!Strings.isBlank(MapUtil.getStr(map,"星期一"))){
                    weekDay = 1;
                    content = MapUtil.getStr(map,"星期一");
                }else if(!Strings.isBlank(MapUtil.getStr(map,"星期二"))){
                    weekDay = 2;
                    content = MapUtil.getStr(map,"星期二");
                }else if(!Strings.isBlank(MapUtil.getStr(map,"星期三"))){
                    weekDay = 3;
                    content = MapUtil.getStr(map,"星期三");
                }else if(!Strings.isBlank(MapUtil.getStr(map,"星期四"))){
                    weekDay = 4;
                    content = MapUtil.getStr(map,"星期四");
                }else if(!Strings.isBlank(MapUtil.getStr(map,"星期五"))){
                    weekDay = 5;
                    content = MapUtil.getStr(map,"星期五");
                }else if(!Strings.isBlank(MapUtil.getStr(map,"星期六"))){
                    weekDay = 6;
                    content = MapUtil.getStr(map,"星期六");
                }else if(!Strings.isBlank(MapUtil.getStr(map,"星期天"))){
                    weekDay = 7;
                    content = MapUtil.getStr(map,"星期天");
                }
                String courseNo = null;
                String teachNo = null;
                String address = null;
                if(!Strings.isBlank(content)){
                    String[] arr = content.split(";");
                    courseNo = arr[0];
                    teachNo = arr[1];
                    address = arr[2];
                }
                map.put("jieci",jieci);
                map.put("weekDay",weekDay);
                map.put("courseNo",courseNo);
                map.put("courseYear",courseYear);
                map.put("teachNo",teachNo);
                map.put("address",address);
                map.put("semester",semester);
                map.put("classNo",classNo);
            }
            System.out.println(JSON.toJSON(excelMap));
            if(courseTimeTableService.addCourseTimeTable(maps) > 0){
                resultMap.put("status",1);
                return resultMap;
            }
            return resultMap;
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
