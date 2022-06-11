<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="com.software.dao.BedDao" %>
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
      <h1>床位查询信息表</h1>
  </div>
        <div class="widget-box">
          <div class="widget-title"> <span class="icon"><i class="icon-th"></i></span>
            <h5>床位信息表</h5>
          </div>
          <div class="widget-content nopadding">
            <table class="table table-bordered data-table">
              <thead>
                <tr>
                  <th>ID</th>
                  <th>床位编号</th>
                  <th>状态</th>
                  <th>房间编号</th>
                  <th>上次清洁时间</th>
                  <th>操作</th>
                </tr>
              </thead>
              <%
                try {

                Connection connection = null;
                connection = DBUtils.getConnection();
                Statement stmt = null;
                ResultSet rs = null;
                String sql = "select ID,Bed_Number,State,Room_ID,Room_Clean from bed where DelMark=1"; //查询语句
                stmt = connection.createStatement();
                rs = stmt.executeQuery(sql);
                int status=0;
                String statusPrint;
                while (rs.next()) {
                  status= rs.getInt("State");
                  if(status==0) statusPrint="未使用";else statusPrint="使用中";
                  int id=rs.getInt("ID");
                  int idRoom=rs.getInt("Room_ID");
              %>
              <tr>
                <td><%=id%></td>
                <td><%=rs.getInt("Bed_Number")%></td>
                <td><%=statusPrint%></td>
                <td><%=rs.getInt("Room_ID")%></td>
                <td><%=rs.getString("Room_Clean")%></td>
                <td><a href='${pageContext.request.contextPath}/UpdateBed.jsp' onclick="storeQuestion(<%=id%>,<%=idRoom%>)">修改</a>|<a href="javaScript:delWorkById(<%=id%>)">删除</td>
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
  function delWorkById(wid){
      if(window.confirm("确认删除医生工号为" + wid +"的记录吗?")){
        window.location.href = '${pageContext.request.contextPath}/deleteBed?id='+wid;
    }
  }
</script>
<script language="javascript">
  function storeQuestion(bedID,roomID) {
    window.localStorage.setItem("bedID", bedID);
    window.localStorage.setItem("roomID", roomID);
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
