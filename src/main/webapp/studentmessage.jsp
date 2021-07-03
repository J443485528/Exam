<%--
  Created by IntelliJ IDEA.
  User: 42962
  Date: 2021/3/7
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <c:choose><c:when test="${!empty list}">
        <table border="1px" cellspacing="0" width="100%">
            <tr>
                <th>序号</th> <th>姓名</th> <th>学号</th>
                <th>课程</th> <th>课程学分</th> <th>分数</th>
            </tr>
            <c:forEach var="student" items="${list}">
                <tr>
                    <td>${student.id}</td><td>${student.name}</td>
                    <td>${student.number}</td><td>${student.crouses}</td>
                    <td>${student.crousescore}</td><td>${student.score}分</td>
                </tr></c:forEach>
        </table></c:when>
        <c:otherwise>没有任何信息！</c:otherwise></c:choose>
</div>
</body>
</html>