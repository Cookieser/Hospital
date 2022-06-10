<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="com.software.utils.DBUtils" %>
<%@ page import="java.sql.Connection" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Matrix Admin</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/matrix-style2.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/matrix-media.css" />
<link href="${pageContext.request.contextPath}/font-awesome/css/font-awesome.css" rel="stylesheet" />
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>
</head>
<body>

<div id="content">
  <div id="content-header">
      <h1>天伦颐养中心</h1>
  </div>
  <div class="container-fluid">
    <div class="row-fluid">
      <div class="span12">
        <div class="widget-box">
          <div class="widget-title"> <span class="icon"> <i class="icon-briefcase"></i> </span>
            <h5 >您好！</h5>
          </div>
          <div class="widget-content">
            <div class="row-fluid">
              <div class="span6">
                <table class="">
                  <tbody>
                    <tr>
                      <td><h4>员工管理系统</h4></td>
                    </tr>
                    <tr>
                      <td>在这里，方便您定位：</td>
                    </tr>
                    <tr>
                      <td>员工职务信息</td>
                    </tr>
                    <tr>
                      <td>员工工龄</td>
                    </tr>
                    <tr>
                      <td >员工科室</td>
                    </tr>
                  </tbody>
                </table>
              </div>
              <div class="span6">
                <table class="table table-bordered table-invoice">
                  <tbody>
                    <tr>
                    <tr>
                      <td class="width30">当前操作员工ID:</td>
                      <td class="width70"><strong>123456</strong></td>
                    </tr>
                    <tr>
                      <td>当前操作员工账号：</td>
                      <td>
                        <strong>
                          <script type="text/javascript">
                          let data = localStorage.getItem("username")
                          document.write(data)
                          </script>


                      </strong>
                      </td>
                    </tr>
                    <tr>
                      <td>操作日期</td>
                      <td><strong>
                        <script type="text/javascript">
                          var today = new Date();
                          var year = today.getFullYear();
                          //因为月份从0开始，所以当前月份需要加1才能正确显示；
                          var month = today.getMonth()+1;
                          var day = today.getDate();
                          var week = today.getDay();
                          var w=new Array(7);   //通过自定义数组将“0”转换为“星期日”；
                          w[0]="星期日"
                          w[1]="星期一"
                          w[2]="星期二"
                          w[3]="星期三"
                          w[4]="星期四"
                          w[5]="星期五"
                          w[6]="星期六"
                          document.write(year+"年"+month+"月"+day+"日"+w[week]);

                        </script>
                      </strong></td>
                    </tr>
             
                    </tbody>
                  
                </table>
              </div>
            </div>
            <div class="row-fluid">
              <div class="span12">
                <table class="table table-bordered table-invoice-full">
                  <thead>
                    <tr>
                      <th class="head0">员工序号</th>
                      <th class="head1">员工ID</th>
                      <th class="head0 right">员工姓名</th>
                      <th class="head1 right">员工年龄</th>
                      <th class="head0 right">员工工龄</th>
                      <th class="head0 right">员工账户</th>
                      <th class="head0 right">员工性别</th>
                      <th class="head0 right">员工生日</th>
                      <th class="head0 right">员工职务</th>
                      <th class="head0 right">员工科室</th>
                      <th class="head0 right">员工备注</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr>
                      <td>1</td>
                      <td><strong>123</strong></td>
                      <td class="right">二哈</td>
                      <td class="right">23</td>
                      <td class="right">3</td>
                      <td class="right"><strong>erha</strong></td>
                      <td class="right">男</td>
                      <td class="right">2026/3/5</td>
                      <td class="right"><strong>护士</strong></td>
                      <td class="right"><strong>内科</strong></td>
                     <td class="right"><a href="修改界面">修改 </a>| 删除</td>
                    </tr>
                    <tr>
                      <td>2</td>
                      <td><strong>345</strong></td>
                      <td class="right">哈哈</td>
                      <td class="right">79</td>
                      <td class="right">4</td>
                      <td class="right"><strong>haha</strong></td>
                      <td class="right">男</td>
                      <td class="right">2016/3/5</td>
                      <td class="right"><strong>医生</strong></td>
                      <td class="right"><strong>外科</strong></td>
                      <td class="right"><a href="修改界面">修改 </a>| 删除</td>
                    </tr>
                    <tr>
                      <td>3</td>
                      <td><strong>575</strong></td>
                      <td class="right">电感</td>
                      <td class="right">89</td>
                      <td class="right">50</td>
                      <td class="right"><strong>diangan</strong></td>
                      <td class="right">男</td>
                      <td class="right">1940/3/5</td>
                      <td class="right"><strong>医生</strong></td>
                      <td class="right"><strong>外科</strong></td>
                      <td class="right"><a href="修改界面">修改 </a>| 删除</td>
                    </tr>
                    <tr>
                      <td>4</td>
                      <td><strong>795</strong></td>
                      <td class="right">憨批</td>
                      <td class="right">37</td>
                      <td class="right">13</td>
                      <td class="right"><strong>hanpi</strong></td>
                      <td class="right">女</td>
                      <td class="right">2016/3/5</td>
                      <td class="right"><strong>护士</strong></td>
                      <td class="right"><strong>内科</strong></td>
                      <td class="right"><a href="修改界面">修改 </a>| 删除</td>
                    </tr>
                    <tr>
                      <td>5</td>
                      <td><strong>287</strong></td>
                      <td class="right">大胖</td>
                      <td class="right">25</td>
                      <td class="right">4</td>
                      <td class="right"><strong>大胖</strong></td>
                      <td class="right">男</td>
                      <td class="right">2000/3/5</td>
                      <td class="right"><strong>护士</strong></td>
                      <td class="right"><strong>外科</strong></td>
                      <td class="right"><a href="修改界面">修改 </a>| 删除</td>
                    </tr>
                  
                </table>
                <div class="pull-right">
     
                  <a class="btn btn-primary btn-large pull-right" href="#">退出</a> </div>
              
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
 
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.ui.custom.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/matrix.js"></script>

</body>
</html>
