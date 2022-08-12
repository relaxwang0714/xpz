package com.example.xpz.mapper;

import com.example.xpz.entity.PartyFengcai;

import java.util.List;

public interface PartyFengcaiMapper {

    List<PartyFengcai> selectByVillageId(Integer villageId);

}
