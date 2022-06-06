package com.software.dao;

import com.software.entity.Patient;
import com.software.utils.DBUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PatientDao {

    public void addPatient(Patient patient){


        String sql="INSERT  INTO `patient`(`patient_name`,`gender`,`principal`,`load_time`,`Idcard`,`home_address`," +
                "`phone`,`Account`,`Password`,`Delmark`,`remarks`) VALUES ('"+patient.getPatientName()+"','"+patient.getGender()+"','"+patient.getPrincipal()+"','"+patient.getLoadTime()+"','"+patient.getIdCard()+"','"+patient.getHomeAddress()+"','"+patient.getPhone()+"','"+patient.getAccount()+"','"+patient.getPassword()+"','"+patient.getDelMark()+"',NULL)";
        int count = DBUtils.executeSql(sql);
        if(count >0){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }
    }
    public int updatePatient(Patient patient){
        String sql="UPDATE `nursecenter`.`patient` SET `patient_name` = '"+patient.getPatientName()+"' , `gender` = '"+patient.getGender()+"' , `principal` = '"+patient.getPrincipal()+"' , `load_time` = '"+patient.getLoadTime()+"' , `Idcard` = '"+patient.getIdCard()+"' , `home_address` = '"+patient.getHomeAddress()+"' , `phone` = '"+patient.getPhone()+"' , `Account` = '"+patient.getAccount()+"' , `Password` = '"+patient.getPassword()+"' , `Delmark` = '"+patient.getDelMark()+"' WHERE `User_ID` = '"+patient.getUserId()+"'";

        int count = DBUtils.executeSql(sql);
        if(count >0){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }
        return count;
    }

    public int deletePatientById(Patient patient){
        String sql="UPDATE `nursecenter`.`patient` SET `Delmark` = '0' WHERE `User_ID` = '"+patient.getUserId()+"' ";

        int count = DBUtils.executeSql(sql);
        return count;
    }

    public List<Patient> findPatient(){
        List<Patient> patients = new ArrayList<Patient>();

        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            connection = DBUtils.getConnection();
            //1.3 创建Statement对象
            st =connection.createStatement();
            //1.4定义要执行操作的SQL语句
            String sql="SELECT `User_ID`,`patient_name`,`gender`,`principal`,`load_time`,`Idcard`,`home_address`,`phone`,`Account`,`Password`,`Delmark`,`remarks` FROM `patient` WHERE Delmark='1' ";
            rs = st.executeQuery(sql);
            Patient patient = null;
            while(rs.next()){
                patient = new Patient();

                String name= rs.getString("patient_name");
                String address =rs.getString("home_address");
                int id =rs.getInt("User_ID");

                patient.setPatientName(name);
                patient.setHomeAddress(address);
                patient.setUserId(id);

                //添加集合对象(封装)
                patients.add(patient);
            }

        } catch(Exception e){
            e.printStackTrace();
        } finally {
            DBUtils.closeAll(rs,st,connection);
        }
        return patients;
    }

}
