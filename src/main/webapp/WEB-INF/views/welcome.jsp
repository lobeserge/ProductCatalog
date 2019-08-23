<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>welcome page</title>
</head>
<body>
<%@include file="header.jsp" %>
<div class="container ">

<c:forEach items="${productslistcatalog}" var="pdt">
<div class="col-md-6">
<div class="row" style="padding-right:30px;padding-bottom:30px;">
    <div class="card">
      <img src="/ProcessImageServlet?prdtdel=${pdt.getProductId()}" style="width:100px; height 100px;">
     
        <h4>${pdt.getProductName()}<span class="title pull-right" style="float:right; clear:both;padding-right:20px;">${pdt.getProductPrice()}</span> </h4>
         <h4>Category<span class="title " style="float:right; clear:both;padding-right:20px;">${pdt.getProductCategory()}</span> </h4>
      
    </div>
  </div>
</div>
</c:forEach>

</div>










<style>


.column {
  float: left;
  width: 33%;
  margin-bottom: 16px;
  padding: 0 8px;
}


@media screen and (max-width: 650px) {
  .column {
    width: 100%;
    display: block;
  }
}


.card {
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
}





.title {
  color: grey;
}



</style>

</body>
</html>