package com.example.xpz.service;

import com.alibaba.fastjson.JSONObject;
import com.example.xpz.entity.*;
import com.example.xpz.mapper.*;
import com.example.xpz.utils.ReturnMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagementService {
    @Autowired
    DesiginMapper desiginMapper;
    @Autowired
    VillageManagementMapper villageManagementMapper;
    @Autowired
    CurrentDataMapper currentDataMapper;
    @Autowired
    GuihuaDataMapper guihuaDataMapper;

    @Autowired
    ConstructionMapper constructionMapper;

    @Autowired
    ReturnMsg returnMsg;
    public String selectDesignByByVillageId(int id){
        List<Design> designList = desiginMapper.selectByVillageId(id);
        returnMsg.setData(designList);
        returnMsg.setCode("0");
        returnMsg.setMsg("success");
        return returnMsg.toString();
    }
    public String selectCurrentByByVillageId(int id){
        List<currentData> currentDataList = currentDataMapper.selectByVillageId(id);
        returnMsg.setData(currentDataList);
        returnMsg.setCode("0");
        returnMsg.setMsg("success");
        return returnMsg.toString();
    }
    public String selectGuihuaByByVillageId(int id){
        List<guihuaData> guihuaDataList = guihuaDataMapper.selectByVillageId(id);
        returnMsg.setData(guihuaDataList);
        returnMsg.setCode("0");
        returnMsg.setMsg("success");
        return returnMsg.toString();
    }
    public String selectConstructionByByVillageId(int id){

        List<Constructionlist> constructionlists =constructionMapper.selectByVillageId(id);
        returnMsg.setData(constructionlists);
        returnMsg.setCode("0");
        returnMsg.setMsg("success");
        return returnMsg.toString();
    }
    public String selectCountyujinByByVillageId(int id){

        Yujin yujins =villageManagementMapper.CountyujinByVillageId(id);
        JSONObject jsonObject = (JSONObject) JSONObject.toJSON(yujins);
        return jsonObject.toString();
    }
    public String selectCountGaizaoByByVillageId(int id){

        Gaizao gaizao =villageManagementMapper.CountGaizaoByVillageId(id);
        JSONObject jsonObject = (JSONObject) JSONObject.toJSON(gaizao);
        return jsonObject.toString();
    }
//    public String selectDesignByByVillageId(int id){
//        List<Design> designList = desiginMapper.selectByVillageId(id);
//        returnMsg.setData(designList);
//        returnMsg.setCode("0");
//        returnMsg.setMsg("success");
//        return returnMsg.toString();
//    }
}
