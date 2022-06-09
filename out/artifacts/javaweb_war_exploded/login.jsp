<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
    
<head>
    <title>Matrix Admin</title><meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-responsive.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/matrix-login.css" />
    <link href="${pageContext.request.contextPath}/font-awesome/css/font-awesome.css" rel="stylesheet" />
	<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>
    <style type="text/css">
        input{
            font-family: "Microsoft Yahei";
        }
        .control-label{
            color: #B2DFEE;
            padding-left: 4px;
        }
    </style>
</head>
<body onkeydown="keydown()">
    <div id="loginbox">  
        <div class="control-group normal_text"> 
            <h2 style="color:#B2DFEE;font-size:28px;">天伦颐养信息管理平台</h2>
            <span style="font-size:14px;color:gray;"></span>
        </div>          
        <form id="loginform" class="form-vertical" action="${pageContext.request.contextPath}/loginServlet" method="get">
            <div class="control-group">
                <label class="control-label">登陆账号</label>
                <div class="controls">
                    <div class="main_input_box">
                        <span class="add-on bg_lg"><i class="icon-user" style="font-size:16px;"></i></span>
                        <input id="name" type="text"  name="username"/>
                    </div>
                </div>
            </div>
            <div class="control-group2">
                <label class="control-label">登陆密码</label>
                <div class="controls">
                    <div class="main_input_box">
                        <span class="add-on bg_ly"><i class="icon-lock" style="font-size:16px;"></i></span><input type="password" name="password"/>
                    </div>
                </div>
            </div>
            <div class="form-actions">
            
                <span class="pull-right">
                    <input type="submit" id="checkBtn" name="submit"  class="btn btn-success"  onclick="print()" style="width:500px;" value=" 登&nbsp;&nbsp;&nbsp;&nbsp;录"/>


                </span>
            </div>
            <div class="control-group normal_text">
                <div style="font-size:14px;color:gray;"></div>
            </div>
        </form>
        

        <form id="recoverform" action="#" class="form-vertical" style="padding-top:10px;">
            <label class="control-label">登陆账号</label>
            <div class="controls">
                <div class="main_input_box">
                    <span class="add-on bg_lg"><i class="icon-user" style="font-size:16px;"></i></span><input type="text" name="re_username" />
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">新密码</label>
                <div class="controls">
                    <div class="main_input_box">
                        <span class="add-on bg_ly"><i class="icon-lock" style="font-size:16px;"></i></span><input type="password" name="re_password"/>
                    </div>
                </div>
            </div>
            <div class="control-group" style="padding-top:0px;">
                <label class="control-label">确认新密码</label>
                <div class="controls">
                    <div class="main_input_box">
                        <span class="add-on bg_ly"><i class="icon-lock" style="font-size:16px;"></i></span><input type="password" name="re_confirmpassword" />
                    </div>
                </div>
            </div>
            <div class="form-actions">
                <span class="pull-left"><a href="#" class="flip-link btn btn-success" id="to-login">&laquo; 返回登录</a></span>
                <span class="pull-right"><a id="changePwd" class="btn btn-info" style="width:310px;">重置密码</a></span>
            </div>
            <div class="control-group normal_text">
                <div style="font-size:14px;color:gray;">推荐使用webkit内核浏览器，如chrome等</div>
            </div>
        </form>

    </div>
    <script language="javascript">
        function print() {
            var username = document.getElementById("name").value;
            window.localStorage.setItem("username", username);
        }
    </script>
    <script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/matrix.login.js"></script>
</body>

</html>
