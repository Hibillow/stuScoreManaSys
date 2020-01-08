package com.upms.controller.dealcontroller;

import com.alibaba.fastjson.JSON;
import com.upms.entity.Speciality;
import com.upms.service.SpecialityService;
import com.upms.tools.Layui;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/Sys/SpecialityDeal")
public class SpecialityDeal {

    @Autowired
    SpecialityService specialityService;

    @RequestMapping("/addSpeciality")
    public String addSpeciality(@RequestBody Map map){
        if(specialityService.addSpeciality(map) > 0){
            return "success";
        }else {
            return "failure";
        }
    }

    @RequestMapping("/getSpecialityList")
    public Object getSpecialityList(@RequestParam("limit") String limit, @RequestParam("page") String page, String name){
        int lim = Integer.parseInt(limit);
        int start = (Integer.parseInt(page) - 1) * lim;
        Map<String, Object> map = new HashMap<>();
        map.put("start", start);
        map.put("pagesize", lim);
        map.put("name", name);
        List<Speciality> specialityList = specialityService.getSpecialityList(map);
        int total = specialityService.getCount();

        Layui l = Layui.data(total, specialityList);
        return JSON.toJSON(l);
    }

    @RequestMapping("/querySpecialityList")
    public Object querySpecialityList(){
        return specialityService.querySpecialityList();
    }

    @RequestMapping("/updateSpeciality")
    public String updateSpeciality(@RequestBody Map map){
        if(specialityService.updateSpeciality(map) > 0){
            return "success";
        }else {
            return "failure";
        }
    }

    @RequestMapping("/deleteSpeciality")
    public String deleteSpeciality(String specialityNo){
        if(specialityService.deleteSpeciality(specialityNo) > 0){
            return "success";
        }else {
            return "failure";
        }
    }

}
