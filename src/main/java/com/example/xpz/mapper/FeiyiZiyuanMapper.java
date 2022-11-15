package com.example.xpz.mapper;

import com.example.xpz.entity.FeiyiZiyuan;
import com.example.xpz.entity.FeiyiZiyuanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeiyiZiyuanMapper {
    long countByExample(FeiyiZiyuanExample example);

    int deleteByExample(FeiyiZiyuanExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FeiyiZiyuan record);

    int insertSelective(FeiyiZiyuan record);

    List<FeiyiZiyuan> selectByExample(FeiyiZiyuanExample example);

    FeiyiZiyuan selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FeiyiZiyuan record, @Param("example") FeiyiZiyuanExample example);

    int updateByExample(@Param("record") FeiyiZiyuan record, @Param("example") FeiyiZiyuanExample example);

    int updateByPrimaryKeySelective(FeiyiZiyuan record);

    int updateByPrimaryKey(FeiyiZiyuan record);
}