
function checkValidation()
{
	//alert("hi");
	var name=document.sturegform.name.value;
	var fname=document.sturegform.fname.value;
	var mname=document.sturegform.mname.value;
	var dob=document.sturegform.dob.value;
	var state=document.sturegform.state.value;
	var city=document.sturegform.city.value;
	var address=document.sturegform.address.value;
	var contact=document.sturegform.contact.value;
	var email=document.sturegform.email.value;
	var branch=document.sturegform.branch.value;
	var sem=document.sturegform.sem.value;
	var uname=document.sturegform.uname.value;
	var pass=document.sturegform.pass.value;
	//alert(name+" "+fname+" "+mname+" "+address+" "+contact+" "+uname+" "+pass);
	var emailcheck=/^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+.[a-zA-Z]{2,4}$/;
	var passcheck=/^[a-zA-Z0-9]{6,12}$/;
	var unamecheck=/^[a-zA-Z0-9_-]+/;
	if(name=="")
	{
		document.getElementById("regarea").innerHTML="name Required";
		document.sturegform.name.focus();
	}
	else if(isNaN(name)==false)
		{
		document.getElementById("regarea").innerHTML="name should be alphabetic";
		document.sturegform.name.focus();
		}
	else if(fname=="")
	{
		document.getElementById("regarea").innerHTML="father name Required";
		document.sturegform.fname.focus();
	}
	else if(isNaN(fname)==false)
		{
		document.getElementById("regarea").innerHTML="father name should be alphabetic";
		document.sturegform.fname.focus();
		}
	else if(mname=="")
	{
		document.getElementById("regarea").innerHTML="mothers name Required";
		document.sturegform.mname.focus();
	}
	else if(isNaN(mname)==false)
		{
		document.getElementById("regarea").innerHTML="mothers name should be alphabetic";
		document.sturegform.mname.focus();
		}
	else if(dob=="")
	{
		document.getElementById("regarea").innerHTML="DOB Required";
		document.sturegform.dob.focus();
	}
	else if(state=="Select State")
	{
		document.getElementById("regarea").innerHTML="Please select State";
		document.sturegform.state.focus();
	}
	else if(city=="")
	{
		document.getElementById("regarea").innerHTML="please Enter City";
		document.sturegform.city.focus();
	}
	else if(isNaN(city)==false)
		{
		document.getElementById("regarea").innerHTML="city name should be alphabetic";
		document.sturegform.city.focus();
		}
	else if(address=="")
	{
		document.getElementById("regarea").innerHTML="address Required";
		document.sturegform.address.focus();
	}
	else if(contact=="")
	{
		document.getElementById("regarea").innerHTML="contact Required";
		document.sturegform.contact.focus();
	}
	else if(isNaN(contact)==true)
		{
		document.getElementById("regarea").innerHTML="contact should be numeric";
		document.sturegform.contact.focus();
		}
	else if(email=="")
	{
		document.getElementById("regarea").innerHTML="please enter email";
		document.sturegform.email.focus();
	}
	else if(email.search(emailcheck)==-1)
		{
		document.getElementById("regarea").innerHTML="please enter valid email";
		document.sturegform.email.focus();
		}
	else if(branch=="Select Branch")
	{
		document.getElementById("regarea").innerHTML="Please select Branch";
		document.sturegform.branch.focus();
	}
	else if(sem=="Select Semester")
	{
		document.getElementById("regarea").innerHTML="Please select Semester";
		document.sturegform.sem.focus();
	}
	else if(uname=="")
	{
		document.getElementById("regarea").innerHTML="please enter username";
		document.sturegform.uname.focus();
	}
	else if(uname.search(unamecheck)==-1)
		{
		document.getElementById("regarea").innerHTML="please enter valid Username";
		document.sturegform.uname.focus();
		//document.sturegform.uname.value="";
		}
	else if(pass=="")
	{
		document.getElementById("regarea").innerHTML="please enter password";
		document.sturegform.pass.focus();
	}
	else if(pass.search(passcheck)==-1)
		{
		document.getElementById("regarea").innerHTML="please enter valid Password";
		document.sturegform.pass.focus();
		}
	else
		{
		document.getElementById("regarea").innerHTML="";
		document.sturegform.submit();
		}
}