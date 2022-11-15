package com.example.xpz.mapper;

import com.example.xpz.entity.Neighbour;
import com.example.xpz.entity.NeighbourExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NeighbourMapper {
    long countByExample(NeighbourExample example);

    int deleteByExample(NeighbourExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Neighbour record);

    int insertSelective(Neighbour record);

    List<Neighbour> selectByExample(NeighbourExample example);

    Neighbour selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Neighbour record, @Param("example") NeighbourExample example);

    int updateByExample(@Param("record") Neighbour record, @Param("example") NeighbourExample example);

    int updateByPrimaryKeySelective(Neighbour record);

    int updateByPrimaryKey(Neighbour record);
}