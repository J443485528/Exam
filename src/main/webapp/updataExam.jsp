<%--
  Created by IntelliJ IDEA.
  User: 42962
  Date: 2021/3/7
  Time: 15:30
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
        <li><a href="/listExam.do"><input type="button" value="赛程安排" class="button2"/></a></li><br/>
        <li><a href="addExam.jsp"><input type="button" value="添加新赛程信息" class="button1"/></a></li><br/>
    </ul>
</div>
<div class="bg2">
    <form method="post" action="/updataExam.do">
        <table>
            <tr><td align="right" width="30%">考试学分：</td><td><input type="text" name="examscore"  class="text"/></td></tr>
            <tr><td align="right" width="30%">考试时间：</td><td><input type="text" name="examdata" class="text"/></td></tr>
            <tr><td align="right" width="30%">考试地点：</td><td><input type="text" name="examaddress"  class="text"/></td></tr>
            <tr><td align="right" width="30%"><input type="submit" value="确认修改" class="button"/></td>
                <td><input type="reset" value="重置" class="button"/></td></tr>
        </table></form>
</div>
</body>
</html>