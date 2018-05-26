function checkValidation()
{
	var branch=document.mngattendanceform.branch.value;
	var sem=document.mngattendanceform.sem.value;
	//alert(branch+" "+sem);
	if(branch=="Select Branch")
	{
		document.getElementById("regarea").innerHTML="Please select Branch";
		document.mngattendanceform.branch.focus();
	}
	else if(sem=="Select Semester")
	{
		document.getElementById("regarea").innerHTML="Please select Semester";
		document.mngattendanceform.sem.focus();
	}
	else
		{
		document.mngattendanceform.submit();
		}
}
/*function getSubject()
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
}*/