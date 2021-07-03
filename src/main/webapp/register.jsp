<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="http://hovertree.com/texiao/css/22/css/hovertree_login.css" />
    <title>登录</title><base  />

    <style type="text/css">
        .con{
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
        .submit-btn:hover{background-color:#5599ff;
        }
    </style>
</head>
<body>

<div id="header">
    <div class="header_title">
        <span class="title_con">学生考试系统</span>
    </div>
</div>

<div id="content" >

    <div class="con">
        <div class="con_title">
            <span class="con_title_sp">欢迎登录学工系统</span>
        </div>

        <div class="con_panel" >

            <form action="/register.do" method="post" >
                <div class="con_input">
                    <span>用户名：</span><input type="text" placeholder="用户名" name="username"/>
                </div>
                <div class="con_input">
                    <span>密&nbsp;&nbsp;&nbsp;&nbsp;码：</span><input type="password" placeholder="密码" name="password"/>
                </div>

                <input type="submit" value="注 册" class="submit-btn"/>
            </form>
        </div>

    </div>


</div>



</body>
</html>