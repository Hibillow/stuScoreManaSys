package com.upms.service;


import com.upms.entity.CourseTimeTable;

import java.util.List;
import java.util.Map;

public interface CourseTimeTableService {

    List<CourseTimeTable> getCourseTimeTableList(Map<String, Object> map);

    int addCourseTimeTable(List<Map<String,Object>> mapList);
}
