<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SignUp Page</title>
<link href="/webjars/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet">
</head>
<body>
<%@include file="header.jsp" %>

<div class="container-fluid " style="margin-top:10%;">

<div class="col-md-4 col-md-offset-4">
<h3 style="color:green;">Sign Up </h3>
<form action="/SignUpServlet" method="post" class="form-group ">
<input type="text" name="signname" class="form-control mt-20" placeholder="given names"><br><br>
<input type="text" name="signuser" class="form-control " placeholder="username"><br><br>
<input type="password" name="signpass" class="form-control mt-20" placeholder="password"><br><br>
<input type="submit"  value="Sign Up" class="btn btn-success btn-lg" style="font-size:15px;padding:4px 20px;">
</form>

</div>
</div>

<script src="/webjars/jquery/1.9.1/jquery.js"></script>
</body>
</html>