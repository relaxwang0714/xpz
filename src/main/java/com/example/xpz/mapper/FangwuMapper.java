package com.example.xpz.mapper;

import com.example.xpz.entity.Fangwu;
import com.example.xpz.entity.FangwuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FangwuMapper {
    long countByExample(FangwuExample example);

    int deleteByExample(FangwuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Fangwu record);

    int insertSelective(Fangwu record);

    List<Fangwu> selectByExampleWithBLOBs(FangwuExample example);

    List<Fangwu> selectByExample(FangwuExample example);

    Fangwu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Fangwu record, @Param("example") FangwuExample example);

    int updateByExampleWithBLOBs(@Param("record") Fangwu record, @Param("example") FangwuExample example);

    int updateByExample(@Param("record") Fangwu record, @Param("example") FangwuExample example);

    int updateByPrimaryKeySelective(Fangwu record);

    int updateByPrimaryKeyWithBLOBs(Fangwu record);

    int updateByPrimaryKey(Fangwu record);
}