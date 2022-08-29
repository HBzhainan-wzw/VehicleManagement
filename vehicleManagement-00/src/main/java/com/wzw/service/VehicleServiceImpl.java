package com.wzw.service;

import com.wzw.dao.VehicleDaoImpl;
import com.wzw.pojo.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleDaoImpl vehicleDaoImpl;

    public void VehicleRegister(Integer vid, String plate, String VIN, String brand, String make, String color, String serveType, Integer numSeat, String vehicleCondition, Integer year) {
        Vehicle vehicle = new Vehicle(plate, VIN, brand, make, color, serveType, numSeat, vehicleCondition, year);

    }
}
