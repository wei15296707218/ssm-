<%--
  Created by IntelliJ IDEA.
  User: 卫霸霸的无敌
  Date: 2019/11/1 0001
  Time: 18:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<<a href="account/findAll">测试</a>
<br>

<form action="account/save" method="post">

    姓名:<input type="text" name="name"><br>
    金额:<input type="text" name="money"><br>
    <input type="submit" name="保存">
</form>
</body>
</html>
