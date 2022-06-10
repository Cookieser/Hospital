package com.software.servlet;

import com.software.dao.DoctorDao;
import com.software.dao.PatientDao;
import com.software.entity.Doctor;
import com.software.entity.Patient;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "addDoctorServlet",urlPatterns = "/DServlet")
public class AddDoctorServlet extends HttpServlet {
    DoctorDao doctorDao = new DoctorDao();
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
        String gender =request.getParameter("gender");
        Integer num = Integer.parseInt(request.getParameter("doctornum"));
        String uname = request.getParameter("name");
        String department=request.getParameter("department");
        String workTime=request.getParameter("worktime");
        Integer age = Integer.parseInt(request.getParameter("age"));
        String account=request.getParameter("account");
        String birthday=request.getParameter("birthday");
        String title=request.getParameter("title");
        String pwd = request.getParameter("password");
        //3.验证登陆用户的合法性
        String password=String.valueOf(pwd.hashCode());
        Doctor doctor=new Doctor();
        doctor.setName(uname);
        doctor.setDoctorNum(num);
        doctor.setDepartment(department);
        doctor.setYear(workTime);
        doctor.setAccount(account);
        doctor.setBirthday(birthday);
        doctor.setTitle(title);
        doctor.setAge(age);
        doctor.setPassWord(password);
        doctor.setGender(gender);

        doctor.setDelMark("1");
        doctorDao.addWork(doctor);
        response.sendRedirect(request.getContextPath() + "/success.jsp");

    }
    protected void deleteWork(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //根据客户端的请求判断需要执行的操作(添加、修改、删除、查询)
        String dID = request.getParameter("dID");
        System.out.println("医生序号为:" +dID);
        doctorDao.deleteWork(Integer.parseInt(dID));

        findall(request,response);
    }
    protected void findall(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //根据客户端的请求判断需要执行的操作(添加、修改、删除、查询)
        List<Doctor> doctors = doctorDao.findAllWork();

        request.setAttribute("doctordata",doctors);
        request.getRequestDispatcher("/getdoctor.jsp").forward(request,response);
    }
    protected void updateInput(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //根据客户端的请求判断需要执行的操作(添加、修改、删除、查询)
        String dID = request.getParameter("dID");
        Doctor doctor = doctorDao.findWorkById(Integer.parseInt(dID));
        request.setAttribute("doctormodel",doctor);
        request.getRequestDispatcher("/updatedoctor.jsp").forward(request,response);
    }
    protected void updateWork(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //根据客户端的请求判断需要执行的操作(添加、修改、删除、查询)
        String name = request.getParameter("doctorname");
        String gender = request.getParameter("gender");
        String title = request.getParameter("title");
        String department = request.getParameter("department");
        String birth = request.getParameter("birthday");
        String age = request.getParameter("age");
        String year = request.getParameter("workyear");
        String did = request.getParameter("dID");

        DoctorDao doctorDao = new DoctorDao();
        Doctor doctor = new Doctor();
        doctor.setPrincipal(Integer.parseInt(did));
        doctor.setName(name);
        doctor.setGender(gender);
        doctor.setTitle(title);
        doctor.setDepartment(department);
        doctor.setBirthday(birth);
        doctor.setAge(Integer.parseInt(age));
        doctor.setYear(year);
        doctor.setDelMark("1");
        doctorDao.updateWork(doctor);
        findall(request,response);
    }


}
