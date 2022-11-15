package com.example.xpz.mapper;

import com.example.xpz.entity.MimianJidi;
import com.example.xpz.entity.MimianJidiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MimianJidiMapper {
    long countByExample(MimianJidiExample example);

    int deleteByExample(MimianJidiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MimianJidi record);

    int insertSelective(MimianJidi record);

    List<MimianJidi> selectByExampleWithBLOBs(MimianJidiExample example);

    List<MimianJidi> selectByExample(MimianJidiExample example);

    MimianJidi selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MimianJidi record, @Param("example") MimianJidiExample example);

    int updateByExampleWithBLOBs(@Param("record") MimianJidi record, @Param("example") MimianJidiExample example);

    int updateByExample(@Param("record") MimianJidi record, @Param("example") MimianJidiExample example);

    int updateByPrimaryKeySelective(MimianJidi record);

    int updateByPrimaryKeyWithBLOBs(MimianJidi record);

    int updateByPrimaryKey(MimianJidi record);
}