package com.upms.service;

import com.upms.entity.StuScore;

import java.util.List;
import java.util.Map;

/**
 * 成绩管理类
 */
public interface StuScoreService {

   List<StuScore> getStuScoreList(Map<String, Object> map);

   int addStuScore(Map<String, Object> map);

   int updateStuScore(Map<String, Object> map);
}
