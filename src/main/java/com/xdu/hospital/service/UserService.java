package com.xdu.hospital.service;

import com.xdu.hospital.pojo.UserModel;

import java.io.IOException;

public interface UserService {
    public UserModel userLogin(String Email, String password);//登录
    public UserModel userRegister(String Email, String password) throws IOException;//注册
}
