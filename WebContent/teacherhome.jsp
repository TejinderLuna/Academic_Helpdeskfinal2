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
      <li class="active"><a href="teacherhome.jsp">Home</a>
      </li>
      <li><a href="index.jsp">Logout</a></li>
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
      <h1 align="right">Welcome ${uname_att}</h1><br/><br/><br/>
      <h3><a href="RegAutoGenServlet?id=regautogen" Style="color:purple">Register Student &raquo;</a></h3><br/>
      <h3><a href="modstu.jsp" Style="color:purple">Modify Student &raquo;</a></h3><br/>
      <h3><a href="ViewStudentServlet" Style="color:purple">View all Students &raquo;</a></h3><br/>
      <h3><a href="managestuattendance.jsp" Style="color:purple">Manage Attendance &raquo;</a></h3><br/> 
      <h3><a href="managesturesult.jsp" Style="color:purple">Publish Result &raquo;</a></h3><br/>
      <h3><a href="StuLeaveAppServlet?tname=${tname_att.tname}" Style="color:purple">view Leave Applications &raquo;</a></h3><br/>
      <h3><a href="messaging.jsp" Style="color:purple">Messaging(E-mail)/Ask queries &raquo;</a></h3><br/>
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