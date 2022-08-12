package com.example.xpz.mapper;

import com.example.xpz.entity.Styles;

import java.util.List;

public interface StylesMapper {
    List<Styles> selectByVillageId(Integer villageId);
}
