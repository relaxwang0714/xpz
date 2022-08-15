package com.example.xpz.mapper;

import com.example.xpz.entity.Express;

import java.util.List;

public interface ExpressMapper {
    List<Express> selectByVillageId(Integer villageId);
}
