<%--
  Created by IntelliJ IDEA.
  User: 84536
  Date: 2018.4.7
  Time: 18:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String username = (String)session.getAttribute("username");
    if(username == null){
        /*
        向request域保存错误信息,转发到login.jsp
         */
        request.setAttribute("msg","您没有登录,请重新登录");
        request.getRequestDispatcher("/sessionTest/login.jsp").forward(request,response);
        return;
    }
%>

<h1>succ1</h1>
欢迎<%=session.getAttribute("username")%>大佬
</body>
</html>
