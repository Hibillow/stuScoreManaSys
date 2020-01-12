package com.upms.service;

import java.util.List;
import java.util.Map;

import com.upms.entity.Scores;
import com.upms.entity.Stu;

public interface StuService {
	public List<Stu> findStu(String stuno, String psw);
	public int addStu(Map map);
	public List<Stu> findAllStu(Map<String, Object> map);

	public List<Stu> findAll();

	public List<Stu> findStuByName(String name, int start, int pagesize);

	public int stuCount();

	public List<Stu> echartStu();

	public int deleteByForeach(List<String> stuNO);

	public int deleteStu(String stuNo);

	public List<Stu> getStuByNum(String num);

	public int updateStu(Map maps);
	
	public List<Scores> getScoreByStuName(String name);

	List<Map<String,Object>> queryStuList();

	List<Stu> getStuByClass(String sclass);
}
