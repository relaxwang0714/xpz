package com.example.xpz.mapper;

import com.example.xpz.entity.currentData;

import java.util.List;

public interface CurrentDataMapper {

    List<currentData> selectByVillageId(Integer id);

}
