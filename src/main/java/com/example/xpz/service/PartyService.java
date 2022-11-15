package com.example.xpz.service;

import com.example.xpz.entity.*;
import com.example.xpz.mapper.DangjianFaciltyMapper;
import com.example.xpz.mapper.DangyuanFazhanMapper;
import com.example.xpz.mapper.DangyuanFengcaiMapper;
import com.example.xpz.mapper.MeetingMapper;
import com.example.xpz.utils.ReturnMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartyService {
    @Autowired
    ReturnMsg returnMsg;
    @Autowired
    MeetingMapper meetingMapper;
    @Autowired
    DangyuanFazhanMapper dangyuanFazhanMapper;
    @Autowired
    DangyuanFengcaiMapper dangyuanFengcaiMapper;
    @Autowired
    DangjianFaciltyMapper dangjianFaciltyMapper;



    public String selectDangjianFacilty(){
        DangjianFaciltyExample dangjianFaciltyExample = new DangjianFaciltyExample();
        DangjianFaciltyExample.Criteria criteria = dangjianFaciltyExample.createCriteria();
        List<DangjianFacilty> dangjianFaciltyList = dangjianFaciltyMapper.selectByExample(dangjianFaciltyExample);
        returnMsg.setData(dangjianFaciltyList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateDangjianFacilty(Long id,DangjianFaciltyWithBLOBs dangjianFacilty){
        DangjianFaciltyExample dangjianFaciltyExample = new DangjianFaciltyExample();
        DangjianFaciltyExample.Criteria criteria = dangjianFaciltyExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = dangjianFaciltyMapper.updateByExampleSelective(dangjianFacilty,dangjianFaciltyExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertDangjianFacilty(DangjianFaciltyWithBLOBs dangjianFacilty){
        int res= dangjianFaciltyMapper.insertSelective(dangjianFacilty);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteDangjianFacilty(Long id){
        DangjianFaciltyExample dangjianFaciltyExample = new DangjianFaciltyExample();
        DangjianFaciltyExample.Criteria criteria = dangjianFaciltyExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = dangjianFaciltyMapper.deleteByExample(dangjianFaciltyExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }
//    public String selectfacilityByVillageId(int id){
//        List<Facility> facilityList = facilityMapper.selectByVillageId(id);
//        returnMsg.setData(facilityList);
//        returnMsg.setCode("0");
//        returnMsg.setMsg("成功");
//        return returnMsg.toString();
//    }

    public String selectMeeting(){
        MeetingExample meetingExample = new MeetingExample();
        MeetingExample.Criteria criteria = meetingExample.createCriteria();
        List<Meeting> meetingList = meetingMapper.selectByExample(meetingExample);
        returnMsg.setData(meetingList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateMeeting(Integer id,Meeting meeting){
        MeetingExample meetingExample = new MeetingExample();
        MeetingExample.Criteria criteria = meetingExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = meetingMapper.updateByExampleSelective(meeting,meetingExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertMeeting(Meeting meeting){
        int res= meetingMapper.insertSelective(meeting);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteMeeting(Integer id){
        MeetingExample meetingExample = new MeetingExample();
        MeetingExample.Criteria criteria = meetingExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = meetingMapper.deleteByExample(meetingExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }

    public String selectDangyuanFengcai(){
        DangyuanFengcaiExample dangyuanFengcaiExample = new DangyuanFengcaiExample();
        DangyuanFengcaiExample.Criteria criteria = dangyuanFengcaiExample.createCriteria();
        List<DangyuanFengcai> dangyuanFengcaiList = dangyuanFengcaiMapper.selectByExample(dangyuanFengcaiExample);
        returnMsg.setData(dangyuanFengcaiList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateDangyuanFengcai(Long id,DangyuanFengcai dangyuanFengcai){
        DangyuanFengcaiExample dangyuanFengcaiExample = new DangyuanFengcaiExample();
        DangyuanFengcaiExample.Criteria criteria = dangyuanFengcaiExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = dangyuanFengcaiMapper.updateByExampleSelective(dangyuanFengcai,dangyuanFengcaiExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertDangyuanFengcai(DangyuanFengcai dangyuanFengcai){
        int res= dangyuanFengcaiMapper.insertSelective(dangyuanFengcai);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteDangyuanFengcai(Long id){
        DangyuanFengcaiExample dangyuanFengcaiExample = new DangyuanFengcaiExample();
        DangyuanFengcaiExample.Criteria criteria = dangyuanFengcaiExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = dangyuanFengcaiMapper.deleteByExample(dangyuanFengcaiExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }

    public String selectDangyuanFazhan(){
        DangyuanFazhanExample dangyuanFazhanExample = new DangyuanFazhanExample();
        DangyuanFazhanExample.Criteria criteria = dangyuanFazhanExample.createCriteria();
        List<DangyuanFazhan> dangyuanFazhanList = dangyuanFazhanMapper.selectByExample(dangyuanFazhanExample);
        returnMsg.setData(dangyuanFazhanList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateDangyuanFazhan(Long id,DangyuanFazhan dangyuanFazhan){
        DangyuanFazhanExample dangyuanFazhanExample = new DangyuanFazhanExample();
        DangyuanFazhanExample.Criteria criteria = dangyuanFazhanExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = dangyuanFazhanMapper.updateByExampleSelective(dangyuanFazhan,dangyuanFazhanExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertDangyuanFazhan(DangyuanFazhan dangyuanFazhan){
        int res= dangyuanFazhanMapper.insertSelective(dangyuanFazhan);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteDangyuanFazhan(Long id){
        DangyuanFazhanExample dangyuanFazhanExample = new DangyuanFazhanExample();
        DangyuanFazhanExample.Criteria criteria = dangyuanFazhanExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = dangyuanFazhanMapper.deleteByExample(dangyuanFazhanExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }

//
//    public String selectPartyFengcaiByVillageId(int id){
//        List<PartyFengcai> partyFengcaiList = partyFengcaiMapper.selectByVillageId(id);
//        returnmsg.setData(partyFengcaiList);
//        returnmsg.setCode("0");
//        returnmsg.setMsg("成功");
//        return returnmsg.toString();
//    }
//    public String selectPartyFazhanByVillageId(int id){
//        List<PartyFazhan> partyFazhanList = partyFazhanMapper.selectByVillageId(id);
//        returnmsg.setData(partyFazhanList);
//        returnmsg.setCode("0");
//        returnmsg.setMsg("成功");
//        return returnmsg.toString();
//    }

}
