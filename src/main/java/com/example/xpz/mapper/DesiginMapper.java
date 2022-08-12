package com.example.xpz.mapper;

import com.example.xpz.entity.Design;

import java.util.List;

public interface DesiginMapper {

    List<Design> selectByVillageId(Integer villageId);

}
