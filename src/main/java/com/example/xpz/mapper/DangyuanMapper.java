package com.example.xpz.mapper;

import com.example.xpz.entity.Dangyuan;
import com.example.xpz.entity.DangyuanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DangyuanMapper {
    long countByExample(DangyuanExample example);

    int deleteByExample(DangyuanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dangyuan record);

    int insertSelective(Dangyuan record);

    List<Dangyuan> selectByExample(DangyuanExample example);

    Dangyuan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dangyuan record, @Param("example") DangyuanExample example);

    int updateByExample(@Param("record") Dangyuan record, @Param("example") DangyuanExample example);

    int updateByPrimaryKeySelective(Dangyuan record);

    int updateByPrimaryKey(Dangyuan record);
}