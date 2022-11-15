package com.example.xpz.mapper;

import com.example.xpz.entity.Dangan;
import com.example.xpz.entity.DanganExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DanganMapper {
    long countByExample(DanganExample example);

    int deleteByExample(DanganExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dangan record);

    int insertSelective(Dangan record);

    List<Dangan> selectByExample(DanganExample example);

    Dangan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dangan record, @Param("example") DanganExample example);

    int updateByExample(@Param("record") Dangan record, @Param("example") DanganExample example);

    int updateByPrimaryKeySelective(Dangan record);

    int updateByPrimaryKey(Dangan record);
}