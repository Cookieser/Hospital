<%@ page import="java.sql.Connection" %>
<%@ page import="com.software.utils.DBUtils" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Matrix Admin</title>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-responsive.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/colorpicker.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/datepicker.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/uniform.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/select2.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/matrix-style2.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/matrix-media.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-wysihtml5.css" />
    <link href="${pageContext.request.contextPath}/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>

    <style>
        .control-group .controls label{
            display:inline-block;
        }
    </style>
</head>
<body>

<div id="content">
    <div id="content-header">
        <h1>更新入住信息</h1>
    </div>
    <form id="loginform" class="form-vertical" action="${pageContext.request.contextPath}/updateAccommodation" method="get">
        <div class="container-fluid">
            <div class="row-fluid">
                <div class="span7">

                    <div class="widget-box">
                        <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
                            <h5>请更新入住信息</h5>
                            <br />
                            <br />
                            <div class="control-group">
                                <label class="control-label">入住ID :</label>
                                <div class="controls">
                                    <input type="text"  class="span11" name="ID" id="AcID" readonly="readonly">
                                    <script type="text/javascript">
                                        let data = localStorage.getItem("AcID")
                                        document.getElementById("AcID").value = data;
                                    </script>
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label">入住时间 :</label>
                                <div class="controls">
                                    <div  data-date="12-02-2012" class="input-append date datepicker">
                                        <input type="text" name="startdate" value="12-02-2012"  data-date-format="mm-dd-yyyy" class="span11" >
                                        <span class="add-on"><i class="icon-th"></i></span> </div>
                                </div>
                            </div>

                            <div class="control-group">
                                <label class="control-label">结束时间 :</label>
                                <div class="controls">
                                    <div  data-date="12-02-2012" class="input-append date datepicker">
                                        <input type="text" name="enddate" value="12-02-2012"  data-date-format="mm-dd-yyyy" class="span11" >
                                        <span class="add-on"><i class="icon-th"></i></span> </div>
                                </div>
                            </div>

                            <div class="control-group">
                                <label class="control-label">填写床位：</label>
                                <div class="controls">
                                    <input type="text" name="bedid" class="span11" placeholder="请填写床位ID" maxlength="20"/>
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label">负责人：</label>
                                <div class="controls">
                                    <select name="principal">
                                        <%
                                            try {

                                                Connection connection = null;
                                                connection = DBUtils.getConnection();
                                                Statement stmt = null;
                                                ResultSet rs = null;
                                                String sql = "SELECT principal,`name` FROM `doctor_chart` WHERE DelMark=1"; //查询语句
                                                stmt = connection.createStatement();
                                                rs = stmt.executeQuery(sql);

                                                while (rs.next()) {
                                                    int id= rs.getInt("principal");
                                                    String name = rs.getString("name");



                                        %>
                                        <option value="<%=id%>"><%=id%>-<%=name%></option>

                                        <%
                                                }
                                            } catch (Exception e) {
                                                e.printStackTrace();
                                                System.out.println("数据库连接失败");
                                            }
                                        %>
                                    </select>                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label">操作时间 :</label>
                                <div class="controls">
                                    <div  data-date="12-02-2012" class="input-append date datepicker">
                                        <input type="text" name="operatedate" value="12-02-2012"  data-date-format="mm-dd-yyyy" class="span11" >
                                        <span class="add-on"><i class="icon-th"></i></span> </div>
                                </div>
                            </div>

                            <div class="form-actions">
                                <center><button type="reset" class="btn btn-primary">重置</button></center>
                                <center><button type="submit" class="btn btn-success">保存</button></center>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>


    </form>

    <div class="row-fluid">

    </div>
</div>

</div>

<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.ui.custom.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap-colorpicker.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap-datepicker.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.toggle.buttons.html"></script>
<script src="${pageContext.request.contextPath}/js/masked.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.uniform.js"></script>
<script src="${pageContext.request.contextPath}/js/select2.min.js"></script>
<script src="${pageContext.request.contextPath}/js/matrix.js"></script>
<script src="${pageContext.request.contextPath}/js/matrix.form_common.js"></script>
<script src="${pageContext.request.contextPath}/js/wysihtml5-0.3.0.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.peity.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap-wysihtml5.js"></script>
<script>
    $('.textarea_editor').wysihtml5();
</script>
</body>
</html>
