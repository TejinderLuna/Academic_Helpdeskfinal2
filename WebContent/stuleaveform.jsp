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
<script type="text/javascript" src="scripts/jquery.slidepanel.setup.js"></script>
<script type="text/javascript" src="scripts/stuleavescript.js"></script>
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
      <li><a href="studenthome.jsp">Home</a>
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
      <li><a href="studenthome.jsp">Home</a></li>
      <li>&#187;</li>
    </ul>
  </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col4">
  <div id="container">
    <div id="content">
      <h1><p style="font-weight:bold" align="right" >Welcome ${uname_att}</p></h1><br/><br/><br/>
      <fieldset>
      <legend><h1>STUDENT LEAVE FORM</h1></legend>
      <form name="studentleaveform" action="SaveApplyLeaveServlet" method="post">
      <table>
      <tr><td>Regno</td><td><input type="text" name="regno" value="${regno_att}" READONLY/></td></tr>
      <tr><td>Leave id</td><td><input type="text" name="lid" value="${lid_att}"READONLY/></td></tr>
      <tr><td>Department :</td><td>
      <select name="tdept" onchange="getdeptteacher()">
      <option>B.tech</option>
      <option>M.tech</option>
      <option>MBA</option>
      <option>MCA</option>
      </select></td></tr>
      <tr><td>To Teacher</td>
      <td><select name="tname" id="tnameid">
      <option></option>
      </select></td></tr>
      <tr><td>Semester</td>
      <td><select name="sem">
      <option>Select Semester</option>
      <option>1st</option>
      <option>2nd</option>
      <option>3rd</option>
      <option>4rth</option>
      <option>5th</option>
      <option>6th</option>
      <option>7th(B.tech)</option>
      <option>8th(B.tech)</option></select></td></tr>
      <tr><td>Hostel Occupied</td><td><select name="hostel">
    									<option>Yes</option>
    									<option>No</option>  	
	      								</select></td></tr>
      <tr><td>Subject</td><td><textarea name="subject" rows="5" cols="30" required="required"></textarea></td></tr>
      <tr><td>From : <input type="date" name="from" min="${date_att}" required="required"/></td><td>To : <input type="date" name="to" min="${date_att}" required="required"/></td></tr>
      <tr><td><input type="button" value="Apply Leave" onclick="checkValidation()"/></td>
      <td><span id="leavearea" style="color:purple;font-weight:bold"></span></td></tr>
      </table>
      </form>
      </fieldset>
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