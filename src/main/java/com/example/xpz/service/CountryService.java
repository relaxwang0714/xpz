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
    VillageCultureMapper villageCultureMapper;
    @Autowired
    DigitalInfrastructureMapper digitalInfrastructureMapper;

    @Autowired
    StyleMapper styleMapper;

    @Autowired
    TrashMapper trashMapper;

    @Autowired
    ReturnMsg returnmsg;

    @Autowired
    FeiyiZiyuanMapper feiyiZiyuanMapper;

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

    public String selectPeopleStructure(){
        PeopleStructureExample peopleStructureExample = new PeopleStructureExample();
        PeopleStructureExample.Criteria criteria = peopleStructureExample.createCriteria();
        List<PeopleStructure> peopleStructureList = peopleStructureMapper.selectByExample(peopleStructureExample);
        returnmsg.setData(peopleStructureList);
        returnmsg.setCode("0");
        returnmsg.setMsg("成功");
        return returnmsg.toString();
    }
    public String updatePeopleStructure(Long id,PeopleStructure peopleStructure){
        PeopleStructureExample peopleStructureExample = new PeopleStructureExample();
        PeopleStructureExample.Criteria criteria = peopleStructureExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = peopleStructureMapper.updateByExampleSelective(peopleStructure,peopleStructureExample);
        if(res ==1) {
            return returnmsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnmsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertPeopleStructure(PeopleStructure peopleStructure){
        int res= peopleStructureMapper.insertSelective(peopleStructure);
        if(res ==1) {
            return returnmsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnmsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deletePeopleStructure(Long id){
        PeopleStructureExample peopleStructureExample = new PeopleStructureExample();
        PeopleStructureExample.Criteria criteria = peopleStructureExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = peopleStructureMapper.deleteByExample(peopleStructureExample);
        if(res ==1) {
            return returnmsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnmsg.toString(String.valueOf(res),"删除失败");
        }
    }
    public String selectDigitalInfrastructure(){
        DigitalInfrastructureExample digitalInfrastructureExample = new DigitalInfrastructureExample();
        DigitalInfrastructureExample.Criteria criteria = digitalInfrastructureExample.createCriteria();
        List<DigitalInfrastructure> digitalInfrastructureList = digitalInfrastructureMapper.selectByExample(digitalInfrastructureExample);
        returnmsg.setData(digitalInfrastructureList);
        returnmsg.setCode("0");
        returnmsg.setMsg("成功");
        return returnmsg.toString();
    }
    public String updateDigitalInfrastructure(Long id,DigitalInfrastructure digitalInfrastructure){
        DigitalInfrastructureExample digitalInfrastructureExample = new DigitalInfrastructureExample();
        DigitalInfrastructureExample.Criteria criteria = digitalInfrastructureExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = digitalInfrastructureMapper.updateByExampleSelective(digitalInfrastructure,digitalInfrastructureExample);
        if(res ==1) {
            return returnmsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnmsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertDigitalInfrastructure(DigitalInfrastructure digitalInfrastructure){
        int res= digitalInfrastructureMapper.insertSelective(digitalInfrastructure);
        if(res ==1) {
            return returnmsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnmsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteDigitalInfrastructure(Long id){
        DigitalInfrastructureExample digitalInfrastructureExample = new DigitalInfrastructureExample();
        DigitalInfrastructureExample.Criteria criteria = digitalInfrastructureExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = digitalInfrastructureMapper.deleteByExample(digitalInfrastructureExample);
        if(res ==1) {
            return returnmsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnmsg.toString(String.valueOf(res),"删除失败");
        }
    }
//    public String selectPlace(){
//        PlaceExample placeExample = new PlaceExample();
//        PlaceExample.Criteria criteria = placeExample.createCriteria();
//        List<Place> placeList = placeMapper.selectByExample(placeExample);
//        returnmsg.setData(placeList);
//        returnmsg.setCode("0");
//        returnmsg.setMsg("成功");
//        return returnmsg.toString();
//    }
//    public String updatePlace(Long id,Place place){
//        PlaceExample placeExample = new PlaceExample();
//        PlaceExample.Criteria criteria = placeExample.createCriteria();
//        criteria.andIdEqualTo(id);
//        int res = placeMapper.updateByExampleSelective(place,PlaceExample);
//        if(res ==1) {
//            return returnmsg.toString(String.valueOf(res), "更新成功");
//        }else{
//            return returnmsg.toString(String.valueOf(res),"更新失败");
//        }
//    }
//    public String insertDigitalInfrastructure(Place place){
//        int res= placeMapper.insertSelective(place);
//        if(res ==1) {
//            return returnmsg.toString(String.valueOf(res), "新增成功");
//        }else{
//            return returnmsg.toString(String.valueOf(res),"新增失败");
//        }
//    }
//    public String deletePlace(Long id){
//        PlaceExample placeExample = new PlaceExample();
//        PlaceExample.Criteria criteria = placeExample.createCriteria();
//        criteria.andIdEqualTo(id);
//        int res = placeMapper.deleteByExample(placeExample);
//        if(res ==1) {
//            return returnmsg.toString(String.valueOf(res), "删除成功");
//        }else{
//            return returnmsg.toString(String.valueOf(res),"删除失败");
//        }
//    }
    public String selectStyle(){
    StyleExample styleExample = new StyleExample();
    StyleExample.Criteria criteria = styleExample.createCriteria();
    List<Style> styleList = styleMapper.selectByExample(styleExample);
    returnmsg.setData(styleList);
    returnmsg.setCode("0");
    returnmsg.setMsg("成功");
    return returnmsg.toString();
}
    public String updateStyle(Long id,Style style){
        StyleExample styleExample = new StyleExample();
        StyleExample.Criteria criteria = styleExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = styleMapper.updateByExampleSelective(style,styleExample);
        if(res ==1) {
            return returnmsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnmsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertStyle(Style style){
        int res= styleMapper.insertSelective(style);
        if(res ==1) {
            return returnmsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnmsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteStyle(Long id){
        StyleExample styleExample = new StyleExample();
        StyleExample.Criteria criteria = styleExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = styleMapper.deleteByExample(styleExample);
        if(res ==1) {
            return returnmsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnmsg.toString(String.valueOf(res),"删除失败");
        }
    }

    public String selectVillageCulture(){
        VillageCultureExample example = new VillageCultureExample();
        VillageCultureExample.Criteria criteria = example.createCriteria();
        List<VillageCulture> list = villageCultureMapper.selectByExample(example);
        returnmsg.setData(list);
        returnmsg.setCode("0");
        returnmsg.setMsg("成功");
        return returnmsg.toString();
    }
    public String updateVillageCulture(Long id,VillageCulture villageCulture){
        VillageCultureExample example = new VillageCultureExample();
        VillageCultureExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        int res = villageCultureMapper.updateByExampleSelective(villageCulture,example);
        if(res==1){
            returnmsg.setCode("0");
            returnmsg.setMsg("成功");
        }
        else{
            returnmsg.setCode("0");
            returnmsg.setMsg("失败");
        }
        return returnmsg.toString();
    }
    public String insertVillageCulture(){
        VillageCultureExample example = new VillageCultureExample();
        VillageCultureExample.Criteria criteria = example.createCriteria();
        List<VillageCulture> list = villageCultureMapper.selectByExample(example);
        returnmsg.setData(list);
        returnmsg.setCode("0");
        returnmsg.setMsg("成功");
        return returnmsg.toString();
    }
    public String deleteVillageCulture(){
        VillageCultureExample example = new VillageCultureExample();
        VillageCultureExample.Criteria criteria = example.createCriteria();
        List<VillageCulture> list = villageCultureMapper.selectByExample(example);
        returnmsg.setData(list);
        returnmsg.setCode("0");
        returnmsg.setMsg("成功");
        return returnmsg.toString();
    }
    public String selectTrash(){
        TrashExample trashExample = new TrashExample();
        TrashExample.Criteria criteria = trashExample.createCriteria();
        List<Trash> trashList = trashMapper.selectByExample(trashExample);
        returnmsg.setData(trashList);
        returnmsg.setCode("0");
        returnmsg.setMsg("成功");
        return returnmsg.toString();
    }
    public String updateTrash(Integer id,Trash trash){
        TrashExample trashExample = new TrashExample();
        TrashExample.Criteria criteria = trashExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = trashMapper.updateByExampleSelective(trash,trashExample);
        if(res ==1) {
            return returnmsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnmsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertTrash(Trash trash){
        int res= trashMapper.insertSelective(trash);
        if(res ==1) {
            return returnmsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnmsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteTrash(Integer id){
        TrashExample trashExample = new TrashExample();
        TrashExample.Criteria criteria = trashExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = trashMapper.deleteByExample(trashExample);
        if(res ==1) {
            return returnmsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnmsg.toString(String.valueOf(res),"删除失败");
        }
    }
    public String selectFeiyiZiyuan(){
        FeiyiZiyuanExample feiyiZiyuanExample = new FeiyiZiyuanExample();
        FeiyiZiyuanExample.Criteria criteria = feiyiZiyuanExample.createCriteria();
        List<FeiyiZiyuan> feiyiZiyuanList = feiyiZiyuanMapper.selectByExample(feiyiZiyuanExample);
        returnmsg.setData(feiyiZiyuanList);
        returnmsg.setCode("0");
        returnmsg.setMsg("成功");
        return returnmsg.toString();
    }
    public String updateFeiyiZiyuan(Long id,FeiyiZiyuan feiyiZiyuan){
        FeiyiZiyuanExample feiyiZiyuanExample = new FeiyiZiyuanExample();
        FeiyiZiyuanExample.Criteria criteria = feiyiZiyuanExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = feiyiZiyuanMapper.updateByExampleSelective(feiyiZiyuan,feiyiZiyuanExample);
        if(res ==1) {
            return returnmsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnmsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertFeiyiZiyuan(FeiyiZiyuan feiyiZiyuan){
        int res= feiyiZiyuanMapper.insertSelective(feiyiZiyuan);
        if(res ==1) {
            return returnmsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnmsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteFeiyiZiyuan(Long id){
        FeiyiZiyuanExample feiyiZiyuanExample = new FeiyiZiyuanExample();
        FeiyiZiyuanExample.Criteria criteria = feiyiZiyuanExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = feiyiZiyuanMapper.deleteByExample(feiyiZiyuanExample);
        if(res ==1) {
            return returnmsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnmsg.toString(String.valueOf(res),"删除失败");
        }
    }
    public String selectFangwu(){
        FangwuExample fangwuExample = new FangwuExample();
        FangwuExample.Criteria criteria = fangwuExample.createCriteria();
        List<Fangwu> fangwuList = fangwuMapper.selectByExample(fangwuExample);
        returnmsg.setData(fangwuList);
        returnmsg.setCode("0");
        returnmsg.setMsg("成功");
        return returnmsg.toString();
    }
    public String updateFangwu(Long id,Fangwu fangwu){
        FangwuExample fangwuExample = new FangwuExample();
        FangwuExample.Criteria criteria = fangwuExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = fangwuMapper.updateByExampleSelective(fangwu,fangwuExample);
        if(res ==1) {
            return returnmsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnmsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertFangwu(Fangwu fangwu){
        int res= fangwuMapper.insertSelective(fangwu);
        if(res ==1) {
            return returnmsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnmsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteFangwu(Long id){
        FangwuExample fangwuExample = new FangwuExample();
        FangwuExample.Criteria criteria = fangwuExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = fangwuMapper.deleteByExample(fangwuExample);
        if(res ==1) {
            return returnmsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnmsg.toString(String.valueOf(res),"删除失败");
        }
    }
    public String selectCunming(){
        CunmingExample cunmingExample = new CunmingExample();
        CunmingExample.Criteria criteria = cunmingExample.createCriteria();
        List<Cunming> cunmingList = cunmingMapper.selectByExample(cunmingExample);
        returnmsg.setData(cunmingList);
        returnmsg.setCode("0");
        returnmsg.setMsg("成功");
        return returnmsg.toString();
    }
    public String updateCunming(Integer huhao,Cunming cunming){
        CunmingExample cunmingExample = new CunmingExample();
        CunmingExample.Criteria criteria = cunmingExample.createCriteria();
        criteria.andHuhaoEqualTo(huhao);
        int res = cunmingMapper.updateByExampleSelective(cunming,cunmingExample);
        if(res ==1) {
            return returnmsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnmsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertCunming(Cunming cunming){
        int res= cunmingMapper.insertSelective(cunming);
        if(res ==1) {
            return returnmsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnmsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteCunming(Integer huhao){
        CunmingExample cunmingExample = new CunmingExample();
        CunmingExample.Criteria criteria = cunmingExample.createCriteria();
        criteria.andHuhaoEqualTo(huhao);
        int res = cunmingMapper.deleteByExample(cunmingExample);
        if(res ==1) {
            return returnmsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnmsg.toString(String.valueOf(res),"删除失败");
        }
    }
    public String selectDangyuan(){
        DangyuanExample dangyuanExample = new DangyuanExample();
        DangyuanExample.Criteria criteria = dangyuanExample.createCriteria();
        List<Dangyuan> dangyuanList = dangyuanMapper.selectByExample(dangyuanExample);
        returnmsg.setData(dangyuanList);
        returnmsg.setCode("0");
        returnmsg.setMsg("成功");
        return returnmsg.toString();
    }
    public String updateDangyuan(String huhao,Dangyuan dangyuan){
        DangyuanExample dangyuanExample = new DangyuanExample();
        DangyuanExample.Criteria criteria = dangyuanExample.createCriteria();
        criteria.andHuhaoEqualTo(huhao);
        int res = dangyuanMapper.updateByExampleSelective(dangyuan,dangyuanExample);
        if(res ==1) {
            return returnmsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnmsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertDangyuan(Dangyuan dangyuan){
        int res= dangyuanMapper.insertSelective(dangyuan);
        if(res ==1) {
            return returnmsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnmsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteDangyuan(String huhao){
        DangyuanExample dangyuanExample = new DangyuanExample();
        DangyuanExample.Criteria criteria = dangyuanExample.createCriteria();
        criteria.andHuhaoEqualTo(huhao);
        int res = dangyuanMapper.deleteByExample(dangyuanExample);
        if(res ==1) {
            return returnmsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnmsg.toString(String.valueOf(res),"删除失败");
        }
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
