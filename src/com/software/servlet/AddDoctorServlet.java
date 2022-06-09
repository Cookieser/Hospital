package com.software.servlet;

import com.software.dao.DoctorDao;
import com.software.entity.Doctor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "AddDoctorServlet",urlPatterns = "/addDoctorServlet")
public class AddDoctorServlet extends HttpServlet {
    DoctorDao doctorDao=new DoctorDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    //添加医生信息
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        //根据客户端的请求判断需要执行的操作(添加、修改、删除、查询)
//        String methodname = request.getParameter("methodname");
//        if ("add".equals(methodname)) {
            //执行添加操作
            addWork(request, response);
//        } else if ("delete".equals(methodname)) {
//            //执行删除操作
//            deleteWork(request, response);
//        } else if ("updateinput".equals(methodname)) {
//            //执行查询修改操作
//            updateInput(request, response);
//        } else if ("update".equals(methodname)) {
//            //执行修改操作
//            updateWork(request, response);
//        } else {
//            //执行查询全部信息
//            findAll(request, response);
//        }
    }

    protected void addWork(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


                //1.获取用户名

        String gender =request.getParameter("gender");
        Integer num = Integer.parseInt(request.getParameter("doctornum"));
        String uname = request.getParameter("name" +
                "");
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
    protected void deleteWork(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}
    protected void updateInput(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}
    protected void updateWork(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}
    protected void findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}


//        //3.验证登陆用户的合法性
//        if(doctor != null && pwd.equals(doctor.getPassWord())){
//            //合法用户.跳转到成功页面
//
//            response.sendRedirect(request.getContextPath() + "/index.jsp");
//        }else{
//            //非法用户，跳转到登陆页面
//            response.sendRedirect(request.getContextPath() + "/login.jsp");
//        }
    }

