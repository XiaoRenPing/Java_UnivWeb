<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" href="//unpkg.com/element-ui@1.3.6/lib/theme-default/index.css" rel="external nofollow" >

    <script src="${pageContext.request.contextPath }/style/js/jquery.js"></script>
    <script src="${pageContext.request.contextPath }/style/js/vue.js"></script>
    <script src="${pageContext.request.contextPath }/style/js/vue-resource.js"></script>
	<!-- 引入组件库 -->
	<script src="https://unpkg.com/element-ui/lib/index.js"></script>
</head>
<body>
审批信息
<hr/>
<form action="http://127.0.0.1:8081/univweb-rpym-web/leave/applyrest" method="POST">
请假事项：<input type="text" name="name"/><br/>
请假原由：<input type="text" name="content"/><br/>
请假备注：<input type="text" name="description"/><br/>
请假申请人：<input type="text" name="applyusername"/><br/>
审批人：<input type="text" name="receiveusername"/><br/>
<input type="submit" value="提交申请"/>
</form>
<script type="text/javascript">
    
</script>
</body>
</html>