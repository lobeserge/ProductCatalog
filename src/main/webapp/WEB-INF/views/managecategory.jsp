<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Manage Categories</title>
</head>
<body>

<form action="/AddCategoryServlet" method="post">
<input type="text" name="catname">
<input type="text" name="catdescription">
<input type="submit" value="add category">
</form>
<br>
<br>

<div>
<c:forEach items="${categories}" var="cat">
				<p>${cat.CategoryName}
				
				${cat.CategoryDetails}</p>
				
</c:forEach>
</div>


</body>
</html>