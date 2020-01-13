package com.upms.service;

import com.upms.entity.Course;
import com.upms.entity.SClass;

import java.util.List;
import java.util.Map;

public interface CourseService {

    List<Course> findAll(Map<String, Object> map);

    int getCount(Map<String, Object> map);

    int getCountStuCourse(Map<String,Object> map);

    int addCourse(Map<String, Object> map);

    int updateCourse(Map<String, Object> map);

    int deletaCourse(String courseNo);

    int updateCoursePercent(Map<String, Object> map);

    List<Map<String,Object>> queryCourseList();

    List<Course> getCourseByTaecher(String teachNo);

    List<Course> getCourseByStuAndName(Map<String,Object> map);

    Course getCourseByNum(String courseNo);
}
