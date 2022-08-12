package com.example.xpz.mapper;

import com.example.xpz.entity.trash;

import java.util.List;

public interface TrashMapper {

    List<trash> selectByVillageId(Integer villageId);
}
