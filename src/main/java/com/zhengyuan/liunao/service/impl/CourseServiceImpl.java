package com.zhengyuan.liunao.service.impl;

import com.zhengyuan.liunao.entity.SClass;
import com.zhengyuan.liunao.mapper.CourseMapper;
import com.zhengyuan.liunao.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseMapper courseMapper;

    @Override
    public List<SClass> findAll(Map<String, Object> map) {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public int addCourse(Map<String, Object> map) {
        return 0;
    }

    @Override
    public int updateCourse(Map<String, Object> map) {
        return 0;
    }

    @Override
    public int deletaCourse(String courseNo) {
        return 0;
    }
}
