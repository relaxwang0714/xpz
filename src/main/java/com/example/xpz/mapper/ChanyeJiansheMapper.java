package com.example.xpz.mapper;

import com.example.xpz.entity.ChanyeJianshe;

import java.util.List;

public interface ChanyeJiansheMapper {
    List<ChanyeJianshe> selectByVillageId(Integer id);
}
