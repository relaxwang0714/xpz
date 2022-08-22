package com.example.xpz.service;

import com.example.xpz.entity.*;
import com.example.xpz.mapper.*;
import com.example.xpz.utils.ReturnMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DigitalGovernService {
    @Autowired
    TingyuanMapper tingyuanMapper;
    @Autowired
    TrashClassficationMapper trashClassficationMapper;
    @Autowired
    WeishengBaojieMapper weishengBaojieMapper;
    @Autowired
    CumingManyiduMapper cumingManyiduMapper;
    @Autowired
    WeixinyuanMapper weixinyuanMapper;
    @Autowired
    ReturnMsg returnMsg;
    public String selectTingyuanByVillageId(int id){
        List<Tingyuan> tingyuanFactoryList = tingyuanMapper.selectByVillageId(id);
        returnMsg.setData(tingyuanFactoryList);
        returnMsg.setCode("0");
        returnMsg.setMsg("success");
        return returnMsg.toString();
    }
    public String selectTrashClassficationByVillageId(int id){
        List<TrashClassfication> trashClassficationList = trashClassficationMapper.selectByVillageId(id);
        returnMsg.setData(trashClassficationList);
        returnMsg.setCode("0");
        returnMsg.setMsg("success");
        return returnMsg.toString();
    }
    public String selectWeishengBaojieByVillageId(int id,Integer isLuzhang){
        List<WeishengBaojie> weishengBaojieList = weishengBaojieMapper.selectByVillageIdAndLuZhang(id,isLuzhang);
        returnMsg.setData(weishengBaojieList);
        returnMsg.setCode("0");
        returnMsg.setMsg("success");
        return returnMsg.toString();
    }
    public String selectCunminManyiduByVillageId(int id){
        List<CunminManyidu> CunminManyiduList = cumingManyiduMapper.selectByVillageId(id);
        returnMsg.setData(CunminManyiduList);
        returnMsg.setCode("0");
        returnMsg.setMsg("success");
        return returnMsg.toString();
    }
    public String selectWeixinyuanByVillageId(int id){
        List<Weixinyuan> weixinyuanList = weixinyuanMapper.selectByVillageId(id);
        returnMsg.setData(weixinyuanList);
        returnMsg.setCode("0");
        returnMsg.setMsg("success");
        return returnMsg.toString();
    }


}
