package com.zhengyuan.liunao.service;

import com.zhengyuan.liunao.entity.SClass;

import java.util.List;
import java.util.Map;

public interface SClassService {
    List<SClass> findAll(Map<String, Object> map);

    int getCount();

    int addSClass(Map<String, Object> map);

    int updateSClass(Map<String, Object> map);

    int deletaSClass(String calssNo);
}
