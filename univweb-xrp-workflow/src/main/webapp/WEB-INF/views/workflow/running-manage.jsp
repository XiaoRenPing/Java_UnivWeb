<%@page import="com.xrp.univweb.utils.ProcessDefinitionCache,org.activiti.engine.RepositoryService"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<head>
	<%@ include file="/common/global.jsp"%>
	<title>管理运行中流程</title>
	<%-- <%@ include file="/common/meta.jsp" %>
    <%@ include file="/common/include-base-styles.jsp" %>
    <%@ include file="/common/include-jquery-ui-theme.jsp" %>
    <link href="${ctx }/js/common/plugins/jui/extends/timepicker/jquery-ui-timepicker-addon.css" type="text/css" rel="stylesheet" />
    <link href="${ctx }/js/common/plugins/qtip/jquery.qtip.min.css" type="text/css" rel="stylesheet" />
     --%>
     <%@ include file="/common/include-custom-styles.jsp" %>

		<link href="${ctx }/style/aceui/css/bootstrap.min.css" rel="stylesheet" />
		<link rel="stylesheet" href="${ctx }/style/aceui/css/font-awesome.min.css" />
		
		<link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400,300" />
		
		<link rel="stylesheet" href="${ctx }/style/aceui/css/ace.min.css" />
		<link rel="stylesheet" href="${ctx }/style/aceui/css/ace-rtl.min.css" />
		<link rel="stylesheet" href="${ctx }/style/aceui/css/ace-skins.min.css" />
		

    <script src="${ctx }/js/common/jquery-1.8.3.js" type="text/javascript"></script>
    <script src="${ctx }/js/common/plugins/jui/jquery-ui-${themeVersion }.min.js" type="text/javascript"></script>
    <script src="${ctx }/js/common/plugins/jui/extends/timepicker/jquery-ui-timepicker-addon.js" type="text/javascript"></script>
	<script src="${ctx }/js/common/plugins/jui/extends/i18n/jquery-ui-date_time-picker-zh-CN.js" type="text/javascript"></script>
	<script src="${ctx }/js/common/plugins/qtip/jquery.qtip.pack.js" type="text/javascript"></script>
	<script src="${ctx }/js/common/plugins/html/jquery.outerhtml.js" type="text/javascript"></script>
	<script src="${ctx }/js/module/activiti/workflow.js" type="text/javascript"></script>
	<script type="text/javascript">
	$(function() {
		// 跟踪
	    $('.trace').click(graphTrace);
	});
	</script>
</head>

<body>

	<div class="page-content">
		<div class="page-header">
			<h1>
				模型列表
			</h1>
		</div>
		
	<div class="row">
		<div class="col-xs-12">		
		
	<!-- 容器 -->		
	<div class="row">

	<%
	RepositoryService repositoryService = WebApplicationContextUtils.getWebApplicationContext(session.getServletContext()).getBean(org.activiti.engine.RepositoryService.class);
	ProcessDefinitionCache.setRepositoryService(repositoryService);
	%>
	<c:if test="${not empty message}">
	<div class="ui-widget">
			<div class="ui-state-highlight ui-corner-all" style="margin-top: 20px; padding: 0 .7em;"> 
				<p><span class="ui-icon ui-icon-info" style="float: left; margin-right: .3em;"></span>
				<strong>提示：</strong>${message}</p>
			</div>
		</div>
	</c:if>
	
 <!-- 表格内容 start -->
	   <div class="col-xs-12">
			<div class="table-responsive">
				<table id="sample-table-1" class="table table-striped table-bordered table-hover">
					<thead>
						<tr>
							<th>执行IDssss</th>
							<th>流程实例ID</th>
							<th>流程定义ID</th>
							<th>当前节点</th>
							<th>是否挂起</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${page.result }" var="p">
						<c:set var="pdid" value="${p.processDefinitionId }" />
						<c:set var="activityId" value="${p.activityId }" />
						<tr>
							<td>${p.id }</td>
							<td>${p.processInstanceId }</td>
							<td>${p.processDefinitionId }</td>
							<td><a class="trace" href='#' pid="${p.id }" pdid="${p.processDefinitionId}" title="点击查看流程图"><%=ProcessDefinitionCache.getActivityName(pageContext.getAttribute("pdid").toString(), ObjectUtils.toString(pageContext.getAttribute("activityId"))) %></a></td>
							<td>${p.suspended }</td>
							<td>
								<c:if test="${p.suspended }">
									<a href="update/active/${p.processInstanceId}">激活</a>
								</c:if>
								<c:if test="${!p.suspended }">
									<a href="update/suspend/${p.processInstanceId}">挂起</a>
								</c:if>
							</td>
						</tr>
						</c:forEach>
				</table>
			</div>
		</div>
	<!-- 表格内容 end -->
	<tags:pagination page="${page}" paginationSize="${page.pageSize}"/>
	<!-- 办理任务对话框 -->
	<div id="handleTemplate" class="template"></div>

</body>
</html>
