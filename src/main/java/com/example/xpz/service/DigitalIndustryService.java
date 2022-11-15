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
    MimianJidiMapper mimianJidiMapper;
    @Autowired
    ChanyeJiansheMapper chanyeJiansheMapper;
    @Autowired
    LvyouXiangmuMapper lvyouXiangmuMapper;
    @Autowired
    ReturnMsg returnMsg;

    public String selectDigitalFactory(){
        DigitalFactoryExample digitalFactoryExample = new DigitalFactoryExample();
        DigitalFactoryExample.Criteria criteria = digitalFactoryExample.createCriteria();
        List<DigitalFactory> digitalFactoryList = digitalFactoryMapper.selectByExample(digitalFactoryExample);
        returnMsg.setData(digitalFactoryList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateDigitalFactory(Integer id,DigitalFactory digitalFactory){
        DigitalFactoryExample digitalFactoryExample = new DigitalFactoryExample();
        DigitalFactoryExample.Criteria criteria = digitalFactoryExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = digitalFactoryMapper.updateByExampleSelective(digitalFactory,digitalFactoryExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertDigitalFactory(DigitalFactory digitalFactory){
        int res= digitalFactoryMapper.insertSelective(digitalFactory);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteDigitalFactory(Integer id){
        DigitalFactoryExample digitalFactoryExample = new DigitalFactoryExample();
        DigitalFactoryExample.Criteria criteria = digitalFactoryExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = digitalFactoryMapper.deleteByExample(digitalFactoryExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }

    public String selectQicaiTianyuan(){
        QicaiTianyuanExample qicaiTianyuanExample = new QicaiTianyuanExample();
        QicaiTianyuanExample.Criteria criteria = qicaiTianyuanExample.createCriteria();
        List<QicaiTianyuan> qicaiTianyuanList = qicaiTianyuanMapper.selectByExample(qicaiTianyuanExample);
        returnMsg.setData(qicaiTianyuanList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateQicaiTianyuan(Integer id,QicaiTianyuan qicaiTianyuan){
        QicaiTianyuanExample qicaiTianyuanExample = new QicaiTianyuanExample();
        QicaiTianyuanExample.Criteria criteria = qicaiTianyuanExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = qicaiTianyuanMapper.updateByExampleSelective(qicaiTianyuan,qicaiTianyuanExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertQicaiTianyuan(QicaiTianyuan qicaiTianyuan){
        int res= qicaiTianyuanMapper.insertSelective(qicaiTianyuan);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteQicaiTianyuan(Integer id){
        QicaiTianyuanExample qicaiTianyuanExample = new QicaiTianyuanExample();
        QicaiTianyuanExample.Criteria criteria = qicaiTianyuanExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = qicaiTianyuanMapper.deleteByExample(qicaiTianyuanExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }

    public String selectAgriculture(){
        AgricultureExample agricultureExample = new AgricultureExample();
        AgricultureExample.Criteria criteria = agricultureExample.createCriteria();
        List<Agriculture> agricultureList = agricultureMapper.selectByExample(agricultureExample);
        returnMsg.setData(agricultureList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateAgriculture(Integer id,Agriculture agriculture){
        AgricultureExample agricultureExample = new AgricultureExample();
        AgricultureExample.Criteria criteria = agricultureExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = agricultureMapper.updateByExampleSelective(agriculture,agricultureExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertAgriculture(Agriculture agriculture){
        int res= agricultureMapper.insertSelective(agriculture);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteAgriculture(Integer id){
        AgricultureExample agricultureExample = new AgricultureExample();
        AgricultureExample.Criteria criteria = agricultureExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = agricultureMapper.deleteByExample(agricultureExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }

    public String selectLvyouXiangmu(){
        LvyouXiangmuExample lvyouXiangmuExample = new LvyouXiangmuExample();
        LvyouXiangmuExample.Criteria criteria = lvyouXiangmuExample.createCriteria();
        List<LvyouXiangmu> lvyouXiangmuList = lvyouXiangmuMapper.selectByExample(lvyouXiangmuExample);
        returnMsg.setData(lvyouXiangmuList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateLvyouXiangmu(Integer id,LvyouXiangmu lvyouXiangmu){
        LvyouXiangmuExample lvyouXiangmuExample = new LvyouXiangmuExample();
        LvyouXiangmuExample.Criteria criteria = lvyouXiangmuExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = lvyouXiangmuMapper.updateByExampleSelective(lvyouXiangmu,lvyouXiangmuExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertLvyouXiangmu(LvyouXiangmu lvyouXiangmu){
        int res= lvyouXiangmuMapper.insertSelective(lvyouXiangmu);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteLvyouXiangmu(Integer id){
        LvyouXiangmuExample lvyouXiangmuExample = new LvyouXiangmuExample();
        LvyouXiangmuExample.Criteria criteria = lvyouXiangmuExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = lvyouXiangmuMapper.deleteByExample(lvyouXiangmuExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }

    public String selectMimianJidi(){
        MimianJidiExample mimianJidiExample = new MimianJidiExample();
        MimianJidiExample.Criteria criteria = mimianJidiExample.createCriteria();
        List<MimianJidi> mimianJidiList = mimianJidiMapper.selectByExample(mimianJidiExample);
        returnMsg.setData(mimianJidiList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateMimianJidi(Integer id,MimianJidi mimianJidi){
        MimianJidiExample mimianJidiExample = new MimianJidiExample();
        MimianJidiExample.Criteria criteria = mimianJidiExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = mimianJidiMapper.updateByExampleSelective(mimianJidi,mimianJidiExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertMimianJidi(MimianJidi mimianJidi){
        int res= mimianJidiMapper.insertSelective(mimianJidi);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteMimianJidi(Integer id){
        MimianJidiExample mimianJidiExample = new MimianJidiExample();
        MimianJidiExample.Criteria criteria = mimianJidiExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = mimianJidiMapper.deleteByExample(mimianJidiExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }

    public String selectChanyeJianshe(){
        ChanyeJiansheExample chanyeJiansheExample = new ChanyeJiansheExample();
        ChanyeJiansheExample.Criteria criteria = chanyeJiansheExample.createCriteria();
        List<ChanyeJianshe> chanyeJiansheList = chanyeJiansheMapper.selectByExample(chanyeJiansheExample);
        returnMsg.setData(chanyeJiansheList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateChanyeJianshe(Integer id,ChanyeJianshe chanyeJianshe){
        ChanyeJiansheExample chanyeJiansheExample = new ChanyeJiansheExample();
        ChanyeJiansheExample.Criteria criteria = chanyeJiansheExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = chanyeJiansheMapper.updateByExampleSelective(chanyeJianshe,chanyeJiansheExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertChanyeJianshe(ChanyeJianshe chanyeJianshe){
        int res= chanyeJiansheMapper.insertSelective(chanyeJianshe);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteChanyeJianshe(Integer id){
        ChanyeJiansheExample chanyeJiansheExample = new ChanyeJiansheExample();
        ChanyeJiansheExample.Criteria criteria = chanyeJiansheExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = chanyeJiansheMapper.deleteByExample(chanyeJiansheExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }
//    public String selectTravelProgramByVillageId(int id){
//        List<TravelProgram> travelProgramList = travelProgramMapper.selectByVillageId(id);
//        returnMsg.setData(travelProgramList);
//        returnMsg.setCode("0");
//        returnMsg.setMsg("success");
//        return returnMsg.toString();
//    }
//    public String selectMimianJidiByVillageId(int id){
//        List<MimianJidi> mimianJidiList = mimianJidiMapper.selectByVillageId(id);
//        returnMsg.setData(mimianJidiList);
//        returnMsg.setCode("0");
//        returnMsg.setMsg("success");
//        return returnMsg.toString();
//    }
//    public String selectChanyeJiansheByVillageId(int id){
//        List<ChanyeJianshe> chanyeJiansheList = chanyeJiansheMapper.selectByVillageId(id);
//        returnMsg.setData(chanyeJiansheList);
//        returnMsg.setCode("0");
//        returnMsg.setMsg("success");
//        return returnMsg.toString();
//    }

}
