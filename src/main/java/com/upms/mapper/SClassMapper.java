package com.upms.mapper;

import com.upms.entity.SClass;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SClassMapper {

    /**
     * 列表查询
     * @param map
     * @return java.util.List<SClass>
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

    List<Map<String, Object>> queryClassList(Map<String, Object> map);
}
