function getdeptteacher()
{
//alert("hi");
	var tdept=document.studentleaveform.tdept.value;
	//alert(tdept);
		obj=new XMLHttpRequest();
		obj.onreadystatechange=handleGettingSubjectsRequest2;
		obj.open("post","GetDeptTeacherServlet?tdept="+tdept,true);
		obj.send();
}
function handleGettingSubjectsRequest2()
{
	if(obj.readyState==4)
		{
		//alert("aa gaya");
			document.getElementById("tnameid").innerHTML=obj.responseText;
		}
}
function checkValidation()
{
var sem=document.studentleaveform.sem.value;
var subject=document.studentleaveform.subject.value;
var to=document.studentleaveform.to.value;
var from=document.studentleaveform.from.value;
if(sem=="Select Semester")
	{
	document.getElementById("leavearea").innerHTML="please select Semester";
	document.studentleaveform.sem.focus();
	}
else if(subject=="")
{
document.getElementById("leavearea").innerHTML="please enter Subject";
document.studentleaveform.subject.focus();
}
else if(from=="")
	{
	document.getElementById("leavearea").innerHTML="please select FROM date";
	document.studentleaveform.from.focus();
	}
else if(to=="")
	{
	document.getElementById("leavearea").innerHTML="please select TO date";
	document.studentleaveform.to.focus();
	}
else
	{
	document.studentleaveform.submit();
	}
}