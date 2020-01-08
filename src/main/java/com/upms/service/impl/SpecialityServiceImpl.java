package com.upms.service.impl;

import com.upms.entity.Speciality;
import com.upms.mapper.SpecialityMapper;
import com.upms.service.SpecialityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SpecialityServiceImpl implements SpecialityService {

    @Autowired
    SpecialityMapper specialityMapper;

    @Override
    public int addSpeciality(Map<String, Object> map) {
        return specialityMapper.addSpeciality(map);
    }

    @Override
    public List<Speciality> getSpecialityList(Map<String, Object> map) {
        return specialityMapper.getSpecialityList(map);
    }

    @Override
    public List<Map<String, Object>> querySpecialityList() {
        return specialityMapper.querySpecialityList();
    }

    @Override
    public int updateSpeciality(Map<String, Object> map) {
        return specialityMapper.updateSpeciality(map);
    }

    @Override
    public int deleteSpeciality(String specialityNo) {
        return deleteSpeciality(specialityNo);
    }

    @Override
    public int getCount() {
        return specialityMapper.getCount();
    }
}
