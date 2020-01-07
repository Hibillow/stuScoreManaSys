package com.zhengyuan.liunao.service.impl;

import com.zhengyuan.liunao.entity.SClass;
import com.zhengyuan.liunao.mapper.SClassMapper;
import com.zhengyuan.liunao.service.SClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SClassServiceImpl implements SClassService {

    @Autowired
    SClassMapper sClassMapper;

    @Override
    public List<SClass> findAll(Map<String, Object> map) {
        return sClassMapper.findAll(map);
    }

    @Override
    public int getCount() {
        return sClassMapper.getCount();
    }

    @Override
    public int addSClass(Map<String, Object> map) {
        return sClassMapper.addSClass(map);
    }

    @Override
    public int updateSClass(Map<String, Object> map) {
        return sClassMapper.updateSClass(map);
    }

    @Override
    public int deletaSClass(String classNo) {
        return deletaSClass(classNo);
    }
}
