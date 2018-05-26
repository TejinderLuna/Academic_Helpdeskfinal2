function checkValidation()
{
var branch=document.resultform.branch.value;
var sem=document.resultform.sem.value;
if(branch=="Select Branch")
{
	document.getElementById("viewresultarea").innerHTML="Please select branch";
	document.resultform.branch.focus();
}
else if(sem=="Select Semester")
{
	document.getElementById("viewresultarea").innerHTML="please select Semester";
	document.resultform.sem.focus();
}
else
	{
	document.resultform.submit();
	}
}