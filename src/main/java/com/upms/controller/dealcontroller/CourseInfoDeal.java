package com.upms.controller.dealcontroller;

import cn.hutool.core.map.MapUtil;
import com.alibaba.fastjson.JSON;
import com.upms.entity.Course;
import com.upms.service.CourseService;
import com.upms.tools.Layui;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Map<String, Object> updateCoursePercent(@RequestBody Map map){
        int attendancePercent = MapUtil.getInt(map,"attendancePercent");
        int workPercent = MapUtil.getInt(map,"workPercent");
        int experimentPercent = MapUtil.getInt(map,"experimentPercent");
        int otherPercent = MapUtil.getInt(map,"otherPercent");
        int all = attendancePercent + workPercent + experimentPercent + otherPercent;
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("status", 0);
        if(all != 100){
            resultMap.put("msg", "权重相加不等于100");
            return resultMap;
        }
        if(courseService.updateCoursePercent(map) > 0){
            resultMap.put("status", 1);
            return resultMap;
        }else {
            resultMap.put("msg", "设置失败");
            return resultMap;
        }
    }

    @RequestMapping("/queryCourseList")
    public Object queryCourseList(){
        return courseService.queryCourseList();
    }

    @RequestMapping("/getCourseByTaecher")
    @ResponseBody
    public Object getCourseByTaecher(String teachNo){
        List<Course> courseList = courseService.getCourseByTaecher(teachNo);
        Map<String,Object> map = new HashMap<>();
        int total = courseService.getCount(map);
        Layui layui = Layui.data(total,courseList);
        return layui;
    }
}
