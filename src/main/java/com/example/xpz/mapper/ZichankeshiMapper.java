package com.example.xpz.mapper;

import com.example.xpz.entity.ZichanKeshi;

import java.util.List;

public interface ZichankeshiMapper {

    List<ZichanKeshi> selectByVillageId(Integer villageId);
}
