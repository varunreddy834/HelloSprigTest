<%--
  Created by IntelliJ IDEA.
  User: Krishna
  Date: 7/11/2018
  Time: 4:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Header</title>
</head>
<body>
<nav class='Header'>
<ul class="nav navbar-nav">


    <li class="active"><a href="${pageContext.request.contextPath}/home">Home</a></li>
    <li ><a href="${pageContext.request.contextPath}/About">About US</a></li>
    <li><a href="${pageContext.request.contextPath}/ContactUs">Contact US</a></li>


    <li><a href="${pageContext.request.contextPath}/About">Services</a></li>
    <li><a href="${pageContext.request.contextPath}/Menu">Menu</a></li>
    <li><a href="${pageContext.request.contextPath}/Orders">Orders</a></li>
</ul>

</nav>
</body>
</html>
