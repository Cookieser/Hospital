<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Matrix Admin</title>
  <script type="text/javascript">
    function delpatientById(pname){
      if(window.confirm("确认删除患者名称为：" + pname +"的记录吗?")){
        window.location.href = '${pageContext.request.contextPath}/PServlet?methodname=delete&name='+pname;
      }
    }
  </script>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-responsive.min.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/uniform.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/select2.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/matrix-style2.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/matrix-media.css" />
  <link href="${pageContext.request.contextPath}/font-awesome/css/font-awesome.css" rel="stylesheet" />
  <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>
</head>
<body>

<div id="content">
  <div id="content-header">
    <h1>患者表</h1>
  </div>
  <div class="container-fluid">
    <div class="row-fluid">
      <div class="span12">
        <div class="widget-box">
          <div class="widget-title"> <span class="icon"> <i class="icon-th"></i> </span>

            <h5>患者信息</h5>
          </div>

          <div class="widget-content nopadding">
            <table class="table table-bordered data-table">

              <thead>
              <tr>
                <th>姓名</th>
                <th>性别</th>
                <th>身份证号</th>
                <th>负责医生</th>
                <th>家庭住址</th>
                <th>联系方式</th>
                <th>操作</th>

              </tr>
              </thead>
              <tbody>

              </tbody>
              <c:choose>
                <c:when test="${empty patientdata}">
                  <tr>
                    <td colspan="5">查无数据！</td>
                  </tr>
                </c:when>
                <c:otherwise>
                  <c:forEach items="${patientdata}" var="v">
                    <tr>
                      <td>${v[1]}</td>
                      <td>${v[2]}</td>
                      <td>${v[5]}</td>
                      <td>${v[3]}</td>
                      <td>${v[6]}</td>
                      <td>${v[7]}</td>
                      <td><a href='${pageContext.request.contextPath}/PServlet?methodname=updateinput&name=${v[1]}'>修改</a>|
                        <a href="javaScript:delpatientById('${v[1]}')">删除</a></td>
                    </tr>
                  </c:forEach>
                </c:otherwise>
              </c:choose>
            </table>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>

<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.ui.custom.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.uniform.js"></script>
<script src="${pageContext.request.contextPath}/js/select2.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.dataTables.min.js"></script>
<script src="${pageContext.request.contextPath}/js/matrix.js"></script>
<script src="${pageContext.request.contextPath}/js/matrix.tables.js"></script>
</body>
</html>
