<%--
  Created by IntelliJ IDEA.
  User: Love
  Date: 13.02.2020
  Time: 20:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit user</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/edit"  method="post">
    <input type="hidden" name = "id" value="${param.id}">
    <input type="text" name="login" value="${param.login}" placeholder="Enter new login">
    <input type="text" name="password" value="${param.password}" placeholder="Enter new password">
    <input type="text" name="name" value="${param.name}" placeholder="Enter new name">
    <input type="submit" value="Edit">
</form>
</body>
</html>