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
    <title>保存Cookie</title>
</head>
<body>
<h1>保存Cookie</h1>
<%

    Cookie cookie1 = new Cookie("aaa","AAA");
    Cookie cookie2 = new Cookie("bbb","BBB");
    response.addCookie(cookie1);
    response.addCookie(cookie2);
%>
</body>
</html>
