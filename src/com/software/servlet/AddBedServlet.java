
package com.software.servlet;

import com.software.dao.BedDao;
import com.software.dao.DoctorDao;
import com.software.entity.BedEntity;
import com.software.entity.Doctor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddBedServlet",urlPatterns = "/addBed")
public class AddBedServlet extends HttpServlet {
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BedDao bedDao=new BedDao();
        BedEntity bedEntity=new BedEntity();
        String  apartment = request.getParameter("apartment");
        String district = request.getParameter("district");
        String roomID = request.getParameter("roomID");
        String bedID = request.getParameter("bedID");
        String  whetherInuse =request.getParameter("whetherInuse");
        String Bed_number = apartment+district+roomID+bedID;
        String Room_clean= request.getParameter("Room_clean");
        //String Delmark = request.getParameter("Delmark");
        bedEntity.setBedNumber(Integer.parseInt(Bed_number));
        bedEntity.setState(Integer.parseInt(whetherInuse));
        bedEntity.setRoomID(Integer.parseInt(roomID));
        bedEntity.setRoomClean(Room_clean);
        bedEntity.setDelmark(1);
        bedDao.addWork(bedEntity);
        response.sendRedirect(request.getContextPath() + "/success.jsp");
    }
}
