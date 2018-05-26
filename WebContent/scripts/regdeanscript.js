function checkValidation()
{
//alert("hi");
	//var hid=document.deanhodform.hid.value;
	var dname=document.deanhodform.dname.value;
	var fname=document.deanhodform.fname.value;
	//var type=document.deanhodform.type.value;
	var dob=document.deanhodform.dob.value;
	//var gender=document.deanhodform.gender.value;
	var dqual=document.deanhodform.dqual.value;
	var exp=document.deanhodform.exp.value;
	var contact=document.deanhodform.contact.value;
	var email=document.deanhodform.email.value;
	var address=document.deanhodform.address.value;
	var uname=document.deanhodform.uname.value;
	var pass=document.deanhodform.pass.value;
	//alert(dname+" "+fname+" "+dob+" "+dqual+" "+exp+" "+contact+" "+email+" "+address+" "+uname+" "+pass);
	var emailcheck=/^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+.[a-zA-Z]{2,4}$/;
	var passcheck=/^[a-zA-Z0-9]{6,12}$/;
	var unamecheck=/^[a-zA-Z0-9_-]+/;
	var contactcheck=/^[0-9]{0,10}$/;
	if(dname=="")
	{
		document.getElementById("regarea").innerHTML="Name required";
		document.deanhodform.dname.focus();
	}
	else if(isNaN(dname)==false)
		{
		document.getElementById("regarea").innerHTML="Name should be alphabetic";
		document.deanhodform.dname.focus();
		}
	else if(fname=="")
	{
		document.getElementById("regarea").innerHTML="Father's name Required";
		document.deanhodform.fname.focus();
	}
	else if(isNaN(fname)==false)
		{
		document.getElementById("regarea").innerHTML="Father's name should be alphabetic";
		document.deanhodform.fname.focus();
		}
	else if(dob=="")
		{
		document.getElementById("regarea").innerHTML="DOB Required";
		document.deanhodform.dob.focus();
		}
	else if(dqual=="")
	{
		document.getElementById("regarea").innerHTML="Enter Qualification";
		document.deanhodform.dqual.focus();
		}
	else if(isNaN(dqual)==false)
	{
	document.getElementById("regarea").innerHTML="Qualification should be alphabetic";
	document.deanhodform.dqual.focus();
	}	
		
	else if(exp=="")
	{
		document.getElementById("regarea").innerHTML="Enter Experience if any or Enter N/A";
		document.deanhodform.exp.focus();
	}
	else if(contact=="")
	{
		document.getElementById("regarea").innerHTML="Enter Contact";
		document.deanhodform.contact.focus();
	}
	else if(contact.search(contactcheck)==-1)
	{
	document.getElementById("regarea").innerHTML="Please enter valid contact number";
	document.deanhodform.contact.focus();
	}
	else if(email=="")
	{
		document.getElementById("regarea").innerHTML="Enter email";
		document.deanhodform.email.focus();
	}
	else if(email.search(emailcheck)==-1)
	{
	document.getElementById("regarea").innerHTML="Please enter valid E-mail ID";
	document.deanhodform.email.focus();
	}
	else if(address=="")
	{
		document.getElementById("regarea").innerHTML="Enter Address";
		document.deanhodform.address.focus();
	}
	else if(uname=="")
	{
		document.getElementById("regarea").innerHTML="Enter uname";
		document.deanhodform.uname.focus();
	}
	else if(uname.search(unamecheck)==-1)
	{
	document.getElementById("regarea").innerHTML="Please enter valid Username";
	document.deanhodform.uname.focus();
	}
	else if(pass=="")
	{
		document.getElementById("regarea").innerHTML="Enter Password";
		document.deanhodform.pass.focus();
	}
	else if(pass.search(passcheck)==-1)
	{
	document.getElementById("regarea").innerHTML="Please enter valid password";
	document.deanhodform.pass.focus();
	}
	else
	{
	document.getElementById("regarea").innerHTML="";
	document.deanhodform.submit();
	}	
}