<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Product</title>
</head>
<body>


<%@include file="header.jsp" %>
<h2>Add a new Product Today</h2>
<div class="container-fluid " style="margin-top:5%;">

<div class="col-md-4 col-md-offset-4" class="form-group ">
<form action="/AddProductServlet" method="post" enctype="multipart/form-data" >
  <input type="text" name="id"  class="form-control mt-20" placeholder="Product id"><br><br>
  <input type="text" name="name"  class="form-control mt-20" placeholder="Product Name"><br><br>
  <input type="text" name="price"  class="form-control mt-20" placeholder="Product Price"><br><br>
  <input type="text" name="pcat"  class="form-control mt-20" placeholder="Product Category"><br><br>
  <input type="file" name="image"  class="form-control mt-20" placeholder="Select File"><br><br>
  <input type="submit" value="Submit Product" class="btn btn-success btn-lg form-control" ><br><br>
</form>
</div>
</div>
</body>
</html>