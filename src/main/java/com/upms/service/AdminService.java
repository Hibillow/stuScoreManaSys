package com.upms.service;

import java.util.List;

import com.upms.entity.Admin;

public interface AdminService {
	public List<Admin> findAdmin(String account, String psw);
}
