package com.example.xpz.mapper;

import com.example.xpz.entity.Kuaidi;
import com.example.xpz.entity.KuaidiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KuaidiMapper {
    long countByExample(KuaidiExample example);

    int deleteByExample(KuaidiExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Kuaidi record);

    int insertSelective(Kuaidi record);

    List<Kuaidi> selectByExampleWithBLOBs(KuaidiExample example);

    List<Kuaidi> selectByExample(KuaidiExample example);

    Kuaidi selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Kuaidi record, @Param("example") KuaidiExample example);

    int updateByExampleWithBLOBs(@Param("record") Kuaidi record, @Param("example") KuaidiExample example);

    int updateByExample(@Param("record") Kuaidi record, @Param("example") KuaidiExample example);

    int updateByPrimaryKeySelective(Kuaidi record);

    int updateByPrimaryKeyWithBLOBs(Kuaidi record);

    int updateByPrimaryKey(Kuaidi record);
}