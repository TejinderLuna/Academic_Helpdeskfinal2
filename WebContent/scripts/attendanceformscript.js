function checkValidation()
{
var branch=document.attendanceform.branch.value;
var sem=document.attendanceform.sem.value;
if(branch=="Select Branch")
{
	document.getElementById("viewattendancearea").innerHTML="Please select branch";
	document.attendanceform.branch.focus();
}
else if(sem=="Select Semester")
{
	document.getElementById("viewattendancearea").innerHTML="please select Semester";
	document.attendanceform.sem.focus();
}
else
	{
	document.attendanceform.submit();
	}
}