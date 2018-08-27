<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>univweb-用户登录</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
	body {
		font-size: 10pt;
		color: #404040;
		font-family: SimSun;
	}
	
	.divBody {
		margin-left: 15%;
	}
	
	.divTitle {
		text-align:left;
		width: 900px;
		height: 25px;
		line-height: 25px;
		background-color: #efeae5;
		border: 5px solid #efeae5;
	}
	.divContent {
		width: 900px;
		height: 230px;
		border: 5px solid #efeae5;
		margin-right:20px; 
		margin-bottom:20px;
	}
	.spanTitle {
		margin-top: 10px;
		margin-left:10px;
		height:25px;
		font-weight: 900;
	}
a {text-decoration: none;}
a:visited {color: #018BD3;}
a:hover {color:#FF6600; text-decoration: underline;}
}
</style>
<script src="style/js/jquery-2.1.1.min.js"></script>
<script type="text/javascript">
	var num = 3;
	var interval = setInterval(function() {
		if (num == 0) {
			clearInterval(interval);
			location = "${pageContext.request.contextPath}/login.jsp";
		}
		numDiv.innerHTML = num--;
	}, 1000);
</script>
</head>

<body>
	<div class="divBody">
	<div class="divTitle">
		<span class="spanTitle">${title }</span>
	</div>
	<div class="divContent">
	  <div style="margin: 20px; font-size: 35px;" >
		<img style="float: left; margin-right: 30px;" src="${pageContext.request.contextPath}/images/duihao.jpg" width="150"/>
		<c:if test="${msg == null}">
			<span style="margin-left: 50px;">操作完成！</span><br/>
		</c:if>
		
		<c:if test="${msg != null}">
			<span style="font-size: 50px; color: #c30; font-weight: 900;">${msg }</span>
		</c:if>
		<span style="margin-left: 50px; color:#ff0000;" id='numDiv'>3</span>秒钟后跳转到登录界面！
	  </div>
	</div>
</div>
</body>
</html>
