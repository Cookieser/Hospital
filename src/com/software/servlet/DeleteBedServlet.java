package com.software.servlet;

import com.software.dao.BedDao;
import com.software.entity.BedEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteBedServlet",urlPatterns = "/deleteBed")
public class DeleteBedServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BedDao bedDao=new BedDao();
        BedEntity bedEntity=new BedEntity();
        Integer id = Integer.parseInt(request.getParameter("id"));
        bedEntity.setDelmark(0);
        bedEntity.setID(id);
        bedDao.deleteWork(bedEntity);

        response.sendRedirect(request.getContextPath() + "/success.jsp");
    }
}
