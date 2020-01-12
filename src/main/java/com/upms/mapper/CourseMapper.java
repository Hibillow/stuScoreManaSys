package com.upms.mapper;

import com.upms.entity.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @description 课程数据库操作层
 */
@Mapper
public interface CourseMapper {

    /**
     * 列表查询
     * @param map
     * @return java.util.List<SClass>
     */
    List<Course> findAll(Map<String, Object> map);

    /**
     * 查询总条数
     * @param
     * @return int
     */
    int getCount(Map<String, Object> map);

    int addCourse(Map<String, Object> map);

    /**
     *编辑班级信息
     * @param map
     * @return int
     */
    int updateCourse(Map<String, Object> map);

    /**
     * 删除班级
     * @param courseNos
     * @return int
     */
    int deleteCourse(String courseNos);

    /**
     * 设置课程成绩权重
     */
    int updateCoursePercent(Map<String, Object> map);

    List<Map<String,Object>> queryCourseList();

    List<Course> getCourseByTaecher(String teachNo);

    Course getCourseByNum(String courseNo);
}
