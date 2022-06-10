package com.software.dao;

import com.software.entity.Question;
import org.junit.Test;

import java.util.List;


/**
 * @author 陈泓达
 *
 * */
public class QuestionTest {

    QuestionDao Questiondao = new QuestionDao();
    @Test
    public void testAddWork(){
        Question question = new Question();
        question.setTitle("是否需要心理干预");
        question.setDelMark(1);
        question.setModuleName(1);
        int count = Questiondao.AddWork(question);
        if(count >0){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }
    }

    @Test
    public void UpdateWork(){
        Question question = new Question();
        question.setTitle("您是否需要心理干预");
        question.setID(10);
        int count = Questiondao.UpdateWork(question);
        if(count >0){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }
    }

    @Test
    public void testDelete(){
        Question question = new Question();
        question.setDelMark(0);
        Integer id=3;
        //1.5执行sql语句操作
        int count = Questiondao.Delete(id);
        if(count >0){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }
    }

    @Test
    public void testFindAllWork(){
        List<Question> Elements = Questiondao.FindAllWork();
        for (Question question:Elements){
            System.out.println(question.getID()+","+question.getTitle()+","+question.getDelMark());
        }
    }

}
