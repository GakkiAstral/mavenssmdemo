<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021-06-08
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户数据页</title>
</head>
<body>
    <table border="1" align="center">
        <tr>
            <th>用户ID</th>
            <th>用户姓名</th>
            <th>用户密码</th>
        </tr>
        <c:forEach items="${list}" var="user">
            <tr>
                <td>${user.userid}</td>
                <td>${user.username}</td>
                <td>${user.userpwd}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
