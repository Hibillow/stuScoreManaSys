package com.upms.controller.dealcontroller;

import cn.hutool.core.map.MapUtil;
import com.alibaba.fastjson.JSON;
import com.upms.entity.Course;
import com.upms.entity.StuScore;
import com.upms.service.CourseService;
import com.upms.service.StuScoreService;
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

@RestController
@RequestMapping("/Sys/StuScoreDeal")
public class StuScoreDeal {

    @Autowired
    StuScoreService stuScoreService;

    @Autowired
    CourseService courseService;

    @RequestMapping("/getStuScoreList")
    public Object getStuScoreList(@RequestParam("limit") String limit, @RequestParam("page") String page
            , @RequestParam("sclass") String classNo, @RequestParam("course") String courseNo, @RequestParam("stu") String stuno){
        int lim = Integer.parseInt(limit);
        int start = (Integer.parseInt(page) - 1) * lim;
        Map<String, Object> map = new HashMap<>();
        map.put("start", start);
        map.put("pagesize", lim);
        map.put("classNo",classNo);
        map.put("courseNo",courseNo);
        map.put("stuno",stuno);
        List<StuScore> courseList = stuScoreService.getStuScoreList(map);
        int total = stuScoreService.getCount(map);
        Layui layui = Layui.data(total,courseList);
        return layui;
    }

    @RequestMapping("/addStuScore")
    public Map<String, Object> addStuScore(@RequestBody Map<String,Object> map){
        String courseNo = MapUtil.getStr(map,"courseNo");
        float attendance = MapUtil.getFloat(map,"attendance");
        float work = MapUtil.getFloat(map,"work");
        float experiment = MapUtil.getFloat(map,"experiment");
        float other = MapUtil.getFloat(map,"other");
        //获取课程权重
        Course course = courseService.getCourseByNum(courseNo);
        //计算成绩
        float score = course.getAttendancePercent()/100*attendance+course.getWorkPercent()/100*work+course.getExperimentPercent()/100*experiment+course.getOtherPercent()/100*other;
        map.put("score",score);
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("status",0);
        if(stuScoreService.addStuScore(map) > 0){
            resultMap.put("status",1);
            return resultMap;
        }else{
            resultMap.put("msg","录入失败");
            return resultMap;
        }
    }

    @RequestMapping("/updateStuScore")
    public Map<String,Object> updateStuScore(@RequestBody Map<String,Object> map){
        String courseNo = MapUtil.getStr(map,"courseNo");
        float attendance = MapUtil.getFloat(map,"attendance");
        float work = MapUtil.getFloat(map,"work");
        float experiment = MapUtil.getFloat(map,"experiment");
        float other = MapUtil.getFloat(map,"other");
        //获取课程权重
        Course course = courseService.getCourseByNum(courseNo);
        //计算成绩
        float score = course.getAttendancePercent()/100*attendance+course.getWorkPercent()/100*work+course.getExperimentPercent()/100*experiment+course.getOtherPercent()/100*other;
        map.put("score",score);
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("status",0);
        if(stuScoreService.updateStuScore(map) > 0){
            resultMap.put("status",1);
            return resultMap;
        }else{
            resultMap.put("msg","修改失败");
            return resultMap;
        }
    }

    @RequestMapping("/deleteStuScore")
    public Map<String,Object> deleteStuScore(@RequestBody Map<String,Object> map){
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("status",0);
        if(stuScoreService.deleteStuScore(map) > 0){
            resultMap.put("status",1);
            return resultMap;
        }else{
            resultMap.put("msg","删除失败");
            return resultMap;
        }
    }

    @RequestMapping("/getStuScoreByExcel")
    public List<StuScore> getStuScoreByExcel(@RequestBody Map<String,Object> map){
        return stuScoreService.getStuScoreByExcel(map);
    }
}
