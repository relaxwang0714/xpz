package com.example.xpz.mapper;

import com.example.xpz.entity.Tudiliuzhuan;
import com.example.xpz.entity.TudiliuzhuanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TudiliuzhuanMapper {
    long countByExample(TudiliuzhuanExample example);

    int deleteByExample(TudiliuzhuanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tudiliuzhuan record);

    int insertSelective(Tudiliuzhuan record);

    List<Tudiliuzhuan> selectByExample(TudiliuzhuanExample example);

    Tudiliuzhuan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tudiliuzhuan record, @Param("example") TudiliuzhuanExample example);

    int updateByExample(@Param("record") Tudiliuzhuan record, @Param("example") TudiliuzhuanExample example);

    int updateByPrimaryKeySelective(Tudiliuzhuan record);

    int updateByPrimaryKey(Tudiliuzhuan record);
}