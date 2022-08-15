package com.example.xpz.mapper;

import com.example.xpz.entity.Park;

import java.util.List;

public interface ParkMapper {
    List<Park> selectByVillageId(Integer villageId);
}
