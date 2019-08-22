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
<a href="/AddProductServlet" class="btn btn-success">Add new Product</a>



<div class="container-fluid">
<table class="table table-striped">

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
<tr>           <%--  <td><a target='_blank' href='<%=response.encodeURL("/ProcessImageServlet?prdtdel="+ ${pdt.getProductId()})%>'></a></td> --%>
                <td><img src="/ProcessImageServlet?prdtdel=${pdt.getProductId()}"></td>
				<td>${pdt.getProductId()}</td>
				<td>${pdt.getProductName()}</td>
				<td>${pdt.getProductPrice()}</td>
				<td>${pdt.getProductCategory()}</td>
				<td>&nbsp;&nbsp;<a href="#" class="btn btn-info" >       Update      </a></td>
				<td>&nbsp;&nbsp;<a href="/DeleteProductServlet?prdtdel=${pdt.getProductId()}"  class="btn btn-danger">Delete</a></td>
</tr>
</c:forEach>
</tbody>
	</table>
</div>

</body>
</html>