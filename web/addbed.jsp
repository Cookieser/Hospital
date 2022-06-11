<%@ page import="java.sql.Connection" %>
<%@ page import="com.software.utils.DBUtils" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="com.software.entity.Patient" %>
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
      <h1>床位增添</h1>
  </div>


 <div class="container-fluid">
  <div class="row-fluid">
    <div class="span7">
        <div class="widget-content nopadding">
      <div class="widget-box">
        <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
          <h5>请核实信息后变更床位</h5>
           <br />
            <br />
            <br />
            <form method="get" class="form-horizontal" action="${pageContext.request.contextPath}/addBed" >

                <div class="control-group">
              <label  class="control-label">公寓楼号：</label>
                <div class="controls">
                <select name="apartment">
                  <option value="1">#1</option>
                  <option value="2">#2</option>
                  <option value="3">#3</option>
                  <option value="4">#4</option>
                  <option value="5">#5</option>
                  <option value="6">#6</option>
                </select>
              </div>
              </div>

                <div class="control-group">
              <label  class="control-label">楼宇区号：</label>
              <div class="controls">
                <select name="district">
                  <option value="1">A区</option>
                  <option value="2">B区</option>
                  <option value="3">C区</option>
                  <option value="4">D区</option>
                </select>
              </div>

                    <div class="control-group">
                      <label  class="control-label">患者ID :</label>
                      <div class="controls">
                          <select name="PatientID">

                        <%
                          try {

                              Connection connection = null;
                              connection = DBUtils.getConnection();
                              Statement stmt = null;
                              ResultSet rs = null;
                              String sql = "select User_ID,patient_name from patient where DelMark=1"; //查询语句
                              stmt = connection.createStatement();
                              rs = stmt.executeQuery(sql);

                              while (rs.next()) {
                                  int id= rs.getInt("User_ID");
                                  String name = rs.getString("patient_name");



                      %>
                          <option value="<%=id%>"><%=id%>-<%=name%></option>
                      <%
                              }
                          } catch (Exception e) {
                              e.printStackTrace();
                              System.out.println("数据库连接失败");
                          }
                      %>
                      </select>
                        </div>

                          <div class="control-group">
                              <label  class="control-label">房间ID ：</label>
                              <div class="controls">
                                  <select name="roomID">
                                      <%
                                          try {

                                              Connection connection = null;
                                              connection = DBUtils.getConnection();
                                              Statement stmt = null;
                                              ResultSet rs = null;
                                              String sql = "SELECT ID,Room_ID FROM `room` WHERE DelMark=1"; //查询语句
                                              stmt = connection.createStatement();
                                              rs = stmt.executeQuery(sql);

                                              while (rs.next()) {
                                                  int id= rs.getInt("ID");
                                                  int roomID=rs.getInt("Room_ID");



                                      %>
                                      <option value="<%=id%>"><%=roomID%></option>
                                      <%
                                              }
                                          } catch (Exception e) {
                                              e.printStackTrace();
                                              System.out.println("数据库连接失败");
                                          }
                                      %>
                                  </select>
                              </div>




              <div class="control-group">
              <label  class="control-label">房间床位号：</label>
              <div class="controls">
                <select name="bedID">
                  <option>1</option>
                  <option>2</option>
                  <option>3</option>
                  <option>4</option>
                  <option>5</option>
                  <option>6</option>
                  <option>7</option>
                  <option>8</option>
                  <option>9</option>
                </select>
              </div>


              <div class="control-group">
              <label  class="control-label">房间使用情况：</label>
             <div class="controls">
                <select name="whetherInuse">
                  <option value="1">使用中</option>
                  <option value="0">未使用</option>
                </select>
              </div>


                  <div class="control-group">
              <label  class="control-label">最近房间打扫时间 :</label>
              <div class="controls">
                <div  data-date="12-02-2012" class="input-append date datepicker">
                  <input type="text" value="12-02-2012"  data-date-format="mm-dd-yyyy" class="span11" name="Room_clean">
                  <span class="add-on"><i class="icon-th"></i></span>
                </div>



                  <div class="control-group">
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
                </div>
            </div>
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
