package com.zhengyuan.liunao.mapper;

import com.zhengyuan.liunao.entity.SClass;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SClassMapper {

    /**
     * 列表查询
     * @param map
     * @return java.util.List<com.zhengyuan.liunao.entity.SClass>
     */
    List<SClass> findAll(Map<String, Object> map);

    /**
     * 查询总条数
     * @param
     * @return int
     */
    int getCount();

    int addSClass(Map<String, Object> map);

    /**
     *编辑班级信息
     * @param map
     * @return int
     */
    int updateSClass(Map<String, Object> map);

    /**
     * 删除班级
     * @param calssNo
     * @return int
     */
    int deleteSClass(String calssNo);
}
