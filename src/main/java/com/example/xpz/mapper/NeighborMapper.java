package com.example.xpz.mapper;

import com.example.xpz.entity.Neighbor;

import java.util.List;

public interface NeighborMapper {
    List<Neighbor> selectByVillageId(Integer villageId);
}
