package com.wzw.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.wzw.dao.DriverDao;
import com.wzw.service.DriverService;
import com.wzw.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DriverController {

    @GetMapping("/driverReg/{uid}/{identifier}/{idType}/{name}/{licenseID}/{state}/{FICO}/{regType}/{insuranceID}/{contractType}/{contractStatus}")
    public String driverRegister(@PathVariable Integer uid, @PathVariable String identifier, @PathVariable String idType,
                               @PathVariable String name, @PathVariable String licenseID, @PathVariable String state,
                               @PathVariable String FICO, @PathVariable String regType, @PathVariable String insuranceID,
                               @PathVariable String contractType, @PathVariable String contractStatus, Model model) throws Exception{
        try{
            // 加载配置文件，获取 IoC 容器
            ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
            // 获取 Bean
            DriverService driverService = (DriverService) app.getBean("DriverService");
            VehicleService vehicleService = (VehicleService) app.getBean("VehicleService");
            // 调用函数
            driverService.driverRegister(uid, identifier, idType, name, licenseID, state,
                    FICO, regType, insuranceID, contractType, contractStatus);
            model.addAttribute("RegMsg","注册成功！");
        }catch (Exception e){
            model.addAttribute("RegMsg","注册失败！");
        }
        return "driverReg";

    }

    @GetMapping("/driverRegVeh/{uid}/{vid}")
    public String driverRegVehicle(@PathVariable Integer uid, @PathVariable Integer vid, Model model) throws Exception{
        try{
            // 加载配置文件，获取 IoC 容器
            ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
            // 获取 Bean
            DriverService driverService = (DriverService) app.getBean("DriverService");
            VehicleService vehicleService = (VehicleService) app.getBean("VehicleService");
            // 调用函数
            driverService.driverRegVehicle(uid,vid);
            model.addAttribute("RegMsg","绑定成功！");
        }catch (Exception e){
            model.addAttribute("RegMsg","绑定失败！");
        }
        model.addAttribute("msg","11");
        return "driverReg";
    }

    @GetMapping("/driverDelVeh/{uid}/{vid}")
    public String driverDelVehicle(Integer uid, Integer vid, Model model){
        try{
            // 加载配置文件，获取 IoC 容器
            ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
            // 获取 Bean
            DriverService driverService = (DriverService) app.getBean("DriverService");
            VehicleService vehicleService = (VehicleService) app.getBean("VehicleService");
            // 调用函数
            driverService.driverRegVehicle(uid,vid);
            model.addAttribute("RegMsg","删除成功！");
        }catch (Exception e){
            model.addAttribute("RegMsg","删除失败！");
        }
        model.addAttribute("msg","11");
        return "driverReg";
    }

}
