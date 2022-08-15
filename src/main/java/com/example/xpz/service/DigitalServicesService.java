package com.example.xpz.service;

import com.example.xpz.entity.*;
import com.example.xpz.mapper.*;
import com.example.xpz.utils.ReturnMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DigitalServicesService {
    @Autowired
    NeighborMapper neighborMapper;
    @Autowired
    NeighborFengcaiMapper neighborFengcaiMapper;
    @Autowired
    ExpressMapper expressMapper;
    @Autowired
    ParkMapper parkMapper;
    @Autowired
    YanglaoMapper yanglaoMapper;
    @Autowired
    DanganMapper danganMapper;
    @Autowired
    WeishengshiMapper weishengshiMapper;
    @Autowired
    EducationMapper educationMapper;
    @Autowired
    ReturnMsg returnMsg;


    public String selectNeighborByVillageId(int id){
        List<Neighbor> neighborList = neighborMapper.selectByVillageId(id);
        returnMsg.setData(neighborList);
        returnMsg.setCode("0");
        returnMsg.setMsg("success");
        return returnMsg.toString();
    }
    public String selectNeighborFengcaiByVillageId(int id){
        List<NeighborFengcai> neighborFengcaiList = neighborFengcaiMapper.selectByVillageId(id);
        returnMsg.setData(neighborFengcaiList);
        returnMsg.setCode("0");
        returnMsg.setMsg("success");
        return returnMsg.toString();
    }
    public String selectExpressByVillageId(int id){
        List<Express> expressList = expressMapper.selectByVillageId(id);
        returnMsg.setData(expressList);
        returnMsg.setCode("0");
        returnMsg.setMsg("success");
        return returnMsg.toString();
    }
    public String selectParkByVillageId(int id){
        List<Park> parkList = parkMapper.selectByVillageId(id);
        returnMsg.setData(parkList);
        returnMsg.setCode("0");
        returnMsg.setMsg("success");
        return returnMsg.toString();
    }
    public String selectYanglaoByVillageId(int id){
        List<Yanglao> yanglaoList = yanglaoMapper.selectByVillageId(id);
        returnMsg.setData(yanglaoList);
        returnMsg.setCode("0");
        returnMsg.setMsg("success");
        return returnMsg.toString();
    }
    public String selectDangAnByVillageId(int id){
        List<DangAn> danganList = danganMapper.selectByVillageId(id);
        returnMsg.setData(danganList );
        returnMsg.setCode("0");
        returnMsg.setMsg("success");
        return returnMsg.toString();
    }
    public String selectWeishengshiByVillageId(int id){
        List<Weishengshi> weishengshiList = weishengshiMapper.selectByVillageId(id);
        returnMsg.setData(weishengshiList);
        returnMsg.setCode("0");
        returnMsg.setMsg("success");
        return returnMsg.toString();
    }
    public String selectEducationByVillageId(int id){
        List<Education> educationList = educationMapper.selectByVillageId(id);
        returnMsg.setData(educationList);
        returnMsg.setCode("0");
        returnMsg.setMsg("success");
        return returnMsg.toString();
    }
}
