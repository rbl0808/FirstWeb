<%--
  Created by IntelliJ IDEA.
  User: 84536
  Date: 2018.4.3
  Time: 19:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=gbk" language="java" %>
<html>
<head>
    <title>登录</title>
    <script>
        function _change(){
    /*
     1.得到img元素
     2.修改其src为/4_7_VerifyCodeServlet
    */
    var imgEle = document.getElementById("img");
    imgEle.src = "/4_7_VerifyCodeServlet?a=" + new Date().getTime();
    }</script>
</head>
<body>

<h1>登录</h1>
<%
    /*
    读取名为uname的cookie
    如果为空 显示""
    如果不为空 显示cookie的值
     */
    String uname ="";
    Cookie[] cs = request.getCookies();
    if (cs != null){//如果存在Cookie
        for (Cookie c : cs){//循环遍历所有Cookie
            if("uname".equals(c.getName())){//查找名为uname的cookie
                uname = c.getValue();//获取这个Cookie的值并赋给uname这个变量
            }
        }
    }
%>
<%String message ="";
String msg = (String) request.getAttribute("msg");
if(msg != null){
    message = msg;
}
%>
<form color="red"><b><%=message%></b>
</form>
<form action="/4_7_LoginServlet" method="post">
    用户名:<input type="text" name="username" value="<%=uname%>"/><br/>
    密  码:<input type="password" name="password"><br/>
    验证码:<input type="text" name="Vcode"/>
           <img src="/4_7_VerifyCodeServlet" id="img">
    <a href="javascript:_change()">换一张</a>
    <br/>
    <input type="submit" value="登录"/>

</form>
</body>
</html>
