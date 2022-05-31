package com.xdu.hospital.utils;

public class ParamsException extends RuntimeException {
   public String Msg;
    public Integer Code=new Integer(200);

    public ParamsException(String msg) {
      this.Msg=msg;
    }
   public Integer getCode() {

        return Code;
   }
   public String getMsg(){
        return Msg;
    }
}
