package com.example.xpz.mapper;

import com.example.xpz.entity.Gaizao;
import com.example.xpz.entity.VillageManagement;
import com.example.xpz.entity.Yujin;

import java.util.List;

public interface VillageManagementMapper {
    List<VillageManagement> selectByVillageId(Integer villageId);

    Yujin CountyujinByVillageId(Integer villageId);

    Gaizao CountGaizaoByVillageId(Integer villageId);
}
