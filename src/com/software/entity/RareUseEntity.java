package com.software.model;

public class RareUseEntity {
    private String startTime;
    private String endTime;
    private Integer userID;
    private String remarks;
    private Integer delMark;
    private Integer id;

    public Integer getDelMark() {
        return delMark;
    }

    public void setDelMark(Integer delMark) {
        this.delMark = delMark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public String getStart_time() {
        return startTime;
    }

    public void setStart_time(String start_time) {
        startTime = start_time;
    }

    public String getEnd_time() {
        return endTime;
    }

    public void setEnd_time(String end_time) {
        endTime = end_time;
    }

    public Integer getUser_ID() {
        return userID;
    }

    public void setUser_ID(Integer user_ID) {
        this.userID = user_ID;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }



}
