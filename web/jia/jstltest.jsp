<%--
  Created by IntelliJ IDEA.
  User: 84536
  Date: 2018.4.9
  Time: 21:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="rbl" uri="/WEB-INF/tlds/ranbingluan.tld" %>
<html>
<head>
    <title>自定义标签测试</title>
</head>
<body>
<h1 style="color: red">
    <rbl:rbl1/></h1>
<%
    request.setAttribute("xxx","然并卵");

%>
<h2><rbl:rbl2> ${xxx}
</rbl:rbl2> </h2>

<h4><rbl:rbl3 test="${empty param.xx}">
    我没用名字
    <h3><rbl:rbl2> 我是然并卵0808
    </rbl:rbl2> </h3>
</rbl:rbl3></h4>
</body>
</html>
