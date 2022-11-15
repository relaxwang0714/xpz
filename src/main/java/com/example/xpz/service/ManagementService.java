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
    VillageManagementMapper villageManagementMapper;
    @Autowired
    CurrentDataMapper currentdataMapper;
    @Autowired
    GuihuadataMapper guihuadataMapper;

    @Autowired
    ConstructionListMapper constructionlistMapper;

    @Autowired
    DesignMapper designMapper;

    @Autowired
    ReturnMsg returnMsg;

    public String selectDesign(){
        DesignExample designExample = new DesignExample();
        DesignExample.Criteria criteria = designExample.createCriteria();
        List<Design> designList = designMapper.selectByExample(designExample);
        returnMsg.setData(designList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateDesign(Long id,Design design){
        DesignExample designExample = new DesignExample();
        DesignExample.Criteria criteria = designExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = designMapper.updateByExampleSelective(design,designExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertDesign(Design design){
        int res= designMapper.insertSelective(design);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteDesign(Long id){
        DesignExample designExample = new DesignExample();
        DesignExample.Criteria criteria = designExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = designMapper.deleteByExample(designExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }

    public String selectCurrentdata(){
        CurrentdataExample currentdataExample = new CurrentdataExample();
        CurrentdataExample.Criteria criteria = currentdataExample.createCriteria();
        List<Currentdata> currentdataList = currentdataMapper.selectByExample(currentdataExample);
        returnMsg.setData(currentdataList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateCurrentdata(Integer id,Currentdata currentdata){
        CurrentdataExample currentdataExample = new CurrentdataExample();
        CurrentdataExample.Criteria criteria = currentdataExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = currentdataMapper.updateByExampleSelective(currentdata,currentdataExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertCurrentdata(Currentdata currentdata){
        int res= currentdataMapper.insertSelective(currentdata);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteCurrentdata(Integer id){
        CurrentdataExample currentdataExample = new CurrentdataExample();
        CurrentdataExample.Criteria criteria = currentdataExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = currentdataMapper.deleteByExample(currentdataExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }

    public String selectGuihuadata(){
        GuihuadataExample guihuadataExample = new GuihuadataExample();
        GuihuadataExample.Criteria criteria = guihuadataExample.createCriteria();
        List<Guihuadata> guihuadataList = guihuadataMapper.selectByExample(guihuadataExample);
        returnMsg.setData(guihuadataList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateGuihuadata(Long id,Guihuadata guihuadata){
        GuihuadataExample guihuadataExample = new GuihuadataExample();
        GuihuadataExample.Criteria criteria = guihuadataExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = guihuadataMapper.updateByExampleSelective(guihuadata,guihuadataExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertGuihuadata(Guihuadata guihuadata){
        int res= guihuadataMapper.insertSelective(guihuadata);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteGuihuadata(Long id){
        GuihuadataExample guihuadataExample = new GuihuadataExample();
        GuihuadataExample.Criteria criteria = guihuadataExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = guihuadataMapper.deleteByExample(guihuadataExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }
    public String selectConstructionlist(){
        ConstructionListExample constructionlistExample = new ConstructionListExample();
        ConstructionListExample.Criteria criteria = constructionlistExample.createCriteria();
        List<ConstructionList> constructionlistList = constructionlistMapper.selectByExample(constructionlistExample);
        returnMsg.setData(constructionlistList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateConstructionlist(Long id,ConstructionList constructionlist){
        ConstructionListExample constructionlistExample = new ConstructionListExample();
        ConstructionListExample.Criteria criteria = constructionlistExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = constructionlistMapper.updateByExampleSelective(constructionlist,constructionlistExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertConstructionlist(ConstructionList constructionlist){
        int res= constructionlistMapper.insertSelective(constructionlist);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteConstructionlist(Long id){
        ConstructionListExample constructionlistExample = new ConstructionListExample();
        ConstructionListExample.Criteria criteria = constructionlistExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = constructionlistMapper.deleteByExample(constructionlistExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }

//    public String selectCountyujinByByVillageId(int id){
//
//        Yujin yujins =villageManagementMapper.CountyujinByVillageId(id);
//        JSONObject jsonObject = (JSONObject) JSONObject.toJSON(yujins);
//        return jsonObject.toString();
//    }
//    public String selectCountGaizaoByByVillageId(int id){
//
//        Gaizao gaizao =villageManagementMapper.CountGaizaoByVillageId(id);
//        JSONObject jsonObject = (JSONObject) JSONObject.toJSON(gaizao);
//        return jsonObject.toString();
//    }

}
