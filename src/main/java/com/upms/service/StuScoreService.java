package com.upms.service;

import com.upms.entity.StuScore;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 成绩管理类
 */
@Service
public interface StuScoreService {

   List<StuScore> getStuScoreList(Map<String, Object> map);

   int getCount(Map<String,Object> map);

   int addStuScore(Map<String, Object> map);

   int updateStuScore(Map<String, Object> map);

   int deleteStuScore(Map<String, Object> map);

   List<StuScore> getStuScoreByExcel(Map<String, Object> map);
}
