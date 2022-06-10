package com.software.servlet;
import com.software.dao.AnswerDao;
import com.software.entity.Answer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteAnswerServlet",urlPatterns = "/deleteAnswer")
public class DeleteAnswerServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AnswerDao answerDao=new AnswerDao();
        Answer answer=new Answer();
        Integer id = Integer.parseInt(request.getParameter("id"));
        answer.setDelmark(0);
        answer.setID(id);
        answerDao.Delete(answer);

        response.sendRedirect(request.getContextPath() + "/success.jsp");
    }
}