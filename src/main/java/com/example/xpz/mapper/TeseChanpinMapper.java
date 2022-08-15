package com.example.xpz.mapper;

import com.example.xpz.entity.TeseChanpin;

import java.util.List;

public interface TeseChanpinMapper {

    List<TeseChanpin> selectByVillageId(Integer villageId);
}
