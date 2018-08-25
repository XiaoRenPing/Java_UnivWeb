<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>高星文网络科技有限公司</title>

	<link href="../favicon.png" rel="apple-touch-icon-precomposed" />
	<meta name="viewport"	content="width=device-width, minimum-scale=1, maximum-scale=1,user-scalable=no">
	<link rel="stylesheet" href="mobile/style/login/css/style.css">
	<script src="mobile/style/login/js/require.js"></script>
</head>
<body>
	<div class="header">
		<span class="nav_right"><a href="${pageContext.request.contextPath }/mobile/reg.jsp">注册</a></span> 
		<h1>欢迎登录</h1>
	</div>
	<div class="wrap">
		<div class="t_p">
			<p></p>
		</div>
		<div class="section">
			<div class="login">
				<form action="/3g/login/login?cnl=kanshu" method="post"
					name="loginform" id="loginform" class="chargemsg">
					<input type="hidden" name="sid" value="-jlfcT4pLcKDMWGdK6tas1" />
					<ul class="blist">
						<li class="item">
							<div class="item_box">
								<span class="icons icon_log fl"></span> <span class="item_inp"><input
									placeholder="请输入用户名" name="username" id="username" class="t_i"
									value="" maxlength="12" required="" type="text"></span>
							</div>
						</li>
						<li class="item">
							<div class="item_box">
								<span class="icons icon_pass"></span> <span class="item_inp"><input
									placeholder="请输入密码" name="password" id="password" class="t_i"
									value="" maxlength="15" required="" type="password"></span>
							</div>
						</li>
						<li class="item"><input class="t_b btn_log" value="登录" type="submit"></li>
						</li>
					</ul>
				</form>
			</div>
		</div>
	</div>
	<div class="footer home-bg">
		<div class="footer_nav clearfix">
			<a href="../index@cnl=kanshu&sid=-jlfcT4pLcKDMWGdK6tas1">高星文网络科技</a> 
		</div>
		<p class="edition mt20">
			<span>Copyright 2016版权所有</span>
		</p>
		<span id="gotop" class="icons icon-gotop"></span>
	</div>
	<script src="mobile/style/login/js/mobile.js"></script>
	<script src="mobile/style/login/js/common.js"></script>
	<div class="pop_cover"></div>
	<div class="pop_tip">
		<div class="pop_inner">
			<div class="pop_cont"></div>
		</div>
	</div>
</body>
</html>