package com.upms.service.impl;

import com.upms.entity.SClass;
import com.upms.mapper.SClassMapper;
import com.upms.service.SClassService;
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

    @Override
    public List<Map<String, Object>> queryClassList(Map<String, Object> map) {
        return sClassMapper.queryClassList(map);
    }
}
