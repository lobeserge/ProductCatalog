<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>manage Product</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet">
</head>
<body>
<%@include file="header.jsp" %>
<br>
<div class="container-fluid">
<a href="/AddProductServlet" class="btn btn-success" >Add new Product</a>
</div>


<div class="container-fluid">
<table class="table table-striped table-hover">

		<thead>
		    <th>Image</th>
			<th>Product ID</th>
			<th>Product Name</th>
			<th>Product Price</th>
			<th>Product Category</th>
			<th>Update</th>
			<th>Delete</th>
		</thead>
		<tbody>
<c:forEach items="${productslist}" var="pdt">
<tr>           
                <td><img src="/ProcessImageServlet?prdtdel=${pdt.getProductId()}" style="width:50px;height 50px;"></td>
				<td>${pdt.getProductId()}</td>
				<td>${pdt.getProductName()}</td>
				<td>${pdt.getProductPrice()}</td>
				<td>${pdt.getProductCategory()}</td>
				<td>&nbsp;&nbsp;<a href="/UpdateProductRetrieve?mprdtid=${pdt.getProductId()}&mprdname=${pdt.getProductName()}&mprdprice=${pdt.getProductPrice()}&mprdcat=${pdt.getProductCategory()}" class="btn btn-info"  >       Update      </a></td>
				<td>&nbsp;&nbsp;<a href="/DeleteProductServlet?prdtdel=${pdt.getProductId()}"  class="btn btn-danger">Delete</a></td>
</tr>
</c:forEach>
</tbody>
	</table>
</div>

</body>
</html>