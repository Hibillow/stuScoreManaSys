package com.upms.mapper;

import com.upms.entity.CourseTimeTable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 */
@Mapper
public interface CourseTimeTableMapper {

    List<CourseTimeTable> getCourseTimeTableList(Map<String, Object> map);

    int addCourseTimeTable(@Param("mapList") List<Map<String,Object>> mapList);

    int deleteCourseTimeTable(String classNo,String courseYear);

    List<Map<String, Object>> queryCourseYearList(@Param("classNo") String classNo);
}
