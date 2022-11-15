package com.example.xpz.mapper;

import com.example.xpz.entity.TeseChanpin;
import com.example.xpz.entity.TeseChanpinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeseChanpinMapper {
    long countByExample(TeseChanpinExample example);

    int deleteByExample(TeseChanpinExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TeseChanpin record);

    int insertSelective(TeseChanpin record);

    List<TeseChanpin> selectByExample(TeseChanpinExample example);

    TeseChanpin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TeseChanpin record, @Param("example") TeseChanpinExample example);

    int updateByExample(@Param("record") TeseChanpin record, @Param("example") TeseChanpinExample example);

    int updateByPrimaryKeySelective(TeseChanpin record);

    int updateByPrimaryKey(TeseChanpin record);
}