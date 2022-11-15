package com.example.xpz.mapper;

import com.example.xpz.entity.TrashClassfication;
import com.example.xpz.entity.TrashClassficationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrashClassficationMapper {
    long countByExample(TrashClassficationExample example);

    int deleteByExample(TrashClassficationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TrashClassfication record);

    int insertSelective(TrashClassfication record);

    List<TrashClassfication> selectByExample(TrashClassficationExample example);

    TrashClassfication selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TrashClassfication record, @Param("example") TrashClassficationExample example);

    int updateByExample(@Param("record") TrashClassfication record, @Param("example") TrashClassficationExample example);

    int updateByPrimaryKeySelective(TrashClassfication record);

    int updateByPrimaryKey(TrashClassfication record);
}