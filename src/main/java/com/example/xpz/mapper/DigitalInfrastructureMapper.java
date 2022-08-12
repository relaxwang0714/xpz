package com.example.xpz.mapper;

import com.example.xpz.entity.DigitalInfrastructure;
import com.example.xpz.entity.PeopleStructure;

public interface DigitalInfrastructureMapper {
    DigitalInfrastructure selectByVillageId(Integer villageId);
}
