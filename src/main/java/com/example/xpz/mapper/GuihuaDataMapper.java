package com.example.xpz.mapper;

import com.example.xpz.entity.guihuaData;

import java.util.List;

public interface GuihuaDataMapper {
    List<guihuaData> selectByVillageId(Integer villageId);
}
