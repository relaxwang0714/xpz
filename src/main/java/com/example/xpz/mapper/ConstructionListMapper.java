package com.example.xpz.mapper;

import com.example.xpz.entity.ConstructionList;
import com.example.xpz.entity.ConstructionListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConstructionListMapper {
    long countByExample(ConstructionListExample example);

    int deleteByExample(ConstructionListExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ConstructionList record);

    int insertSelective(ConstructionList record);

    List<ConstructionList> selectByExampleWithBLOBs(ConstructionListExample example);

    List<ConstructionList> selectByExample(ConstructionListExample example);

    ConstructionList selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ConstructionList record, @Param("example") ConstructionListExample example);

    int updateByExampleWithBLOBs(@Param("record") ConstructionList record, @Param("example") ConstructionListExample example);

    int updateByExample(@Param("record") ConstructionList record, @Param("example") ConstructionListExample example);

    int updateByPrimaryKeySelective(ConstructionList record);

    int updateByPrimaryKeyWithBLOBs(ConstructionList record);

    int updateByPrimaryKey(ConstructionList record);
}