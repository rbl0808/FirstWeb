<%--
  Created by IntelliJ IDEA.
  User: 84536
  Date: 2018.4.6
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试请求参数</title>

</head>
<body>
<a href="4_6_DServlet?xxx=XXX&yyy=YYY"> 点击这里</a>
<form action="4_6_DServlet" method="post">
用户名:<input type="text" name="username"/><br/>
密码:<input type="password" name="password"/><br/>
 爱好:<input type="checkbox" name="hobby" value="cf"/>吃饭
    <input type="checkbox" name="hobby" value="sj"/>睡觉
    <input type="checkbox" name="hobby" value="dnf"/>地下城
    <br/><input type="submit" value="提交"/>
</form>
</body>
</html>
