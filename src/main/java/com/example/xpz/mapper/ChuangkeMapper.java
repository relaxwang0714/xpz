package com.example.xpz.mapper;

import com.example.xpz.entity.Chuangke;

import java.util.List;

public interface ChuangkeMapper {

    List<Chuangke> selectByVillageId(Integer villageId);
}
