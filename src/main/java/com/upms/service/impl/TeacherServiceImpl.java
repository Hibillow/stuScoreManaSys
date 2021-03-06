package com.upms.service.impl;

import java.util.List;
import java.util.Map;

import com.upms.entity.Teacher;
import com.upms.mapper.TeacherMapper;
import com.upms.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {

	
	@Autowired
    TeacherMapper teacherMapper;
	
	@Override
	public List<Teacher> findTeacher(String teachno, String psw) {
		// TODO Auto-generated method stub
		return teacherMapper.findTeacher(teachno, psw);
	}

	@Override
	public int addTeacher(Map map) {
		// TODO Auto-generated method stub
		return teacherMapper.addTeacher(map);
	}
	
	@Override
	public List<Teacher> findAllTeacher(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return teacherMapper.findAllTeacher(map);
	}

	@Override
	public List<Teacher> findTeacherByName(String name, int start, int pagesize) {
		// TODO Auto-generated method stub
		return teacherMapper.findTeacherByName(name, start, pagesize);
	}

	@Override
	public int teacherCount() {
		// TODO Auto-generated method stub
		return teacherMapper.teacherCount();
	}

	@Override
	public List<Teacher> findTeacherByNum(String num) {
		// TODO Auto-generated method stub
		return teacherMapper.findTeacherByNum(num);
	}

	@Override
	public int updateTea(Map map) {
		// TODO Auto-generated method stub
		return teacherMapper.updateTea(map);
	}

	@Override
	public int deleteTeacherByNum(String num) {
		return teacherMapper.deleteTeacherByNum(num);
	}

	@Override
	public List<Map<String, Object>> queryTeacherList() {
		return teacherMapper.queryTeacherList();
	}


}
