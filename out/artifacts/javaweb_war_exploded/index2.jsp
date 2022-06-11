<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Matrix Admin</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/fullcalendar.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/matrix-style2.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/matrix-media.css" />
<link href="${pageContext.request.contextPath}/font-awesome/css/font-awesome.css" rel="stylesheet" />
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>
</head>
<body>

<div id="content">
	
	
	<div class="widget-title">
        <div class="row-fluid">
            <div class="span12">
                <div class="widget-box">
                    <div class="widget-title"> <span class="icon"> <i class="icon-info-sign"></i> </span>
                        <h5>你好，admin</h5>
                    </div>
                </div>
            </div>
        </div>

        <div class="widget-content">
            <div class="error_ex">
                <li class="span5"> <a> <img src="${pageContext.request.contextPath}/img/gallery/imgbox2.jpg" alt="" > </a>
                    <div class="actions"> <a title="" href="#"><i class="icon-pencil"></i></a> <a class="lightbox_trigger" href="${pageContext.request.contextPath}/img/gallery/imgbox2.jpg"><i class="icon-search"></i></a> </div>
                </li>
                <li class="span5"> <a> <img src="${pageContext.request.contextPath}/img/gallery/imgbox3.jpg" alt="" > </a>
                    <div class="actions"> <a title="" href="#"><i class="icon-pencil"></i></a> <a class="lightbox_trigger" href="${pageContext.request.contextPath}/img/gallery/imgbox3.jpg"><i class="icon-search"></i></a> </div>
                </li>
            </div>
        </div>



   <div class="widget-box">
   	         <div class="widget-title"> <span class="icon"> <i class="icon-globe"></i> </span>
            <h5>Quick buttons</h5>
          </div>
            <ul class="quick-actions">
              <li class="bg_lb"> <a href="addquestion.jsp"> <i class="icon-book"></i> 提出问题 </a> </li>
              <li class="bg_lg"> <a href="addanswer.jsp"> <i class="icon-tasks"></i> 问题回答</a> </li>
              <li class="bg_ly"> <a href="adddoctor.jsp"> <i class="icon-calendar"></i>  医生注册 </a> </li>
              <li class="bg_lo"> <a href="addaccommodation.jsp"> <i class="icon-user"></i>  办理入住</a> </li>
              <li class="bg_ls"> <a href="addpatient.jsp"> <i class="icon-upload-alt"></i>  添加用户</a> </li>
              <li class="bg_lb"> <a href="addbed.jsp"> <i class="icon-download"></i> 床位添加 </a> </li>
              <li class="bg_lg"> <a href="addraremanage.jsp"> <i class="icon-bar-chart"></i>添加设备 </a> </li>
              <li class="bg_lo"> <a href="addrareuse.jsp"> <i class="icon-home"></i>设备使用注册 </a> </li>
              <li class="bg_ls"> <a href="getpatientinfo.jsp"> <i class="icon-lock"></i> 查询用户</a> </li>
              <li class="bg_lb"> <a href="success.jsp"> <i class="icon-envelope-alt"></i>成功 </a> </li>
              <li class="bg_lg"> <a href="#"> <i class="icon-dashboard"></i> icon-Dashboard </a> </li>
              <li class="bg_lo"> <a href="#"> <i class="icon-facetime-video"></i>icon-facetime-video </a> </li>
            </ul>
    </div>

        <div class="widget-box">
          <div class="widget-title"> <span class="icon"><i class="icon-ok"></i></span>
            <h5>To Do list</h5>
          </div>
          <div class="widget-content">
            <ul class="unstyled">
              <li> <span class="icon24 icomoon-icon-arrow-up-2 green"></span> 81% Clicks <span class="pull-right strong">567</span>
                <div class="progress progress-striped ">
                  <div style="width: 81%;" class="bar"></div>
                </div>
              </li>
              <li> <span class="icon24 icomoon-icon-arrow-up-2 green"></span> 72% Uniquie Clicks <span class="pull-right strong">507</span>
                <div class="progress progress-success progress-striped ">
                  <div style="width: 72%;" class="bar"></div>
                </div>
              </li>
              <li> <span class="icon24 icomoon-icon-arrow-down-2 red"></span> 53% Impressions <span class="pull-right strong">457</span>
                <div class="progress progress-warning progress-striped ">
                  <div style="width: 53%;" class="bar"></div>
                </div>
              </li>
              <li> <span class="icon24 icomoon-icon-arrow-up-2 green"></span> 3% Online Users <span class="pull-right strong">8</span>
                <div class="progress progress-danger progress-striped ">
                  <div style="width: 3%;" class="bar"></div>
                </div>
              </li>
            </ul>
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
  

