package com.example.xpz.mapper;

import com.example.xpz.entity.Weixinyuan;

import java.util.List;

public interface WeixinyuanMapper {
    List<Weixinyuan> selectByVillageId(Integer villageId);
}
