package com.example.xpz.mapper;

import com.example.xpz.entity.Tingyuan;
import com.example.xpz.entity.TingyuanExample;
import com.example.xpz.entity.TingyuanWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TingyuanMapper {
    long countByExample(TingyuanExample example);

    int deleteByExample(TingyuanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TingyuanWithBLOBs record);

    int insertSelective(TingyuanWithBLOBs record);

    List<TingyuanWithBLOBs> selectByExampleWithBLOBs(TingyuanExample example);

    List<Tingyuan> selectByExample(TingyuanExample example);

    TingyuanWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TingyuanWithBLOBs record, @Param("example") TingyuanExample example);

    int updateByExampleWithBLOBs(@Param("record") TingyuanWithBLOBs record, @Param("example") TingyuanExample example);

    int updateByExample(@Param("record") Tingyuan record, @Param("example") TingyuanExample example);

    int updateByPrimaryKeySelective(TingyuanWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TingyuanWithBLOBs record);

    int updateByPrimaryKey(Tingyuan record);
}