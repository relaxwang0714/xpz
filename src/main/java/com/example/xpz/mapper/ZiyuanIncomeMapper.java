package com.example.xpz.mapper;

import com.example.xpz.entity.ZiyuanIncome;
import com.example.xpz.entity.ZiyuanIncomeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZiyuanIncomeMapper {
    long countByExample(ZiyuanIncomeExample example);

    int deleteByExample(ZiyuanIncomeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZiyuanIncome record);

    int insertSelective(ZiyuanIncome record);

    List<ZiyuanIncome> selectByExample(ZiyuanIncomeExample example);

    ZiyuanIncome selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZiyuanIncome record, @Param("example") ZiyuanIncomeExample example);

    int updateByExample(@Param("record") ZiyuanIncome record, @Param("example") ZiyuanIncomeExample example);

    int updateByPrimaryKeySelective(ZiyuanIncome record);

    int updateByPrimaryKey(ZiyuanIncome record);
}