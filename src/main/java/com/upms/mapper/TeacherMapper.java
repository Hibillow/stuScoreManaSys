package com.upms.mapper;

import java.util.List;
import java.util.Map;

import com.upms.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeacherMapper {
	public List<Teacher> findTeacher(String teachno, String psw);
	public int addTeacher(Map map);

	public List<Teacher> findAllTeacher(Map<String, Object> map);

	public List<Teacher> findTeacherByName(String name, int start, int pagesize);

	public int teacherCount();
	
	public List<Teacher> findTeacherByNum(String num);

	public int updateTea(Map map);

	int deleteTeacherByNum(String num);

	List<Map<String, Object>> queryTeacherList();
}
