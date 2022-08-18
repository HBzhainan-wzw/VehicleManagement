package com.wzw.controller;

import com.wzw.dao.DriverDao;
import com.wzw.service.DriverService;
import com.wzw.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class DriverController {
    @Autowired
    @Qualifier("DriverServiceImpl")
    private DriverService driverService;

    @Autowired
    @Qualifier("VehicleServiceImpl")
    private VehicleService vehicleService;




}
