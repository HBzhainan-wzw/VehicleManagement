package com.wzw.service;

import com.wzw.dao.DriverDaoImpl;
import com.wzw.pojo.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverServiceImpl implements DriverService{
    @Autowired
    private DriverDaoImpl driverDaoImpl;

    public void driverRegister(Integer uid, String identifier, String idType, String name, String licenseID, String state, String FICO, String regType, String insuranceID, String contractType, String contractStatus) {
        Driver driver = new Driver(identifier, idType, name, licenseID, state, FICO, regType, insuranceID, contractType, contractStatus);
        driverDaoImpl = new DriverDaoImpl();
        driverDaoImpl.driverRegister(driver.getUid(),identifier, idType, name, licenseID, state, FICO, regType, insuranceID, contractType, contractStatus);
    }

    public int driverRegVehicle(Integer uid, Integer vid){
        return driverDaoImpl.driverRegVehicle(uid, vid);

    }

    public int driverDelVehicle(Integer uid, Integer vid){
        return driverDelVehicle(uid, vid);
    }
}
