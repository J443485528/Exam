<%--
  Created by IntelliJ IDEA.
  User: 42962
  Date: 2021/3/7
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Insert title here</title>
    <style type="text/css">
        .c1{position:fixed;
            top: 0;
            left: 0;
            width:100%;
            height:100%;
            min-width: 1000px;
            z-index:-10;
            background-repeat:no-repeat;
            background-size:cover;
            background-position: center 0;
        }
        ul li{display:inline;}
        ul li a{text-decoration: none;}
        a{text-decoration:none;}
        a:link,a:visited,a:hover{color:white;}
        a:active{color:gold;}
        .button{width:auto;height:30px;
            margin:10px;border-width: 0px;background: #114092;
            cursor: pointer;outline: none;color: white;font-size: 14px;
        }
        .button:hover{background-color:#144CAC;}
        .co{
            color: #fff;
        }
        .co:hover{background-color:#144CAC;}
    </style>
</head>
<body>
<div><img src="images/uni.jpg" class="c1"/></div>
<div align="right" style="background-color:#114092;padding:5px;">
    <span class="co"><a href="/login.jsp">登录</a>&nbsp;&nbsp;&nbsp;</span>
    <span class="co">${user.getUsername()}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
    <a href="/logout.do">退出</a>
</div>
<div style="width:100%;height:50px;">

    <h1 style="color:#000;position:relative" align="center">学生考试管理系统</h1>
</div>
<div style="background-color:#114092;">
    <ul>
        <li><a href="index.jsp"><input type="button" value="首页" class="button"/></a></li>|
        <li><a href="/listStudents.do"><input type="button" value="学生成绩信息管理" class="button"/></a></li>|
        <li><a href="/listExam.do"><input type="button" value="考试安排" class="button"/></a></li>|
        <li><a href="examsafe.jsp"><input type="button" value="考试事项" class="button"/></a></li>|
    </ul></div>
</body>
</html>
