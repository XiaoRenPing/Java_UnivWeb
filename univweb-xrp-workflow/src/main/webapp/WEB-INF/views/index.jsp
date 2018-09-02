<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
	<ul>
		<li><a href='#' title="不区分表单类型，可以显示设计器设计后部署的流程">综合流程</a>
			<ul>
				<li><a href="${pageContext.request.contextPath }/form/dynamic/process-list?processType=all">流程列表</a></li>
				<li><a href="${pageContext.request.contextPath }/form/dynamic/task/list?processType=all">任务列表(综合)</a></li>
				<li><a href="${pageContext.request.contextPath }/form/dynamic/process-instance/running/list?processType=all">运行中流程表(综合)</a></li>
				<li><a href="${pageContext.request.contextPath }/form/dynamic/process-instance/finished/list?processType=all">已结束流程(综合)</a></li>
			</ul></li>
		<li>
		<a href='#'>流程管理</a>
			<ul>
				<li><a href='${pageContext.request.contextPath }/workflow/process-list'>流程定义及部署管理</a></li>
				<li><a href='${pageContext.request.contextPath }/workflow/processinstance/running'>运行中流程</a></li>
				<li><a href='${pageContext.request.contextPath }/workflow/model/list'>模型工作区</a></li>
			</ul>
		</li>
	</ul>
</body>
</html>