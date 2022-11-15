package com.example.xpz.mapper;

import com.example.xpz.entity.Currentdata;
import com.example.xpz.entity.CurrentdataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CurrentDataMapper {
    long countByExample(CurrentdataExample example);

    int deleteByExample(CurrentdataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Currentdata record);

    int insertSelective(Currentdata record);

    List<Currentdata> selectByExample(CurrentdataExample example);

    Currentdata selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Currentdata record, @Param("example") CurrentdataExample example);

    int updateByExample(@Param("record") Currentdata record, @Param("example") CurrentdataExample example);

    int updateByPrimaryKeySelective(Currentdata record);

    int updateByPrimaryKey(Currentdata record);
}