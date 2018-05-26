<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head profile="http://gmpg.org/xfn/11">
<title>Academic Helpdesk</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<meta http-equiv="imagetoolbar" content="no" />
<link rel="stylesheet" href="styles/layout.css" type="text/css" />
<script type="text/javascript" src="scripts/jquery-1.4.1.min.js"></script>
<script type="text/javascript" src="scripts/script4.js"></script>
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
       <form action="AttendanceServlet?id=saveattendance" name="stuattendanceform" method="post">
<table border="1" cellpadding="10">
<tr><td>Total Lectures</td>
<td><input type="number" name="total" id="t" /></td>
<td>Select Subject</td>
<td><select name="subject" id="subjectcombo">
	<c:forEach var="k" items="${sublist_att}">
		<option>${k}</option>
	</c:forEach>
</select></td>	
</tr>
<tr><th>REGNO</th><th>NAME</th><th>BRANCH</th><th>SEMESTER</th><th>Lec.Attended</th><th>Errors if any</th></tr>
<c:forEach var="j" items="${attendance_att}">
		<tr>
		<td style="font-weight:bold">
		<input type="text" name="regno"value="${j.regno}" READONLY/></td>
		<td><input type="text" name="name" value="${j.name}"READONLY/></td>
		<td><input type="text" name="branch"value="${j.branch}"READONLY/></td>
		<td><input type="text" name="sem"value="${j.sem}"READONLY/></td>
		<td><input type="number" name="present" min="1" max="100" id="p" required="required"/></td>
		<td><span id="attarea" style="color:purple;font-weight:bold"></span></td>
		</tr>
		</c:forEach>
           </table>
          <input type="submit" value="Submit Attendance"/>
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
   	<p class="fl_right">Developing team - <a href="#" title="Free Website Templates">Tejinder,Sumit,Prince</a></p>
    <br class="clear" />
  </div>
</div>
</body>
</html>