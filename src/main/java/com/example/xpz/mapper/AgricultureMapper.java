package com.example.xpz.mapper;

import com.example.xpz.entity.Agriculture;

import java.util.List;

public interface AgricultureMapper {
    List<Agriculture> selectByVillageId(Integer villageId);
}
