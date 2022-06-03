package com.software.dao;
import com.software.utils.DBUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;



public class QuestionTest {
    @Test
    public void testAddWork(){
        String sql="Insert into question(Title,DelMark,Module_Name,remarks)values('是否需要心理干预',1,1,NULL)";
        int count = DBUtils.executeSql(sql);
        if(count >0){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }
    }

    @Test
    public void UpdateWork(){
        String sql="update question set Title='您是否需要心理干预' where ID=10";

        int count = DBUtils.executeSql(sql);
        if(count >0){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }
    }

    @Test
    public void testDelete(){
        String sql="update question set DelMark=0 where ID=10 ";
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
            String sql="select ID,Title,Delmark from question where DelMark=1" ;
            rs = st.executeQuery(sql);
            while(rs.next()){
                int QID= rs.getInt("ID");
                String QTitle =rs.getString("Title");
                System.out.println(QID+","+QTitle);
            }

        } catch(Exception e){
            e.printStackTrace();
        } finally {
            DBUtils.closeAll(rs,st,connection);
        }
    }
}

