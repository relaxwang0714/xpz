package com.example.xpz.mapper;

import com.example.xpz.entity.Guihuadata;
import com.example.xpz.entity.GuihuadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GuihuadataMapper {
    long countByExample(GuihuadataExample example);

    int deleteByExample(GuihuadataExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Guihuadata record);

    int insertSelective(Guihuadata record);

    List<Guihuadata> selectByExample(GuihuadataExample example);

    Guihuadata selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Guihuadata record, @Param("example") GuihuadataExample example);

    int updateByExample(@Param("record") Guihuadata record, @Param("example") GuihuadataExample example);

    int updateByPrimaryKeySelective(Guihuadata record);

    int updateByPrimaryKey(Guihuadata record);
}