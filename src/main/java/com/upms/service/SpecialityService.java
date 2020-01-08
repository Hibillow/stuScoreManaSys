package com.upms.service;

import com.upms.entity.Speciality;

import java.util.List;
import java.util.Map;

public interface SpecialityService {

    int addSpeciality(Map<String, Object> map);

    List<Speciality> getSpecialityList(Map<String, Object> map);

    List<Map<String, Object>> querySpecialityList();

    int updateSpeciality(Map<String, Object> map);

    int deleteSpeciality(String specialityNo);

    int getCount();
}
