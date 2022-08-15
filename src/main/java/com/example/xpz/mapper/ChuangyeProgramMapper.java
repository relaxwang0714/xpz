package com.example.xpz.mapper;

import com.example.xpz.entity.ChuangyeProgram;

import java.util.List;

public interface ChuangyeProgramMapper {

    List<ChuangyeProgram> selectByVillageId(Integer villageId);
}
