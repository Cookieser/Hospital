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
      <h1>患者表</h1>
  </div>
  <div class="container-fluid">
    <div class="row-fluid">
      <div class="span12">
        <div class="widget-box">
          <div class="widget-title"> <span class="icon"> <i class="icon-th"></i> </span>
            
            <h5>患者信息</h5>
          </div>
          <div class="widget-content nopadding">
            <table class="table table-bordered data-table">
            	
              <thead>
                <tr>
                  <th>姓名</th>
                  <th>性别</th>
                  <th>年龄</th>
                  <th>房间号</th>
                  <th>身份证号</th>
                  <th>负责医生</th>
                  <th>家庭住址</th>
                  <th>联系方式</th>
                </tr>
              </thead>
              <tbody>
                <tr class="gradeA">
                	<td>陈泓达</td>
                	<td>男</td>
                	<td>43</td>
                	<td>A403</td>
                	<td>546548</td>
                	<td>陈</td>
                	<td>陈</td>
                	<td>123</td>
                	
                </tr>
                <tr class="gradeX">
                  <td>齐豪</td>
                  <td>男</td>
                  <td>103</td>
                  <td>B402</td>
                  <td>546548</td>
                  <td>陈</td>
                  <td>陈</td>
                  <td>123</td>
                </tr>
                <tr class="gradeC">
                  <td>王俞普</td>
                  <td>男</td>
                  <td>46</td>
                  <td>F207</td>
                  <td>546548</td>
                  <td>陈</td>
                  <td>陈</td>
                  <td>123</td>

                </tr>
                <tr class="gradeC">
                  <td>吴李天然</td>
                  <td>女</td>
                  <td>18</td>
                  <td>C254</td>
                  <td>546548</td>
                  <td>陈</td>
                  <td>陈</td>
                  <td>123</td>

                </tr>
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </div>
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
