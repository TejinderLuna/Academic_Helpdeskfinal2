function checkValidation()
{
var tid=document.teachersearchform.tid.value;
//alert(tid);
if(tid=="")
	{
	document.getElementById("searcharea").innerHTML="Enter Teacher ID";
	documnet.teachersearchform.tid.focus();	
	}
	
else if(isNaN(tid)==true)
	{
	document.getElementById("searcharea").innerHTML="Teacher ID should be Numeric";
	documnet.teachersearchform.tid.focus();
	}
else
	{
	document.teachersearchform.submit();
	}
}