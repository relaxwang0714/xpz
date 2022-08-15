package com.example.xpz.mapper;

import com.example.xpz.entity.WeishengBaojie;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WeishengBaojieMapper {

    List<WeishengBaojie> selectByVillageIdAndLuZhang(@Param("villageId")Integer villageId,@Param("isLuZhang")Integer isLuZhang);
}
