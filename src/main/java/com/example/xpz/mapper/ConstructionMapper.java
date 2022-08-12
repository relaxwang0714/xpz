package com.example.xpz.mapper;

import com.example.xpz.entity.Constructionlist;

import java.util.List;

public interface ConstructionMapper {
    List<Constructionlist> selectByVillageId(Integer id);
}
