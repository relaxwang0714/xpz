package com.example.xpz.mapper;

import com.example.xpz.entity.QicaiTianyuan;
import com.example.xpz.entity.QicaiTianyuanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QicaiTianyuanMapper {
    long countByExample(QicaiTianyuanExample example);

    int deleteByExample(QicaiTianyuanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QicaiTianyuan record);

    int insertSelective(QicaiTianyuan record);

    List<QicaiTianyuan> selectByExample(QicaiTianyuanExample example);

    QicaiTianyuan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QicaiTianyuan record, @Param("example") QicaiTianyuanExample example);

    int updateByExample(@Param("record") QicaiTianyuan record, @Param("example") QicaiTianyuanExample example);

    int updateByPrimaryKeySelective(QicaiTianyuan record);

    int updateByPrimaryKey(QicaiTianyuan record);
}