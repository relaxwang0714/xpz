package com.example.xpz.mapper;

import com.example.xpz.entity.MimianJidi;

import java.util.List;

public interface MimianJidiMapper {
    List<MimianJidi> selectByVillageId(Integer villageId);
}
