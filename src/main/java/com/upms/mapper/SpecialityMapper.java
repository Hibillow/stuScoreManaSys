package com.upms.mapper;

import com.upms.entity.Speciality;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SpecialityMapper {

    int addSpeciality(Map<String, Object> map);

    List<Speciality> getSpecialityList(Map<String, Object> map);

    List<Map<String, Object>> querySpecialityList();

    int updateSpeciality(Map<String, Object> map);

    int deleteSpeciality(String specialityNo);

    int getCount(String name);
}
