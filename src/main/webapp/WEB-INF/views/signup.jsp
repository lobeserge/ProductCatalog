<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SignUp Page</title>
</head>
<body>

<form action="/SignUpServlet" method="post">
<input type="text" name="signname">
<input type="text" name="signuser">
<input type="password" name="signpass">
<input type="submit"  value="Sign Up ">
</form>
<a href="/CatalogHome">go back</a>
</body>
</html>