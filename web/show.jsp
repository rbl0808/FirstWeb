<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 84536
  Date: 2018.4.17
  Time: 23:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 align="center">显示结果</h1>
<table align="center">
    <tr>
        <th>IP</th>
        <th>次数</th>
    </tr>
<c:forEach items="${applicationScope.map}" var="entry">
    <tr>
        <th>${entry.key}</th>
        <th>${entry.value}</th>
    </tr>
</c:forEach>
</table>
</body>
</html>
