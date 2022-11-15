package com.example.xpz.mapper;

import com.example.xpz.entity.ZichanKeshi;
import com.example.xpz.entity.ZichanKeshiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZichanKeshiMapper {
    long countByExample(ZichanKeshiExample example);

    int deleteByExample(ZichanKeshiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZichanKeshi record);

    int insertSelective(ZichanKeshi record);

    List<ZichanKeshi> selectByExample(ZichanKeshiExample example);

    ZichanKeshi selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZichanKeshi record, @Param("example") ZichanKeshiExample example);

    int updateByExample(@Param("record") ZichanKeshi record, @Param("example") ZichanKeshiExample example);

    int updateByPrimaryKeySelective(ZichanKeshi record);

    int updateByPrimaryKey(ZichanKeshi record);
}