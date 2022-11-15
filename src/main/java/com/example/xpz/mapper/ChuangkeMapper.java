package com.example.xpz.mapper;

import com.example.xpz.entity.Chuangke;
import com.example.xpz.entity.ChuangkeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChuangkeMapper {
    long countByExample(ChuangkeExample example);

    int deleteByExample(ChuangkeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Chuangke record);

    int insertSelective(Chuangke record);

    List<Chuangke> selectByExample(ChuangkeExample example);

    Chuangke selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Chuangke record, @Param("example") ChuangkeExample example);

    int updateByExample(@Param("record") Chuangke record, @Param("example") ChuangkeExample example);

    int updateByPrimaryKeySelective(Chuangke record);

    int updateByPrimaryKey(Chuangke record);
}