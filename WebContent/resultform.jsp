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
<script type="text/javascript" src="scripts/resultformscript.js"></script>
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
      <form name="resultform" action="ViewResultServlet" method="post">
      <table>
      <tr><td>Registration no.</td><td><input type="text" name="regno" value="${regno_att}" READONLY/></td></tr>
      <tr><td>Username</td><td><input type="text" name="uname" value="${uname_att}" READONLY/></td></tr>
	  <tr><td>Branch</td>
	  <td><select name="branch">
	  <option>Select Branch</option>
      <option>Btech ECE</option>      <option>Btech ME</option>
      <option>Btech CSE</option>      <option>Btech EE</option>
      <option>Btech IT</option>      <option>Btech CE</option>
      <option>MCA</option>		      <option>MBA</option>
      <option>Mtech CSE</option>      <option>Mtech EE</option>
      <option>Mtech CE</option>      <option>Mtech ECE</option>
      </select></td></tr>
      <tr><td>Semester</td><td>
      <select name="sem" >
      <option>Select Semester</option>
      <option>1st</option>      <option>2nd</option>
      <option>3rd</option>      <option>4th</option>
      <option>5th</option>      <option>6th</option>
      <option>7th(B.tech)</option>     <option>8th(B.tech)</option></select></td></tr>
	  <tr><td>MST</td><td><select name="mst">
      <option>1st</option><option>2nd</option><option>3rd</option></select>
      <tr><td><input type="button" value="View Result" onclick="checkValidation()"></td>
      <td><span id="viewresultarea" style="color:purple;font-weight:bold"></span></td>
      </tr>
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
    <p class="fl_right">Developing team - <a href="http://www.os-templates.com/" title="Free Website Templates">Tejinder,Sumit,Prince</a></p>
    <br class="clear" />
  </div>
</div>
</body>
</html>