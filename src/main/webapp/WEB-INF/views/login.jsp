<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<link href="/webjars/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet">
</head>
<body>





<div class="container-fluid " style="margin-top:10%;">

<div class="col-md-4 col-md-offset-4">
<h3 style="color:green;">Sign In </h3>
 <form action="/LoginServlet" method="post" class="form-group ">
<input type="text" name="username" class="form-control mt-20" placeholder="username"/><br/><br/>
<input type="password" name="password"  class="form-control mb-20" placeholder="password"/><br/>
<input type="submit" value=" login" class="btn btn-success btn-lg" style="font-size:15px;padding:4px 20px;"/>
<h5 style="color:red">${warning}</h5>
 <h5 style="color:red">${errrorlogin}</h5>
<p><span style="font-size:15px; color:grey;">Don't have and account?</span> 
<a href="/SignUpServlet"><span style="font-size:15px; color:green;" >SignUp today</span></a></p>
</form>

</div>
</div>
<script src="/webjars/jquery/1.9.1/jquery.js"></script>
</body>
</html>