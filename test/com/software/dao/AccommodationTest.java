package com.software.dao;


import com.software.utils.DBUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class AccommodationTest {
    @Test
    public void testAddWork(){
        String sql="insert  into `accommodation`(`Start_time`,`End_time`,`bed_id`,`principal`,`operate_time`,`Delmark`,`remarks`) values ('2020/1/2','2020/1/22',1,2,'2019-01-02',1,NULL);";
        int count = DBUtils.executeSql(sql);
        if(count >0){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }
    }

    @Test
    public void testUpdateWork(){
        String sql="UPDATE `nursecenter`.`accommodation` SET `Start_time` = '2020/1/30' , `End_time` = '2020/1/23' , `bed_id` = '10' , `principal` = '3' , `operate_time` = '2019-01-03' WHERE `ID` = '1';  ";

        int count = DBUtils.executeSql(sql);
        if(count >0){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }
    }

    @Test
    public void testDelWork(){
        String sql="UPDATE `nursecenter`.`accommodation` SET `Delmark` = '0' WHERE `ID` = '3'; ";
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
            String sql="SELECT`ID`,`Start_time`,`End_time`,`bed_id`,`principal`,`operate_time`,`remarks` FROM `accommodation` WHERE Delmark='1' ";
            rs = st.executeQuery(sql);
            while(rs.next()){
                String id= rs.getString("ID");
                String Start_time =rs.getString("Start_time");
                String End_time =rs.getString("End_time");

                System.out.println(id+","+Start_time+","+End_time);
            }

        } catch(Exception e){
            e.printStackTrace();
        } finally {
            DBUtils.closeAll(rs,st,connection);
        }
    }
}
