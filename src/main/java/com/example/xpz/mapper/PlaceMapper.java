package com.example.xpz.mapper;

import com.example.xpz.entity.Place;

import java.util.List;

public interface PlaceMapper {

    List<Place> selectByVillageId(Integer villageId);
}
