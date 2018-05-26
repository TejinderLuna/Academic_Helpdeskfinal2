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
<script type="text/javascript" src="scripts/regdeanscript.js"></script>
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
      <li><a href="adminhome.jsp">Home</a>
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
      <li><a href="adminhome.jsp">Home</a></li>
      <li>&#187;</li>
    </ul>
  </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col4">
  <div id="container">
    <div id="content">
      <form name="deanhodform" action="DeanRegServlet" method="post">
      <fieldset>
      <legend><h1>DEAN Registration form</h1></legend>
      <table>
 			<tr><td>Dean ID</td><td><input type="text" name="did" value="${did_att}" readonly="readonly"/></td></tr>
 			<tr><td>Name</td><td><input type="text" name="dname" /></td></tr>
 			<tr><td>Father Name</td><td><input type="text" name="fname" /></td></tr>
 			<tr><td>Type</td><td><input type="text" name="type" value="Dean" READONLY/></td></tr>
 			<tr><td>DOB</td><td><input type="date" name="dob" /></td></tr>
 			<tr><td>Gender</td><td><input type="radio" name="gender" value="male" checked="checked"/>Male<input type="radio" name="gender" value="female"/>Female</td></tr>
 			<tr><td>Qualification</td><td><input type="text" name="dqual" /></td></tr>
 			<tr><td>Experience</td><td><textarea rows="5" cols="30" name="exp"></textarea></td></tr>
             <tr><td>Contact</td><td><input type="text" name="contact"/></td></tr>
      		 <tr><td>E-mail</td><td><input type="text" name="email"/></td></tr>
     		 <tr><td>Address</td><td><textarea rows="5" cols="30" name="address"></textarea></td></tr>
     		 <tr><td>Username</td><td><input type="text" name="uname"/></td></tr>
    	     <tr><td>Password</td><td><input type="password" name="pass"/></td></tr>
      		 <tr><td><input type="button" value="Register" onclick="checkValidation()"/></td>
      		 <td><span id="regarea" style="color:purple;font-weight:bold"></span></td>
      		 </tr>           
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