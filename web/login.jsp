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
    <title>登录</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/loginServlet" method="get">
    username:<input type="text" name="username" ><br>
    password:<input type="password" name="password"><br>
    <input type="submit" name="submit" value="OK">
</form>
</body>
</html>
