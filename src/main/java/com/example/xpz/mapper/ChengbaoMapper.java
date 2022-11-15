package com.example.xpz.mapper;

import com.example.xpz.entity.Chengbao;
import com.example.xpz.entity.ChengbaoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChengbaoMapper {
    long countByExample(ChengbaoExample example);

    int deleteByExample(ChengbaoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Chengbao record);

    int insertSelective(Chengbao record);

    List<Chengbao> selectByExample(ChengbaoExample example);

    Chengbao selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Chengbao record, @Param("example") ChengbaoExample example);

    int updateByExample(@Param("record") Chengbao record, @Param("example") ChengbaoExample example);

    int updateByPrimaryKeySelective(Chengbao record);

    int updateByPrimaryKey(Chengbao record);
}