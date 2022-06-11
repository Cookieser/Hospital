<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="com.software.dao.AccommodationDao" %>
<%@ page import="com.software.utils.DBUtils" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Matrix Admin</title>
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
  <div id="content-header" class="widget-title">
      <h1>患者入住信息表</h1>
  </div>
        <div class="widget-box">
          <div class="widget-title"> <span class="icon"><i class="icon-th"></i></span>
            <h5>数据表</h5>
          </div>
          <div class="widget-content nopadding">
            <table class="table table-bordered data-table">
              <thead>
                <tr>
                  <th>入住编号</th>
                  <th>入住时间</th>
                  <th>离开时间</th>
                  <th>床位序号</th>
                  <th>负责医生工号</th>
                  <th>操作时间</th>
                  <th>操作</th>

                </tr>
              </thead>
              <%
                try{
                  Connection connection = null;
                  connection = DBUtils.getConnection();
                  Statement stmt = null;
                  ResultSet rs = null;
                  String sql = "select ID,Start_time,End_time,bed_id,principal,operate_time from accommodation where DelMark=1";
                  stmt = connection.createStatement();
                  rs = stmt.executeQuery(sql);
                  while (rs.next()) {
                    int id=rs.getInt("ID");
              %>
              <tr>
                <td><%=id%></td>
                <td><%=rs.getString("Start_time")%></td>
                <td><%=rs.getString("End_time")%></td>
                <td><%=rs.getInt("bed_id")%></td>
                <td><%=rs.getInt("principal")%></td>
                <td><%=rs.getString("operate_time")%></td>
                <td><a href='${pageContext.request.contextPath}/UpdateAccommodation.jsp' onclick="storeAc(<%=id%>)">更新</a>|<a href="javaScript:delWorkById(<%=id%>)">删除</td>
              </tr>
              <%
                  }
                } catch (Exception e) {
                  e.printStackTrace();
                  System.out.println("数据库连接失败");
                }
              %>

              </tr>
            </table>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
<script type="text/javascript">
  function delWorkById(acid){
    if(window.confirm("确认删除答案编号为" + acid +"的记录吗?")){
      window.location.href = '${pageContext.request.contextPath}/deleteAccommodation?id='+acid;
    }
  }
</script>
<script language="javascript">
  function storeAc(AcID) {
    window.localStorage.setItem("AcID", AcID);
  }
</script>
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
