package com.software.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet",urlPatterns = "/loginServlet")
public class Servlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //1.获取用户名
        String uname = request.getParameter("username");
        //2.获取密码
        String pwd = request.getParameter("password");
        System.out.println(uname);
        System.out.println(pwd);
//            //3.验证登陆用户的合法性
//            if("admin".equals(uname) && "123".equals(pwd)){
//                //合法用户.跳转到成功页面
//                response.sendRedirect(request.getContextPath() + "/success.jsp");
//            }
//            else{
//                //非法用户，跳转到登陆页面
//                response.sendRedirect(request.getContextPath() + "/index.jsp");
//            }
//        }
    }
}
