package com.example.xpz.mapper;

import com.example.xpz.entity.ZiyuanShouru;

import java.util.List;

public interface ZiyuanIncomeMapper {

    List<ZiyuanShouru> selectByVillageId(Integer villageId);
}
