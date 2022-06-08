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
      
            <h5>模板管理</h5>
          <div class="widget-content ">
            <table class="table table-bordered table-striped with-check">
              <thead>
                <tr>
                	<th> </th>
                  <th>模板类型</th>
                  <th>问题一</th>
                  <th>问题二</th>
                  <th>问题三</th>
                  <th>问题四</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td><input type="checkbox" /></td>
                  <td>养老型</td>
                  <td>您的子女是否经常探望？</td>
                  <td>您是否存在慢性病？</td>
                  <td>您是否患有突发疾病？</td>
                  <td>您是否拥有精神疾病?</td>
                </tr>
                <tr>
                  <td><input type="checkbox" /></td>
                  <td>疗养型</td>
                  <td>您的问题是位于哪一部位？</td>
                  <td>您是否有家族遗传病</td>
                  <td>暂无</td>
                  <td>暂无</td>
                </tr>
                <tr>
                  <td><input type="checkbox" /></td>
                  <td>轻型残疾型</td>
                  <td>您是否拥有残疾证</td>
                  <td>您是否存在行动障碍？</td>
                  <td>暂无</td>
                  <td>暂无</td>
                </tr>
                <tr>
                  <td><input type="checkbox" /></td>
                  <td>严重残疾型</td>
                  <td>您是否拥有基本的自理能力?</td>
                  <td>您或者您的家人是否需要特殊护理人员?</td>
                  <td>暂无</td>
                  <td>暂无</td>
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
