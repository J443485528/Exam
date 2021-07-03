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
    <script type="text/javascript">
        function yunxu(){
            if(confirm("确定此比赛信息完成?")){
                return true;
            }return false;
        }
        function buyunxu(){
            alert("已完成！不允许修改!")
            return false;
        }
    </script>
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
    <form action="/selectExamByName.do" method="post">
        考试名称：<input type="text" name="examname" />
        <input type="submit" value="查询" class="button"/>
    </form>
    <c:choose><c:when test="${!empty list}">
        <table border="1px" cellspacing="0" width="100%">
            <tr>
                <th>考试名称</th> <th>考试学分</th>
                <th>考试时间</th> <th>考试地点</th> <th>修改</th>
            </tr>
            <c:forEach var="exam" items="${list}">
                <tr>
                    <td>${exam.examname}</td>
                    <td>${exam.examscore}</td>
                    <td>${exam.examdata}</td>
                    <td>${exam.examaddress}</td>
                    <td>
                        <a href="/editExam.do?examname=${exam.getExamname()}">
                             <img src="./images/edit.jpg" width="20px" height="20px"/>
                        </a>
                    </td>
                </tr></c:forEach>
        </table></c:when>
        <c:otherwise>没有任何信息！</c:otherwise></c:choose>
</div>
</body>
</html>