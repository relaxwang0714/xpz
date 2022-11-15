package com.example.xpz.mapper;

import com.example.xpz.entity.LaodongliIncome;
import com.example.xpz.entity.LaodongliIncomeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LaodongliIncomeMapper {
    long countByExample(LaodongliIncomeExample example);

    int deleteByExample(LaodongliIncomeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LaodongliIncome record);

    int insertSelective(LaodongliIncome record);

    List<LaodongliIncome> selectByExample(LaodongliIncomeExample example);

    LaodongliIncome selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LaodongliIncome record, @Param("example") LaodongliIncomeExample example);

    int updateByExample(@Param("record") LaodongliIncome record, @Param("example") LaodongliIncomeExample example);

    int updateByPrimaryKeySelective(LaodongliIncome record);

    int updateByPrimaryKey(LaodongliIncome record);
}