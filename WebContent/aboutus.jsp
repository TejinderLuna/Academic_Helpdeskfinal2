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
<script type="text/javascript" src="scripts/jquery-ui-1.7.2.custom.min.js"></script>
<script type="text/javascript" src="scripts/jquery.tabs.setup.js"></script>
<script type="text/javascript" src="scripts/teacherloginscript.js"></script>
<script type="text/javascript" src="scripts/stuloginscript.js"></script>
</head>
<body>
<div class="wrapper col0">
  <div id="topbar">
    <div id="slidepanel">
      <div class="topbox">
        <h2>User Login corner</h2>
        <p>Here the Users of the Website can succesfully login with their provided username and password and perform their provided task.</p>
		</div>
      <div class="topbox">
        <h2>Users Login Here</h2>
        <form name="teacherloginform" method="post">
          <fieldset>
            <legend>Users Login Form</legend>
            Usertype : <select name="type" >
			<option>Admin</option>
			<option>Dean</option>
			<option>HOD</option>
			<option>Teacher</option>
			</select>
			<label for="teachername">ID :
              <input type="text" name="tid" id="tid" />
            </label> 
			<label for="teachername">Username:
              <input type="text" name="uname" id="teachername" value="" />
            </label>
            <label for="teacherpass">Password:
              <input type="password" name="pass" id="teacherpass" value="" />
            </label><br/>
            <span style="color:red" id="loginarea"></span><br/><br/>
            
            <p>
              <input type="button" value="Login" onclick="checkValidation2()"/>
              &nbsp;
              <input type="reset" name="teacherreset" id="teacherreset" value="Reset" />
            </p>
          </fieldset>
        </form>
      </div>
      <div class="topbox last">
        <h2>Student Login Here</h2>
        <form action="StudentLoginServlet" method="post" name="stuloginform">
          <fieldset>
            <legend>Student Login Form</legend>
            <label for="pupilname">Regno:
              <input type="text" name="regno" id="pupilname" value="" />
            </label>
            <label for="pupilname">Username:
              <input type="text" name="uname" id="pupilname" value="" />
            </label>
            <label for="pupilpass">Password:
              <input type="password" name="pass" id="pupilpass" value="" />
            </label><br/>
            <span style="color:red" id="stuloginarea"></span><br/><br/>
            <p>
              <input type="button" name="pupillogin" id="pupillogin" value="Login" onclick="checkValidation()" />
              &nbsp;
              <input type="reset" name="pupilreset" id="pupilreset" value="Reset" />
            </p>
          </fieldset>
        </form>
      </div>
      <br class="clear" />
    </div>
    <div id="loginpanel">
      <ul>
        <li class="left">Log In Here &raquo;</li>
        <li class="right" id="toggle"><a id="slideit" href="#slidepanel">Administration</a><a id="closeit" style="display: none;" href="#slidepanel">Close Panel</a></li>
      </ul>
    </div>
    <br class="clear" />
  </div>
</div>
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
      <li><a href="index.jsp">Home</a>
      </li>
      <li  class="active"><a href="aboutus.jsp">About us</a>
      </li>
      <li><a href="contact.jsp">Contact us</a></li>
    </ul>
  </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col3">
  <div id="breadcrumb">
    <ul>
      <li class="first">You Are Here</li>
      <li>&#187;</li>
      <li><a href="index.jsp">Home</a></li>
      <li>&#187;</li>
    </ul>
  </div>
</div>
<!-- ####################################################################################################### -->

  <div id="container" align="justify">
		<h2>Academic Helpdesk...</h2>
		<p>The Project titled as ACADEMIC HELPDESK is developed in Advanced Java as Front Tool  and MYSQL 5.5 as Backend Server.
		 The main aim of the project is to create a website for the Welfare purpose in which Student,Teacher,HOD,Dean,Admin are connected.
		 Student can view his result, attendance Internal marks and can apply for leave online.
		 Teacher also on Logging in can publish result of MST,Register new student ,manage attendance etc.
		 HOD by Logging in can register and manage new teacher, approve student leave, view modify result of student etc.
		 another user of the project i.e Dean by logging in can manage placements ,Register and manage HOD.
		 Also Administrator will manage institute Bulletin Board and can view all users of the project .
		 In addition to this a major Facility called Messaging and Query Facility is provided to all the user of the Project but restrictively,
		 so as to ask query, send messages between themselves . </p> 
		 <form>
		 <fieldset>
		 <legend><h2>Developed by MCA 6th SEM Students :</h2></legend>
		 <table cellpadding="4px">
		 <tr><td style="font-weight:bold">Tejinder Luna</td><td style="font-weight:bold">Unv Roll no: 1277855</td><td style="font-weight:bold">College rollno: 2246/12</td></tr>
		 <tr><td style="font-weight:bold">Sumit Sondhi</td><td style="font-weight:bold">Unv Roll no: 1277854</td><td style="font-weight:bold">College rollno: 2245/12</td></tr>
		 <tr><td style="font-weight:bold">Prince Arora</td><td style="font-weight:bold">Unv Roll no: 1277839</td><td style="font-weight:bold">College rollno: 2230/12</td></tr>
		 </table>  
		 </fieldset>
		 </form>
		 
    <div class="clear"></div>
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