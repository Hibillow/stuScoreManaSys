package com.upms.service.impl;

import com.upms.entity.CourseTimeTable;
import com.upms.mapper.CourseTimeTableMapper;
import com.upms.service.CourseTimeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 */

@Service
public class CourseTimeTableServiceImpl implements CourseTimeTableService {

    @Autowired
    CourseTimeTableMapper courseTimeTableMapper;
    @Override
    public List<CourseTimeTable> getCourseTimeTableList(Map<String, Object> map) {
        return courseTimeTableMapper.getCourseTimeTableList(map);
    }

    @Override
    public int addCourseTimeTable(List<Map<String,Object>> mapList) {
        return courseTimeTableMapper.addCourseTimeTable(mapList);
    }

    @Override
    public int deleteCourseTimeTable(String classNo, String courseYear) {
        return courseTimeTableMapper.deleteCourseTimeTable(classNo,courseYear);
    }

    @Override
    public List<Map<String, Object>> queryCourseYearList(String classNo) {
        return courseTimeTableMapper.queryCourseYearList(classNo);
    }
}
