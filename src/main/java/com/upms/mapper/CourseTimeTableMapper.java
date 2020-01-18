package com.upms.mapper;

import com.upms.entity.CourseTimeTable;

import java.util.List;
import java.util.Map;

/**
 */
public interface CourseTimeTableMapper {

    List<CourseTimeTable> getCourseTimeTableList(Map<String, Object> map);

    int addCourseTimeTable(List<Map<String,Object>> mapList);
}
