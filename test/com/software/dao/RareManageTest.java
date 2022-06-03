package com.software.dao;

import com.software.utils.DBUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class RareManageTest {

    @Test
    public void testAddWork(){
        String sql="insert into rare_equipment_management_table(equipment_name,equipment_type,in_use,Delmark,\n" +
                "Room_ID,remarks) values ('血压仪','医疗型','0','1','5',NULL)";
        int count = DBUtils.executeSql(sql);
        if(count >0){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }
    }

    @Test
    public void testUpdateWork(){
        String sql="update rare_equipment_management_table set equipment_type='医疗型' where ID=7";

        int count =DBUtils.executeSql(sql);
        if(count >0){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }
    }

    @Test
    public void testDeleWork(){
        String sql="UPDATE rare_equipment_management_table SET Delmark='0' WHERE ID=6";
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
            String sql="select ID,equipment_name,equipment_type,\n"+
                    "in_use,Delmark,Room_ID,remarks from rare_equipment_management_table where Delmark=1";
            rs = st.executeQuery(sql);
            while(rs.next()){
                String workAccount= rs.getString("ID");
                String name =rs.getString("equipment_name");
                String type =rs.getString("equipment_type");
                System.out.println(workAccount+","+name+","+type);
            }

        } catch(Exception e){
            e.printStackTrace();
        } finally {
            DBUtils.closeAll(rs,st,connection);
        }
    }
}

