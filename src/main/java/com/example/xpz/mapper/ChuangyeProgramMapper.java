package com.example.xpz.mapper;

import com.example.xpz.entity.ChuangyeProgram;
import com.example.xpz.entity.ChuangyeProgramExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChuangyeProgramMapper {
    long countByExample(ChuangyeProgramExample example);

    int deleteByExample(ChuangyeProgramExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ChuangyeProgram record);

    int insertSelective(ChuangyeProgram record);

    List<ChuangyeProgram> selectByExample(ChuangyeProgramExample example);

    ChuangyeProgram selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ChuangyeProgram record, @Param("example") ChuangyeProgramExample example);

    int updateByExample(@Param("record") ChuangyeProgram record, @Param("example") ChuangyeProgramExample example);

    int updateByPrimaryKeySelective(ChuangyeProgram record);

    int updateByPrimaryKey(ChuangyeProgram record);
}