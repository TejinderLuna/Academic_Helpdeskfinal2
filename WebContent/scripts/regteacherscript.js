function checkValidation()
{
	//alert("hi");
	//var tid=document.regteacherform.tid.value;
	var tname=document.regteacherform.tname.value;
	var fname=document.regteacherform.fname.value;
	var dob=document.regteacherform.dob.value;
	var tqual=document.regteacherform.tqual.value;
	var kskills=document.regteacherform.kskills.value;
	var desig=document.regteacherform.desig.value;
	var tdept=document.regteacherform.tdept.value;
	var contact=document.regteacherform.contact.value;
	var email=document.regteacherform.email.value;
	var address=document.regteacherform.address.value;
	var uname=document.regteacherform.uname.value;
	var pass=document.regteacherform.pass.value;
	//alert(tname+" "+fname+" "+dob+" "+tqual+" "+kskills+" "+dept+" "+contact+" "+email+" "+address+" "+uname+" "+pass);
	
	var emailcheck=/^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+.[a-zA-Z]{2,4}$/;
	var passcheck=/^[a-zA-Z0-9]{6,12}$/;
	var unamecheck=/^[a-zA-Z0-9_-]+/;
	var contactcheck=/^[0-9]{0,10}$/;
	if(tname=="")
	{
		document.getElementById("regarea").innerHTML="Name required";
		document.regteacherform.tname.focus();
	}
	else if(isNaN(tname)==false)
		{
		document.getElementById("regarea").innerHTML="Name should be alphabetic";
		document.regteacherform.tname.focus();
		}
	else if(fname=="")
	{
		document.getElementById("regarea").innerHTML="Father's name Required";
		document.regteacherform.fname.focus();
	}
	else if(isNaN(fname)==false)
		{
		document.getElementById("regarea").innerHTML="Father's name should be alphabetic";
		document.regteacherform.fname.focus();
		}
	else if(dob=="")
		{
		document.getElementById("regarea").innerHTML="DOB Required";
		document.regteacherform.dob.focus();
		}
	else if(tqual=="")
	{
		document.getElementById("regarea").innerHTML="Enter Qualification";
		document.regteacherform.tqual.focus();
		}
	else if(isNaN(tqual)==false)
	{
	document.getElementById("regarea").innerHTML="Qualification should be alphabetic";
	document.regteacherform.tqual.focus();
	}	
	else if(kskills=="")
	{
		document.getElementById("regarea").innerHTML="Enter Key Skills";
		document.regteacherform.kskills.focus();
	}
	else if(desig=="Select Designation")
	{
		document.getElementById("regarea").innerHTML="Select Designation";
		document.regteacherform.desig.focus();
	}
	else if(isNaN(kskills)==false)
	{
	document.getElementById("regarea").innerHTML="Key Skills should be alphabetic";
	document.regteacherform.kskills.focus();
	}	
	else if(tdept=="Select DEPT")
	{
		document.getElementById("regarea").innerHTML="Select Department";
		document.regteacherform.tdept.focus();
	}
	else if(contact=="")
	{
		document.getElementById("regarea").innerHTML="Enter Contact";
		document.regteacherform.contact.focus();
	}
	else if(contact.search(contactcheck)==-1)
	{
	document.getElementById("regarea").innerHTML="Please enter valid contact number";
	document.regteacherform.contact.focus();
	}
	else if(email=="")
	{
		document.getElementById("regarea").innerHTML="Enter email";
		document.regteacherform.email.focus();
	}
	else if(email.search(emailcheck)==-1)
	{
	document.getElementById("regarea").innerHTML="Please enter valid E-mail ID";
	document.regteacherform.email.focus();
	}
	else if(address=="")
	{
		document.getElementById("regarea").innerHTML="Enter Address";
		document.regteacherform.address.focus();
	}
	else if(uname=="")
	{
		document.getElementById("regarea").innerHTML="Enter uname";
		document.regteacherform.uname.focus();
	}
	else if(uname.search(unamecheck)==-1)
	{
	document.getElementById("regarea").innerHTML="Please enter valid Username";
	document.regteacherform.uname.focus();
	}
	else if(pass=="")
	{
		document.getElementById("regarea").innerHTML="Enter Password";
		document.regteacherform.pass.focus();
	}
	else if(pass.search(passcheck)==-1)
	{
	document.getElementById("regarea").innerHTML="Please enter valid password";
	document.regteacherform.pass.focus();
	}
	else
	{
	document.getElementById("regarea").innerHTML="";
	document.regteacherform.submit();
	}
}