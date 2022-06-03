package com.software.dao;

import com.software.utils.DBUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class RoomTest {

    @Test
    public void testAdd(){
        String sql="Insert into room(Type,Max,Remark,department,Room_ID,principal,Delmark,remarks)values(1,10,'阳面',4,4102,4,1,Null)";
        int count = DBUtils.executeSql(sql);
        if(count >0){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }
    }

    @Test
    public void testUpdate(){
        String sql="update room set Room_ID=1200 where ID=4";

        int count = DBUtils.executeSql(sql);
        if(count >0){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }
    }

    @Test
    public void testDelete(){
        String sql="update room set DelMark=0 where ID=5 ";
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
            String sql="select ID,`Type`,`Max`,Remark,department,Room_ID,principal,Delmark,remarks from room where DelMark=1" ;
            rs = st.executeQuery(sql);
            while(rs.next()){
                int RID= rs.getInt("ID");
                String Rroom_ID =rs.getString("Room_ID");
                String remark=rs.getString("Remark");

                System.out.println(RID+","+Rroom_ID+","+remark);
            }

        } catch(Exception e){
            e.printStackTrace();
        } finally {
            DBUtils.closeAll(rs,st,connection);
        }
    }
}


