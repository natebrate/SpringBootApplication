<%@ page language="java" contentType="text/html" %>
<!DOCTYPE html>
<html lang="en"> <!--indicating the language is English-->
<head>
    <title>System Login</title> <!--PAGE TITLE-->
    <!-- Required meta tags-->
    <meta http-equiv="Content-Type" charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

</head>
<body>
<h3 th:inline="text">Welcome [[${#httpServletRequest.remoteUser}]]</h3>
<form th:action="@{/logout}" method="post">
    <input type="submit" value="Logout"/>
</form>

</body>
</html>