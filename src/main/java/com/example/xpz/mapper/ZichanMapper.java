package com.example.xpz.mapper;

import com.example.xpz.entity.Zichan;

import java.util.List;

public interface ZichanMapper {

    List<Zichan> selectByVillageId(Integer villageId);
}
