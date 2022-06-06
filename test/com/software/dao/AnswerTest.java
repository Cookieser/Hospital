package com.software.dao;

import com.software.entity.Answer;
import com.software.utils.DBUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class AnswerTest {
    AnswerDao Answerdao = new AnswerDao();
    @Test
    public void testAdd(){
        Answer answer = new Answer();
        answer.setQuestionID(4);
        answer.setContent("测试test");
        answer.setDelmark(1);
        answer.setUser_ID(4);
        int count = Answerdao.AddWork(answer);
        if(count >0){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }
    }

    @Test
    public void testUpdate(){
        Answer answer = new Answer();
        answer.setID(4);
        answer.setContent("子女满堂，双肩共立");
        int count = Answerdao.Update(answer);
        if(count >0){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }
    }

    @Test
    public void testDelete(){
        Answer answer = new Answer();
        answer.setID(2);
        answer.setDelmark(0);
        //1.5执行sql语句操作
        int count = Answerdao.Delete(answer);
        if(count >0){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }
    }

    @Test
    public void testFindAllWork(){
        List<Answer> Elements= Answerdao.FindAllWork();
        for(Answer ans:Elements){
            System.out.println(ans.getID()+","+ans.getQuestionID()+","+ans.getContent());
        }
    }
}

