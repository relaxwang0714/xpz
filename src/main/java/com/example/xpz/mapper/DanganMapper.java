package com.example.xpz.mapper;

import com.example.xpz.entity.DangAn;

import java.util.List;

public interface DanganMapper {
    List<DangAn> selectByVillageId(Integer villageId);
}
