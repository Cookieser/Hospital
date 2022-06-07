package com.software.dao;

import com.software.entity.Answer;
import com.software.utils.DBUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AnswerDao {
    public int AddWork(Answer answer){
        String sql="Insert into answer(QuestionID,Content,Delmark,User_ID,remarks)values('"+answer.getQuestionID()+"','"+answer.getContent()+"'"+"\n"+
                ",'"+answer.getDelmark()+"','"+answer.getUserID()+"',NULL)";
        int count = DBUtils.executeSql(sql);
        return count;
    }
    public int Update(Answer answer){
        String sql="update answer set Content='"+answer.getContent()+"' where ID="+answer.getID()+" ";
        int count = DBUtils.executeSql(sql);
        return count;
    }
    public int Delete(Answer answer){
        String sql="update answer set Delmark="+answer.getDelmark()+" where ID="+answer.getID()+" ";
        //1.5执行sql语句操作
        int count = DBUtils.executeSql(sql);
        return count;
    }
    public List<Answer> FindAllWork(){
        List<Answer> Elements = new ArrayList<Answer>();
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
            Answer answer = null;
            while(rs.next()){
                answer = new Answer();
                int ID= rs.getInt("ID");
                int questionID =rs.getInt("QuestionID");
                String Content =rs.getString("Content");
                answer.setID(ID);
                answer.setQuestionID(questionID);
                answer.setContent(Content);
                Elements.add(answer);
            }

        } catch(Exception e){
            e.printStackTrace();
        } finally {
            DBUtils.closeAll(rs,st,connection);
        }
        return Elements;
    }
}
