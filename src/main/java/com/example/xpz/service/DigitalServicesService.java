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
    NeighbourMapper neighbourMapper;
    @Autowired
    NeighbourfengcaiMapper neighbourfengcaiMapper;
    @Autowired
    KuaidiMapper kuaidiMapper;
    @Autowired
    ParkMapper parkMapper;
    @Autowired
    ZhihuiYanglaoMapper ZhihuiYanglaoMapper;
    @Autowired
    DanganMapper danganMapper;
    @Autowired
    WeishengshiMapper weishengshiMapper;
    @Autowired
    EducationMapper educationMapper;
    @Autowired
    ZhihuiYanglaoMapper zhihuiYanglaoMapper;
    @Autowired
    ReturnMsg returnMsg;


    public String selectNeighbour(){
        NeighbourExample neighbourExample = new NeighbourExample();
        NeighbourExample.Criteria criteria = neighbourExample.createCriteria();
        List<Neighbour> neighbourList = neighbourMapper.selectByExample(neighbourExample);
        returnMsg.setData(neighbourList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateNeighbour(Integer id,Neighbour neighbour){
        NeighbourExample neighbourExample = new NeighbourExample();
        NeighbourExample.Criteria criteria = neighbourExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = neighbourMapper.updateByExampleSelective(neighbour,neighbourExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertNeighbour(Neighbour neighbour){
        int res= neighbourMapper.insertSelective(neighbour);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteNeighbour(Integer id){
        NeighbourExample neighbourExample = new NeighbourExample();
        NeighbourExample.Criteria criteria = neighbourExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = neighbourMapper.deleteByExample(neighbourExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }

    public String selectNeighbourfengcai(){
        NeighbourfengcaiExample neighbourfengcaiExample = new NeighbourfengcaiExample();
        NeighbourfengcaiExample.Criteria criteria = neighbourfengcaiExample.createCriteria();
        List<Neighbourfengcai> neighbourfengcaiList = neighbourfengcaiMapper.selectByExample(neighbourfengcaiExample);
        returnMsg.setData(neighbourfengcaiList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateNeighbourfengcai(Integer id,Neighbourfengcai neighbourfengcai){
        NeighbourfengcaiExample neighbourfengcaiExample = new NeighbourfengcaiExample();
        NeighbourfengcaiExample.Criteria criteria = neighbourfengcaiExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = neighbourfengcaiMapper.updateByExampleSelective(neighbourfengcai,neighbourfengcaiExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertNeighbourfengcai(Neighbourfengcai neighbourfengcai){
        int res= neighbourfengcaiMapper.insertSelective(neighbourfengcai);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteNeighbourfengcai(Integer id){
        NeighbourfengcaiExample neighbourfengcaiExample = new NeighbourfengcaiExample();
        NeighbourfengcaiExample.Criteria criteria = neighbourfengcaiExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = neighbourfengcaiMapper.deleteByExample(neighbourfengcaiExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }

    public String selectKuaidi(){
        KuaidiExample kuaidiExample = new KuaidiExample();
        KuaidiExample.Criteria criteria = kuaidiExample.createCriteria();
        List<Kuaidi> kuaidiList = kuaidiMapper.selectByExample(kuaidiExample);
        returnMsg.setData(kuaidiList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateKuaidi(Long id,Kuaidi kuaidi){
        KuaidiExample kuaidiExample = new KuaidiExample();
        KuaidiExample.Criteria criteria = kuaidiExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = kuaidiMapper.updateByExampleSelective(kuaidi,kuaidiExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertKuaidi(Kuaidi kuaidi){
        int res= kuaidiMapper.insertSelective(kuaidi);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteKuaidi(Long id){
        KuaidiExample kuaidiExample = new KuaidiExample();
        KuaidiExample.Criteria criteria = kuaidiExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = kuaidiMapper.deleteByExample(kuaidiExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }

    public String selectPark(){
        ParkExample parkExample = new ParkExample();
        ParkExample.Criteria criteria = parkExample.createCriteria();
        List<Park> parkList = parkMapper.selectByExample(parkExample);
        returnMsg.setData(parkList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updatePark(Long id,Park park){
        ParkExample parkExample = new ParkExample();
        ParkExample.Criteria criteria = parkExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = parkMapper.updateByExampleSelective(park,parkExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertPark(Park park){
        int res= parkMapper.insertSelective(park);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deletePark(Long id){
        ParkExample parkExample = new ParkExample();
        ParkExample.Criteria criteria = parkExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = parkMapper.deleteByExample(parkExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }

    public String selectZhihuiYanglao(){
        ZhihuiYanglaoExample zhihuiYanglaoExample = new ZhihuiYanglaoExample();
        ZhihuiYanglaoExample.Criteria criteria = zhihuiYanglaoExample.createCriteria();
        List<ZhihuiYanglao> zhihuiYanglaoList = zhihuiYanglaoMapper.selectByExample(zhihuiYanglaoExample);
        returnMsg.setData(zhihuiYanglaoList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateZhihuiYanglao(Integer id,ZhihuiYanglao zhihuiYanglao){
        ZhihuiYanglaoExample zhihuiYanglaoExample = new ZhihuiYanglaoExample();
        ZhihuiYanglaoExample.Criteria criteria = zhihuiYanglaoExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = zhihuiYanglaoMapper.updateByExampleSelective(zhihuiYanglao,zhihuiYanglaoExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertZhihuiYanglao(ZhihuiYanglao zhihuiYanglao){
        int res= zhihuiYanglaoMapper.insertSelective(zhihuiYanglao);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteZhihuiYanglao(Integer id){
        ZhihuiYanglaoExample zhihuiYanglaoExample = new ZhihuiYanglaoExample();
        ZhihuiYanglaoExample.Criteria criteria = zhihuiYanglaoExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = zhihuiYanglaoMapper.deleteByExample(zhihuiYanglaoExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }

    public String selectDangan(){
        DanganExample danganExample = new DanganExample();
        DanganExample.Criteria criteria = danganExample.createCriteria();
        List<Dangan> danganList = danganMapper.selectByExample(danganExample);
        returnMsg.setData(danganList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateDangan(Integer id,Dangan dangan){
        DanganExample danganExample = new DanganExample();
        DanganExample.Criteria criteria = danganExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = danganMapper.updateByExampleSelective(dangan,danganExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertDangan(Dangan dangan){
        int res= danganMapper.insertSelective(dangan);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteDangan(Integer id){
        DanganExample danganExample = new DanganExample();
        DanganExample.Criteria criteria = danganExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = danganMapper.deleteByExample(danganExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }
    public String selectWeishengshi(){
        WeishengshiExample weishengshiExample = new WeishengshiExample();
        WeishengshiExample.Criteria criteria = weishengshiExample.createCriteria();
        List<Weishengshi> weishengshiList = weishengshiMapper.selectByExample(weishengshiExample);
        returnMsg.setData(weishengshiList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateWeishengshi(Integer id,Weishengshi weishengshi){
        WeishengshiExample weishengshiExample = new WeishengshiExample();
        WeishengshiExample.Criteria criteria = weishengshiExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = weishengshiMapper.updateByExampleSelective(weishengshi,weishengshiExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertWeishengshi(Weishengshi weishengshi){
        int res= weishengshiMapper.insertSelective(weishengshi);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteWeishengshi(Integer id){
        WeishengshiExample weishengshiExample = new WeishengshiExample();
        WeishengshiExample.Criteria criteria = weishengshiExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = weishengshiMapper.deleteByExample(weishengshiExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }

    public String selectEducation(){
        EducationExample educationExample = new EducationExample();
        EducationExample.Criteria criteria = educationExample.createCriteria();
        List<Education> educationList = educationMapper.selectByExample(educationExample);
        returnMsg.setData(educationList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateEducation(Integer id,Education education){
        EducationExample educationExample = new EducationExample();
        EducationExample.Criteria criteria = educationExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = educationMapper.updateByExampleSelective(education,educationExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertEducation(Education education){
        int res= educationMapper.insertSelective(education);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteEducation(Integer id){
        EducationExample educationExample = new EducationExample();
        EducationExample.Criteria criteria = educationExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = educationMapper.deleteByExample(educationExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }
    


}
