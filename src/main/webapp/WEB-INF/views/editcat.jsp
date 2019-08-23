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

<div class="container-fluid " style="margin-top:10%;">

<div class="col-md-6 col-md-offset-4">
<h3 style="color:green;">Update Category</h3>
<form action="/UpdateCategoryServlet" method="post" class="form-group ">
<input type="text" name="cat-name" value="<%=request.getAttribute("cat-name")%>"  class="form-control "><br><br>
<input type="text" name="cat-description" value="<%=request.getAttribute("cat-desc")%>" class="form-control"><br><br>
<input type="submit" value="Update" class="btn btn-success">
</form>
</div>
</div>
</body>
</html>