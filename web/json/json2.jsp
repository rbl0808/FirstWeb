<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 84536
  Date: 2018.4.19
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSON</title>
    <script type="text/javascript">
        function createXMLHttpRequest() {
            return new  XMLHttpRequest();
        }
        window.onload = function() {
        var btn = document.getElementById("btn");
        btn.onclick =function() {
        var xmlHttp = createXMLHttpRequest();
        xmlHttp.open("GET","<c:url value='/4_19_BServlet'/>",true);
        xmlHttp.send(null);
        /*
        给异步对象的onreadystatechange事件注册监听器
        */
        xmlHttp.onreadystatechange = function () {
        if(xmlHttp.readyState === 4 && xmlHttp.status === 200){
        var text = xmlHttp.responseText;
        var person = eval("(" + text + ")");
        var  s= person.name + "," + person.age + "," +person.sex;
        var h3 = document.getElementById("h3");
        h3.innerHTML = s;
        }
        }
      }
        }

    </script>
</head>
<body>
<h1>jsonTest2</h1>
<button id = "btn">点击这里测试JSON</button>
<h3 id="h3"></h3>


</body>
</html>
