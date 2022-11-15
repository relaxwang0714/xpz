package com.example.xpz.mapper;

import com.example.xpz.entity.Agriculture;
import com.example.xpz.entity.AgricultureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgricultureMapper {
    long countByExample(AgricultureExample example);

    int deleteByExample(AgricultureExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Agriculture record);

    int insertSelective(Agriculture record);

    List<Agriculture> selectByExample(AgricultureExample example);

    Agriculture selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Agriculture record, @Param("example") AgricultureExample example);

    int updateByExample(@Param("record") Agriculture record, @Param("example") AgricultureExample example);

    int updateByPrimaryKeySelective(Agriculture record);

    int updateByPrimaryKey(Agriculture record);
}