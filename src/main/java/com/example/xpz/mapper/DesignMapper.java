package com.example.xpz.mapper;

import com.example.xpz.entity.Design;
import com.example.xpz.entity.DesignExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DesignMapper {
    long countByExample(DesignExample example);

    int deleteByExample(DesignExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Design record);

    int insertSelective(Design record);

    List<Design> selectByExample(DesignExample example);

    Design selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Design record, @Param("example") DesignExample example);

    int updateByExample(@Param("record") Design record, @Param("example") DesignExample example);

    int updateByPrimaryKeySelective(Design record);

    int updateByPrimaryKey(Design record);
}