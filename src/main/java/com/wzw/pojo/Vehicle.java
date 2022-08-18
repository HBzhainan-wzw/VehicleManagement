package com.wzw.pojo;

public class Vehicle {
    private Integer vid;
    private String plate;
    private String VIN;
    private String brand;
    private String make;
    private String color;
    private String serveType;
    private Integer numSeat;
    private String vehicleCondition;
    private Integer year;
    private Integer uid;

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getServeType() {
        return serveType;
    }

    public void setServeType(String serveType) {
        this.serveType = serveType;
    }

    public Integer getNumSeat() {
        return numSeat;
    }

    public void setNumSeat(Integer numSeat) {
        this.numSeat = numSeat;
    }

    public String getVehicleCondition() {
        return vehicleCondition;
    }

    public void setVehicleCondition(String vehicleCondition) {
        this.vehicleCondition = vehicleCondition;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getDriver() {
        return uid;
    }

    public void setDriver(Integer driver) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "film{" +
                "vid=" + vid +
                ", plate='" + plate + '\'' +
                ", VIN='" + VIN + '\'' +
                ", brand='" + brand + '\'' +
                ", make='" + make + '\'' +
                ", color='" + color + '\'' +
                ", serveType='" + serveType + '\'' +
                ", numSeat=" + numSeat +
                ", vehicleCondition='" + vehicleCondition + '\'' +
                ", year='" + year + '\'' +
                ", uid='" + uid + '\'' +
                '}';
    }
    public Vehicle(String plate, String VIN, String brand, String make, String color, String serveType, Integer numSeat, String vehicleCondition, Integer year){
        this.vid = (int)(Math.random() * 1000000);
        this.plate = plate;
        this.VIN = VIN;
        this.brand = brand;
        this.make = make;
        this.color = color;
        this.serveType = serveType;
        this.numSeat = numSeat;
        this.vehicleCondition = vehicleCondition;
        this.year = year;
    }
}
