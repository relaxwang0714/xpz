package com.example.xpz.mapper;

import com.example.xpz.entity.TrashClassfication;

import java.util.List;

public interface TrashClassficationMapper {

    List<TrashClassfication> selectByVillageId(Integer villageId);
}
