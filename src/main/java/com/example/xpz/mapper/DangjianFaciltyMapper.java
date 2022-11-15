package com.example.xpz.mapper;

import com.example.xpz.entity.DangjianFacilty;
import com.example.xpz.entity.DangjianFaciltyExample;
import com.example.xpz.entity.DangjianFaciltyWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DangjianFaciltyMapper {
    long countByExample(DangjianFaciltyExample example);

    int deleteByExample(DangjianFaciltyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DangjianFaciltyWithBLOBs record);

    int insertSelective(DangjianFaciltyWithBLOBs record);

    List<DangjianFaciltyWithBLOBs> selectByExampleWithBLOBs(DangjianFaciltyExample example);

    List<DangjianFacilty> selectByExample(DangjianFaciltyExample example);

    DangjianFaciltyWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DangjianFaciltyWithBLOBs record, @Param("example") DangjianFaciltyExample example);

    int updateByExampleWithBLOBs(@Param("record") DangjianFaciltyWithBLOBs record, @Param("example") DangjianFaciltyExample example);

    int updateByExample(@Param("record") DangjianFacilty record, @Param("example") DangjianFaciltyExample example);

    int updateByPrimaryKeySelective(DangjianFaciltyWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(DangjianFaciltyWithBLOBs record);

    int updateByPrimaryKey(DangjianFacilty record);
}