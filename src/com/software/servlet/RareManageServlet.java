package com.software.servlet;

import com.software.dao.RareManageDao;
import com.software.entity.RareManageEntity;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 前端控制器:实现员工信息的增、删、改、查操作
 */
@WebServlet(name = "RareManageServlet",urlPatterns = "/rareManageservlet")
public class RareManageServlet extends HttpServlet {

    RareManageDao rareManageDao =new RareManageDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //根据客户端的请求判断需要执行的操作(添加、修改、删除、查询)
        String methodname =request.getParameter("methodname");
        if("add".equals(methodname)){
            //执行添加操作
            addwork(request,response);
        }else if("delete".equals(methodname)){
            //执行删除操作
            deleteWork(request,response);
        }else if("updateinput".equals(methodname)){
            //执行查询修改操作
            updateInput(request,response);
        }else if("update".equals(methodname)){
            //执行修改操作
            updateWork(request,response);
        }else{
            //执行查询全部信息
            findall(request,response);
        }
    }

    /**
     * 添加操作
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void addwork(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取用户添加的数据信息

        String name =request.getParameter("equipmentName");
        String type =request.getParameter("equipmentType");
        String inuse =request.getParameter("inUse");
        String roomid =request.getParameter("roomID");
        String remark =request.getParameter("remarks");



        //2.调用数据库访问层中的添加方法
        //2.1.创建测试用例
        RareManageEntity workEntity = new RareManageEntity();
        //2.2.设置测试用例的数据
        workEntity.setEquipmentName(name);
        workEntity.setEquipmentType(type);
        workEntity.setInUse(Integer.parseInt(inuse));
        workEntity.setRoomID(Integer.parseInt(roomid));
        workEntity.setDelMark(1);
        workEntity.setRemarks(remark);



        //2.3.验证添加功能是否实现
        int count =rareManageDao.addWork(workEntity);

        //3.调用数据库查询操作
        //3.1 跳转到success.jsp页面
        response.sendRedirect(request.getContextPath()+"/success.jsp");
    }

    /**
     * 删除操作
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void deleteWork(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //根据客户端的请求判断需要执行的操作(添加、修改、删除、查询)
        String ID = request.getParameter("workid");
        System.out.println("id" +ID);
        rareManageDao.deleteWorkById(ID);

        findall(request,response);
    }

    /**
     * 查询全部信息
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void findall(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //根据客户端的请求判断需要执行的操作(添加、修改、删除、查询)
        List<RareManageEntity> works = rareManageDao.findWork();
        request.setAttribute("worksdata",works);
        request.getRequestDispatcher("/raremanage.jsp")
                .forward(request,response);
    }

    /**
     * 修改查询操作
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void updateInput(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //根据客户端的请求判断需要执行的操作(添加、修改、删除、查询)
        String ID = request.getParameter("wid");
        RareManageDao rareManageDao=new RareManageDao();
        RareManageEntity rareManageEntity= rareManageDao.findWorkById(Integer.parseInt(ID));


        request.setAttribute("workmodel",rareManageEntity);
        request.getRequestDispatcher("/updateraremanage.jsp").forward(request,response);

    }

    /**
     * 修改操作
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void updateWork(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //根据客户端的请求判断需要执行的操作(添加、修改、删除、查询)
        //1.获取用户添加的数据信息ID
        String ID = request.getParameter("ID");
        String name =request.getParameter("equipmentName");
        String type =request.getParameter("equipmentType");
        String inuse =request.getParameter("inUse");
        String roomid =request.getParameter("roomID");
        String remark =request.getParameter("remarks");



        //2.调用数据库访问层中的修改方法
        //2.1.创建测试用例
        RareManageEntity workEntity = new RareManageEntity();
        //2.2.设置测试用例的数据
        workEntity.setID(Integer.parseInt(ID));
        workEntity.setEquipmentName(name);
        workEntity.setEquipmentType(type);
        workEntity.setInUse(Integer.parseInt(inuse));
        workEntity.setRoomID(Integer.parseInt(roomid));
        workEntity.setRemarks(remark);

        //2.3.验证添加功能是否实现
        int count =rareManageDao.updateWork(workEntity);

        //3.调用数据库查询操作
        findall(request,response);


    }
}

//package com.software.servlet;
//
//import com.software.dao.RareManageDao;
//import com.software.entity.RareManageEntity;
//
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.List;
//
//
//
//@WebServlet(name = "RareMangeServlet",urlPatterns = "/rareManageServlet")
//public class RareManageServlet extends HttpServlet {
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        RareManageDao rareManageDao=new RareManageDao();
//        RareManageEntity rareManageEntity =new RareManageEntity();
//
//        String name =request.getParameter("equipment_name");
//        String type =request.getParameter("equipment_type");
//        String inuse =request.getParameter("in_use");
//        String roomid =request.getParameter("Room_ID");
//
//
//        rareManageEntity.setEquipmentName(name);
//        rareManageEntity.setEquipmentType(type);
//        rareManageEntity.setInUse(Integer.parseInt(inuse));
//        rareManageEntity.setRoom_ID(Integer.parseInt(roomid));
//
//        rareManageDao.updateWork(rareManageEntity);
//    }
//}


