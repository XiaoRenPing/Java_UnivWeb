<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<head>
	<%@ include file="/common/global.jsp"%>
	<title>动态Form流程列表</title>
<%-- 	<%@ include file="/common/meta.jsp" %>
    <%@ include file="/common/include-base-styles.jsp" %>
    <%@ include file="/common/include-jquery-ui-theme.jsp" %>
    <link href="${ctx }/js/common/plugins/jui/extends/timepicker/jquery-ui-timepicker-addon.css" type="text/css" rel="stylesheet" />
    <link href="${ctx }/js/common/plugins/qtip/jquery.qtip.min.css" type="text/css" rel="stylesheet" />--%>
    <%@ include file="/common/include-custom-styles.jsp" %> 

		<link href="${ctx }/style/aceui/css/bootstrap.min.css" rel="stylesheet" />
		<link rel="stylesheet" href="${ctx }/style/aceui/css/font-awesome.min.css" />
		
		<link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400,300" />
		
		<link rel="stylesheet" href="${ctx }/style/aceui/css/ace.min.css" />
		<link rel="stylesheet" href="${ctx }/style/aceui/css/ace-rtl.min.css" />
		<link rel="stylesheet" href="${ctx }/style/aceui/css/ace-skins.min.css" />
	
    <script src="${ctx }/js/common/jquery-1.8.3.js" type="text/javascript"></script>
    <script src="${ctx }/js/common/plugins/jui/jquery-ui-${themeVersion }.min.js" type="text/javascript"></script>
	<script src="${ctx }/js/common/plugins/jui/extends/i18n/jquery-ui-date_time-picker-zh-CN.js" type="text/javascript"></script>
	<script src="${ctx }/js/common/plugins/validate/jquery.validate.pack.js" type="text/javascript"></script>
	<script src="${ctx }/js/common/plugins/validate/messages_cn.js" type="text/javascript"></script>
	<script src="${ctx }/js/common/plugins/qtip/jquery.qtip.pack.js" type="text/javascript"></script>
	<script src="${ctx }/js/common/common.js" type="text/javascript"></script>
	
    <script type="text/javascript">
        // 利用动态表单的功能，做一个标示
        var processType = '${empty processType ? param.processType : processType}';
    </script>
	<script src="${ctx }/js/module/form/dynamic/dynamic-process-list.js" type="text/javascript"></script>
</head>

<body>
	<div class="page-content">
		<div class="page-header">
			<h1>
				已经部署的流程列表
			</h1>
		</div>
		
	<div class="row">
		<div class="col-xs-12">				
	
	
		<!-- 容器 -->	
		<div class="row">
		
	<c:if test="${not empty message}">
		<div id="message" class="alert alert-success">${message}</div>
		<!-- 自动隐藏提示信息 -->
		<script type="text/javascript">
		setTimeout(function() {
			$('#message').hide('slow');
		}, 5000);
		</script>
	</c:if>
 <!-- 表格内容 start -->
   <div class="col-xs-12">
			<div class="table-responsive">
				<table id="sample-table-1" class="table table-striped table-bordered table-hover">
					<thead>
						<tr>
							<!-- <th>ID</th> -->
							<th>名称</th>
							<th>键值</th>
							<th>部署ID</th>
							<th>版本号</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${page.result }" var="process">
							<tr>
								<%-- <td class='process-id'>${process.id }</td> --%>
								<td class='process-name'>${process.name }</td>
								<td>${process.key }</td>
								<td>${process.deploymentId }</td>
								<td>${process.version }</td>
								<td>
									<a class="startup-process btn btn-xs btn-success">启动</a>
									<a class="btn btn-xs btn-success" target="_blank" href='${ctx }/workflow/resource/read?processDefinitionId=${process.id}&resourceType=image'>流程图</a><!-- ${process.diagramResourceName } -->
									<a class="btn btn-xs btn-success" target="_blank" href='${ctx }/workflow/resource/read?processDefinitionId=${process.id}&resourceType=xml'>流程文件</a><!-- ${process.resourceName } -->
								</td>
							</tr>
						</c:forEach>
					</tbody>
			   </table>
		</div>
	</div>
	
 <!-- 表格内容 end -->
	<tags:pagination page="${page}" paginationSize="${page.pageSize}"/>
	</div></div></div></div>
</body>
</html>
