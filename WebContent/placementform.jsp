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
      <li><a href="deanhome.jsp">Home</a>
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
      <li><a href="deanhome.jsp">Home</a></li>
      <li>&#187;</li>
    </ul>
  </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col4">
  <div id="container">
    <div id="content">
		<form name="placementform" action="SavePlacementInfoServlet" method="post">
		<fieldset>
		<legend><h1>PLACEMENT INFO....</h1></legend>
		<table>
		<tr><td>Sr.no.</td><td><input type="number" name="srno" value="${srno_att}" required="required" READONLY /></td></tr>
		<tr><td>Company name</td><td><input type="text" name="cname" required="required" /></td></tr>
		<tr><td>Company desc</td><td><textarea name="cdesc" rows="4" cols="30" required="required">upto 250 words</textarea></td></tr>
		<tr><td>Eligibility</td><td><textarea name="eligibility" rows="4" cols="30" required="required">upto 250 words</textarea></td></tr>
		<tr><td>Skills required</td><td><textarea name="skills" rows="3" cols="30"required="required">upto 100 words</textarea></td></tr>
		<tr><td>Location</td><td><input type="text" name="loc" required="required"/></td></tr>
		<tr><td>Posts</td><td><textarea name="post" rows="5" cols="40" required="required">upto 250 words</textarea></td></tr>
		<tr><td>Package</td><td><input type="number" name="pkg" required="required"/>P/A</td></tr>
		<tr><td>No of rounds</td><td><input type="number" name="nor" required="required"/></td></tr>
		<tr><td>Rounds</td><td><textarea name="round" rows="5" cols="40" required="required">upto 250 words</textarea></td></tr>
		<tr><td>Date of Arrivals</td><td><input type="date" name="doa" required="required"/></td></tr>
		<tr><td>Reporting time</td><td><input type="time" name="rtime" required="required"/></td></tr>
		<tr><td>No of Vacancy</td><td><input type="number" name="nov" required="required"/></td></tr>
		<tr><td>Status</td><td><input type="text" name="status" value="UPCOMING"/></td></tr>
		<tr><td><input type="submit" value="Add info"/></td></tr>
		</table>
		</fieldset>
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