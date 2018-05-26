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
      <li><a href="aboutus.jsp">About us</a>
      </li>
      <li class="active"><a href="contact.jsp">Contact us</a></li>
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
<div class="wrapper col4">
  <div id="container">
    <div id="content">
      <h2>Contact Information</h2>
      <ul type="square">
      <li>Tejinder luna +91 8556097509 </li>
      <li>Sumit Sondhi  +91 9041312294</li>
      <li>Prince Arora  +91 9592340509</li>
      </ul>
      <p> for any queries You can Email us at : academichelpdesk5@gmail.com</p>
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