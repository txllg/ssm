<%--
  Created by IntelliJ IDEA.
  User: txllg
  Date: 2020/7/28
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%--添加jstl核心库--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>congratulations！</h1>

输出查询所有结果
<c:forEach items="${movies}" var="movie">
    ${movie.id}-
    ${movie.name}-
    ${movie.director}-
    ${movie.actor}<br>

</c:forEach>


<%--输出查询一个结果--%>
${movie.id}--
${movie.name}--
${movie.director}--
${movie.actor}
</body>
</html>
