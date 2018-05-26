function checkValidation()
{
//alert("hi");
	//var hid=document.reghodform.hid.value;
	var hname=document.reghodform.hname.value;
	var fname=document.reghodform.fname.value;
	//var type=document.reghodform.type.value;
	var dob=document.reghodform.dob.value;
	//var gender=document.reghodform.gender.value;
	var hqual=document.reghodform.hqual.value;
	var kskills=document.reghodform.kskills.value;
	var hdept=document.reghodform.hdept.value;
	var contact=document.reghodform.contact.value;
	var email=document.reghodform.email.value;
	var address=document.reghodform.address.value;
	var uname=document.reghodform.uname.value;
	var pass=document.reghodform.pass.value;
	//alert(hname+" "+fname+" "+type+" "+dob+" "+gender+" "+hqual+" "+kskills+" "+hdept+" "+contact+" "+email+" "+address+" "+uname+" "+pass);
	var emailcheck=/^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+.[a-zA-Z]{2,4}$/;
	var passcheck=/^[a-zA-Z0-9]{6,12}$/;
	var unamecheck=/^[a-zA-Z0-9_-]+/;
	var contactcheck=/^[0-9]{0,10}$/;
	if(hname=="")
	{
		document.getElementById("regarea").innerHTML="Name required";
		document.reghodform.hname.focus();
	}
	else if(isNaN(hname)==false)
		{
		document.getElementById("regarea").innerHTML="Name should be alphabetic";
		document.reghodform.hname.focus();
		}
	else if(fname=="")
	{
		document.getElementById("regarea").innerHTML="Father's name Required";
		document.reghodform.fname.focus();
	}
	else if(isNaN(fname)==false)
		{
		document.getElementById("regarea").innerHTML="Father's name should be alphabetic";
		document.reghodform.fname.focus();
		}
	else if(dob=="")
		{
		document.getElementById("regarea").innerHTML="DOB Required";
		document.reghodform.dob.focus();
		}
	else if(hqual=="")
	{
		document.getElementById("regarea").innerHTML="Enter Qualification";
		document.reghodform.hqual.focus();
		}
	else if(isNaN(hqual)==false)
	{
	document.getElementById("regarea").innerHTML="Qualification should be alphabetic";
	document.reghodform.hqual.focus();
	}	
	else if(kskills=="")
	{
		document.getElementById("regarea").innerHTML="Enter Key Skills";
		document.reghodform.kskills.focus();
	}
	else if(isNaN(kskills)==false)
	{
	document.getElementById("regarea").innerHTML="Key Skills should be alphabetic";
	document.reghodform.kskills.focus();
	}	
	else if(hdept=="Select DEPT")
	{
		document.getElementById("regarea").innerHTML="Select Department";
		document.reghodform.hdept.focus();
	}
	else if(contact=="")
	{
		document.getElementById("regarea").innerHTML="Enter Contact";
		document.reghodform.contact.focus();
	}
	else if(contact.search(contactcheck)==-1)
	{
	document.getElementById("regarea").innerHTML="Please enter valid contact number";
	document.reghodform.contact.focus();
	}
	else if(email=="")
	{
		document.getElementById("regarea").innerHTML="Enter email";
		document.reghodform.email.focus();
	}
	else if(email.search(emailcheck)==-1)
	{
	document.getElementById("regarea").innerHTML="Please enter valid E-mail ID";
	document.reghodform.email.focus();
	}
	else if(address=="")
	{
		document.getElementById("regarea").innerHTML="Enter Address";
		document.reghodform.address.focus();
	}
	else if(uname=="")
	{
		document.getElementById("regarea").innerHTML="Enter uname";
		document.reghodform.uname.focus();
	}
	else if(uname.search(unamecheck)==-1)
	{
	document.getElementById("regarea").innerHTML="Please enter valid Username";
	document.reghodform.uname.focus();
	}
	else if(pass=="")
	{
		document.getElementById("regarea").innerHTML="Enter Password";
		document.reghodform.pass.focus();
	}
	else if(pass.search(passcheck)==-1)
	{
	document.getElementById("regarea").innerHTML="Please enter valid password";
	document.reghodform.pass.focus();
	}
	else
	{
	document.getElementById("regarea").innerHTML="";
	document.reghodform.submit();
	}	
}