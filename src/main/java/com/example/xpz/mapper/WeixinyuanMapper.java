package com.example.xpz.mapper;

import com.example.xpz.entity.Weixinyuan;
import com.example.xpz.entity.WeixinyuanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeixinyuanMapper {
    long countByExample(WeixinyuanExample example);

    int deleteByExample(WeixinyuanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Weixinyuan record);

    int insertSelective(Weixinyuan record);

    List<Weixinyuan> selectByExample(WeixinyuanExample example);

    Weixinyuan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Weixinyuan record, @Param("example") WeixinyuanExample example);

    int updateByExample(@Param("record") Weixinyuan record, @Param("example") WeixinyuanExample example);

    int updateByPrimaryKeySelective(Weixinyuan record);

    int updateByPrimaryKey(Weixinyuan record);
}