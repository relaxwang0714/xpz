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
    CunMingManyiduMapper CunMingManyiduMapper;
    @Autowired
    WeixinyuanMapper weixinyuanMapper;
    @Autowired
    ReturnMsg returnMsg;
    public String selectTingyuan(){
        TingyuanExample tingyuanExample = new TingyuanExample();
        TingyuanExample.Criteria criteria = tingyuanExample.createCriteria();
        List<TingyuanWithBLOBs> tingyuanList = tingyuanMapper.selectByExampleWithBLOBs(tingyuanExample);
        returnMsg.setData(tingyuanList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateTingyuan(Integer id,TingyuanWithBLOBs tingyuan){
        TingyuanExample tingyuanExample = new TingyuanExample();
        TingyuanExample.Criteria criteria = tingyuanExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = tingyuanMapper.updateByExampleSelective(tingyuan,tingyuanExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertTingyuan(TingyuanWithBLOBs tingyuan){
        int res= tingyuanMapper.insertSelective(tingyuan);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteTingyuan(Integer id){
        TingyuanExample tingyuanExample = new TingyuanExample();
        TingyuanExample.Criteria criteria = tingyuanExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = tingyuanMapper.deleteByExample(tingyuanExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }

    public String selectTrashClassfication(){
        TrashClassficationExample trashClassficationExample = new TrashClassficationExample();
        TrashClassficationExample.Criteria criteria = trashClassficationExample.createCriteria();
        List<TrashClassfication> trashClassficationList = trashClassficationMapper.selectByExample(trashClassficationExample);
        returnMsg.setData(trashClassficationList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateTrashClassfication(Integer id,TrashClassfication trashClassfication){
        TrashClassficationExample trashClassficationExample = new TrashClassficationExample();
        TrashClassficationExample.Criteria criteria = trashClassficationExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = trashClassficationMapper.updateByExampleSelective(trashClassfication,trashClassficationExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertTrashClassfication(TrashClassfication trashClassfication){
        int res= trashClassficationMapper.insertSelective(trashClassfication);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteTrashClassfication(Integer id){
        TrashClassficationExample trashClassficationExample = new TrashClassficationExample();
        TrashClassficationExample.Criteria criteria = trashClassficationExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = trashClassficationMapper.deleteByExample(trashClassficationExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }

    public String selectWeishengBaojie(Integer isLuzhang){
        WeishengBaojieExample weishengBaojieExample = new WeishengBaojieExample();
        WeishengBaojieExample.Criteria criteria = weishengBaojieExample.createCriteria();
        criteria.andIsLuzhangEqualTo(isLuzhang);
        List<WeishengBaojie> weishengBaojieList = weishengBaojieMapper.selectByExampleWithBLOBs(weishengBaojieExample);
        returnMsg.setData(weishengBaojieList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateWeishengBaojie(Integer id,WeishengBaojie weishengBaojie){
        WeishengBaojieExample weishengBaojieExample = new WeishengBaojieExample();
        WeishengBaojieExample.Criteria criteria = weishengBaojieExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = weishengBaojieMapper.updateByExampleSelective(weishengBaojie,weishengBaojieExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertWeishengBaojie(WeishengBaojie weishengBaojie){
        int res= weishengBaojieMapper.insertSelective(weishengBaojie);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteWeishengBaojie(Integer id){
        WeishengBaojieExample weishengBaojieExample = new WeishengBaojieExample();
        WeishengBaojieExample.Criteria criteria = weishengBaojieExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = weishengBaojieMapper.deleteByExample(weishengBaojieExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }

    public String selectCunMingManyidu(){
        CunMingManyiduExample CunMingManyiduExample = new CunMingManyiduExample();
        CunMingManyiduExample.Criteria criteria = CunMingManyiduExample.createCriteria();
        List<CunMingManyidu> CunMingManyiduList = CunMingManyiduMapper.selectByExample(CunMingManyiduExample);
        returnMsg.setData(CunMingManyiduList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateCunMingManyidu(Integer id,CunMingManyidu CunMingManyidu){
        CunMingManyiduExample CunMingManyiduExample = new CunMingManyiduExample();
        CunMingManyiduExample.Criteria criteria = CunMingManyiduExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = CunMingManyiduMapper.updateByExampleSelective(CunMingManyidu,CunMingManyiduExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertCunMingManyidu(CunMingManyidu CunMingManyidu){
        int res= CunMingManyiduMapper.insertSelective(CunMingManyidu);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteCunMingManyidu(Integer id){
        CunMingManyiduExample CunMingManyiduExample = new CunMingManyiduExample();
        CunMingManyiduExample.Criteria criteria = CunMingManyiduExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = CunMingManyiduMapper.deleteByExample(CunMingManyiduExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }

    public String selectWeixinyuan(){
        WeixinyuanExample weixinyuanExample = new WeixinyuanExample();
        WeixinyuanExample.Criteria criteria = weixinyuanExample.createCriteria();
        List<Weixinyuan> weixinyuanList = weixinyuanMapper.selectByExample(weixinyuanExample);
        returnMsg.setData(weixinyuanList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateWeixinyuan(Integer id,Weixinyuan weixinyuan){
        WeixinyuanExample weixinyuanExample = new WeixinyuanExample();
        WeixinyuanExample.Criteria criteria = weixinyuanExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = weixinyuanMapper.updateByExampleSelective(weixinyuan,weixinyuanExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertWeixinyuan(Weixinyuan weixinyuan){
        int res= weixinyuanMapper.insertSelective(weixinyuan);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteWeixinyuan(Integer id){
        WeixinyuanExample weixinyuanExample = new WeixinyuanExample();
        WeixinyuanExample.Criteria criteria = weixinyuanExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = weixinyuanMapper.deleteByExample(weixinyuanExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }


}
