<%--
  Created by IntelliJ IDEA.
  User: 42962
  Date: 2021/3/7
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Insert title here</title>
    <link rel="stylesheet" type="text/css" href="css/page.css">
</head>
<body>
<%@include file="head.jsp" %>
<div class="bg1">
    <ul>
        <li><a href="/listStudents.do"><input type="button" value="查询所有学生信息" class="button2"/></a></li><br/>
        <li><a href="sm1.jsp"><input type="button" value="按学号查询" class="button1"/></a></li><br/>
        <li><a href="sm2.jsp"><input type="button" value="按学生姓名查询" class="button1"/></a></li><br/>
        <li><a href="smadd.jsp"><input type="button" value="添加学生" class="button1"/></a></li><br/>
    </ul>
</div>
<div class="bg2">
    <form action="/addStudent.do" method="post">
        <table style="text-align:left">
            <tr><td align="right" width="30%">序号：</td><td><input type="text" name="id" class="text"/></td><tr>
            <tr><td align="right" width="30%">姓名：</td><td><input type="text" name="name" class="text"/></td><tr>
            <tr><td align="right" width="30%">学号：</td><td><input type="text" name="number" class="text"/></td><tr>
            <tr><td align="right" width="30%">课程：</td><td><input type="text" name="crouses" class="text"/></td><tr>
            <tr><td align="right" width="30%">课程学分：</td><td><input type="text" name="crousescore" class="text"/></td><tr>
            <tr><td align="right" width="30%">分数:</td><td><input type="text" name="score"  class="text"/>分</td></tr>

            <tr><td align="right" width="30%"><input type="submit" value="确定" class="button"/>&nbsp;&nbsp;&nbsp;</td>
                <td><input type="reset" value="重置" class="button"/></td><tr>
        </table></form>
</div>
</body>
</html>