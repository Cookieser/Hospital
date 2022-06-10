

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
                    <form id="loginform" class="form-vertical" action="${pageContext.request.contextPath}/rareManageservlet" method="get">
                        <input type="hidden" name="methodname" value="add">
                        <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
                            <h5>信息录入</h5>
                        </div>
                        <div class="widget-content nopadding">
                            <form action="#" method="get" class="form-horizontal">
                                <div class="control-group">
                                    <label class="control-label">设备名称 :</label>
                                    <div class="controls">
                                        <input type="text" name="equipmentName" class="span11" placeholder="请输入设备名称" maxlength="10"/>
                                    </div>
                                </div>


                                <div class="control-group">
                                    <label class="control-label">设备类型 :</label>
                                    <div class="controls">
                                        <input type="text" name="equipmentType" class="span11" placeholder="请输入设备类型" maxlength="5"/>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">是否正在使用 :</label>
                                    <div class="controls">
                                        <input type="text" name="inUse" class="span11" placeholder="请输入设备类型" maxlength="1"/>
                                    </div>
                                </div>

                                <div class="control-group">
                                    <label class="control-label">房间编号 :</label>
                                    <div class="controls">
                                        <select name="roomID">
                                            <option value="${workmodel.roomID}">${workmodel.roomID}</option>
                                            <option value="1">1</option>
                                            <option value="2">2</option>
                                            <option value="3">3</option>
                                            <option value="4">4</option>
                                            <option value="5">5</option>
                                            <option value="6">6</option>
                                            <option value="7">7</option>
                                            <option value="8">8</option>
                                            <option value="9">9</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">备注 :</label>
                                    <div class="controls">
                                        <input type="text" name="remarks" class="span11" placeholder="备注" oninput="value=value.replace(/[^\d]/g,'')" maxlength="20"/>
                                    </div>
                                </div>
                                <div class="form-actions">
                                    <botton type="reset" class="btn btn-primary">重置</botton>
                                    <input type="submit" value="submit" class="btn btn-success">
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


