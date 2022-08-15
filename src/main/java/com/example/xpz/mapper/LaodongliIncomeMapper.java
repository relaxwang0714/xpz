package com.example.xpz.mapper;

import com.example.xpz.entity.LaodongliIncome;

import java.util.List;

public interface LaodongliIncomeMapper {

    List<LaodongliIncome> selectByVillageId(Integer villageId);
}
