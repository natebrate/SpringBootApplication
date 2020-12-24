<%--
  Created by IntelliJ IDEA.
  User: nsbra1
  Date: 11/29/2020
  Time: 3:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!-- Developed by http://grohit.com/ -->
<!DOCTYPE html>
<html lang="en"> <!--indicating the language is English-->
<head>
<!--link to main style sheet and resources-->
    <link href="resources/css/userStyle.css" rel="stylesheet" media="all">

</head>
<html>
<body>
<div id="menuArea">
    <input type="checkbox" id="menuToggle"></input>

    <label for="menuToggle" class="menuOpen">
        <div class="open"></div>
    </label>

    <div>
        <h1>WELCOME TO ZOO MANAGEMENT</h1>
    </div>

    <div class="menu menuEffects">
        <label for="menuToggle"></label>
        <div class="menuContent">
            <ul>]
                <!-- Main user selection to connect to different pages-->
                <li><a href="${pageContext.request.contextPath}/home">HOME </a></li>
                <li><a href="user.jsp">USER MANAGEMENT 2</a></li>
                <li><a href="animal.jsp">ANIMAL MANAGEMENT 3</a></li>
                <li><a href="animal.jsp">TICKET MASTER 4</a></li>
                <li><a href="#">ABOUT </a></li>
            </ul>
        </div>
    </div>
</div>
</body>
</html>
