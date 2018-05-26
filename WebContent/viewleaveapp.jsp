<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head profile="http://gmpg.org/xfn/11">
<title>Academic Helpdesk</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<meta http-equiv="imagetoolbar" content="no" />
<link rel="stylesheet" href="styles/layout.css" type="text/css" />
<script type="text/javascript" src="scripts/jquery-1.4.1.min.js"></script>
<script type="text/javascript" src="scripts/jquery.slidepanel.setup.js"></script>
</head>
<body>

<!-- ####################################################################################################### -->
<div class="wrapper col1">
  <div id="header">
    <div id="logo">
      <h1><a href="#">Academic Helpdesk...</a></h1>
      <p>a Complete Solution for Academics</p>
    </div>
    <div class="fl_right">
      <p>Tel: 0181-2200232|Mail: daviet@davietjal.org</p>
    </div>
    <br class="clear" />
  </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col2">
  <div id="topnav">
    <ul>
      <li><a href="teacherhome.jsp">Home</a>
      </li>
    </ul>
  </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col3">
  <div id="breadcrumb">
    <ul>
      <li class="first">You Are Here</li>
      <li>&#187;</li>
      <li><a href="teacherhome.jsp">Home</a></li>
      <li>&#187;</li>
    </ul>
  </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col4">
  <div id="container">
    <div id="content">
       <form action="UpdateLeaveStatusServlet" method="post">
       <table border="1" cellpadding="10px">
       <caption><h1>STUDENT LEAVE APPLICATIONS</h1></caption>
       <tr><th>REGNO</th><th>LEAVE_ID</th><th>DEPT</th><th>SEM</th><th>HOSTEL</th><th>SUBJECT</th>
       <th>From</th><th>TO</th><th>Cur_date</th><th>STATUS</th></tr>
       <c:forEach var="j" items="${leaves_att}">
       <tr><td>${j.regno}</td><td><input type="text" name="lid"value="${j.lid}" READONLY/></td><td>${j.tdept}</td><td>${j.sem}</td><td>${j.hostel}</td><td>${j.subject}</td><td>${j.from}</td><td>${j.to}</td><td>${j.cd}</td>
       						<td><select name="status">
       						<option>${j.status}<option>
       						<option style="color:green">approved<option>
       						<option style="color:red">reject<option>
       						</select></td></tr>
       </c:forEach>
       <tr><td><input type="submit" value="send"/></td></tr>
       </table>
       </form>
    </div>    
    <div class="clear"></div>
  </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col5">
  <div id="footer">
   </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col6">
  <div id="copyright">
    <p class="fl_left">Copyright &copy; Encapsulate Logics 2015 - All Rights Reserved - <a href="#">academichelpdesk.com</a></p>
    <p class="fl_right">Developing team - <a href="#">Tejinder,Sumit,Prince</a></p>
    <br class="clear" />
  </div>
</div>
</body>
</html>