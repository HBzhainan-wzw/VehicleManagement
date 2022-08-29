package com.wzw.dao;

public interface VehicleDao {
    public void VehicleRegister(Integer vid, String plate, String VIN, String brand, String make, String color,
                                String serveType, Integer numSeat, String vehicleCondition, Integer year);
}
