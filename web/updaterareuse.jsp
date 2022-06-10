<%--<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<!DOCTYPE html>--%>
<%--<html lang="en">--%>
<%--<head>--%>
<%--    <title>Matrix Admin</title>--%>
<%--    <meta charset="UTF-8" />--%>
<%--    <meta name="viewport" content="width=device-width, initial-scale=1.0" />--%>
<%--    <link rel="stylesheet" href="css/bootstrap.min.css" />--%>
<%--    <link rel="stylesheet" href="css/bootstrap-responsive.min.css" />--%>
<%--    <link rel="stylesheet" href="css/colorpicker.css" />--%>
<%--    <link rel="stylesheet" href="css/datepicker.css" />--%>
<%--    <link rel="stylesheet" href="css/uniform.css" />--%>
<%--    <link rel="stylesheet" href="css/select2.css" />--%>
<%--    <link rel="stylesheet" href="css/matrix-style2.css" />--%>
<%--    <link rel="stylesheet" href="css/matrix-media.css" />--%>
<%--    <link rel="stylesheet" href="css/bootstrap-wysihtml5.css" />--%>
<%--    <link href="font-awesome/css/font-awesome.css" rel="stylesheet" />--%>
<%--    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>--%>

<%--    <style>--%>
<%--        .control-group .controls label{--%>
<%--            display:inline-block;--%>
<%--        }--%>
<%--    </style>--%>
<%--</head>--%>
<%--<body>--%>

<%--<div id="content">--%>
<%--    <div id="content-header">--%>
<%--        <h1>稀有设备统计管理</h1>--%>
<%--    </div>--%>
<%--    <div class="container-fluid">--%>
<%--        <div class="row-fluid">--%>
<%--            <div class="span6">--%>
<%--                <div class="widget-box">--%>
<%--                    <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>--%>
<%--                        <h5>添加设备</h5>--%>
<%--                    </div>--%>
<%--                    <div class="widget-content nopadding">--%>
<%--                        <form action="#" method="get" class="form-horizontal">--%>
<%--                            <div class="control-group">--%>
<%--                                <label class="control-label">设备名称 :</label>--%>
<%--                                <div class="controls">--%>
<%--                                    <input type="text" class="span11" name="equipmentName" placeholder="设备名称" />--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                            <div class="control-group">--%>
<%--                                <label class="control-label">设备类型:</label>--%>
<%--                                <div class="controls">--%>
<%--                                    <input type="text" class="span11" name="equipmentType" placeholder="设备类型" />--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                            <div class="control-group">--%>
<%--                                <label class="control-label">房间编号</label>--%>
<%--                                <div class="controls">--%>
<%--                                    <input type="password"  class="span11" name="roomID" placeholder="房间编号"  />--%>
<%--                                </div>--%>
<%--                            </div>--%>

<%--                            <div class="form-actions">--%>
<%--                                <button type="submit" class="btn btn-success">保存</button>--%>
<%--                                <button type="submit" class="btn btn-primary">重置</button>--%>
<%--                                <button type="submit" class="btn btn-danger">取消</button>--%>
<%--                            </div>--%>
<%--                    </div>--%>
<%--                    </form>--%>
<%--                </div>--%>
<%--            </div>--%>




<%--        </div></div>--%>

<%--    <script src="js/jquery.min.js"></script>--%>
<%--    <script src="js/jquery.ui.custom.js"></script>--%>
<%--    <script src="js/bootstrap.min.js"></script>--%>
<%--    <script src="js/bootstrap-colorpicker.js"></script>--%>
<%--    <script src="js/bootstrap-datepicker.js"></script>--%>
<%--    <script src="js/jquery.toggle.buttons.html"></script>--%>
<%--    <script src="js/masked.js"></script>--%>
<%--    <script src="js/jquery.uniform.js"></script>--%>
<%--    <script src="js/select2.min.js"></script>--%>
<%--    <script src="js/matrix.js"></script>--%>
<%--    <script src="js/matrix.form_common.js"></script>--%>
<%--    <script src="js/wysihtml5-0.3.0.js"></script>--%>
<%--    <script src="js/jquery.peity.min.js"></script>--%>
<%--    <script src="js/bootstrap-wysihtml5.js"></script>--%>
<%--    <script>--%>
<%--        $('.textarea_editor').wysihtml5();--%>
<%--    </script>--%>
<%--</body>--%>
<%--</html>--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
        <h1>稀有设备统计</h1>
    </div>
    <div class="container-fluid">
        <div class="row-fluid">
            <div class="span7">

                <div class="widget-box">
                    <form id="loginform" class="form-vertical" action="${pageContext.request.contextPath}/rareUseservlet" method="get">
                        <input type="hidden" name="methodname" value="update">

                        <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
                            <h5>信息录入</h5>
                            <input type="hidden" name="ID" value="${workmodel.ID}">
                        </div>
                        <div class="widget-content nopadding">
                            <form action="#" method="get" class="form-horizontal">
                                <div class="control-group">
                                    <label class="control-label">开始使用时间 :</label>
                                    <div class="controls">
                                        <input  name="startTime" class="span11" value="${workmodel.startTime}" placeholder="请输入开始使用时间" maxlength="10"/>
                                    </div>
                                </div>


                                <div class="control-group">
                                    <label class="control-label">结束使用时间 :</label>
                                    <div class="controls">
                                        <input  name="endTime" class="span11" value="${workmodel.endTime}" placeholder="请输入结束使用时间" maxlength="10"/>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">使用人编号 :</label>
                                    <div class="controls">
                                        <input type="text" name="userID" class="span11"  value="${workmodel.userID}" placeholder="请输入使用人编号" maxlength="1"/>
                                    </div>
                                </div>

                                <div class="form-actions">
                                    <botton type="reset" class="btn btn-primary">重置</botton>
                                    <input type="submit" value="保存" class="btn btn-success">
                                </div>
                            </form>
                        </div>
                    </form>
                </div>
            </div>
        </div>
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


