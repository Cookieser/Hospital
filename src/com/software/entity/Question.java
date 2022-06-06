package com.software.entity;

public class Question {
    private Integer ID;
    private String title;
    private Integer delMark;
    private Integer moduleName;


    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getDelMark() {
        return delMark;
    }

    public void setDelMark(Integer delMark) {
        this.delMark = delMark;
    }

    public Integer getModuleName() {
        return moduleName;
    }

    public void setModuleName(Integer moduleName) {
        this.moduleName = moduleName;
    }
}
