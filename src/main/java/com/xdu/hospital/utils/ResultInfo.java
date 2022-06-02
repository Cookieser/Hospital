package com.xdu.hospital.utils;

import lombok.Data;

@Data
public class ResultInfo {


    private Integer code=2000;
    private String msg="success";
    private Object result;
}
