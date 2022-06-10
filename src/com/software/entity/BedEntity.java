package com.software.entity;

public class BedEntity {
    private Integer ID;
    private Integer bedNumber;
    private Integer state;
    private Integer roomID;
    private String roomClean;
    private Integer delmark;
    private String remarks;
    private Integer PatientID;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(Integer bedNumber) {
        this.bedNumber = bedNumber;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getRoomID() {
        return roomID;
    }

    public void setRoomID(Integer roomID) {
        this.roomID = roomID;
    }

    public String getRoomClean() {
        return roomClean;
    }

    public void setRoomClean(String roomClean) {
        this.roomClean = roomClean;
    }

    public Integer getDelmark() {
        return delmark;
    }

    public void setDelmark(Integer delmark) {
        this.delmark = delmark;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getPatientID() {
        return PatientID;
    }

    public void setPatientID(Integer patientID) {
        PatientID = patientID;
    }






}
