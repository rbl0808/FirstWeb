<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 84536
  Date: 2018.4.19
  Time: 14:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ajax</title>
    <script type="text/javascript">
        function createXMLHttpRequest() {
            return new  XMLHttpRequest();
        }

        window.onload = function () {
            var btn = document.getElementById("btn1");
            btn.onclick = function () {
            /*
            ajax4步操作
            得到响应对象
             */
            var xmlHttp = createXMLHttpRequest();
            /*
            打开与服务器的连接
             */
            xmlHttp.open("GET","<c:url value='/4_19_AServlet'/>",true);
            /*
            发送请求
             */
            xmlHttp.send(null);//GET请求没有请求体,也要给出null,否则火狐浏览器可能会不发送
            /*
            给异步对象的onreadystatechange事件注册监听器
             */
            xmlHttp.onreadystatechange = function () {
                if(xmlHttp.readyState === 4 && xmlHttp.status === 200){
                var text = xmlHttp.responseText;
                var h1 = document.getElementById("h1");
                h1.innerHTML = text;
            }
        };
        };
        };


        window.onload = function () {
            var btn = document.getElementById("btn2");
            btn.onclick = function () {
                /*
                ajax4步操作
                得到响应对象
                 */
                var xmlHttp = createXMLHttpRequest();
                /*
                打开与服务器的连接
                 */
                /*****************************/
                xmlHttp.open("POST","<c:url value='/4_19_AServlet'/>",true);
                xmlHttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
                /*************************/
                /*
                发送请求
                 */
                xmlHttp.send("username=rbl&password=123");//GET请求没有请求体,也要给出null,否则火狐浏览器可能会不发送
                /*
                给异步对象的onreadystatechange事件注册监听器
                 */
                xmlHttp.onreadystatechange = function () {
                    if(xmlHttp.readyState === 4 && xmlHttp.status === 200){
                        var text = xmlHttp.responseText;
                        var h2 = document.getElementById("h1");
                        h2.innerHTML = text;
                    }
                };
            };
        };
    </script>
</head>
<body>

<button id="btn1">点击这里测试AJAX  GET请求</button>
<h1 id="h1"></h1>

<button id="btn2">点击这里测试AJAX  POST请求</button>
<h1 id="h2"></h1>

</body>
</html>
