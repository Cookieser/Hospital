package com.software.entity;

public class Answer {
    private Integer ID;
    private Integer questionID;
    private String content;
    private Integer delmark;
    private Integer userID;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getQuestionID() {
        return questionID;
    }

    public void setQuestionID(Integer questionID) {
        this.questionID = questionID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getDelmark() {
        return delmark;
    }

    public void setDelmark(Integer delmark) {
        this.delmark = delmark;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUser_ID(Integer userID) {
        this.userID = userID;
    }
//枚举类选中以上变量右键reactor最后一项快速建类

}
