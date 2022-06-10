package com.software.servlet;

import com.software.dao.PatientDao;
import com.software.entity.Patient;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "addPatientServlet",urlPatterns = "/PServlet")
public class addPatientServlet extends HttpServlet {
    PatientDao patientDao = new PatientDao();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String methodname = request.getParameter("methodname");
        if ("add".equals(methodname)) {
            //执行添加操作
            addwork(request, response);
        } else if ("delete".equals(methodname)) {
            //执行删除操作
            deleteWork(request, response);
        } else if ("updateinput".equals(methodname)) {
            //执行查询修改操作
            updateInput(request, response);
        } else if ("update".equals(methodname)) {
            //执行修改操作
            updateWork(request, response);
        } else {
            //执行查询全部信息
            findall(request, response);
        }
    }
    protected void addwork(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("patientname");
        String gender = request.getParameter("gender");
        String DID = request.getParameter("DID");
        String date = request.getParameter("date");
        String PID = request.getParameter("PID");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");

        PatientDao patientDao = new PatientDao();
        Patient patient = new Patient();
        patient.setPatientName(name);
        patient.setGender(gender);
        patient.setPrincipal(Integer.parseInt(DID));
        patient.setLoadTime(date);
        patient.setIdCard(PID);
        patient.setHomeAddress(address);
        patient.setPhone(phone);
        patient.setDelMark(1);
        patientDao.addPatient(patient);
        response.sendRedirect(request.getContextPath()+"/addpatient.jsp");
    }
    protected void deleteWork(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //根据客户端的请求判断需要执行的操作(添加、修改、删除、查询)
        String pname = request.getParameter("name");
        System.out.println("患者名为:" +pname);
        patientDao.deletePatientById(pname);

        findall(request,response);
    }
    protected void findall(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //根据客户端的请求判断需要执行的操作(添加、修改、删除、查询)
        List<List>  rows = patientDao.findPatientCheckin();
        request.setAttribute("patientdata",rows);
        request.getRequestDispatcher("/getpatientinfo.jsp").forward(request,response);
    }
    protected void updateInput(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //根据客户端的请求判断需要执行的操作(添加、修改、删除、查询)
        String pname = request.getParameter("name");
        Patient patient = patientDao.findPatientByID(pname);
        request.setAttribute("patientmodel",patient);
        request.getRequestDispatcher("/updatepatient.jsp").forward(request,response);
    }
    protected void updateWork(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //根据客户端的请求判断需要执行的操作(添加、修改、删除、查询)
        String name = request.getParameter("patientname");
        String gender = request.getParameter("gender");
        String DID = request.getParameter("DID");
        String date = request.getParameter("date");
        String PID = request.getParameter("PID");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");

        PatientDao patientDao = new PatientDao();
        Patient patient = new Patient();
        patient.setPatientName(name);
        patient.setGender(gender);
        patient.setPrincipal(Integer.parseInt(DID));
        patient.setLoadTime(date);
        patient.setIdCard(PID);
        patient.setHomeAddress(address);
        patient.setPhone(phone);
        patient.setDelMark(1);
        patientDao.updatePatient(patient);
        findall(request,response);
    }


}
