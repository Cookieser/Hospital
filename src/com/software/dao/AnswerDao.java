package com.software.dao;

import com.software.entity.Answer;
import com.software.utils.DBUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AnswerDao {
    public int AddWork(Answer Answer){
        String sql="Insert into answer(QuestionID,Content,Delmark,User_ID,remarks)values('"+Answer.getQuestionID()+"','"+Answer.getContent()+"'"+"\n"+
                ",'"+Answer.getDelmark()+"','"+Answer.getUser_ID()+"',NULL)";
        int count = DBUtils.executeSql(sql);
        return count;
    }
    public int Update(Answer Answer){
        String sql="update answer set Content='"+Answer.getContent()+"' where ID="+Answer.getID()+" ";
        int count = DBUtils.executeSql(sql);
        return count;
    }
    public int Delete(Answer Answer){
        String sql="update answer set Delmark="+Answer.getDelmark()+" where ID="+Answer.getID()+" ";
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
            Answer Answer = null;
            while(rs.next()){
                Answer = new Answer();
                int ID= rs.getInt("ID");
                int QID =rs.getInt("QuestionID");
                String Content =rs.getString("Content");
                Answer.setID(ID);
                Answer.setQuestionID(QID);
                Answer.setContent(Content);
                Elements.add(Answer);
            }

        } catch(Exception e){
            e.printStackTrace();
        } finally {
            DBUtils.closeAll(rs,st,connection);
        }
        return Elements;
    }
}
