package com.software.dao;

import com.software.utils.DBUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class PatientTest {
    @Test
    public void testAddWork(){
        String sql="INSERT  INTO `patient`(`patient_name`,`gender`,`principal`,`load_time`,`Idcard`,`home_address`,`phone`,`Account`,`Password`,`Delmark`,`remarks`) VALUES ('陈达达','女',3,'2018/1/2','510623198601073613','四川省德阳市中江县','18379413070','dada','435788',1,NULL);";
        int count = DBUtils.executeSql(sql);
        if(count >0){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }
    }

    @Test
    public void testUpdateWork(){
        String sql="UPDATE `nursecenter`.`patient` SET `patient_name` = '李欣欣' , `gender` = '男' , `principal` = '2' , `load_time` = '2019/1/1' , `Idcard` = '130925199106132623' , `home_address` = '河南省沧州市盐山县' , `phone` = '14176507215' , `Account` = 'xinrei' , `Password` = '135984' , `Delmark` = '0' WHERE `User_ID` = '1'; ";

        int count = DBUtils.executeSql(sql);
        if(count >0){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }
    }

    @Test
    public void testDelWork(){
        String sql="UPDATE `nursecenter`.`patient` SET `Delmark` = '0' WHERE `User_ID` = '5'; ";
        //1.5执行sql语句操作
        int count =DBUtils.executeSql(sql);
        if(count >0){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }
    }

    @Test
    public void testFindAllWork(){
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
            while(rs.next()){
                String name= rs.getString("patient_name");
                String address =rs.getString("home_address");
                int id =rs.getInt("User_ID");
                System.out.println(id+","+name+","+address);
            }

        } catch(Exception e){
            e.printStackTrace();
        } finally {
            DBUtils.closeAll(rs,st,connection);
        }
    }
}
