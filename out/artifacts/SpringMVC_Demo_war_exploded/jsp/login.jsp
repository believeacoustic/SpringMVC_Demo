<%--
  Created by IntelliJ IDEA.
  User: Rong
  Date: 2018/4/25
  Time: 14:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%--网站的所有路径都会加上path路径--%>
    <base href="${path}/">
    <title>登陆页面</title>
    <link href="css/main.css" type="text/css" rel="stylesheet"/>
    <script src="js/jquery-1.10.1.min.js"></script>
    <script>
        $(
            function () {
                //获取表单
                $("form").eq(0).submit(
                    function () {
                        var uname=$("#uname").val();
                        var pwd=$("#pwd").val();
                        if(uname==null||uname==""||uname.length==0){
                            $("#nameError").html("用户名不为空");
                            return false;
                        }
                        if(pwd==""||pwd.length==0){
                            $("#pwdError").html("密码不为空");
                            return false;
                        }


                    }
                );
            }
        );

    </script>

</head>
<body>
<div id="main">


<form id="form" method="post" action="login.action">
    <p>用户名：<input id="uname" type="text" placeholder="请输入用户名" name="uname">
    <span id="nameError"></span></p>

    <p>密码：<input id="pwd" type="password" placeholder="请输入密码" name="pwd">
    <span id="pwdError" style="color: red"></span></p>
    <p><input type="reset" value="取消">
    <input type="submit" value="登陆">
    </p>



</form>
    <span style="color: red">${error}</span>;
</div>
</body>
</html>
