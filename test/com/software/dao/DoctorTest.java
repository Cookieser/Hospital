package com.software.dao;

import com.software.utils.DBUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DoctorTest {

    @Test
    public void testAddWork(){
        String sql="insert into doctor_chart(doctor_num,name,age,work_year,Account,password,gender,birthday,Title,department,Delmark,remarks) values( '434','大齐豪','34','12','chou','345765','男','1989/6/3','医生','内科','1','null')";
        int count = DBUtils.executeSql(sql);
        if(count >0){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }
    }

    @Test
    public void testUpdateWork(){
        String sql="update doctor_chart set age=39,Title='医生' where principal = 6;";

        int count =DBUtils.executeSql(sql);
        if(count >0){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }
    }

    @Test
    public void testDelWork(){
        String sql="update doctor_chart set Delmark=0 where principal = 6;";
        //1.5执行sql语句操作
        int count =DBUtils.executeSql(sql);
        if(count >0){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }
    }

    @Test
    public void testFindAllWrk(){
        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            connection = DBUtils.getConnection();
            //1.3 创建Statement对象
            st =connection.createStatement();
            //1.4定义要执行操作的SQL语句
            String sql="select principal,doctor_num,`name`,age,work_year,Account,password,gender,birthday,Title,department,Delmark,remarks from doctor_chart where Delmark=1";
            rs = st.executeQuery(sql);
            while(rs.next()){
                Integer id=rs.getInt("principal");
                Integer num=rs.getInt("doctor_num");
                Integer age=rs.getInt("age");
                String account= rs.getString("Account");
                String name= rs.getString("name");


                System.out.println(id+","+num+","+age+","+account+","+name);
            }

        } catch(Exception e){
            e.printStackTrace();
        } finally {
            DBUtils.closeAll(rs,st,connection);
        }
    }
}

