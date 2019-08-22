<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Category</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet">
</head>
<body>
<%@include file="header.jsp" %>
<form action="/UpdateCategoryServlet" method="post">
<input type="text" name="cat-name" value="<%=request.getAttribute("cat-name")%>">
<input type="text" name="cat-description" value="<%=request.getAttribute("cat-desc")%>">
<input type="submit" value="Update category">
</form>
</body>
</html>