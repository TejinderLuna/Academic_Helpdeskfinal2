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
      <h1><a href="#">Academic Helpdesk....</a></h1>
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
      <li class="active"><a href="index.jsp">Home</a>
      </li>
      <li><a href="aboutus.jsp">About us</a>  
      </li>
      <li><a href="contact.jsp">Contact us</a></li>
    </ul>
  </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col3">
  <div id="featured_slide">
    <div id="featured_wrap">
      <ul id="featured_tabs">
        <li><a href="#fc1">Sports Grounds<br />
          <span></span></a></li>
        <li><a href="#fc2">Undergradute Block<br />
          <span></span></a></li>
        <li><a href="#fc3">Postgraduate Block<br />
          <span></span></a></li>
        <li class="last"><a href="#fc4">Core Block<br />
          <span></span></a></li>
      </ul>
      <div id="featured_content">
        <div class="featured_box" id="fc1"><a href="infrastructure.jsp"><img src="images/demo/10.gif" alt="" /></a>
          <div class="floater"></div>
        </div>
        <div class="featured_box" id="fc2"><a href="infrastructure.jsp"><img src="images/demo/20.gif" alt="" /></a>
          <div class="floater"></div>
        </div>
        <div class="featured_box" id="fc3"><a href="infrastructure.jsp"><img src="images/demo/30.gif" alt="" /></a>
          <div class="floater"></div>
        </div>
        <div class="featured_box" id="fc4"><a href="infrastructure.jsp"><img src="images/demo/40.gif" alt="" /></a>
          <div class="floater"></div>
        </div>
      </div>
    </div>
  </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col4">
  <div id="container">
    <div id="hpage">
      <ul>
        <li>
          <h2>Placement Corner</h2>
          <div class="imgholder">
          <marquee direction="up" scrollamount="3" onMouseOver="stop()" onMouseOut="start()">
          <a href="ViewPlacementInfoServlet"><u>Click to View Upcoming Companies in campus,eligibility details,sal pkg
           and other recruitment process information</u></a><br><br><br><br>
          <a href="#"></a><u>click to Apply for recruitment process for the upcoming companies</u><br><br>
          </marquee>
          </div>
          <p></p>
          
        </li>
        <li style="width:460px">
          <h2>History Of DAVIET...</h2>
          <p align="justify">DAV Institute of Engineering and Technology (DAVIET) is an engineering institute in Jalandhar City, established by the Dayanand Anglo-Vedic College Trust and Management Society.
			The DAV College Trust and Management Society is the largest non-government educational organization in India, managing a chain of about 700 institutions in India and abroad. The institute is located in the heart of city adjacent to DAV College, Jalandhar, on the left side of the Jalandhar-Amritsar National Highway.
			The institute received ISO 9001:2000 certification in 2005 under joint accreditation of SGS Group and UKAS (United Kingdom Accreditation Services) Quality Management.
			The institute offers a B.Tech. program in six fields of engineering as well as M.Tech, MCA and MBA programs
          </p>
          <p class="readmore"><a href="davhistory.jsp">Continue Reading &raquo;</a></p>
          
        </li>
        <li class="last">
          <h2>Bulletin Board</h2>
          <div class="imgholder">
          <marquee direction="up" scrollamount="2" onMouseOver="stop()" onMouseOut="start()">
          <a href="viewbulletinboard.jsp"><u>Click here to view latest Institute NEWS and Events that are about to be held in the Institute</u></a><br></br>
          <p>Session 2015-16 going to start on 22 July 2015</p><br></br>
          </marquee>
          </div>
        </li>
      </ul>
      <br class="clear" />
    </div>
  </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col5">
  <div id="footer">
    
    <br class="clear" />
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