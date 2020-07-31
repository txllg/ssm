<%--
  Created by IntelliJ IDEA.
  User: txllg
  Date: 2020/7/28
  Time: 10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="moviesController/findAll">findAll方法</a><br>

根据id查询
<form action="moviesController/findOne">
   id:<input type="text" name="id"><br>
    <input type="submit" value="提交">
</form><br>

添加电影
<form action="moviesController/addMovie">
    name:<input type="text" name="name"><br>
    director:<input type="text" name="director"><br>
    actor:<input type="text" name="actor"><br>
    <input type="submit" value="提交">
</form><br>


修改电影
<form action="moviesController/modifyMovie">
    id:<input type="text" name="id"><br>
    name:<input type="text" name="name"><br>
    director:<input type="text" name="director"><br>
    actor:<input type="text" name="actor"><br>
    <input type="submit" value="提交">
</form><br>


删除电影
<form action="moviesController/deleteMovie">
    id:<input type="text" name="id"><br>
    <input type="submit" value="提交">
</form>

</body>
</html>
