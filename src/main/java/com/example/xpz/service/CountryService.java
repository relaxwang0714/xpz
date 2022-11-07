package com.example.xpz.service;

import com.alibaba.fastjson.JSONObject;
import com.example.xpz.entity.*;
import com.example.xpz.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
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

    @Autowired
    FangwuMapper fangwuMapper;
    @Autowired
    CunmingMapper cunmingMapper;

    @Autowired
    DangyuanMapper dangyuanMapper;

    public String selectByPrimaryKey(int id){
        Country country= countryMapper.selectByPrimaryKey(id);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("profile",country.getProfile());
        return jsonObject.toString();
    }

    public String selectPeopleStructureByVillageId(int id){
        PeopleStructure peopleStructure= peopleStructureMapper.selectByVillageId(id);
        JSONObject jsonObject = (JSONObject) JSONObject.toJSON(peopleStructure);
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
        return returnmsg.toString();
    }

    public String selectStyleByVillageId(int id){
        List<Styles> placeList = stylesMapper.selectByVillageId(id);
        returnmsg.setData(placeList);
        returnmsg.setCode("0");
        returnmsg.setMsg("成功");
        return returnmsg.toString();
    }

    public String selectEnvironmentByVillageId(int id){
        List<trash> trashList = trashMapper.selectByVillageId(id);
        returnmsg.setData(trashList);
        returnmsg.setCode("0");
        returnmsg.setMsg("成功");
        return returnmsg.toString();
    }

    public String selectFeiyiByVillageId(int id){
        List<feiyi> feiyiList = feiyiMapper.selectByVillageId(id);
        returnmsg.setData(feiyiList);
        returnmsg.setCode("0");
        returnmsg.setMsg("成功");
        return returnmsg.toString();
    }
    public String selectFangwuByVillageId(int id){
        FangwuExample fangwuExample = new FangwuExample();
        FangwuExample.Criteria criteria = fangwuExample.createCriteria();
//        criteria
        List<Fangwu> fangwuList = fangwuMapper.selectByExample(fangwuExample);
        returnmsg.setData(fangwuList);
        returnmsg.setCode("0");
        returnmsg.setMsg("成功");
        return returnmsg.toString();
    }
    public String selectCunmingByHuhao(int id, Integer huhao){
        CunmingExample cunmingExample = new CunmingExample();
        CunmingExample.Criteria criteria = cunmingExample.createCriteria();
        criteria.andHuhaoEqualTo(huhao);
        List<Cunming> cunmingList = cunmingMapper.selectByExample(cunmingExample);
        returnmsg.setData(cunmingList);
        returnmsg.setCode("0");
        returnmsg.setMsg("成功");
        return returnmsg.toString();
    }
    public String selectDangyuanByHuhao(int id, String huhao){
        DangyuanExample dangyuanExample = new DangyuanExample();
        DangyuanExample.Criteria criteria = dangyuanExample.createCriteria();
        criteria.andHuhaoEqualTo(huhao);
        List<Dangyuan> dangyuanList = dangyuanMapper.selectByExample(dangyuanExample);
        returnmsg.setData(dangyuanList);
        returnmsg.setCode("0");
        returnmsg.setMsg("成功");
        return returnmsg.toString();
    }
}
