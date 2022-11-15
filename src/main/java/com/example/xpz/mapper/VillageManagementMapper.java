package com.example.xpz.mapper;

import com.example.xpz.entity.VillageManagement;
import com.example.xpz.entity.VillageManagementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VillageManagementMapper {
    long countByExample(VillageManagementExample example);

    int deleteByExample(VillageManagementExample example);

    int deleteByPrimaryKey(Long id);

    int insert(VillageManagement record);

    int insertSelective(VillageManagement record);

    List<VillageManagement> selectByExample(VillageManagementExample example);

    VillageManagement selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") VillageManagement record, @Param("example") VillageManagementExample example);

    int updateByExample(@Param("record") VillageManagement record, @Param("example") VillageManagementExample example);

    int updateByPrimaryKeySelective(VillageManagement record);

    int updateByPrimaryKey(VillageManagement record);
}