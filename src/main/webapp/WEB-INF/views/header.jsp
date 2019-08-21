<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>header</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet">
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-primary rounded">
    <a class="navbar-brand" href="#" style="color:white;">ProductCatalog</a>
    <ul class="nav navbar-nav mr-auto" style="padding-right:12px;">
            <li class="nav-item active text-success">
                <a class="nav-link" href="/CatalogHome" style="color:white;font-size:15px;">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/ProductHomeServlet"  style="color:white;font-size:15px;">Products</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/RetrieveCategory" style="color:white;font-size:15px;">Category</a>
            </li>
             <li class="nav-item">
                <a class="nav-link" href="/SignUpServlet" style="color:white;font-size:15px;">SignUp</a>
            </li>
            <li class="nav-item navbar-right">
                <a class="nav-link" href="/LogoutServlet" style="color:white;font-size:15px;">Logout</a>
            </li>
       </ul>
</nav>




<script src="/webjars/jquery/1.9.1/jquery.js"></script>
</body>
</html>