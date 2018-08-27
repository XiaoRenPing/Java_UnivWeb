<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>univweb</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="{{keyword}}">
	<meta http-equiv="description" content="{{content}}">
	
	  <link rel="stylesheet" href="${pageContext.request.contextPath }/style/login-style/css/supersized.css">
	  <link rel="stylesheet" href="${pageContext.request.contextPath }/style/login-style/css/login.css">
	  <link rel="stylesheet" href="${pageContext.request.contextPath }/style/login-style/css/bootstrap.min.css" >

	<script type="text/javascript" src="${pageContext.request.contextPath }/style/login-style/js/jquery-1.8.2.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/style/login-style/js/tool.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/style/login-style/js/jquery.form.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/style/login-style/js/tooltips.js"></script>
	
	<script type="text/javascript" src="${pageContext.request.contextPath }/style/login-style/js/login.js"></script>
	
	<script src="${pageContext.request.contextPath }/style/login-style/js/supersized.3.2.7.min.js" ></script>
	<script src="${pageContext.request.contextPath }/style/login-style/js/supersized-init.js" ></script>
	<script src="${pageContext.request.contextPath }/style/login-style/js/scripts.js" ></script>
</head>

<body>

<div class="page-container">
	<div class="main_box">
		<div class="login_box">
			<div class="login_logo">
				<h2><spring:message code="system.login.title"/></h2>
			</div>
			<div class="login_form">
				<form action="${pageContext.request.contextPath }/users/login" id="login_form" method="post">
					<div class="form-group">
						<label for="j_username" class="t"><spring:message code="system.username"/>:</label> 
						<input id="email" value="" name="username" type="text" class="form-control x319 in" autocomplete="off">
					</div>
					<div class="form-group">
						<label for="j_password" class="t"><spring:message code="system.password"/>:</label> 
						<input id="password" value="" name="password" type="password" 
						class="password form-control x319 in">
					</div>
					<div class="form-group">
						<label for="j_captcha" class="t"><spring:message code="system.verifycode"/>:</label>
						 <input id="j_captcha" name="vcode" type="text" class="form-control x164 in">
						 <img id="captcha_img" alt="点击更换" title="点击更换" src="servlet/VerifyCodeServlet" class="m">
					</div>
					<div class="form-group">
						<label class="t"></label>
						<label for="j_remember" class="m">
						<input id="j_remember" type="checkbox" value="true">&nbsp;<spring:message code="system.rememberme"/>!</label>&nbsp;&nbsp;&nbsp;&nbsp;
						<label><a href="<%=basePath%>register.jsp"><spring:message code="system.toregister"/></a></label>
					</div>
					<div class="form-group space">
						<label class="t"></label>　　　
						<button type="button"  id="submit_btn" class="btn btn-primary btn-lg"><spring:message code="system.login"/> </button>
						<input type="reset" value="<spring:message code="system.reset"/>" class="btn btn-default btn-lg">
					</div>
				</form>
			</div>
		</div>
		<div class="bottom">{{copyright}}<a href="http://www.univweb.com">{{application}}</a></div>
	</div>
</div>
  </body>
</html>
