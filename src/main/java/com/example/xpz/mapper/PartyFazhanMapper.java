package com.example.xpz.mapper;

import com.example.xpz.entity.PartyFazhan;

import java.util.List;

public interface PartyFazhanMapper {

    List<PartyFazhan> selectByVillageId(Integer villageId);
}
