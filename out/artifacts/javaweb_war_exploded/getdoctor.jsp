<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Matrix Admin</title>
  <script type="text/javascript">
    function deldoctorById(did){
      if(window.confirm("确认删除员工序号为：" + did +"的记录吗?")){
        window.location.href = '${pageContext.request.contextPath}/DServlet?methodname=delete&dID='+did;
      }
    }
  </script>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/matrix-style2.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/matrix-media.css" />
<link href="${pageContext.request.contextPath}/font-awesome/css/font-awesome.css" rel="stylesheet" />
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>
</head>
<body>

<div id="content">
  <div id="content-header">
      <h1>天伦颐养中心</h1>
  </div>
  <div class="container-fluid">
    <div class="row-fluid">
      <div class="span12">
        <div class="widget-box">
          <div class="widget-title"> <span class="icon"> <i class="icon-briefcase"></i> </span>
            <h5 >您好！</h5>
          </div>
          <div class="widget-content">
            <div class="row-fluid">
              <div class="span6">
                <table class="">
                  <tbody>
                    <tr>
                      <td><h4>员工管理系统</h4></td>
                    </tr>
                    <tr>
                      <td>在这里，方便您定位：</td>
                    </tr>
                    <tr>
                      <td>员工职务信息</td>
                    </tr>
                    <tr>
                      <td>员工工龄</td>
                    </tr>
                    <tr>
                      <td >员工科室</td>
                    </tr>
                  </tbody>
                </table>
              </div>
              <div class="span6">
                <table class="table table-bordered table-invoice">
                  <tbody>
                    <tr>
                    <tr>
                      <td class="width30">当前操作员工ID:</td>
                      <td class="width70"><strong>123456</strong></td>
                    </tr>
                    <tr>
                      <td>当前操作员工姓名：</td>
                      <td><strong>王渝普</strong></td>
                    </tr>
                    <tr>
                      <td>操作日期</td>
                      <td><strong>April 01, 2013</strong></td>
                    </tr>
             
                    </tbody>
                  
                </table>
              </div>
            </div>
            <div class="row-fluid">
              <div class="span12">
                <table class="table table-bordered table-invoice-full">
                  <thead>
                    <tr>
                      <th class="head0">员工序号</th>
                      <th class="head1">员工ID</th>
                      <th class="head0 right">员工姓名</th>
                      <th class="head1 right">员工年龄</th>
                      <th class="head0 right">员工工龄</th>
                      <th class="head0 right">员工性别</th>
                      <th class="head0 right">员工生日</th>
                      <th class="head0 right">员工职称 </th>
                      <th class="head0 right">员工科室</th>
                      <th class="head0 right">操作</th>
                    </tr>
                  </thead>
                  <tbody>
                  <c:choose>
                  <c:when test="${empty doctordata}">
                  <tr>
                    <td colspan="5">查无数据！</td>
                  </tr>
                  </c:when>
                  <c:otherwise>
                  <c:forEach items="${doctordata}" var="v">
                  <tr>
                    <td>${v.principal}</td>
                    <td>${v.doctorNum}</td>
                    <td>${v.name}</td>
                    <td>${v.age}</td>
                    <td>${v.year}</td>
                    <td>${v.gender}</td>
                    <td>${v.birthday}</td>
                    <td>${v.title}</td>
                    <td>${v.department}</td>
                    <td><a href='${pageContext.request.contextPath}/DServlet?methodname=updateinput&dID=${v.principal}'>修改</a>|
                      <a href="javaScript:deldoctorById('${v.principal}')">删除</a></td>
                  </tr>
                  </c:forEach>
                  </c:otherwise>
                  </c:choose>

                  
                </table>
                <div class="pull-right">
     
                  <a class="btn btn-primary btn-large pull-right" href="#">退出</a> </div>
              
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
 
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.ui.custom.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/matrix.js"></script>

</body>
</html>
