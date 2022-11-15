package com.example.xpz.mapper;

import com.example.xpz.entity.DangyuanFazhan;
import com.example.xpz.entity.DangyuanFazhanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DangyuanFazhanMapper {
    long countByExample(DangyuanFazhanExample example);

    int deleteByExample(DangyuanFazhanExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DangyuanFazhan record);

    int insertSelective(DangyuanFazhan record);

    List<DangyuanFazhan> selectByExample(DangyuanFazhanExample example);

    DangyuanFazhan selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DangyuanFazhan record, @Param("example") DangyuanFazhanExample example);

    int updateByExample(@Param("record") DangyuanFazhan record, @Param("example") DangyuanFazhanExample example);

    int updateByPrimaryKeySelective(DangyuanFazhan record);

    int updateByPrimaryKey(DangyuanFazhan record);
}