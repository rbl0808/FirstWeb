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
    <title>��¼</title>
    <script>
        function _change(){
    /*
     1.�õ�imgԪ��
     2.�޸���srcΪ/4_7_VerifyCodeServlet
    */
    var imgEle = document.getElementById("img");
    imgEle.src = "/4_7_VerifyCodeServlet?a=" + new Date().getTime();
    }</script>
</head>
<body>

<h1>��¼</h1>
<%
    /*
    ��ȡ��Ϊuname��cookie
    ���Ϊ�� ��ʾ""
    �����Ϊ�� ��ʾcookie��ֵ
     */
    String uname ="";
    Cookie[] cs = request.getCookies();
    if (cs != null){//�������Cookie
        for (Cookie c : cs){//ѭ����������Cookie
            if("uname".equals(c.getName())){//������Ϊuname��cookie
                uname = c.getValue();//��ȡ���Cookie��ֵ������uname�������
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
    �û���:<input type="text" name="username" value="<%=uname%>"/><br/>
    ��  ��:<input type="password" name="password"><br/>
    ��֤��:<input type="text" name="Vcode"/>
           <img src="/4_7_VerifyCodeServlet" id="img">
    <a href="javascript:_change()">��һ��</a>
    <br/>
    <input type="submit" value="��¼"/>

</form>
</body>
</html>
