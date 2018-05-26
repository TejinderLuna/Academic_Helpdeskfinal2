function checkValidation()
{
var branch=document.sturesultform.branch.value;
var sem=document.sturesultform.sem.value;
//alert("hello");
if(branch=="Select Branch")
{
	document.getElementById("resultarea").innerHTML="Please select branch";
	document.sturesultform.branch.focus();
}
else if(sem=="Select Semester")
{
	document.getElementById("resultarea").innerHTML="please select Semester";
	document.sturesultform.sem.focus();
}

}
function checkMMValidation()
	{
		var mm=document.sturesultform.mm.value;
		
		//alert(mm);
		if(mm=="")
		{
			document.getElementById("resultarea").innerHTML="Please enter max marks";
			document.sturesultform.mm.focus();
		}
		else if(isNaN(mm)==true)
		{
			document.getElementById("resultarea").innerHTML="Enter numeric value";
			document.sturesultform.mm.focus();
		}
	}
function checkPMValidation()
{
	var pm=document.sturesultform.pm.value;
	//alert(pm);
	if(pm=="")
	{
		document.getElementById("resultarea").innerHTML="Please enter Passing marks";
		document.sturesultform.pm.focus();
	}
	else if(isNaN(pm)==true)
	{
		document.getElementById("resultarea").innerHTML="Enter numeric value";
		document.sturesultform.pm.focus();
	}
}
function getStudent()
{
		//alert("hi");
		var branch=document.sturesultform.branch.value;
		var sem=document.sturesultform.sem.value;
		
		obj=new XMLHttpRequest();
		
		obj.onreadystatechange=handleGettingSubjectsRequest1;
		obj.open("post","GetStudentServlet?id=getstudent&branch="+branch+"&sem="+sem,true);
		obj.send();
}
	function handleGettingSubjectsRequest1()
	{
		if(obj.readyState==4)
			{
				document.getElementById("getallstudents").innerHTML=obj.responseText;
			}
	}
function getSubject()
{
//alert("hello");
	var branch=document.sturesultform.branch.value;
	var sem=document.sturesultform.sem.value;
	if(branch=="Select Branch")
		alert("Please Select the Branch");
	else
	{
		obj=new XMLHttpRequest();
		obj.onreadystatechange=handleGettingSubjectsRequest2;
		obj.open("post","SubjectServlet?id=getsubjects&branch="+branch+"&sem="+sem,true);
		obj.send();
	}
}
function handleGettingSubjectsRequest2()
{
	if(obj.readyState==4)
		{
			document.getElementById("subjectcombo").innerHTML=obj.responseText;
		}
}
