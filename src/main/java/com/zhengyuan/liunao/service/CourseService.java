package com.zhengyuan.liunao.service;

import com.zhengyuan.liunao.entity.SClass;

import java.util.List;
import java.util.Map;

public interface CourseService {

    List<SClass> findAll(Map<String, Object> map);

    int getCount();

    int addCourse(Map<String, Object> map);

    int updateCourse(Map<String, Object> map);

    int deletaCourse(String courseNo);

}
