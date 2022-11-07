package com.example.xpz.service;

import com.example.xpz.entity.*;
import com.example.xpz.mapper.*;
import com.example.xpz.utils.ReturnMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DigitalIndustryService {
    @Autowired
    DigitalFactoryMapper digitalFactoryMapper;
    @Autowired
    QicaiTianyuanMapper qicaiTianyuanMapper;
    @Autowired
    AgricultureMapper agricultureMapper;
    @Autowired
    TravelProgramMapper travelProgramMapper;
    @Autowired
    MimianJidiMapper mimianJidiMapper;
    @Autowired
    ChanyeJiansheMapper chanyeJiansheMapper;
    @Autowired
    ReturnMsg returnMsg;
    public String selectDigitalFactoryByVillageId(int id){
        List<DigitalFactory> digitalFactoryList = digitalFactoryMapper.selectByVillageId(id);
        returnMsg.setData(digitalFactoryList);
        returnMsg.setCode("0");
        returnMsg.setMsg("success");
        return returnMsg.toString();
    }
    public String selectQicaiTianyuanByVillageId(int id){
        List<QicaiTianyuan> qicaiTianyuanList = qicaiTianyuanMapper.selectByVillageId(id);
        returnMsg.setData(qicaiTianyuanList);
        returnMsg.setCode("0");
        returnMsg.setMsg("success");
        return returnMsg.toString();
    }
    public String selectAgricultureByVillageId(int id){
        List<Agriculture> agricultureList = agricultureMapper.selectByVillageId(1);
        returnMsg.setData(agricultureList);
        returnMsg.setCode("0");
        returnMsg.setMsg("success");
        return returnMsg.toString();
    }
    public String selectTravelProgramByVillageId(int id){
        List<TravelProgram> travelProgramList = travelProgramMapper.selectByVillageId(id);
        returnMsg.setData(travelProgramList);
        returnMsg.setCode("0");
        returnMsg.setMsg("success");
        return returnMsg.toString();
    }
    public String selectMimianJidiByVillageId(int id){
        List<MimianJidi> mimianJidiList = mimianJidiMapper.selectByVillageId(id);
        returnMsg.setData(mimianJidiList);
        returnMsg.setCode("0");
        returnMsg.setMsg("success");
        return returnMsg.toString();
    }
    public String selectChanyeJiansheByVillageId(int id){
        List<ChanyeJianshe> chanyeJiansheList = chanyeJiansheMapper.selectByVillageId(id);
        returnMsg.setData(chanyeJiansheList);
        returnMsg.setCode("0");
        returnMsg.setMsg("success");
        return returnMsg.toString();
    }

}
