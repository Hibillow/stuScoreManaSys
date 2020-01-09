package com.upms.service;

import com.upms.entity.SClass;

import java.util.List;
import java.util.Map;

public interface SClassService {
    List<SClass> findAll(Map<String, Object> map);

    int getCount();

    int addSClass(Map<String, Object> map);

    int updateSClass(Map<String, Object> map);

    int deletaSClass(String calssNo);

    List<Map<String, Object>> queryClassList(Map<String, Object> map);
}
