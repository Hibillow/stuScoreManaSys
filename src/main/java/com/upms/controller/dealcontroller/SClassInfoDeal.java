package com.upms.controller.dealcontroller;

import com.upms.tools.Layui;
import com.upms.entity.SClass;
import com.upms.service.SClassService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description 班级信息类
 */
@RestController
@RequestMapping(value = "Sys")
@Api("SClassInfoDeal相关api")
@Slf4j
public class SClassInfoDeal {

    @Autowired
    SClassService sclassService;

    /**
     * 获取班级列表
     * @param limit
     * @param page
     * @return java.lang.Object
     */
    @RequestMapping(value = "/SClass/getSClassInfo")
    public Object getSClassInfo(@RequestParam("limit") String limit, @RequestParam("page") String page){
        int lim = Integer.parseInt(limit);
        int start = (Integer.parseInt(page) - 1) * lim;
        Map<String, Object> map = new HashMap<>();
        map.put("start", start);
        map.put("pagesize", lim);
        List<SClass> sClassList = sclassService.findAll(map);
        int total = sclassService.getCount();
        Layui layui = Layui.data(total,sClassList);
        return layui;
    }

    @RequestMapping(value = "/SClass/addSClass")
    public String addSClass(@RequestBody Map map){
        if(sclassService.addSClass(map) > 0){
            return "success";
        }else{
            return "failure";
        }
    }

    @RequestMapping(value = "/SClass/updateSClass")
    public String updateSClass(@RequestBody Map map){
        if(sclassService.updateSClass(map) > 0){
            return "success";
        }else{
            return "failure";
        }
    }

    @RequestMapping(value = "/SClass/delteSClass")
    public String delteSClass(String calssNo){
        if(sclassService.deletaSClass(calssNo) > 0){
            return "success";
        }else{
            return "failure";
        }
    }
}
