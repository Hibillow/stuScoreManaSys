package com.upms.controller.dealcontroller;

import com.alibaba.fastjson.JSON;
import com.upms.entity.Course;
import com.upms.service.CourseService;
import com.upms.tools.Layui;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description课程信息
 */
@RestController
@RequestMapping("/Sys/CourseDeal")
public class CourseInfoDeal {

    @Autowired
    CourseService courseService;

    @RequestMapping("/addCourse")
    public String addCourse(@RequestBody Map map){
        if(courseService.addCourse(map) > 0){
            return "success";
        }else {
            return "failure";
        }
    }

    @RequestMapping("/updateCourse")
    public String updateCourse(@RequestBody Map map){
        if(courseService.updateCourse(map) > 0){
            return "success";
        }else {
            return "failure";
        }
    }

    @RequestMapping("/getCourseInfoList")
    public Object getCourseInfoList(@RequestParam("limit") String limit, @RequestParam("page") String page, String queryJson){
        int lim = Integer.parseInt(limit);
        int start = (Integer.parseInt(page) - 1) * lim;
        Map<String, Object> map = new HashMap<>();
        map.put("start", start);
        map.put("pagesize", lim);
        if(!Strings.isBlank(queryJson)){
            Map<String, Object> queryMap = JSON.parseObject(queryJson, Map.class);
            for (Map.Entry<String, Object> entry : queryMap.entrySet()) {
                map.put(entry.getKey(),entry.getValue());
            }
        }
        List<Course> courseList = courseService.findAll(map);
        int total = courseService.getCount(map);
        Layui layui = Layui.data(total,courseList);
        return layui;
    }

    @RequestMapping("/deleteCourse")
    public String deleteCourse(String courseNos){
        if(courseService.deletaCourse(courseNos) > 0){
            return "success";
        }else {
            return "failure";
        }
    }

    @RequestMapping("/updateCoursePercent")
    public String updateCoursePercent(@RequestBody Map map){
        if(courseService.updateCoursePercent(map) > 0){
            return "success";
        }else {
            return "failure";
        }
    }
}
