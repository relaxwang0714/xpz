package com.example.xpz.mapper;

import com.example.xpz.entity.ZhihuiYanglao;
import com.example.xpz.entity.ZhihuiYanglaoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZhihuiYanglaoMapper {
    long countByExample(ZhihuiYanglaoExample example);

    int deleteByExample(ZhihuiYanglaoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZhihuiYanglao record);

    int insertSelective(ZhihuiYanglao record);

    List<ZhihuiYanglao> selectByExample(ZhihuiYanglaoExample example);

    ZhihuiYanglao selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZhihuiYanglao record, @Param("example") ZhihuiYanglaoExample example);

    int updateByExample(@Param("record") ZhihuiYanglao record, @Param("example") ZhihuiYanglaoExample example);

    int updateByPrimaryKeySelective(ZhihuiYanglao record);

    int updateByPrimaryKey(ZhihuiYanglao record);
}