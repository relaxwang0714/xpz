package com.example.xpz.mapper;

import com.example.xpz.entity.DangyuanFengcai;
import com.example.xpz.entity.DangyuanFengcaiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DangyuanFengcaiMapper {
    long countByExample(DangyuanFengcaiExample example);

    int deleteByExample(DangyuanFengcaiExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DangyuanFengcai record);

    int insertSelective(DangyuanFengcai record);

    List<DangyuanFengcai> selectByExample(DangyuanFengcaiExample example);

    DangyuanFengcai selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DangyuanFengcai record, @Param("example") DangyuanFengcaiExample example);

    int updateByExample(@Param("record") DangyuanFengcai record, @Param("example") DangyuanFengcaiExample example);

    int updateByPrimaryKeySelective(DangyuanFengcai record);

    int updateByPrimaryKey(DangyuanFengcai record);
}