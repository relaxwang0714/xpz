package com.example.xpz.mapper;

import com.example.xpz.entity.DigitalInfrastructure;
import com.example.xpz.entity.DigitalInfrastructureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DigitalInfrastructureMapper {
    long countByExample(DigitalInfrastructureExample example);

    int deleteByExample(DigitalInfrastructureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DigitalInfrastructure record);

    int insertSelective(DigitalInfrastructure record);

    List<DigitalInfrastructure> selectByExample(DigitalInfrastructureExample example);

    DigitalInfrastructure selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DigitalInfrastructure record, @Param("example") DigitalInfrastructureExample example);

    int updateByExample(@Param("record") DigitalInfrastructure record, @Param("example") DigitalInfrastructureExample example);

    int updateByPrimaryKeySelective(DigitalInfrastructure record);

    int updateByPrimaryKey(DigitalInfrastructure record);
}