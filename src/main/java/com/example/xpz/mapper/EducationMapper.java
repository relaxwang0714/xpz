package com.example.xpz.mapper;

import com.example.xpz.entity.Education;
import com.example.xpz.entity.EducationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EducationMapper {
    long countByExample(EducationExample example);

    int deleteByExample(EducationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Education record);

    int insertSelective(Education record);

    List<Education> selectByExample(EducationExample example);

    Education selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Education record, @Param("example") EducationExample example);

    int updateByExample(@Param("record") Education record, @Param("example") EducationExample example);

    int updateByPrimaryKeySelective(Education record);

    int updateByPrimaryKey(Education record);
}