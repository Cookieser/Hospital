package com.software.dao;

import com.software.utils.DBUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class BedTest {

    @Test
    public void testAdd(){
        String sql="Insert into bed(Bed_Number,State,Room_ID,Room_Clean,Delmark,remarks)values(12043,1,2,'2022/5/31',1,Null)";
        int count = DBUtils.executeSql(sql);
        if(count >0){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }
    }

    @Test
    public void testUpdate(){
        String sql="update bed set Room_ID=2 where ID=1";

        int count = DBUtils.executeSql(sql);
        if(count >0){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }
    }

    @Test
    public void testdelete(){
        String sql="update bed set DelMark=0 where ID=2 ";
        //1.5执行sql语句操作
        int count = DBUtils.executeSql(sql);
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
            String sql="select ID,Bed_Number,State,Room_ID,Room_Clean from bed where DelMark=1" ;
            rs = st.executeQuery(sql);
            while(rs.next()){
                int ID= rs.getInt("ID");
                int number= rs.getInt("Bed_Number");
                String BState =rs.getString("State");
                System.out.println(ID+","+ number+","+BState);
            }

        } catch(Exception e){
            e.printStackTrace();
        } finally {
            DBUtils.closeAll(rs,st,connection);
        }
    }
}
