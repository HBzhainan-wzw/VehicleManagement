package com.wzw.service;

public interface DriverService {

    public void driverRegister(Integer uid, String identifier, String idType, String name, String licenseID, String state,
                               String FICO, String regType, String insuranceID, String contractType, String contractStatus);
    public int driverRegVehicle(Integer uid, Integer vid);

    public int driverDelVehicle(Integer uid, Integer vid);
}
