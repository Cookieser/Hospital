package com.software.servlet;

import com.software.dao.QuestionDao;
import com.software.entity.Question;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteQuestionServlet",urlPatterns = "/deleteQuestion")
public class DeleteQuestionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        QuestionDao questionDao=new QuestionDao();
        Question question=new Question();
        Integer id = Integer.parseInt(request.getParameter("id"));
        question.setDelMark(0);
        question.setID(id);
        questionDao.Delete(id);

        response.sendRedirect(request.getContextPath() + "/success.jsp");
    }
}
