package com.software.dao;

import com.software.entity.Answer;
import com.software.entity.Question;
import com.software.utils.DBUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class QuestionDao {
    public int AddWork(Question Question){
        String sql="Insert into question(Title,DelMark,Module_Name,remarks)values('"+Question.getTitle()+"',"+Question.getDelMark()+"\n"+
                ","+Question.getModule_Name()+",NULL)";
        int count = DBUtils.executeSql(sql);
        return count;
    }
    public int UpdateWork(Question Question){
        String sql="update question set Title='"+Question.getTitle()+"' where ID="+Question.getID()+"";
        int count = DBUtils.executeSql(sql);
        return count;
    }
    public int Delete(Question Question){
        String sql="update question set DelMark="+Question.getDelMark()+" where ID="+Question.getID()+" ";
        //1.5执行sql语句操作
        int count = DBUtils.executeSql(sql);
        return count;
    }
    public List<Question> FindAllWork(){
        List<Question> Elements = new ArrayList<Question>();
        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            connection = DBUtils.getConnection();
            //1.3 创建Statement对象
            st =connection.createStatement();
            //1.4定义要执行操作的SQL语句
            String sql="select ID,Title,DelMark from question where DelMark=1" ;
            rs = st.executeQuery(sql);
            Question Question = null;
            while(rs.next()){
                Question = new Question();
                int ID= rs.getInt("ID");
                int DelMark =rs.getInt("DelMark");
                String Title =rs.getString("Title");
                Question.setID(ID);
                Question.setDelMark(DelMark);
                Question.setTitle(Title);
                Elements.add(Question);
            }

        } catch(Exception e){
            e.printStackTrace();
        } finally {
            DBUtils.closeAll(rs,st,connection);
        }
        return Elements;
    }
}
