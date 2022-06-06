package com.software.model;

/**
 * 实体层--员工类
 */
public class RareManageEntity {
    private Integer id;
    private String equipmentType;
    private String equipmentName;
    private Integer inUse;
    private Integer delMark;
    private Integer roomID;
    private String remarks;
    public Integer getID() {
        return id;
    }

    public void setID(Integer ID) {
        this.id = ID;
    }

    //select account,password,name,sex,birthday,age from work;


    public Integer getDelMark() {
        return delMark;
    }

    public void setDelMark(Integer delMark) {
        this.delMark = delMark;
    }



    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public Integer getInUse() {
        return inUse;
    }

    public void setInUse(Integer inUse) {
        this.inUse = inUse;
    }



    public Integer getRoom_ID() {
        return roomID;
    }

    public void setRoom_ID(Integer room_ID) {
        roomID = room_ID;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }








}


