package com.example.xpz.mapper;

import com.example.xpz.entity.DigitalFactory;
import com.example.xpz.entity.DigitalInfrastructure;

import java.util.List;

public interface DigitalFactoryMapper {
    List<DigitalFactory> selectByVillageId(Integer villageId);
}
