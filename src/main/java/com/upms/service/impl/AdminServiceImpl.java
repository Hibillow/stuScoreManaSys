package com.upms.service.impl;

import java.util.List;

import com.upms.entity.Admin;
import com.upms.mapper.AdminMapper;
import com.upms.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
    AdminMapper adminMapper;

	@Override
	public List<Admin> findAdmin(String account, String psw) {
		// TODO Auto-generated method stub
		return adminMapper.findAdmin(account, psw);
	}

}
