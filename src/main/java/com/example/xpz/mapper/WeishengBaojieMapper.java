package com.example.xpz.mapper;

import com.example.xpz.entity.WeishengBaojie;
import com.example.xpz.entity.WeishengBaojieExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeishengBaojieMapper {
    long countByExample(WeishengBaojieExample example);

    int deleteByExample(WeishengBaojieExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WeishengBaojie record);

    int insertSelective(WeishengBaojie record);

    List<WeishengBaojie> selectByExampleWithBLOBs(WeishengBaojieExample example);

    List<WeishengBaojie> selectByExample(WeishengBaojieExample example);

    WeishengBaojie selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WeishengBaojie record, @Param("example") WeishengBaojieExample example);

    int updateByExampleWithBLOBs(@Param("record") WeishengBaojie record, @Param("example") WeishengBaojieExample example);

    int updateByExample(@Param("record") WeishengBaojie record, @Param("example") WeishengBaojieExample example);

    int updateByPrimaryKeySelective(WeishengBaojie record);

    int updateByPrimaryKeyWithBLOBs(WeishengBaojie record);

    int updateByPrimaryKey(WeishengBaojie record);
}