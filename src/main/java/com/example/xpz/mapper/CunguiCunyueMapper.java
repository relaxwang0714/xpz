package com.example.xpz.mapper;

import com.example.xpz.entity.CunguiCunyue;
import com.example.xpz.entity.CunguiCunyueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CunguiCunyueMapper {
    long countByExample(CunguiCunyueExample example);

    int deleteByExample(CunguiCunyueExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CunguiCunyue record);

    int insertSelective(CunguiCunyue record);

    List<CunguiCunyue> selectByExampleWithBLOBs(CunguiCunyueExample example);

    List<CunguiCunyue> selectByExample(CunguiCunyueExample example);

    CunguiCunyue selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CunguiCunyue record, @Param("example") CunguiCunyueExample example);

    int updateByExampleWithBLOBs(@Param("record") CunguiCunyue record, @Param("example") CunguiCunyueExample example);

    int updateByExample(@Param("record") CunguiCunyue record, @Param("example") CunguiCunyueExample example);

    int updateByPrimaryKeySelective(CunguiCunyue record);

    int updateByPrimaryKeyWithBLOBs(CunguiCunyue record);

    int updateByPrimaryKey(CunguiCunyue record);
}