package com.example.xpz.mapper;

import com.example.xpz.entity.DigitalFactory;
import com.example.xpz.entity.QicaiTianyuan;

import java.util.List;

public interface QicaiTianyuanMapper {
    List<QicaiTianyuan> selectByVillageId(Integer villageId);
}
