<%--
  Created by IntelliJ IDEA.
  User: pipapupu1
  Date: 2022/6/9
  Time: 23:19
  To change this template use File | Settings | File Templates.
--%>
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
        <h1>答案修改</h1>
    </div>
    <form id="loginform" class="form-vertical" action="${pageContext.request.contextPath}/updateAnswer" method="get">
        <div class="container-fluid">
            <div class="row-fluid">
                <div class="span7">

                    <div class="widget-box">
                        <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
                            <h5>请认真思考后修改答案~</h5>
                            <br />
                            <br />

                            <div class="control-group">
                                <label class="control-label">答案ID :</label>
                                <div class="controls">
                                    <input type="text"  class="span11" id="ID" name="ID" readonly="readonly">
                                    <script type="text/javascript">
                                        let data = localStorage.getItem("answerID")
                                        document.getElementById("ID").value = data;
                                    </script>

                            <div class="control-group">
                                <label class="control-label">回答人：</label>
                                <div class="controls">
                                    <input type="text"  id="userID" name="userID" class="span11"  maxlength="20" readonly="readonly"/>
                                    <script type="text/javascript">
                                        let data2 = localStorage.getItem("personID")
                                        document.getElementById("userID").value = data2;
                                    </script>
                                </div>

                                <div class="control-group">
                                    <label class="control-label">问题题目：</label>
                                    <div class="controls">
                                        <input type="text" name="questionID" id="questionID" class="span11"  maxlength="20" readonly="readonly"/>
                                        <script type="text/javascript">
                                            let data3 = localStorage.getItem("QSID")
                                            document.getElementById("questionID").value = data3;
                                        </script>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">答案填写：</label>
                                    <div class="controls">
                                        <input type="text" name="content" class="span11" placeholder="请输入答案" maxlength="20"/>
                                    </div>
                                </div>
                                <div class="form-actions">
                                    <center><button type="reset" class="btn btn-primary">重置</button>
                                    <button type="submit" class="btn btn-success">保存</button></center>
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
