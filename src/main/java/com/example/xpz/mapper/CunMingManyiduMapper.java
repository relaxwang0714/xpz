package com.example.xpz.mapper;

import com.example.xpz.entity.CunMingManyidu;
import com.example.xpz.entity.CunMingManyiduExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CunMingManyiduMapper {
    long countByExample(CunMingManyiduExample example);

    int deleteByExample(CunMingManyiduExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CunMingManyidu record);

    int insertSelective(CunMingManyidu record);

    List<CunMingManyidu> selectByExample(CunMingManyiduExample example);

    CunMingManyidu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CunMingManyidu record, @Param("example") CunMingManyiduExample example);

    int updateByExample(@Param("record") CunMingManyidu record, @Param("example") CunMingManyiduExample example);

    int updateByPrimaryKeySelective(CunMingManyidu record);

    int updateByPrimaryKey(CunMingManyidu record);
}