

function checkValidation()
{
	//alert("hello");
	var regno=document.stusearchform.regno.value;
	if(regno=="")
	{
		document.getElementById("searcharea").innerHTML="enter Reg. number";
		document.stusearchform.regno.focus();
	}
	else if(isNaN(regno)==true)
		{
		document.getElementById("searcharea").innerHTML="Reg. no should be numeric";
		document.stusearchform.regno.focus();
		}
	else
		{
		document.stusearchform.submit();
		}
}