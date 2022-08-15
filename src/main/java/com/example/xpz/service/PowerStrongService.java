package com.example.xpz.service;

import com.example.xpz.entity.*;
import com.example.xpz.mapper.*;
import com.example.xpz.utils.ReturnMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PowerStrongService {
    @Autowired
    TudiliuzhuanMapper tudiliuzhuanMapper;
    @Autowired
    ChengbaoMapper chengbaoMapper;
    @Autowired
    ZichankeshiMapper zichankeshiMapper;
    @Autowired
    ChuangkeMapper chuangkeMapper;
    @Autowired
    ChuangyeProgramMapper chuangyeProgramMapper;
    @Autowired
    ZufangGuanjiaMapper zufangGuanjiaMapper;
    @Autowired
    ZiyuanIncomeMapper ziyuanIncomeMapper;
    @Autowired
    LaodongliIncomeMapper laodongliIncomeMapper;
    @Autowired
    TeseChanpinMapper teseChanpinMapper;
    @Autowired
    ReturnMsg returnMsg;
    public String selectTudiliuliuzhuanByVillageId(int id){
        List<Tudiliuliuzhuan> tudiliuzhuanList = tudiliuzhuanMapper.selectByVillageId(id);
        returnMsg.setData(tudiliuzhuanList);
        returnMsg.setCode("0");
        returnMsg.setMsg("success");
        return returnMsg.toString();
    }
    public String selectChengbaoByVillageId(int id){
        List<Chengbao> chengbaoist = chengbaoMapper.selectByVillageId(id);
        returnMsg.setData(chengbaoist);
        returnMsg.setCode("0");
        returnMsg.setMsg("success");
        return returnMsg.toString();
    }
    public String selectZichanKeshiByVillageId(int id){
        List<ZichanKeshi> zichankeshiList = zichankeshiMapper.selectByVillageId(1);
        returnMsg.setData(zichankeshiList);
        returnMsg.setCode("0");
        returnMsg.setMsg("success");
        return returnMsg.toString();
    }
    public String selectChuangkeByVillageId(int id){
        List<Chuangke> chuangkeList = chuangkeMapper.selectByVillageId(id);
        returnMsg.setData(chuangkeList);
        returnMsg.setCode("0");
        returnMsg.setMsg("success");
        return returnMsg.toString();
    }
    public String selectChuangyeProgramByVillageId(int id){
        List<ChuangyeProgram> chuangyeProgramList = chuangyeProgramMapper.selectByVillageId(id);
        returnMsg.setData(chuangyeProgramList);
        returnMsg.setCode("0");
        returnMsg.setMsg("success");
        return returnMsg.toString();
    }
    public String selectZiyuanShouruByVillageId(int id){
        List<ZiyuanShouru> ziyuanIncomeFactoryList = ziyuanIncomeMapper.selectByVillageId(id);
        returnMsg.setData(ziyuanIncomeFactoryList);
        returnMsg.setCode("0");
        returnMsg.setMsg("success");
        return returnMsg.toString();
    }
    public String selectLaodongliIncomeByVillageId(int id){
        List<LaodongliIncome> laodongliIncomeList = laodongliIncomeMapper.selectByVillageId(id);
        returnMsg.setData(laodongliIncomeList);
        returnMsg.setCode("0");
        returnMsg.setMsg("success");
        return returnMsg.toString();
    }
    public String selectTeseChanpinByVillageId(int id){
        List<TeseChanpin> teseChanpinList = teseChanpinMapper.selectByVillageId(1);
        returnMsg.setData(teseChanpinList);
        returnMsg.setCode("0");
        returnMsg.setMsg("success");
        return returnMsg.toString();
    }
    public String selectZufangGuanjiaByVillageId(int id){
        List<ZufangGuanjia> zufangGuanList = zufangGuanjiaMapper.selectByVillageIdAndIsChuzu(id,1);
        returnMsg.setData(zufangGuanList);
        returnMsg.setCode("0");
        returnMsg.setMsg("success");
        return returnMsg.toString();
    }
}
