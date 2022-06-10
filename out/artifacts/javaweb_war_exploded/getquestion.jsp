<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="com.software.dao.QuestionDao" %>
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
        <h1>问题题目查询表</h1>
    </div>
    <div class="widget-box">
        <div class="widget-title"> <span class="icon"><i class="icon-th"></i></span>
            <h5>数据表</h5>
        </div>
        <div class="widget-content nopadding">
            <table class="table table-bordered data-table">
                <thead>
                <tr>
                    <th>问题ID</th>
                    <th>问题类型</th>
                    <th>问题题目</th>
                    <th>操作</th>
                </tr>
                </thead>
                <%
                    try {

                        Connection connection = null;
                        connection = DBUtils.getConnection();
                        Statement stmt = null;
                        ResultSet rs = null;
                        String sql = "select ID,Title,Module_Name from question where DelMark=1"; //查询语句
                        stmt = connection.createStatement();
                        rs = stmt.executeQuery(sql);
                        int status=0;
                        String statusPrint;
                        while (rs.next()) {
                            status= rs.getInt("Module_Name");
                            switch(status)
                            {
                                case 1 :
                                    statusPrint="养老";
                                    break;
                                case 2 :
                                    statusPrint="疗养";
                                    break;
                                case 3 :
                                    statusPrint="轻型残疾";
                                    break;
                                case 4 :
                                    statusPrint="重型残疾";
                                    break;
                                default :
                                    statusPrint="未分类";
                            }
                            int id=rs.getInt("ID");
                %>
                <tr>
                    <td><%=id%></td>
                    <td><%=statusPrint%></td>
                    <td><%=rs.getString("Title")%></td>
                    <td><a href='${pageContext.request.contextPath}/UpdateQuestion.jsp' onclick="storeQuestion(<%=id%>)">修改</a>|<a href="javaScript:delWorkById(<%=id%>)">删除</td>
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
    function delWorkById(qid){
        if(window.confirm("确认删除问题编号为" + qid +"的记录吗?")){
            window.location.href = '${pageContext.request.contextPath}/deleteQuestion?id='+qid;
        }
    }
</script>
<script language="javascript">
    function storeQuestion(questionID) {
        window.localStorage.setItem("questionID", questionID);
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
