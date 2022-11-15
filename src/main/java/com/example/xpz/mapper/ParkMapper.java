package com.example.xpz.mapper;

import com.example.xpz.entity.Park;
import com.example.xpz.entity.ParkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParkMapper {
    long countByExample(ParkExample example);

    int deleteByExample(ParkExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Park record);

    int insertSelective(Park record);

    List<Park> selectByExampleWithBLOBs(ParkExample example);

    List<Park> selectByExample(ParkExample example);

    Park selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Park record, @Param("example") ParkExample example);

    int updateByExampleWithBLOBs(@Param("record") Park record, @Param("example") ParkExample example);

    int updateByExample(@Param("record") Park record, @Param("example") ParkExample example);

    int updateByPrimaryKeySelective(Park record);

    int updateByPrimaryKeyWithBLOBs(Park record);

    int updateByPrimaryKey(Park record);
}