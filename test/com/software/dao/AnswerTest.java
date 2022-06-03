package com.software.dao;

import com.software.utils.DBUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class AnswerTest {
    @Test
    public void testAdd(){
        String sql="Insert into answer(QuestionID,Content,Delmark,User_ID,remarks)values(4,'测试test',1,4,NULL)";
        int count = DBUtils.executeSql(sql);
        if(count >0){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }
    }

    @Test
    public void testUpdate(){
        String sql="update answer set Content='子女满堂，经常探望' where ID=4";

        int count = DBUtils.executeSql(sql);
        if(count >0){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }
    }

    @Test
    public void testDelete(){
        String sql="update answer set Delmark=0 where ID=2 ";
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
            String sql="select ID,QuestionID,Content,Delmark,User_ID,remarks from answer where Delmark=1" ;
            rs = st.executeQuery(sql);
            while(rs.next()){
                int QID= rs.getInt("ID");
                int QTitle =rs.getInt("QuestionID");
                String Content =rs.getString("Content");
                System.out.println(QID+","+QTitle+","+Content);
            }

        } catch(Exception e){
            e.printStackTrace();
        } finally {
            DBUtils.closeAll(rs,st,connection);
        }
    }
}

