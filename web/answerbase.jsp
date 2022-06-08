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
  <div id="content-header">
      <h1>表格</h1>
  </div>
  <div class="container-fluid">
    <div class="row-fluid">
      <div class="span12">
        <div class="widget-box">
          <div class="widget-title"> <span class="icon"> <i class="icon-th"></i> </span>
            <h5>问题库</h5>
          </div>
          <div class="widget-content nopadding">
            <table class="table table-bordered table-striped">
              <thead>
                <tr>
                  <th>答案编号</th>
                  <th>回答用户ID</th>
                  <th>对应问题</th>
                  <th>答案内容</th>

                </tr>
              </thead>
              <tbody>
                <tr>
                  <td>1</td>
                  <td>2</td>
                  <td>您或者您的家人是否需要特殊护理人员？</td>
                  <td class="center"> 腰酸背痛，需要日常中医药护理</td>
                  
                </tr>
                <tr>
                  <td>2</td>
                  <td rowspan="2">3</td>
                  <td>您或者您的家人是否需要特殊护理人员？</td>
                  <td class="center">需要进行腿部肌肉日常康复训练</td>
                  
                </tr>
                <tr>
                  <td>3</td>

                  <td>您的子女是否经常探望？</td>
                  <td class="center">子女满堂，经常探望</td>
                  
                </tr>
                <tr>
                  <td>4</td>
                  <td>4</td>
                  <td>您是否存在慢性病？</td>
                  <td class="center">有慢性病，痰多咳嗽，慢性鼻炎</td>
                  
                </tr>
                <tr>
                  <td>5</td>
                  <td>1</td>
                  <td>您是否患有突发疾病？</td>
                  <td class="center">没有突发疾病，偶尔心绞痛</td>
                  
                </tr>
                <tr>
                  <td>6</td>
                  <td>5</td>
                  <td>您是否有家族遗传病</td>
                  <td class="center">具有家族遗传心血管疾病</td>
                  
                </tr>
              </tbody>
            </table>
          </div>
        </div>
        

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
