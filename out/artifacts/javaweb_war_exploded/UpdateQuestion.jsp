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
        <h1>问题修改</h1>
    </div>
    <form id="loginform" class="form-vertical" action="${pageContext.request.contextPath}/updateQuestion" method="get">
        <div class="container-fluid">
            <div class="row-fluid">
                <div class="span7">

                    <div class="widget-box">
                        <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
                            <h5>请认真思考后提出问题~</h5>
                            <br />
                            <br />

                            <div class="control-group">
                                <label class="control-label">问题ID :</label>
                                <div class="controls">
                                    <input type="text"  class="span11" name="ID" id="ID" disabled="disabled">
                                    <script type="text/javascript">
                                        let data = localStorage.getItem("questionID")
                                        document.getElementById("ID").value = data;
                                </script>

                            <div class="control-group">
                                <label class="control-label">题目类型：</label>
                                <div class="controls">
                                    <select name="modelName">
                                        <option value="1">养老</option>
                                        <option value="2">疗养</option>
                                        <option value="3">轻型残疾</option>
                                        <option value="4">严重残疾</option>
                                    </select>
                                </div>

                                <div class="control-group">
                                    <label class="control-label">问题题目：</label>
                                    <div class="controls">
                                        <input type="text" name="title" class="span11" placeholder="请输入问题" maxlength="20"/>
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
        </div>


    </form>

    <div class="row-fluid">

    </div>
</div>

</div>
<script type="text/javascript">
    function storeQuestion() {
        let data = localStorage.getItem("questionID")
        document.getElementById("ID").value = data;
    }
</script>

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
