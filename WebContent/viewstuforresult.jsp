<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<body>
<table>
<tr><th>REGNO</th><th>NAME</th><th>MARKS.Obtained</th></tr>
<c:forEach var="j" items="${stulist_att}">
		<tr>
		<td style="font-weight:bold"><input type="text" name="regno"value="${j.regno}" required="required" READONLY/></td>
		<td><input type="text" name="name" value="${j.name}" required="required" READONLY/></td>
		<td><input type="number" name="om" min="1" max="30"/></td>
		</tr>
		</c:forEach>
		<tr><td><input type="submit" value="Save"/></td></tr>
</table>
</body>
</head>
<body>

</body>
</html>