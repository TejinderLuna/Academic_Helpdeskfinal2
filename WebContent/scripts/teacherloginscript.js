	function checkValidation2()
	{
		//alert("hello");
		var type=document.teacherloginform.type.value;
		var tid=document.teacherloginform.tid.value;
		var uname=document.teacherloginform.uname.value;
		var pass=document.teacherloginform.pass.value;
		if(tid=="")
		{
		document.getElementById("loginarea").innerHTML="Enter ID";
		document.teacherloginform.tid.focus();
		}
		else if(isNaN(tid)==true)
		{
		document.getElementById("loginarea").innerHTML="ID should be numeric";
		document.teacherloginform.tid.focus();	
		}
		else if(uname=="")
		{
		document.getElementById("loginarea").innerHTML="Enter Username";
		document.teacherloginform.uname.focus();
		}
	    else if(pass=="")
	    {
		document.getElementById("loginarea").innerHTML="Enter Password";
		document.teacherloginform.pass.focus();
		}
	    else
	    	{
	    	obj=new XMLHttpRequest();
			obj.onreadystatechange=handleGettingSubjectsRequest2;
			obj.open("post","TeacherLoginServlet?type="+type+"&tid="+tid+"&uname="+uname+"&pass="+pass,true);
			obj.send();
	    	}
	}
		function handleGettingSubjectsRequest2()
		{
			//alert("opps");
			if(obj.readyState==4)
				{
					//alert("aa gya");
					if(obj.responseText=="1")
						document.location="teacherhome.jsp";
					else if(obj.responseText=="2")
						document.location="hodhome.jsp";
					else if(obj.responseText=="3")
						document.location="deanhome.jsp";
					else if(obj.responseText=="4")
						document.location="adminhome.jsp";
					else
						{
						if (obj.responseText=="0")	
						document.getElementById("loginarea").innerHTML="Un-Authorised User";
						}
				}
		}