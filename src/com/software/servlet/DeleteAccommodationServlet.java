package com.software.servlet;
import com.software.dao.AccommodationDao;
import com.software.entity.Accommodation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteAccommodationServlet",urlPatterns = "/deleteAccommodation")
public class DeleteAccommodationServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AccommodationDao accommodationDao=new AccommodationDao();
        Accommodation accommodation=new Accommodation();
        Integer id = Integer.parseInt(request.getParameter("id"));
        accommodation.setDelMark(0);
        accommodation.setID(id);
        accommodationDao.deleteWork(accommodation);

        response.sendRedirect(request.getContextPath() + "/success.jsp");
    }
}