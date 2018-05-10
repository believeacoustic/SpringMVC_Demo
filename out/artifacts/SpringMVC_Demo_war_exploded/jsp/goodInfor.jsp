<%--
  Created by IntelliJ IDEA.
  User: Rong
  Date: 2018/4/26
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品详情</title>
    <style>
        #main{
            width: 800px;
            margin: 0px auto;
            text-align: center;

        }
    </style>
</head>
<body>
<%@include file="head.jsp"%>
<div id="main">
    <img src="${good.img}" width="400px" height="400px" border="1">
    <p>商品名：${good.gname}</p>
    <p>价格：${good.price}</p>
    <p><input type="button" value="立即购买"/>
        <input type="button" value="添加到购物车"/>
    </p>


</div>


</body>
</html>
