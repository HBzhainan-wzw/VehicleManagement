package com.wzw.controller;

import com.wzw.service.VehicleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class VehicleController {

    @GetMapping("vehicleReg/{vid}/{plate}/{VIN}/{brand}/{make}/{color}/{serveType}/{numSeat}/{vehicleCondition}/{year}")
    public String VehicleRegister(@PathVariable Integer vid, @PathVariable String plate, @PathVariable String VIN,
                                  @PathVariable String brand, @PathVariable String make, @PathVariable String color,
                                  @PathVariable String serveType, @PathVariable Integer numSeat, @PathVariable String vehicleCondition,
                                  @PathVariable Integer year, Model model){
        try{
            // 加载配置文件，获取 IoC 容器
            ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
            // 获取 Bean
            VehicleService vehicleService = (VehicleService) app.getBean("VehicleService");
            // 调用函数
            vehicleService.VehicleRegister(vid, plate, VIN, brand, make, color,
                    serveType, numSeat, vehicleCondition, year);
            model.addAttribute("RegMsg","注册成功！");
        }catch (Exception e){
            model.addAttribute("RegMsg","注册失败！");
        }
        return "vehicleReg";
    }
}
