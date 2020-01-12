package com.upms.service.impl;

import com.upms.entity.StuScore;
import com.upms.mapper.StuScoreMapper;
import com.upms.service.StuScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StuScoreServiceImpl implements StuScoreService {

    @Autowired
    StuScoreMapper stuScoreMapper;

    @Override
    public List<StuScore> getStuScoreList(Map<String, Object> map) {
        return stuScoreMapper.getStuScoreList(map);
    }

    @Override
    public int getCount(Map<String, Object> map) {
        return stuScoreMapper.getCount(map);
    }

    @Override
    public int addStuScore(Map<String, Object> map) {
        return stuScoreMapper.addStuScore(map);
    }

    @Override
    public int updateStuScore(Map<String, Object> map) {
        return stuScoreMapper.updateStuScore(map);
    }

    @Override
    public int deleteStuScore(Map<String, Object> map) {
        return stuScoreMapper.deleteStuScore(map);
    }

    @Override
    public List<StuScore> getStuScoreByExcel(Map<String, Object> map) {
        return stuScoreMapper.getStuScoreByExcel(map);
    }
}
