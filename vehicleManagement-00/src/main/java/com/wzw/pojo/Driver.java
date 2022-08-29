package com.wzw.pojo;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data //生成构造函数，getter setter
//@AllArgsConstructor //构造函数
//@NoArgsConstructor //构造函数
public class Driver {
    private Integer uid;  //id
    private String identifier; //证件号
    private String idType; //证件类型
    private String name; //姓名
    private String licenseID; //驾照号
    private String state; //州
    private String FICO; //FICO
    private String regType; //注册类型
    private String insuranceID; //保险号
    private String contractType; //合同类型
    private String contractStatus; //合同状态
    private Integer[] bindedVID;  //绑定汽车id
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenseID() {
        return licenseID;
    }

    public void setLicenseID(String licenseID) {
        this.licenseID = licenseID;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getFICO() {
        return FICO;
    }

    public void setFICO(String FICO) {
        this.FICO = FICO;
    }

    public String getRegType() {
        return regType;
    }

    public void setRegType(String regType) {
        this.regType = regType;
    }

    public String getInsuranceID() {
        return insuranceID;
    }

    public void setInsuranceID(String insuranceID) {
        this.insuranceID = insuranceID;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(String contractStatus) {
        this.contractStatus = contractStatus;
    }

    public Integer[] getBindedVID() {
        return bindedVID;
    }

    public void setBindedVID(Integer[] bindedVID) {
        this.bindedVID = bindedVID;
    }

    public Driver(String identifier, String idType, String name, String licenseID, String state, String FICO, String regType, String insuranceID, String contractType, String contractStatus){
        this.uid = (int)(Math.random() * 1000000);;
        this.identifier = identifier;
        this.idType = idType;
        this.name = name;
        this.licenseID = licenseID;
        this.state = state;
        this.FICO = FICO;
        this.regType = regType;
        this.insuranceID = insuranceID;
        this.contractType = contractType;
        this.contractStatus = contractStatus;
    }
}
