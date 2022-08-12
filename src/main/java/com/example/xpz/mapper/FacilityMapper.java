package com.example.xpz.mapper;

import com.example.xpz.entity.Facility;

import java.util.List;

public interface FacilityMapper {

    List<Facility> selectByVillageId(Integer villageId);
}
