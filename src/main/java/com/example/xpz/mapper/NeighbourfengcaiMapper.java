package com.example.xpz.mapper;

import com.example.xpz.entity.Neighbourfengcai;
import com.example.xpz.entity.NeighbourfengcaiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NeighbourfengcaiMapper {
    long countByExample(NeighbourfengcaiExample example);

    int deleteByExample(NeighbourfengcaiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Neighbourfengcai record);

    int insertSelective(Neighbourfengcai record);

    List<Neighbourfengcai> selectByExample(NeighbourfengcaiExample example);

    Neighbourfengcai selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Neighbourfengcai record, @Param("example") NeighbourfengcaiExample example);

    int updateByExample(@Param("record") Neighbourfengcai record, @Param("example") NeighbourfengcaiExample example);

    int updateByPrimaryKeySelective(Neighbourfengcai record);

    int updateByPrimaryKey(Neighbourfengcai record);
}