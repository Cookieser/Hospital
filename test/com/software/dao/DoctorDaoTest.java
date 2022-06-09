package com.software.dao;

import com.software.entity.Doctor;
import com.software.utils.DBUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;


/**
 * @author 齐豪
 *
 * */

public class DoctorDaoTest {

    DoctorDao doctorDao = new DoctorDao();

    @Test
    public void testAddWork() {
        Doctor doctor = new Doctor();
        doctor.setDoctorNum(234);
        doctor.setName("一二三");
        doctor.setAge(89);
        doctor.setYear("70");
        doctor.setAccount("wangYuPu");
        doctor.setPassWord("234567");
        doctor.setGender("男");
        doctor.setBirthday("1933/3/4");
        doctor.setTitle("中医");
        doctor.setDepartment("外科");
        doctor.setDelMark("1");
        doctor.setRemarks(null);
        int count = doctorDao.addWork(doctor);
        if (count > 0) {
            System.out.println("success");
        } else {
            System.out.println("failure");
        }
    }


    @Test
    public void testUpdateWork() {
        Doctor doctor = new Doctor();
        doctor.setPrincipal(5);
        doctor.setDoctorNum(234);
        doctor.setName("王玉普");
        doctor.setAge(89);
        doctor.setYear("70");
        doctor.setAccount("wangYuPu");
        doctor.setPassWord("234567");
        doctor.setGender("男");
        doctor.setBirthday("1933/3/4");
        doctor.setTitle("中医");
        doctor.setDepartment("外科");
        doctor.setDelMark("1");
        doctor.setRemarks(null);
        int count = doctorDao.updateWork(doctor);
        if (count > 0) {
            System.out.println("success");
        } else {
            System.out.println("failure");
        }
    }


    @Test
    public void testDelWork() {
        Doctor doctor = new Doctor();
        doctor.setPrincipal(5);
        doctor.setRemarks(null);
        int result = doctorDao.deleteWork(doctor);
        if (result > 0) {
            System.out.println("success");
        } else {
            System.out.println("failure");
        }
    }

    @Test
    public void testFindAllWrk() {


        List<Doctor> doctors = doctorDao.findAllWork();
        for (Doctor doctor : doctors) {
            System.out.println(doctor.getPrincipal() + "," +
                    doctor.getDoctorNum() + "," + doctor.getName() + "," + doctor.getAge() + ","
                    + doctor.getYear() + "," + doctor.getAccount() + ","
                    + doctor.getPassWord() + "," + doctor.getGender()
                    + "," + doctor.getBirthday() + "," + doctor.getTitle() + "," + doctor.getDepartment() + ","
                    + doctor.getDelMark() + "," + doctor.getRemarks());
        }

    }

    @Test
    public void testFindWorkByID(){
        //调用数据库访问层中的方法
        Doctor work = doctorDao.findWorkById(2);
        System.out.println(work);
    }

    /**
     * 测试用例：用户登陆信息的合法性
     */
    @Test
    public void testValidateUser(){
        Doctor doctor=
                doctorDao.validateLogin("qihao");
        if(doctor ==null){
            System.out.println("此账户不存在！");
        }else{
            //验证用户登陆密码是否正确
            if("240250".equals(doctor.getPassWord())){
                System.out.println("合法用户");
            }else{
                System.out.println("输入密码错误");
            }
        }
    }
}

