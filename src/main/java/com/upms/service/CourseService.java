package com.upms.service;

import com.upms.entity.SClass;

import java.util.List;
import java.util.Map;

public interface CourseService {

    List<SClass> findAll(Map<String, Object> map);

    int getCount();

    int addCourse(Map<String, Object> map);

    int updateCourse(Map<String, Object> map);

    int deletaCourse(String courseNo);

}
