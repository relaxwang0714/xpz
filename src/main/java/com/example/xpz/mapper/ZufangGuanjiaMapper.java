package com.example.xpz.mapper;

import com.example.xpz.entity.ZufangGuanjia;
import com.example.xpz.entity.ZufangGuanjiaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZufangGuanjiaMapper {
    long countByExample(ZufangGuanjiaExample example);

    int deleteByExample(ZufangGuanjiaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZufangGuanjia record);

    int insertSelective(ZufangGuanjia record);

    List<ZufangGuanjia> selectByExample(ZufangGuanjiaExample example);

    ZufangGuanjia selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZufangGuanjia record, @Param("example") ZufangGuanjiaExample example);

    int updateByExample(@Param("record") ZufangGuanjia record, @Param("example") ZufangGuanjiaExample example);

    int updateByPrimaryKeySelective(ZufangGuanjia record);

    int updateByPrimaryKey(ZufangGuanjia record);
}