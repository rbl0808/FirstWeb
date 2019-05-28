<%--
  Created by IntelliJ IDEA.
  User: 84536
  Date: 2018.4.18
  Time: 19:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>fileUpload</title>
</head>
<body>
<h1>fileUpload1</h1>
<form action="/4_18_AServlet"  method="post" enctype="multipart/form-data">
    用户名:<input type="text" name="username"/><br/>
    上  传:<input type="file" name="zhaopian"/><br/>
    <input type="submit" value="上传"/>

</form>
</body>
</html>
