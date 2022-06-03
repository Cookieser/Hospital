package com.software.dao;


import com.software.utils.DBUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class RareUse {

    @Test
    public void testAddWork(){
        String sql="INSERT  INTO `rare_equipment_use_table`(`Start_time`,`End_time`,`user_ID`,`Delmark`,`remarks`) VALUES ('2022-6-1','2022-6-11',1,1,NULL);";
        int count = DBUtils.executeSql(sql);
        if(count >0){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }
    }

    @Test
    public void testUpdateWork(){
        String sql="update rare_equipment_use_table set End_time='2022-6-30' where ID='6'";
        int count =DBUtils.executeSql(sql);
        if(count >0){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }
    }

    @Test
    public void testDelWork(){
        String sql="UPDATE rare_equipment_use_table SET Delmark='0' WHERE ID='6'";
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
            String sql="select ID,Start_time,End_time,user_ID,remarks from rare_equipment_use_table where Delmark=1";
            rs = st.executeQuery(sql);
            while(rs.next()){
                String workAccount= rs.getString("ID");
                String stime=rs.getString("Start_time");
                String etime =rs.getString("Start_time");
                System.out.println(workAccount+","+stime+","+etime);
            }

        } catch(Exception e){
            e.printStackTrace();
        } finally {
            DBUtils.closeAll(rs,st,connection);
        }
    }
}
