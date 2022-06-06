package com.software.dao;

import com.software.entity.Question;
import com.software.utils.DBUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class QuestionDao {
    public int AddWork(Question question){
    String sql="Insert into question(Title,DelMark,Module_Name,remarks)values('"+question.getTitle()+"',"+question.getDelMark()+"\n"+
            ","+question.getModuleName()+",NULL)";
    int count = DBUtils.executeSql(sql);
    return count;
}
    public int UpdateWork(Question question){
        String sql="update question set Title='"+question.getTitle()+"' where ID="+question.getID()+"";
        int count = DBUtils.executeSql(sql);
        return count;
    }
    public int Delete(Question question){
        String sql="update question set DelMark="+question.getDelMark()+" where ID="+question.getID()+" ";
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
            Question question = null;
            while(rs.next()){
                question = new Question();
                int ID= rs.getInt("ID");
                int DelMark =rs.getInt("DelMark");
                String Title =rs.getString("Title");
                question.setID(ID);
                question.setDelMark(DelMark);
                question.setTitle(Title);
                Elements.add(question);
            }

        } catch(Exception e){
            e.printStackTrace();
        } finally {
            DBUtils.closeAll(rs,st,connection);
        }
        return Elements;
    }
}
