<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Manage Categories</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet">
</head>
<body>
<%@include file="header.jsp" %>
<form action="/AddCategoryServlet" method="post">
<input type="text" name="catname">
<input type="text" name="catdescription">
<input type="submit" value="add category">
</form>
<br>
<br>


<div class="container-fluid">
<table class="table table-striped">

		<thead>
			<th>Category</th>
			<th>Description</th>
			<th>Update</th>
			<th>Delete</th>
		</thead>
		<tbody>
<c:forEach items="${categories}" var="cat">
<tr>
				<td>${cat.getCategoryName()}</td>
				<td>${cat.getCategoryDetails()}</td>
				<td>&nbsp;&nbsp;<a href="/UpdateCategoryRetrieve?catname=${cat.getCategoryName()}&catdesc=${cat.getCategoryDetails()}"  class="btn btn-info">       Update      </a></td>
				<td>&nbsp;&nbsp;<a href="DeleteCategoryServlet?catname=${cat.getCategoryName()}&catdesc=${cat.getCategoryDetails()}"  class="btn btn-danger">Delete</a></td>
</tr>
</c:forEach>
</tbody>
	</table>
</div>


</body>
</html>