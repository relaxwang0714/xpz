package com.example.xpz.mapper;

import com.example.xpz.entity.Education;

import java.util.List;

public interface EducationMapper {
    List<Education> selectByVillageId(Integer villageId);
}
