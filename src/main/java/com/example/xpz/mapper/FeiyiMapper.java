package com.example.xpz.mapper;

import com.example.xpz.entity.feiyi;
import com.example.xpz.entity.guihuaData;

import java.util.List;

public interface FeiyiMapper {
    List<feiyi> selectByVillageId(Integer villageId);
}
