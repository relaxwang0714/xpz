package com.example.xpz.service;

import com.example.xpz.entity.*;
import com.example.xpz.mapper.*;
import com.example.xpz.utils.ReturnMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PowerStrongService {
    @Autowired
    TudiliuzhuanMapper tudiliuzhuanMapper;
    @Autowired
    ChengbaoMapper chengbaoMapper;
    @Autowired
    ZichanKeshiMapper zichanKeshiMapper;
    @Autowired
    ChuangkeMapper chuangkeMapper;
    @Autowired
    ChuangyeProgramMapper chuangyeProgramMapper;
    @Autowired
    ZufangGuanjiaMapper zufangGuanjiaMapper;
    @Autowired
    ZiyuanIncomeMapper ziyuanIncomeMapper;
    @Autowired
    LaodongliIncomeMapper laodongliIncomeMapper;
    @Autowired
    TeseChanpinMapper teseChanpinMapper;
    @Autowired
    ReturnMsg returnMsg;

    public String selectTudiliuzhuan(){
        TudiliuzhuanExample tudiliuzhuanExample = new TudiliuzhuanExample();
        TudiliuzhuanExample.Criteria criteria = tudiliuzhuanExample.createCriteria();
        List<Tudiliuzhuan> tudiliuzhuanList = tudiliuzhuanMapper.selectByExample(tudiliuzhuanExample);
        returnMsg.setData(tudiliuzhuanList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateTudiliuzhuan(Integer id,Tudiliuzhuan tudiliuzhuan){
        TudiliuzhuanExample tudiliuzhuanExample = new TudiliuzhuanExample();
        TudiliuzhuanExample.Criteria criteria = tudiliuzhuanExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = tudiliuzhuanMapper.updateByExampleSelective(tudiliuzhuan,tudiliuzhuanExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertTudiliuzhuan(Tudiliuzhuan tudiliuzhuan){
        int res= tudiliuzhuanMapper.insertSelective(tudiliuzhuan);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteTudiliuzhuan(Integer id){
        TudiliuzhuanExample tudiliuzhuanExample = new TudiliuzhuanExample();
        TudiliuzhuanExample.Criteria criteria = tudiliuzhuanExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = tudiliuzhuanMapper.deleteByExample(tudiliuzhuanExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }

    public String selectChengbao(){
        ChengbaoExample chengbaoExample = new ChengbaoExample();
        ChengbaoExample.Criteria criteria = chengbaoExample.createCriteria();
        List<Chengbao> chengbaoList = chengbaoMapper.selectByExample(chengbaoExample);
        returnMsg.setData(chengbaoList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateChengbao(Integer id,Chengbao chengbao){
        ChengbaoExample chengbaoExample = new ChengbaoExample();
        ChengbaoExample.Criteria criteria = chengbaoExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = chengbaoMapper.updateByExampleSelective(chengbao,chengbaoExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertChengbao(Chengbao chengbao){
        int res= chengbaoMapper.insertSelective(chengbao);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteChengbao(Integer id){
        ChengbaoExample chengbaoExample = new ChengbaoExample();
        ChengbaoExample.Criteria criteria = chengbaoExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = chengbaoMapper.deleteByExample(chengbaoExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }

    public String selectZichanKeshi(){
        ZichanKeshiExample zichanKeshiExample = new ZichanKeshiExample();
        ZichanKeshiExample.Criteria criteria = zichanKeshiExample.createCriteria();
        List<ZichanKeshi> zichanKeshiList = zichanKeshiMapper.selectByExample(zichanKeshiExample);
        returnMsg.setData(zichanKeshiList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateZichanKeshi(Integer id,ZichanKeshi zichanKeshi){
        ZichanKeshiExample zichanKeshiExample = new ZichanKeshiExample();
        ZichanKeshiExample.Criteria criteria = zichanKeshiExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = zichanKeshiMapper.updateByExampleSelective(zichanKeshi,zichanKeshiExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertZichanKeshi(ZichanKeshi zichanKeshi){
        int res= zichanKeshiMapper.insertSelective(zichanKeshi);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteZichanKeshi(Integer id){
        ZichanKeshiExample zichanKeshiExample = new ZichanKeshiExample();
        ZichanKeshiExample.Criteria criteria = zichanKeshiExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = zichanKeshiMapper.deleteByExample(zichanKeshiExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }

    public String selectChuangke(){
        ChuangkeExample chuangkeExample = new ChuangkeExample();
        ChuangkeExample.Criteria criteria = chuangkeExample.createCriteria();
        List<Chuangke> chuangkeList = chuangkeMapper.selectByExample(chuangkeExample);
        returnMsg.setData(chuangkeList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateChuangke(Integer id,Chuangke chuangke){
        ChuangkeExample chuangkeExample = new ChuangkeExample();
        ChuangkeExample.Criteria criteria = chuangkeExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = chuangkeMapper.updateByExampleSelective(chuangke,chuangkeExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertChuangke(Chuangke chuangke){
        int res= chuangkeMapper.insertSelective(chuangke);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteChuangke(Integer id){
        ChuangkeExample chuangkeExample = new ChuangkeExample();
        ChuangkeExample.Criteria criteria = chuangkeExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = chuangkeMapper.deleteByExample(chuangkeExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }
    
    public String selectChuangyeProgram(){
        ChuangyeProgramExample chuangyeProgramExample = new ChuangyeProgramExample();
        ChuangyeProgramExample.Criteria criteria = chuangyeProgramExample.createCriteria();
        List<ChuangyeProgram> chuangyeProgramList = chuangyeProgramMapper.selectByExample(chuangyeProgramExample);
        returnMsg.setData(chuangyeProgramList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateChuangyeProgram(Integer id,ChuangyeProgram chuangyeProgram){
        ChuangyeProgramExample chuangyeProgramExample = new ChuangyeProgramExample();
        ChuangyeProgramExample.Criteria criteria = chuangyeProgramExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = chuangyeProgramMapper.updateByExampleSelective(chuangyeProgram,chuangyeProgramExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertChuangyeProgram(ChuangyeProgram chuangyeProgram){
        int res= chuangyeProgramMapper.insertSelective(chuangyeProgram);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteChuangyeProgram(Integer id){
        ChuangyeProgramExample chuangyeProgramExample = new ChuangyeProgramExample();
        ChuangyeProgramExample.Criteria criteria = chuangyeProgramExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = chuangyeProgramMapper.deleteByExample(chuangyeProgramExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }

    public String selectZiyuanIncome(){
        ZiyuanIncomeExample ziyuanIncomeExample = new ZiyuanIncomeExample();
        ZiyuanIncomeExample.Criteria criteria = ziyuanIncomeExample.createCriteria();
        List<ZiyuanIncome> ziyuanIncomeList = ziyuanIncomeMapper.selectByExample(ziyuanIncomeExample);
        returnMsg.setData(ziyuanIncomeList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateZiyuanIncome(Integer id,ZiyuanIncome ziyuanIncome){
        ZiyuanIncomeExample ziyuanIncomeExample = new ZiyuanIncomeExample();
        ZiyuanIncomeExample.Criteria criteria = ziyuanIncomeExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = ziyuanIncomeMapper.updateByExampleSelective(ziyuanIncome,ziyuanIncomeExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertZiyuanIncome(ZiyuanIncome ziyuanIncome){
        int res= ziyuanIncomeMapper.insertSelective(ziyuanIncome);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteZiyuanIncome(Integer id){
        ZiyuanIncomeExample ziyuanIncomeExample = new ZiyuanIncomeExample();
        ZiyuanIncomeExample.Criteria criteria = ziyuanIncomeExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = ziyuanIncomeMapper.deleteByExample(ziyuanIncomeExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }

    public String selectLaodongliIncome(){
        LaodongliIncomeExample laodongliIncomeExample = new LaodongliIncomeExample();
        LaodongliIncomeExample.Criteria criteria = laodongliIncomeExample.createCriteria();
        List<LaodongliIncome> laodongliIncomeList = laodongliIncomeMapper.selectByExample(laodongliIncomeExample);
        returnMsg.setData(laodongliIncomeList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateLaodongliIncome(Integer id,LaodongliIncome laodongliIncome){
        LaodongliIncomeExample laodongliIncomeExample = new LaodongliIncomeExample();
        LaodongliIncomeExample.Criteria criteria = laodongliIncomeExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = laodongliIncomeMapper.updateByExampleSelective(laodongliIncome,laodongliIncomeExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertLaodongliIncome(LaodongliIncome laodongliIncome){
        int res= laodongliIncomeMapper.insertSelective(laodongliIncome);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteLaodongliIncome(Integer id){
        LaodongliIncomeExample laodongliIncomeExample = new LaodongliIncomeExample();
        LaodongliIncomeExample.Criteria criteria = laodongliIncomeExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = laodongliIncomeMapper.deleteByExample(laodongliIncomeExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }


    public String selectTeseChanpin(){
        TeseChanpinExample teseChanpinExample = new TeseChanpinExample();
        TeseChanpinExample.Criteria criteria = teseChanpinExample.createCriteria();
        List<TeseChanpin> teseChanpinList = teseChanpinMapper.selectByExample(teseChanpinExample);
        returnMsg.setData(teseChanpinList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateTeseChanpin(Integer id,TeseChanpin teseChanpin){
        TeseChanpinExample teseChanpinExample = new TeseChanpinExample();
        TeseChanpinExample.Criteria criteria = teseChanpinExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = teseChanpinMapper.updateByExampleSelective(teseChanpin,teseChanpinExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertTeseChanpin(TeseChanpin teseChanpin){
        int res= teseChanpinMapper.insertSelective(teseChanpin);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteTeseChanpin(Integer id){
        TeseChanpinExample teseChanpinExample = new TeseChanpinExample();
        TeseChanpinExample.Criteria criteria = teseChanpinExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = teseChanpinMapper.deleteByExample(teseChanpinExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }


    public String selectZufangGuanjia(){
        ZufangGuanjiaExample zufangGuanjiaExample = new ZufangGuanjiaExample();
        ZufangGuanjiaExample.Criteria criteria = zufangGuanjiaExample.createCriteria();
        List<ZufangGuanjia> zufangGuanjiaList = zufangGuanjiaMapper.selectByExample(zufangGuanjiaExample);
        returnMsg.setData(zufangGuanjiaList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateZufangGuanjia(Integer id,ZufangGuanjia zufangGuanjia){
        ZufangGuanjiaExample zufangGuanjiaExample = new ZufangGuanjiaExample();
        ZufangGuanjiaExample.Criteria criteria = zufangGuanjiaExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = zufangGuanjiaMapper.updateByExampleSelective(zufangGuanjia,zufangGuanjiaExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertZufangGuanjia(ZufangGuanjia zufangGuanjia){
        int res= zufangGuanjiaMapper.insertSelective(zufangGuanjia);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "新增成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"新增失败");
        }
    }
    public String deleteZufangGuanjia(Integer id){
        ZufangGuanjiaExample zufangGuanjiaExample = new ZufangGuanjiaExample();
        ZufangGuanjiaExample.Criteria criteria = zufangGuanjiaExample.createCriteria();
        criteria.andIdEqualTo(id);
        int res = zufangGuanjiaMapper.deleteByExample(zufangGuanjiaExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }
}
