package com.example.xpz.mapper;

import com.example.xpz.entity.TravelProgram;

import java.util.List;

public interface TravelProgramMapper {
    List<TravelProgram> selectByVillageId(Integer villageId);
}
