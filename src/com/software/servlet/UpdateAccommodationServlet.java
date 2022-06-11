package com.software.servlet;



import com.software.dao.AccommodationDao;
import com.software.entity.Accommodation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UpdateAccommodationServlet",urlPatterns = "/updateAccommodation")
public class UpdateAccommodationServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AccommodationDao accommodationDao=new AccommodationDao();
        Accommodation accommodation=new Accommodation();
        String ID = request.getParameter("ID");
        String  startDate = request.getParameter("startdate");
        String  endDate = request.getParameter("enddate");
        String bedID = request.getParameter("bedid");
        String principal = request.getParameter("principal");
        String  operateDate = request.getParameter("operatedate");

        accommodation.setID(Integer.parseInt(ID));
        accommodation.setStartTime(startDate);
        accommodation.setEndTime(endDate);
        accommodation.setBedId(Integer.parseInt(bedID));
        accommodation.setPrincipal(Integer.parseInt(principal));
        accommodation.setOperateTime(operateDate);
        accommodation.setDelMark(1);
        accommodationDao.updateWork(accommodation);
        response.sendRedirect(request.getContextPath() + "/success.jsp");
    }
}