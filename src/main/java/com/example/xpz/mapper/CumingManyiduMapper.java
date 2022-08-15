package com.example.xpz.mapper;

import com.example.xpz.entity.CunminManyidu;

import java.util.List;

public interface CumingManyiduMapper {
    List<CunminManyidu> selectByVillageId(Integer villageId);
}
