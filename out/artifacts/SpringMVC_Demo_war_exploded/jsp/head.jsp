<%--
  Created by IntelliJ IDEA.
  User: Rong
  Date: 2018/4/26
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <base href="${path}/" />
    <title>Title</title>
    <style>
        #menu{height: 50px;
            width: 500px;
            text-align: center;
            margin: 20px auto;
        }
        .span{
            padding-top: 5px;
            display: inline-block;/*具有块标签的特性，行标签的高度只和内容一样，不能设置*/
        }

        .li{
            float: left;
            list-style: none;
            width: 120px;
            height: 40px;
            font-size: 25px;
            font-weight: bolder;
            font-family: 黑体;
            background-color: antiquewhite;
            border: 1px solid beige;
        }

    </style>


</head>
<body>

<%--是否有session--%>
<c:choose>
    <c:when test="${not empty user}">
        欢迎您，${user.uname},<a href="loginOut.action">注销</a>
    </c:when>
    <c:otherwise>
        <a href="jsp/login.jsp">登陆</a>
    </c:otherwise>
</c:choose>


<div id="menu">
    <%--菜单--%>
    <ul>
        <%--商品的类型 for循环--%>
        <c:forEach items="${goodCatories}" var="goodCatorie">
            <%--类别的id
            ${goodCatorie.catory}  el表达式取域对象里的类别.类名id
            goodCatory.catory 请求的参数 以这样的方式命名，会直接交由处理器，被处理器的goodCatory形参接受
            --%>
            <a href="main.action?catory=${goodCatorie.catory}">
                <c:choose>
                    <c:when test="${goodCatorie.catory == catoryId}">
                        <li class="li" style="background-color: aqua">
                            <span class="span">${goodCatorie.catoryname}</span></li>
                    </c:when>

                    <c:otherwise>
                        <li class="li"><span class="span">${goodCatorie.catoryname}</span></li>
                    </c:otherwise>
                </c:choose>
            </a>
        </c:forEach>
    </ul>

</div>

</body>
</html>
