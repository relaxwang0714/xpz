package com.example.xpz.mapper;

import com.example.xpz.entity.Chengbao;

import java.util.List;

public interface ChengbaoMapper {

    List<Chengbao> selectByVillageId(Integer villageId);
}
