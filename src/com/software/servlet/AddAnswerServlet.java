package com.software.servlet;


import com.software.dao.AnswerDao;
import com.software.entity.Answer;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddAnswerServlet",urlPatterns = "/addAnswer")
public class AddAnswerServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AnswerDao answerDao=new AnswerDao();
        Answer answer=new Answer();
        String  UID = request.getParameter("userID");
        String qID = request.getParameter("questionID");
        String con = request.getParameter("content");

        answer.setUser_ID(Integer.parseInt(UID));
        answer.setQuestionID(Integer.parseInt(qID));
        answer.setContent(con);
        answer.setDelmark(1);
        answerDao.AddWork(answer);
    }
}