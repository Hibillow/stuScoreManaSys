package com.upms.service.impl;

import cn.hutool.core.map.MapUtil;
import com.upms.entity.Course;
import com.upms.entity.SClass;
import com.upms.mapper.CourseMapper;
import com.upms.service.CourseService;
import com.upms.tools.MyTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseMapper courseMapper;

    @Override
    public List<Course> findAll(Map<String, Object> map) {
        return courseMapper.findAll(map);
    }

    @Override
    public int getCount(Map<String, Object> map) {
        return courseMapper.getCount(map);
    }

    @Override
    public int addCourse(Map<String, Object> map) {
        return courseMapper.addCourse(map);
    }

    @Override
    public int updateCourse(Map<String, Object> map) {
        return courseMapper.updateCourse(map);
    }

    @Override
    public int deletaCourse(String courseNo) {
        List<String> courseNoList = Arrays.asList(courseNo.split(","));
        String courseNos = MyTool.list2SqlStr(courseNoList);
        return courseMapper.deleteCourse(courseNos);
    }

    @Override
    public int updateCoursePercent(Map<String, Object> map) {
        return courseMapper.updateCoursePercent(map);
    }

    @Override
    public List<Map<String, Object>> queryCourseList() {
        return courseMapper.queryCourseList();
    }

    @Override
    public List<Course> getCourseByTaecher(String teachNo) {
        return courseMapper.getCourseByTaecher(teachNo);
    }

    @Override
    public Course getCourseByNum(String courseNo) {
        return courseMapper.getCourseByNum(courseNo);
    }
}
