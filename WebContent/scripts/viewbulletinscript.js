function viewBulletins()
{
	//alert("hi");
	obj=new XMLHttpRequest();
	obj.onreadystatechange=handleGettingSubjectsRequest1;
	obj.open("post","ViewBulletinsForBullBoardServlet",true);
	obj.send();
}
function handleGettingSubjectsRequest1()
{
	if(obj.readyState==4)
		{
			document.getElementById("getallBulletins").innerHTML=obj.responseText;
		}
}