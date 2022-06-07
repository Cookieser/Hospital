package com.software.dao;

import com.software.entity.Doctor;
import com.software.entity.Patient;
import org.junit.Test;

import java.util.List;

/**
 * @author 王渝普
 *
 * */

public class PatientTest {

    PatientDao patientDao = new PatientDao();
    @Test
    public void testAddWork() {

        //创建Patient对象测试用例
        Patient patient = new Patient();
        patient.setUserId(14);
        patient.setPatientName("admin");
        patient.setGender("男");
        patient.setAccount("123456");
        patient.setLoadTime("2001/01");
        patient.setHomeAddress("河南");
        patient.setPhone("152468455");
        patient.setPrincipal(1);
        patient.setIdCard("12345687");
        patient.setPassword("991978");
        patient.setDelMark(1);


        patientDao.addPatient(patient);

    }

    @Test
    public void testUpdateWork() {
        //创建Patient对象测试用例
        Patient patient = new Patient();
        patient.setUserId(12);
        patient.setPatientName("adminTest");
        patient.setGender("男");
        patient.setAccount("123456");
        patient.setLoadTime("2001/01");
        patient.setHomeAddress("河南");
        patient.setPhone("152468455");
        patient.setPrincipal(1);
        patient.setIdCard("12345687");
        patient.setPassword("51588888888");
        patient.setDelMark(1);
        patientDao.updatePatient(patient);
    }

    @Test
    public void testDelWork() {
        Patient patient = new Patient();
        patient.setUserId(5);
        patientDao.deletePatientById(patient);
    }

    @Test
    public void testFindAllWork() {
        List<Patient> patients = patientDao.findPatient();
        for (Patient patient : patients) {
            System.out.println(patient.getPatientName() + "," + patient.getUserId() + "," + patient.getHomeAddress());


        }
    }
        @Test
        public void testFindWorkById(){
            //调用数据库访问层中的方法
            Patient patient =patientDao.findPatientByID(2);
            System.out.println(patient);
        }

    @Test
    public void testValidateUser(){
        Patient patient=
                patientDao.validateLogin("xiaohao");
        if(patient ==null){
            System.out.println("此账户不存在！");
        }else{
            //验证用户登陆密码是否正确
            if("946284".equals(patient.getPassword())){
                System.out.println("合法用户");
            }else{
                System.out.println("输入密码错误");
            }
        }
    }

    }

