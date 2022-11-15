package com.example.xpz.mapper;

import com.example.xpz.entity.LvyouXiangmu;
import com.example.xpz.entity.LvyouXiangmuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LvyouXiangmuMapper {
    long countByExample(LvyouXiangmuExample example);

    int deleteByExample(LvyouXiangmuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LvyouXiangmu record);

    int insertSelective(LvyouXiangmu record);

    List<LvyouXiangmu> selectByExample(LvyouXiangmuExample example);

    LvyouXiangmu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LvyouXiangmu record, @Param("example") LvyouXiangmuExample example);

    int updateByExample(@Param("record") LvyouXiangmu record, @Param("example") LvyouXiangmuExample example);

    int updateByPrimaryKeySelective(LvyouXiangmu record);

    int updateByPrimaryKey(LvyouXiangmu record);
}