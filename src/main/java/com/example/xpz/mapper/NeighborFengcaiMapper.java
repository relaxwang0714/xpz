package com.example.xpz.mapper;

import com.example.xpz.entity.NeighborFengcai;

import java.util.List;

public interface NeighborFengcaiMapper {
    List<NeighborFengcai> selectByVillageId(Integer villageId);
}
