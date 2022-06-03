<%--
  Created by IntelliJ IDEA.
  User: 32442
  Date: 2022/5/31
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>获取用户信息</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/infoServlet" method="get">
    Name:<input type="text" name="name"><br>
    Gender:<input type="text" name="gender"><br>
    IDcard:<input type="number" name="idcard"><br>
    HomeAddress:<input type="text" name="homeaddress"><br>
    <input type="submit" name="submit" value="OK">
</form>


</form>
</body>
</html>
