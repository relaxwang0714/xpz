package com.example.xpz.mapper;

import com.example.xpz.entity.Zichan;
import com.example.xpz.entity.ZichanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZichanMapper {
    long countByExample(ZichanExample example);

    int deleteByExample(ZichanExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Zichan record);

    int insertSelective(Zichan record);

    List<Zichan> selectByExample(ZichanExample example);

    Zichan selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Zichan record, @Param("example") ZichanExample example);

    int updateByExample(@Param("record") Zichan record, @Param("example") ZichanExample example);

    int updateByPrimaryKeySelective(Zichan record);

    int updateByPrimaryKey(Zichan record);
}