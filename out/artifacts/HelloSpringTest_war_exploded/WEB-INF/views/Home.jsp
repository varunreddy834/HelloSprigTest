<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Krishna
  Date: 7/9/2018
  Time: 4:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>

    <style>
        body .Home> ul
        {
            text-align:center;

            /*color:white;*/
            font-size: 100px;
            font-style:italic;
            list-style:none;
            background-image: url("https://previews.123rf.com/images/somegirl/somegirl1508/somegirl150800011/43320245-Overhead-shot-of-ingredients-for-sushi-on-dark-background-Raw-salmon-steak-rice-cream-cheese-avocado-Stock-Photo.jpg");

        }
        body .Home> ul{
            color: rgba(255, 255, 255, 0.96);
        }
    </style>
</head>
<body>

<nav class='Home'>

    <ul>

        <li><a href="/OurPage">OurPage</a></li>
        <li><a href="/About">About</a></li>
        <li><a href="/Menu">Menu</a></li>
        <li><a href="/Orders">Orders</a></li>
        <li><a href="/ContactUs">ContactUs</a></li>
    </ul>


</nav>
</body>>
</html>
