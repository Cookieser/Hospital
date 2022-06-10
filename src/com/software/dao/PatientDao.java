package com.software.dao;

import com.software.entity.Doctor;
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
        String sql="UPDATE `nursecenter`.`patient` SET `patient_name` = '"+patient.getPatientName()+"' , `gender` = '"+patient.getGender()+"' , `principal` = '"+patient.getPrincipal()+"' , `load_time` = '"+patient.getLoadTime()+"' , `Idcard` = '"+patient.getIdCard()+"' , `home_address` = '"+patient.getHomeAddress()+"' , `phone` = '"+patient.getPhone()+"' , `Account` = '"+patient.getAccount()+"' , `Password` = '"+patient.getPassword()+"' , `Delmark` = '"+patient.getDelMark()+"' WHERE `patient_name` = '"+patient.getPatientName()+"'";

        int count = DBUtils.executeSql(sql);
        if(count >0){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }
        return count;
    }

    public int deletePatientById(String name){
        String sql="UPDATE `nursecenter`.`patient` SET `Delmark` = '0' WHERE `patient_name` = '"+name+"' ";

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
                String gender = rs.getString("gender");
                Integer principal = rs.getInt("principal");
                String address =rs.getString("home_address");
                String phone = rs.getString("phone");
                String idcard = rs.getString("Idcard");
                int id =rs.getInt("User_ID");

                patient.setPatientName(name);
                patient.setHomeAddress(address);
                patient.setGender(gender);
                patient.setPrincipal(principal);
                patient.setPhone(phone);
                patient.setUserId(id);
                patient.setIdCard(idcard);

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

    public Patient findPatientByID(String pname){
        Patient patient = new Patient();

        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            connection = DBUtils.getConnection();
            //1.3 创建Statement对象
            st =connection.createStatement();
            //1.4定义要执行操作的SQL语句
            String sql="SELECT `User_ID`,`patient_name`,`gender`,`principal`,`load_time`,`Idcard`,`home_address`,`phone`,`Delmark`,`remarks` FROM `patient` WHERE `patient_name`='"+pname+"' and `Delmark`=1";
            rs = st.executeQuery(sql);
            if(rs.next()){
                Integer userId=rs.getInt("User_ID");
                String name= rs.getString("patient_name");
                String gender =rs.getString("gender");
                Integer principal =rs.getInt("principal");
                String load_time =rs.getString("load_time");
                String idCard =rs.getString("Idcard");
                String address =rs.getString("home_address");
                String phone =rs.getString("phone");




                patient.setUserId(userId);
                patient.setPatientName(name);
                patient.setGender(gender);
                patient.setPrincipal(principal);
                patient.setLoadTime(load_time);
                patient.setIdCard(idCard);
                patient.setPhone(phone);
                patient.setHomeAddress(address);



            }

        } catch(Exception e){
            e.printStackTrace();
        } finally {
            DBUtils.closeAll(rs,st,connection);
        }
        return patient;
    }

    public Patient validateLogin(String loginAccount) {
        Patient patient = null;
        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            connection = DBUtils.getConnection();
            //1.3 创建Statement对象
            st = connection.createStatement();
            //1.4定义要执行操作的SQL语句
            String sql = "select Account,password from `patient`\n" +
                    " where Account='" + loginAccount + "' and  Delmark='1'";
            rs = st.executeQuery(sql);

            if (rs.next()) {
                patient = new Patient();
                String acc = rs.getString("Account");
                String pwd = rs.getString("password");


                patient.setAccount(acc);
                patient.setPassword(pwd);

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtils.closeAll(rs, st, connection);
        }
        return patient;
    }
    public List<List> findPatientCheckin(){
        List<List> patientsCheckList = new ArrayList<>();

        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            connection = DBUtils.getConnection();
            //1.3 创建Statement对象
            st =connection.createStatement();
            //1.4定义要执行操作的SQL语句
            String sql="select `User_ID`,`patient_name`,patient.gender,`name`,`load_time`,`Idcard`,`home_address`,`phone`,patient.Delmark from doctor_chart,patient where patient.principal=doctor_chart.principal and patient.Delmark=1";

            rs = st.executeQuery(sql);
            List data = null;
            while(rs.next()){
                data = new ArrayList();
                data.add(rs.getInt("User_ID"));
                data.add(rs.getString("patient_name"));
                data.add(rs.getString("gender"));
                data.add(rs.getString("name"));
                data.add(rs.getString("load_time"));
                data.add(rs.getString("Idcard"));
                data.add(rs.getString("home_address"));
                data.add(rs.getString("phone"));
                data.add(rs.getString("Delmark"));

                //添加集合对象(封装)
                patientsCheckList.add(data);
            }

        } catch(Exception e){
            e.printStackTrace();
        } finally {
            DBUtils.closeAll(rs,st,connection);
        }

        return patientsCheckList;
    }

}
