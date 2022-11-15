package com.example.xpz.mapper;

import com.example.xpz.entity.ChanyeJianshe;
import com.example.xpz.entity.ChanyeJiansheExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChanyeJiansheMapper {
    long countByExample(ChanyeJiansheExample example);

    int deleteByExample(ChanyeJiansheExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ChanyeJianshe record);

    int insertSelective(ChanyeJianshe record);

    List<ChanyeJianshe> selectByExample(ChanyeJiansheExample example);

    ChanyeJianshe selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ChanyeJianshe record, @Param("example") ChanyeJiansheExample example);

    int updateByExample(@Param("record") ChanyeJianshe record, @Param("example") ChanyeJiansheExample example);

    int updateByPrimaryKeySelective(ChanyeJianshe record);

    int updateByPrimaryKey(ChanyeJianshe record);
}