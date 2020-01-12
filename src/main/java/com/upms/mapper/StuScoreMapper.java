package com.upms.mapper;

import com.upms.entity.StuScore;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface StuScoreMapper {

    List<StuScore> getStuScoreList(Map<String, Object> map);

    int getCount(Map<String,Object> map);

    int addStuScore(Map<String, Object> map);

    int updateStuScore(Map<String, Object> map);

    int deleteStuScore(Map<String, Object> map);

    List<StuScore> getStuScoreByExcel(Map<String, Object> map);
}
