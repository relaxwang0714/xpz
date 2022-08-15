package com.example.xpz.mapper;

import com.example.xpz.entity.ZufangGuanjia;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ZufangGuanjiaMapper {

    List<ZufangGuanjia> selectByVillageIdAndIsChuzu(@Param("villageId") Integer villageId, @Param("isChuZu")Integer isChuZu);
}
