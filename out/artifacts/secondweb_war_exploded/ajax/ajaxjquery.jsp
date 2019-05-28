<%--
  Created by IntelliJ IDEA.
  User: 84536
  Date: 2018.5.27
  Time: 22:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="../js/jquery-3.2.1.min.js"></script>
    <script>
        $(function () {
            $("#btn1").click(function(){
                $.ajax({
                    type:"GET",
                    url:"/4_19_CServlet",
                    success:function(msg) {
                        alert(msg);
                    }
                });
            })
        })

        $(function () {
            $("#btn2").click(function(){
                $.ajax({
                    type:"POST",
                    url:"/4_19_CServlet",
                    data:"username=rbl&password=123",
                    success:function(msg) {
                        alert(msg);
                    }
                });
            })
        })
    </script>
</head>
<body>
<button id="btn1">点击这里测试AJAX  jquery请求 GET</button> <br/><br/><br/><br/>
<button id="btn2">点击这里测试AJAX  jquery请求 POST</button>
</body>
</html>
