package com.example.xpz.mapper;

import com.example.xpz.entity.DigitalFactory;
import com.example.xpz.entity.DigitalFactoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DigitalFactoryMapper {
    long countByExample(DigitalFactoryExample example);

    int deleteByExample(DigitalFactoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DigitalFactory record);

    int insertSelective(DigitalFactory record);

    List<DigitalFactory> selectByExampleWithBLOBs(DigitalFactoryExample example);

    List<DigitalFactory> selectByExample(DigitalFactoryExample example);

    DigitalFactory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DigitalFactory record, @Param("example") DigitalFactoryExample example);

    int updateByExampleWithBLOBs(@Param("record") DigitalFactory record, @Param("example") DigitalFactoryExample example);

    int updateByExample(@Param("record") DigitalFactory record, @Param("example") DigitalFactoryExample example);

    int updateByPrimaryKeySelective(DigitalFactory record);

    int updateByPrimaryKeyWithBLOBs(DigitalFactory record);

    int updateByPrimaryKey(DigitalFactory record);
}