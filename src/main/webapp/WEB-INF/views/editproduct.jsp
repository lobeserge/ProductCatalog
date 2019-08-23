<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="/webjars/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet">
<title>Edit Product</title>
</head>
<body>


<%@include file="header.jsp" %>
<h2>Update Your Product</h2>
<div class="container-fluid " style="margin-top:1%;">

<div class="col-md-4 col-md-offset-4" class="form-group ">
<img src="/ProcessImageServlet?prdtdel=<%=request.getAttribute("prd-id")%>" style="width:170px; height 170px;">
<form action="/UpdateProduct" method="post" enctype="multipart/form-data" >
  <input type="text" name="pid"  class="form-control mt-20"  value="<%=request.getAttribute("prd-id")%>"><br><br>
  <input type="text" name="pname"  class="form-control mt-20" value="<%=request.getAttribute("prd-name")%>"><br><br>
  <input type="text" name="pprice"  class="form-control mt-20" value="<%=request.getAttribute("prd-price")%>"><br><br>
  <input type="text" name="ppcat"  class="form-control mt-20" value="<%=request.getAttribute("prd-cat")%>"><br><br>
  <input type="file" name="pimage"  class="form-control mt-20" placeholder="Select File"><br><br>
  <input type="submit" value="Update  Product" class="btn btn-success btn-lg form-control" ><br><br>
</form>
</div>
</div>





</body>
</html>