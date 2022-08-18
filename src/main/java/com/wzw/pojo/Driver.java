package com.wzw.pojo;

public class Driver {
    private Integer uid;
    private String identifier;
    private String idType;
    private String name;
    private String licenseID;
    private String state;
    private String FICO;
    private String regType;
    private String insuranceID;
    private String contractType;
    private String contractStatus;
    private Integer[] bindedVID;

    @Override
    public String toString(){
        String returnString =  "film{" +
                "uid=" + uid +
                ", identifier='" + identifier + '\'' +
                ", idType='" + idType + '\'' +
                ", name='" + name + '\'' +
                ", licenseID='" + licenseID + '\'' +
                ", state='" + state + '\'' +
                ", FICO='" + FICO + '\'' +
                ", regType=" + regType +
                ", insuranceID='" + insuranceID + '\'' +
                ", contractType='" + contractType + '\'' +
                ", contractStatus='" + contractStatus + '\'' +
                ", contractType={'"  ;
        for(int i = 0; i < bindedVID.length; i++){
            returnString = returnString +  bindedVID[i] + ", ";
        }
        returnString = returnString + '\'' + '}';
        return returnString;
    }

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

    public Driver(String identifier, String idType, String name, String licenseID, String state, String FICO, String regType, String insuranceID, String contractType, String contractStatus, Integer[] bindedVID){
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
        this.bindedVID = bindedVID;
    }
}
