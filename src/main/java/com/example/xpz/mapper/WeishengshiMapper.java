package com.example.xpz.mapper;

import com.example.xpz.entity.Weishengshi;
import com.example.xpz.entity.WeishengshiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeishengshiMapper {
    long countByExample(WeishengshiExample example);

    int deleteByExample(WeishengshiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Weishengshi record);

    int insertSelective(Weishengshi record);

    List<Weishengshi> selectByExampleWithBLOBs(WeishengshiExample example);

    List<Weishengshi> selectByExample(WeishengshiExample example);

    Weishengshi selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Weishengshi record, @Param("example") WeishengshiExample example);

    int updateByExampleWithBLOBs(@Param("record") Weishengshi record, @Param("example") WeishengshiExample example);

    int updateByExample(@Param("record") Weishengshi record, @Param("example") WeishengshiExample example);

    int updateByPrimaryKeySelective(Weishengshi record);

    int updateByPrimaryKeyWithBLOBs(Weishengshi record);

    int updateByPrimaryKey(Weishengshi record);
}