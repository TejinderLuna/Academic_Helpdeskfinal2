function checkValidation()
{
	var regno=document.stuloginform.regno.value;
	var uname=document.stuloginform.uname.value;
	var pass=document.stuloginform.pass.value;
	
	if(regno=="")
		{
		document.getElementById("stuloginarea").innerHTML="Enter Regno";
		document.stuloginform.regno.focus();
		}
	else if(isNaN(regno)==true)
	{
		document.getElementById("stuloginarea").innerHTML="Regno should be numeric";
		document.stuloginform.regno.focus();
		
	}
	else if(uname=="")
	{
	document.getElementById("stuloginarea").innerHTML="Enter Username";
	document.stuloginform.uname.focus();
	}
    else if(pass=="")
    {
	document.getElementById("stuloginarea").innerHTML="Enter Password";
	document.stuloginform.pass.focus();
	}
    else
    	{
    	obj=new XMLHttpRequest();
		obj.onreadystatechange=handleGettingSubjectsRequest;
		obj.open("post","StudentLoginServlet?id=getstudent&regno="+regno+"&uname="+uname+"&pass="+pass,true);
		obj.send();
    	}
}
	function handleGettingSubjectsRequest()
	{
		if(obj.readyState==4)
			{
				//alert("aa gya");
				if(obj.responseText=="1")
					document.location="studenthome.jsp";
				else if(obj.responseText=="0")	
					document.getElementById("stuloginarea").innerHTML="Un-Authorised User";
			}
	}
		