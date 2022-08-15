package com.example.xpz.mapper;

import com.example.xpz.entity.Tingyuan;

import java.util.List;

public interface TingyuanMapper {

    List<Tingyuan> selectByVillageId(Integer villageId);


}
