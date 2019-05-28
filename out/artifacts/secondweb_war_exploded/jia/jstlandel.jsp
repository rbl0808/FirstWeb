<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: 84536
  Date: 2018.4.7
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>JSTL标签库</title>
</head>
<body>
<%--   <%
       request.setAttribute("code","<script>alert('hello');</script>");
   %>--%>
  <%-- ${fn:contains("asd","gdgdf" )}
   ${code} --%>
   <c:set var="code" value="<script>alert('hello');</script>" scope="request"/>
   <c:out value="${code }"  escapeXml="true"/><br/>
   <c:remove var="code" />
   <c:out value="${code }"  escapeXml="false"/>
   <!--项目路径-->
   <c:url value='/jia/jstlandel.jsp'/><br/>

   <!--if语句-->
   <c:set var="a" value="hello" />
   <c:if test="${not empty a}">
       <c:out value="${a}"/>
   </c:if><br/>
    <!--choose语句-->
    <c:url value="../index.jsp">
        <c:param name="name" value="然并卵0808"/>
    </c:url>
    <c:choose>
        <c:when test="${empty param.name}">
            你没有给出名为name的参数
        </c:when>
        <c:otherwise>
            你怎么给出了名为name参数的!!!
        </c:otherwise>
        
    </c:choose><br/>

   <!--循环-->
   <c:forEach var="i" begin="1" end="10">
       ${i}
   </c:forEach><br/>
   <c:forEach var="i" begin="1" end="10" step="2">
        ${i}
   </c:forEach><br/>
   <!--循环输出数组-->
   <%
        String[] strs = {"one","two","three","four"};
        request.setAttribute("strs",strs);
    %>
    <c:forEach items="${requestScope.strs }" var="str">
        ${str }
    </c:forEach><br/>
    <!--fmt标签格式化时间-->
    <%
        Date date = new Date();
        pageContext.setAttribute("date",date);
    %>
    <fmt:formatDate value="${date}" pattern="yyyy-MM-dd HH:mm:ss"/><br/>

</body>
</html>
