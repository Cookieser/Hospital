package com.software.servlet;


import com.software.dao.AccommodationDao;
import com.software.entity.Accommodation;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddAccommodationServlet",urlPatterns = "/addAccommodation")
public class AddAccommodationServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AccommodationDao accommodationDao=new AccommodationDao();
        Accommodation accommodation=new Accommodation();
        String  startDate = request.getParameter("startdate");
        String bedID = request.getParameter("bedid");
        String principal = request.getParameter("principal");
        String  operateDate = request.getParameter("operatedate");

        accommodation.setStartTime(startDate);
        accommodation.setBedId(Integer.parseInt(bedID));
        accommodation.setPrincipal(Integer.parseInt(principal));
        accommodation.setOperateTime(operateDate);

        accommodation.setDelMark(1);
        accommodationDao.addWork(accommodation);
        response.sendRedirect(request.getContextPath() + "/success.jsp");
    }
}