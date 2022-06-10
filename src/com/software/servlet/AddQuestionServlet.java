package com.software.servlet;


import com.software.dao.QuestionDao;
import com.software.entity.Question;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddQuestionServlet",urlPatterns = "/addQuestion")
public class AddQuestionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        QuestionDao questionDao=new QuestionDao();
        Question question=new Question();
        String  title = request.getParameter("title");
        String mName = request.getParameter("modelName");


        question.setTitle(title);
        question.setModuleName(Integer.parseInt(mName));
        question.setDelMark(1);
        questionDao.AddWork(question);
    }
}