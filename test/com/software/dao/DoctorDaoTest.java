package com.software.dao;

import com.software.entity.Doctor;
import com.software.utils.DBUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class DoctorDaoTest {

    DoctorDao doctorDao = new DoctorDao();

    @Test
    public void testAddWork() {
        Doctor doctor = new Doctor();
        doctor.setPrincipal(11);
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


        List<Doctor> doctors = doctorDao.findWork();
        for (Doctor doctor : doctors) {
            System.out.println(doctor.getPrincipal() + "," +
                    doctor.getDoctorNum() + "," + doctor.getName() + "," + doctor.getAge() + ","
                    + doctor.getYear() + "," + doctor.getAccount() + ","
                    + doctor.getPassWord() + "," + doctor.getGender()
                    + "," + doctor.getBirthday() + "," + doctor.getTitle() + "," + doctor.getDepartment() + ","
                    + doctor.getDelMark() + "," + doctor.getRemarks());
        }

    }
}

