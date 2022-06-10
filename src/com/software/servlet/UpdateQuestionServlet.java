package com.software.servlet;



import com.software.dao.QuestionDao;
import com.software.entity.Question;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UpdateQuestionServlet",urlPatterns = "/updateQuestion")
public class UpdateQuestionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        QuestionDao questionDao=new QuestionDao();
        Question question=new Question();
        String ID = request.getParameter("ID");
        String  title = request.getParameter("title");
        String mName = request.getParameter("modelName");
        question.setID(Integer.parseInt(ID));
        question.setTitle(title);
        question.setModuleName(Integer.parseInt(mName));
        question.setDelMark(1);
        questionDao.UpdateWork(question);
        response.sendRedirect(request.getContextPath() + "/success.jsp");
    }
}