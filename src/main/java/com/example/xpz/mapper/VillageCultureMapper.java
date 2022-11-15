package com.example.xpz.mapper;

import com.example.xpz.entity.VillageCulture;
import com.example.xpz.entity.VillageCultureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VillageCultureMapper {
    long countByExample(VillageCultureExample example);

    int deleteByExample(VillageCultureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(VillageCulture record);

    int insertSelective(VillageCulture record);

    List<VillageCulture> selectByExampleWithBLOBs(VillageCultureExample example);

    List<VillageCulture> selectByExample(VillageCultureExample example);

    VillageCulture selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") VillageCulture record, @Param("example") VillageCultureExample example);

    int updateByExampleWithBLOBs(@Param("record") VillageCulture record, @Param("example") VillageCultureExample example);

    int updateByExample(@Param("record") VillageCulture record, @Param("example") VillageCultureExample example);

    int updateByPrimaryKeySelective(VillageCulture record);

    int updateByPrimaryKeyWithBLOBs(VillageCulture record);

    int updateByPrimaryKey(VillageCulture record);
}