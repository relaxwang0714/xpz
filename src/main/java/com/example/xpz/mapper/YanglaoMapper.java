package com.example.xpz.mapper;

import com.example.xpz.entity.Yanglao;

import java.util.List;

public interface YanglaoMapper {
    List<Yanglao> selectByVillageId(Integer villageId);
}
