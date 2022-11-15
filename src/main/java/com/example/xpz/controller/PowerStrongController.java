package com.example.xpz.controller;

import com.example.xpz.entity.*;
import com.example.xpz.service.PowerStrongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/powerStrong")
public class PowerStrongController {
    @Autowired
    PowerStrongService powerStrongService;
    @GetMapping("/zufangGuanjia")
    public String zufangGuanjiaSelect(HttpServletRequest request){
        return powerStrongService.selectZufangGuanjia();
    }
    @PutMapping("/zufangGuanjia/{id}")
    public String zufangGuanjiaUpdate(HttpServletRequest request, @PathVariable("id")Integer id, @RequestBody ZufangGuanjia zufangGuanjia){
        return powerStrongService.updateZufangGuanjia(id,zufangGuanjia);
    }
    @PostMapping("/zufangGuanjia")
    public String zufangGuanjiaInsert(HttpServletRequest request,@RequestBody ZufangGuanjia zufangGuanjia){
        return powerStrongService.insertZufangGuanjia(zufangGuanjia);
    }
    @DeleteMapping("/zufangGuanjia/{id}")
    public String zufangGuanjiaDelete(HttpServletRequest request,@PathVariable("id")Integer id){
        return powerStrongService.deleteZufangGuanjia(id);
    }
    @GetMapping("/zichanKeshi")
    public String zichanKeshiSelect(HttpServletRequest request){
        return powerStrongService.selectZichanKeshi();
    }
    @PutMapping("/zichanKeshi/{id}")
    public String zichanKeshiUpdate(HttpServletRequest request, @PathVariable("id")Integer id, @RequestBody ZichanKeshi zichanKeshi){
        return powerStrongService.updateZichanKeshi(id,zichanKeshi);
    }
    @PostMapping("/zichanKeshi")
    public String zichanKeshiInsert(HttpServletRequest request, @RequestBody ZichanKeshi zichanKeshi){
        return powerStrongService.insertZichanKeshi(zichanKeshi);
    }
    @DeleteMapping("/zichanKeshi/{id}")
    public String zichanKeshiDelete(HttpServletRequest request,@PathVariable("id")Integer id){
        return powerStrongService.deleteZichanKeshi(id);
    }
    @GetMapping("/chengbao")
    public String chengbaoSelect(HttpServletRequest request){
        return powerStrongService.selectChengbao();
    }
    @PostMapping("/chengbao")
    public String chengbaoInsert(HttpServletRequest request, @RequestBody Chengbao chengbao){
        return powerStrongService.insertChengbao(chengbao);
    }
    @DeleteMapping("/chengbao/{id}")
    public String chengbaoDelete(HttpServletRequest request,@PathVariable("id")Integer id){
        return powerStrongService.deleteChengbao(id);
    }
    @PutMapping("/chengbao/{id}")
    public String chengbaoUpdate(HttpServletRequest request,@PathVariable("id")Integer id,@RequestBody Chengbao chengbao){
        return powerStrongService.updateChengbao(id,chengbao);
    }
    @GetMapping("/chuangke")
    public String chuangkeSelect(HttpServletRequest request){
        return powerStrongService.selectChuangke();
    }
    @PostMapping("/chuangke")
    public String chuangkeInsert(HttpServletRequest request,@RequestBody Chuangke chuangke){
        return powerStrongService.insertChuangke(chuangke);
    }
    @DeleteMapping("/chuangke/{id}")
    public String chuangkeDelete(HttpServletRequest request,@PathVariable("id")Integer id){
        return powerStrongService.deleteChuangke(id);
    }
    @PutMapping("/chuangke/{id}")
    public String chuangkeUpdate(HttpServletRequest request,@PathVariable("id")Integer id,@RequestBody Chuangke chuangke){
        return powerStrongService.updateChuangke(id,chuangke);
    }
    @GetMapping("/chuangyeProgram")
    public String chuangyeProgramSelect(HttpServletRequest request){
        return powerStrongService.selectChuangyeProgram();
    }
    @PostMapping("/chuangyeProgram")
    public String chuangyeProgramInsert(HttpServletRequest request,@RequestBody ChuangyeProgram chuangyeProgram){
        return powerStrongService.insertChuangyeProgram(chuangyeProgram);
    }
    @DeleteMapping("/chuangyeProgram/{id}")
    public String chuangyeProgramDelete(HttpServletRequest request,@PathVariable("id")Integer id){
        return powerStrongService.deleteChuangyeProgram(id);
    }
    @PutMapping("/chuangyeProgram/{id}")
    public String chuangyeProgramUpdate(HttpServletRequest request,@PathVariable("id")Integer id,@RequestBody ChuangyeProgram chuangyeProgram){
        return powerStrongService.updateChuangyeProgram(id,chuangyeProgram);
    }
    
    @GetMapping("/laodongliIncome")
    public String laodongliIncomeSelect(HttpServletRequest request){
        return powerStrongService.selectLaodongliIncome();
    }
    @PostMapping("/laodongliIncome")
    public String laodongliIncomeInsert(HttpServletRequest request,@RequestBody LaodongliIncome laodongliIncome){
        return powerStrongService.insertLaodongliIncome(laodongliIncome);
    }
    @DeleteMapping("/laodongliIncome/{id}")
    public String laodongliIncomeDelete(HttpServletRequest request,@PathVariable("id")Integer id){
        return powerStrongService.deleteLaodongliIncome(id);
    }
    @PutMapping("/laodongliIncome/{id}")
    public String laodongliIncomeUpdate(HttpServletRequest request,@PathVariable("id")Integer id,@RequestBody LaodongliIncome laodongliIncome){
        return powerStrongService.updateLaodongliIncome(id,laodongliIncome);
    }
    @GetMapping("/ziyuanShouru")
    public String ziyuanShouruSelect(HttpServletRequest request){
        return powerStrongService.selectZiyuanIncome();
    }
    @PostMapping("/ziyuanShouru")
    public String ziyuanShouruInsert(HttpServletRequest request,@RequestBody ZiyuanIncome ziyuanIncome){
        return powerStrongService.insertZiyuanIncome(ziyuanIncome);
    }
    @DeleteMapping("/ziyuanShouru/{id}")
    public String ziyuanShouruDelete(HttpServletRequest request,@PathVariable("id")Integer id){
        return powerStrongService.deleteZiyuanIncome(id);
    }
    @PutMapping("/ziyuanShouru/{id}")
    public String ziyuanShouruUpdate(HttpServletRequest request,@PathVariable("id")Integer id,@RequestBody ZiyuanIncome ziyuanIncome){
        return powerStrongService.updateZiyuanIncome(id,ziyuanIncome);
    }
    @GetMapping("/teseChanpin")
    public String teseChanpinSelect(HttpServletRequest request){
        return powerStrongService.selectTeseChanpin();
    }
    @PostMapping("/teseChanpin")
    public String teseChanpinInsert(HttpServletRequest request,@RequestBody TeseChanpin teseChanpin){
        return powerStrongService.insertTeseChanpin(teseChanpin);
    }
    @DeleteMapping("/teseChanpin/{id}")
    public String teseChanpinDelete(HttpServletRequest request,@PathVariable("id")Integer id){
        return powerStrongService.deleteTeseChanpin(id);
    }
    @PutMapping("/teseChanpin/{id}")
    public String teseChanpinUpdate(HttpServletRequest request,@PathVariable("id")Integer id,@RequestBody TeseChanpin teseChanpin){
        return powerStrongService.updateTeseChanpin(id,teseChanpin);
    }
    @GetMapping("/tudiliuzhuan")
    public String tudiliuzhuanSelect(HttpServletRequest request){
        return powerStrongService.selectTudiliuzhuan();
    }
    @PostMapping("/tudiliuzhuan")
    public String tudiliuzhuanInsert(HttpServletRequest request,Tudiliuzhuan tudiliuzhuan){
        return powerStrongService.insertTudiliuzhuan(tudiliuzhuan);
    }
    @DeleteMapping("/tudiliuzhuan/{id}")
    public String tudiliuzhuanDelete(HttpServletRequest request,@PathVariable("id")Integer id){
        return powerStrongService.deleteTudiliuzhuan(id);
    }
    @PutMapping("/tudiliuzhuan/{id}")
    public String tudiliuzhuanUpdate(HttpServletRequest request, @PathVariable("id")Integer id, @RequestBody Tudiliuzhuan tudiliuzhuan){
        return powerStrongService.updateTudiliuzhuan(id,tudiliuzhuan);
    }



}
