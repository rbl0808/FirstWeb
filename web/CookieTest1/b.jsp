<%--
  Created by IntelliJ IDEA.
  User: 84536
  Date: 2018.4.7
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>获取Cookie</title>
</head>
<body>
<h1>获取Cookie</h1>
<%
    Cookie[] cookies = request.getCookies();
    for (Cookie c : cookies){
        out.println(c.getName() + "=" + "=" +c.getValue());
    }
%>
</body>
</html>
