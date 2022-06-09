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
  <div id="content-header" class="widget-title">
      <h1>床位查询信息表</h1>
  </div>
        <div class="widget-box">
          <div class="widget-title"> <span class="icon"><i class="icon-th"></i></span>
            <h5>数据表</h5>
          </div>
          <div class="widget-content nopadding">
            <table class="table table-bordered data-table">
              <thead>
                <tr>
                  <th>床位编号</th>
                  <th>状态(0:未使用;1:使用中)</th>
                  <th>房间编号</th>
                  <th>上次清洁时间</th>
                  <th>备注</th>
                </tr>
              </thead>
              <tbody>
                <tr class="gradeX">
                  <td>3</td>
                  <td>1</td>
                  <td>6</td>
                  <td>2022-5-6</td>
                  <td class="center">无</td>
                </tr>
                <tr class="gradeC">
                  <td>3</td>
                  <td>1</td>
                  <td>6</td>
                  <td>2022-5-6</td>
                  <td class="center">无</td>
                </tr>
                <tr class="gradeA">
                  <td>3</td>
                  <td>1</td>
                  <td>6</td>
                  <td>2022-5-6</td>
                  <td class="center">无</td>
                </tr>
                <tr class="gradeA">
                  <td>3</td>
                  <td>1</td>
                  <td>6</td>
                  <td>2022-5-6</td>
                  <td class="center">无</td>
                </tr>
                <tr class="gradeA">
                  <td>3</td>
                  <td>0</td>
                  <td>6</td>
                  <td>2022-5-6</td>
                  <td class="center">无</td>
                </tr>
                <tr class="gradeA">
                  <td>3</td>
                  <td>1</td>
                  <td>6</td>
                  <td>2022-5-6</td>
                  <td class="center">无</td>
                </tr>
                <tr class="gradeA">
                  <td>3</td>
                  <td>0</td>
                  <td>6</td>
                  <td>2022-5-6</td>
                  <td class="center">无</td>
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
