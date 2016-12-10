<%--
  Created by IntelliJ IDEA.
  User: zxk175
  Date: 16/12/8
  Time: 21:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport"
          content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no"/>
    <title>后台管理中心 - 登录</title>
    <link rel="icon" type="image/x-icon" href="icon/favicon_64.ico"/>
    <link rel="shortcut icon" type="image/x-icon" href="icon/favicon_64.ico"/>
    <link rel="stylesheet" href="library/bootstrap/dist/bootstrap.css">
    <link rel="stylesheet" href="library/Animate.css">
    <link rel="stylesheet" href="css/basic.css">
    <link rel="stylesheet" href="css/login.css">
    <link rel="stylesheet" href="library/font_awesome/css/font-awesome.css">
    <!--[if lt IE 9]>
    <script src="library/html5shiv.min.js"></script>
    <script src="library/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<div class="login">
    <div class="photo"></div>
    <span>管理员登录</span>
    <div id="login-form">
        <div id="u" class="form-group">
            <input id="username" spellcheck="false" class="form-control" name="username" type="text" size="18"
                   alt="login" required="">
            <span class="form-highlight"></span>
            <span class="form-bar"></span>
            <label for="username" class="float-label">邮箱</label>
            <span class="erroru">
                邮箱不能为空
                <i>
                    <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24">
                        <path d="M0 0h24v24h-24z" fill="none"></path>
                        <path d="M1 21h22l-11-19-11 19zm12-3h-2v-2h2v2zm0-4h-2v-4h2v4z"></path>
                    </svg>
                </i>
            </span>
            <span class="errorf">
                邮箱格式不正确
                <i>
                    <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24">
                        <path d="M0 0h24v24h-24z" fill="none"></path>
                        <path d="M1 21h22l-11-19-11 19zm12-3h-2v-2h2v2zm0-4h-2v-4h2v4z"></path>
                    </svg>
                </i>
            </span>
        </div>
        <div id="p" class="form-group">
            <input id="password" class="form-control" spellcheck="false" name="password" type="password" size="18"
                   alt="login" required="">
            <span class="form-highlight"></span>
            <span class="form-bar"></span>
            <label for="password" class="float-label">密码</label>
            <span class="errorp">
                密码不能为空
                <i>
                    <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24">
                        <path d="M0 0h24v24h-24z" fill="none"></path>
                        <path d="M1 21h22l-11-19-11 19zm12-3h-2v-2h2v2zm0-4h-2v-4h2v4z"></path>
                    </svg>
                </i>
            </span>
        </div>
        <div class="form-group">
            <input type="checkbox" id="rem">
            <label for="rem">记住密码</label>
            <button id="submit" type="submit" ripple="">登录</button>
        </div>
    </div>
</div>

<script type="text/javascript" src="library/jquery/jquery.min.js"></script>
<script type="text/javascript" src="library/layer/layer.js"></script>
<script type="text/javascript" src="js/basic.js"></script>
<script type="text/javascript" src="library/bootstrap/dist/bootstrap.js"></script>
<script type="text/javascript" src="library/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
