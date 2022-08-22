package com.example.xpz.mapper;

import com.example.xpz.entity.Cunming;
import com.example.xpz.entity.CunmingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CunmingMapper {
    long countByExample(CunmingExample example);

    int deleteByExample(CunmingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cunming record);

    int insertSelective(Cunming record);

    List<Cunming> selectByExample(CunmingExample example);

    Cunming selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cunming record, @Param("example") CunmingExample example);

    int updateByExample(@Param("record") Cunming record, @Param("example") CunmingExample example);

    int updateByPrimaryKeySelective(Cunming record);

    int updateByPrimaryKey(Cunming record);
}