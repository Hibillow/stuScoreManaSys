package com.upms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.upms.entity.Admin;

@Mapper
public interface AdminMapper {
	public List<Admin> findAdmin(String account, String psw);
}
