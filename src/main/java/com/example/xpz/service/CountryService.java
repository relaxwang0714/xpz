package com.example.xpz.service;

import com.alibaba.fastjson.JSONObject;
import com.example.xpz.entity.*;
import com.example.xpz.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import com.example.xpz.utils.ReturnMsg;

@Service
public class CountryService {
    @Autowired
    CountryMapper countryMapper;
    @Autowired
    PeopleStructureMapper peopleStructureMapper;
    @Autowired
    PlaceMapper placeMapper;

    @Autowired
    DigitalInfrastructureMapper digitalInfrastructureMapper;

    @Autowired
    StylesMapper stylesMapper;

    @Autowired
    TrashMapper trashMapper;

    @Autowired
    ReturnMsg returnmsg;

    @Autowired
    FeiyiMapper feiyiMapper;

    public String selectByPrimaryKey(int id){
        Country country= countryMapper.selectByPrimaryKey(id);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("profile",country.getProfile());
//        returnmsg.setData(country.getProfile());
//        returnmsg.setCode("0");
//        returnmsg.setMsg("成功");
        return jsonObject.toString();
    }
    public String selectPeopleStructureByVillageId(int id){
        PeopleStructure peopleStructure= peopleStructureMapper.selectByVillageId(id);
//        JSONObject jsonObject = new JSONObject();
        JSONObject jsonObject = (JSONObject) JSONObject.toJSON(peopleStructure);
//        jsonObject.put("profile",country.getProfile());
//        returnmsg.setData(country.getProfile());
//        returnmsg.setCode("0");
//        returnmsg.setMsg("成功");
        return jsonObject.toString();
    }
    public String selectDigitalByVillageId(int id){
        DigitalInfrastructure digitalInfrastructure = digitalInfrastructureMapper.selectByVillageId(id);
        JSONObject jsonObject = (JSONObject) JSONObject.toJSON(digitalInfrastructure);
        return jsonObject.toString();
    }

    public String selectPlaceByVillageId(int id){
        List<Place> placeList = placeMapper.selectByVillageId(id);
        returnmsg.setData(placeList);
        returnmsg.setCode("0");
        returnmsg.setMsg("成功");
//        JSONObject jsonObject = (JSONObject) JSONObject.toJSON(place);
        return returnmsg.toString();
    }

    public String selectStyleByVillageId(int id){
        List<Styles> placeList = stylesMapper.selectByVillageId(id);
        returnmsg.setData(placeList);
        returnmsg.setCode("0");
        returnmsg.setMsg("成功");
//        JSONObject jsonObject = (JSONObject) JSONObject.toJSON(place);
        return returnmsg.toString();
    }

    public String selectEnvironmentByVillageId(int id){
        List<trash> trashList = trashMapper.selectByVillageId(id);
        returnmsg.setData(trashList);
        returnmsg.setCode("0");
        returnmsg.setMsg("成功");
//        JSONObject jsonObject = (JSONObject) JSONObject.toJSON(place);
        return returnmsg.toString();
    }

    public String selectFeiyiByVillageId(int id){
        List<feiyi> feiyiList = feiyiMapper.selectByVillageId(id);
        returnmsg.setData(feiyiList);
        returnmsg.setCode("0");
        returnmsg.setMsg("成功");
//        JSONObject jsonObject = (JSONObject) JSONObject.toJSON(place);
        return returnmsg.toString();
    }
}
