package com.example.xpz.mapper;

import com.example.xpz.entity.PeopleStructure;
import com.example.xpz.entity.PeopleStructureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PeopleStructureMapper {
    long countByExample(PeopleStructureExample example);

    int deleteByExample(PeopleStructureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PeopleStructure record);

    int insertSelective(PeopleStructure record);

    List<PeopleStructure> selectByExample(PeopleStructureExample example);

    PeopleStructure selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PeopleStructure record, @Param("example") PeopleStructureExample example);

    int updateByExample(@Param("record") PeopleStructure record, @Param("example") PeopleStructureExample example);

    int updateByPrimaryKeySelective(PeopleStructure record);

    int updateByPrimaryKey(PeopleStructure record);
}