<%--
  Created by IntelliJ IDEA.
  User: Rong
  Date: 2018/4/26
  Time: 10:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <base href="${path}/"/>
    <title>首页</title>
    <%--<link href="css/main.css" rel="stylesheet" type="text/css"/>--%>
    <style>
        /*.li{
            float: left;
            list-style: none;
            width: 120px;
            height: 40px;
            font-size: 25px;
            font-family: 黑体;
            font-weight: bolder;
            background-color: aquamarine;
            border: 1px solid beige;

        }

        .span{
            padding-top: 5px;
            display: inline-block;
        !*!/具有块标签的特性，行标签的高度和内容一样，不能设置*!
        }*/
        .good{
            width: 250px;
            height: 350px;
            border: 1px solid black;
            margin-left: 10px;
            margin-right: 10px;
            margin-bottom: 10px;
        }

        #goods{
            width: 1200px;
            margin-top:30px ;

        }
        .gli{
            float: left;
            list-style: none;
            text-align: center;
        }
    </style>

</head>
<body>
<div id="main">

    <%@include file="head.jsp"%>
    <div id="goods">
        <%--第一个，然后for循环--%>
        <ul>
            <c:forEach items="${goodsList}" var="good">
                <li class="gli">
                    <div class="good">
                        <a href="goodInfor.action?gid=${good.gid}">
                            <img src="${good.img}" width="200px" height="200px"/></a>
                        <a href="goodInfor.action?gid=${good.gid}">
                            <p>${good.gname}</p>
                        </a>
                        <a href="goodInfor.action?gid=${good.gid}">
                            <p>现价：${good.price}</p>
                        </a>
                        <p> <input type="button"  value="添加购物车"/>
                            <input type="button"  value="购买"/>
                        </p>
                    </div>
                </li>
            </c:forEach>
        </ul>
    </div>
</div>


</body>
</html>
