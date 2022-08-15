package com.example.xpz.mapper;

import com.example.xpz.entity.Weishengshi;

import java.util.List;

public interface WeishengshiMapper {
    List<Weishengshi> selectByVillageId(Integer villageId);
}
