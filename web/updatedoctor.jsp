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
      <h1>信息修改</h1>
  </div>
 <div class="container-fluid">
  <div class="row-fluid">
    <div class="span7">

      <div class="widget-box">
        <form id="loginform" class="form-vertical" action="${pageContext.request.contextPath}/DServlet" method="get">
          <input type="hidden" name="methodname" value="update">
          <input type="hidden" name="dID" value="${doctormodel.principal}">
        <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
          <h5>医生信息修改</h5>
        </div>
        <div class="widget-content nopadding">
          <form action="#" method="get" class="form-horizontal">
            <div class="control-group">
              <label class="control-label">姓名 :</label>
              <div class="controls">
                <input type="text" name="doctorname" value="${doctormodel.name}" class="span11" placeholder="请输入姓名" maxlength="10"/>
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">性别 :</label>
              <div class="controls">
                <input type="text" name="gender" value="${doctormodel.gender}" class="span11" placeholder="请输入性别" maxlength="1"/>
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">职称 :</label>
              <div class="controls">
                <select name="title"  class="form-control" style="width:80px" id="title">
                  <option value="${doctormodel.title}">${doctormodel.title}</option>
                  <option value="医生">医生</option>
                  <option value="护士">护士</option>
                  <option value="护工">护工</option>
                </select>
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">科室 :</label>
              <div class="controls">
                <input type="text" name="department" value="${doctormodel.department}" class="span11" placeholder="请输入科室名" maxlength="5"/>
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">生日 :</label>
              <div class="controls">
                <div  data-date="12-02-2012" class="input-append date datepicker">
                  <input type="text" name="birthday" value="${doctormodel.birthday}"  data-date-format="mm-dd-yyyy" class="span11" >
                  <span class="add-on"><i class="icon-th"></i></span> </div>
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">年龄 :</label>
              <div class="controls">
                <input type="text" name="age" value="${doctormodel.age}" class="span11" placeholder="请输入年龄" maxlength="18"/>
              </div>
            </div>
              <div class="control-group">
                <label class="control-label">工作时长 :</label>
                <div class="controls">
                  <input type="text" name="workyear" value="${doctormodel.year}" class="span11" placeholder="请输入工作时长" maxlength="20"/>
                </div>
              </div>
            <div class="form-actions">
              <botton type="reset" class="btn btn-primary">重置</botton>
              <input type="submit" value="submit" class="btn btn-success"></input>
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
