<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<%@ include file="/common/global.jsp"%>
	<%-- <%@ include file="/common/meta.jsp" %>
	<%@ include file="/common/include-base-styles.jsp" %>
	<%@ include file="/common/include-jquery-ui-theme.jsp" %>
	<%@ include file="/common/include-custom-styles.jsp" %> --%>
	
		<link href="${ctx }/style/aceui/css/bootstrap.min.css" rel="stylesheet" />
		<link rel="stylesheet" href="${ctx }/style/aceui/css/font-awesome.min.css" />
		
		<link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400,300" />
		
		<link rel="stylesheet" href="${ctx }/style/aceui/css/ace.min.css" />
		<link rel="stylesheet" href="${ctx }/style/aceui/css/ace-rtl.min.css" />
		<link rel="stylesheet" href="${ctx }/style/aceui/css/ace-skins.min.css" />
	
		<script src="${ctx }/style/aceui/js/ace-extra.min.js"></script>
	<title>流程列表</title>

	<script src="${ctx }/js/common/jquery-1.8.3.js" type="text/javascript"></script>
    <script src="${ctx }/js/common/plugins/jui/jquery-ui-${themeVersion }.min.js" type="text/javascript"></script>
    <script type="text/javascript">
    $(function() {
    	$('#create').button({
    		icons: {
    			primary: 'ui-icon-plus'
    		}
    	}).click(function() {
    		$('#createModelTemplate').dialog({
    			modal: true,
    			width: 500,
    			buttons: [{
    				text: '创建',
    				click: function() {
    					if (!$('#name').val()) {
    						alert('请填写名称！');
    						$('#name').focus();
    						return;
    					}
                        setTimeout(function() {
                            location.reload();
                        }, 1000);
    					$('#modelForm').submit();
    				}
    			}]
    		});
    	});
    });
    </script>
</head>
<body>
	<div class="page-content">
		<div class="page-header">
			<h1>
				Tables
				<small>
					<i class="icon-double-angle-right"></i>
					Static &amp; Dynamic Tables
				</small>
			</h1>
		</div>
		
	<div class="row">
		<div class="col-xs-12">				
	
	
<!-- 容器 -->	
<div class="row">
							<c:if test="${not empty message}">
							<div class="ui-widget">
									<div class="ui-state-highlight ui-corner-all" style="margin-top: 20px; padding: 0 .7em;"> 
										<p><span class="ui-icon ui-icon-info" style="float: left; margin-right: .3em;"></span>
										<strong>提示：</strong>${message}</p>
									</div>
								</div>
							</c:if>
							<div style="text-align: right"><button id="create">创建</button></div>
				<div class="col-xs-12">
							<div class="table-responsive">
								<table id="sample-table-1" class="table table-striped table-bordered table-hover">
								<thead>
									<tr>
										<th class="center">
											<label>
												<input type="checkbox" class="ace" />
												<span class="lbl"></span>
											</label>
										</th>
										<th>ID</th>
										<th>KEY</th>
										<th>Name</th>
										<th>Version</th>
										<th>创建时间</th>
										<th>最后更新时间</th>
										<th>元数据</th>
										<th>操作</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${list }" var="model">
										<tr>
											<td class="center">
												<label>
													<input type="checkbox" class="ace" />
													<span class="lbl"></span>
												</label>
											</td>
											<td>${model.id }</td>
											<td>${model.key }</td>
											<td>${model.name}</td>
											<td>${model.version}</td>
											<td>${model.createTime}</td>
											<td>${model.lastUpdateTime}</td>
											<td>${model.metaInfo}</td>
											<td>
												<a class="btn btn-xs btn-success" href="${ctx}/service/editor?id=${model.id}" target="_blank">编辑</a>
												<a class="btn btn-xs btn-success" href="${ctx}/workflow/model/deploy/${model.id}">部署</a>
												<a class="btn btn-xs btn-success" href="${ctx}/workflow/model/export/${model.id}" target="_blank">导出</a>
						                        <a class="btn btn-xs btn-success" href="${ctx}/workflow/model/delete/${model.id}">删除</a>
											</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
							</div>
					</div>
							
							
							<div id="createModelTemplate" title="创建模型" class="template" style="display:none;">
						        <form id="modelForm" action="${ctx}/workflow/model/create" target="_blank" method="post">
								<table>
									<tr>
										<td>名称：</td>
										<td>
											<input id="name" name="name" type="text" />
										</td>
									</tr>
									<tr>
										<td>KEY：</td>
										<td>
											<input id="key" name="key" type="text" />
										</td>
									</tr>
									<tr>
										<td>描述：</td>
										<td>
											<textarea id="description" name="description" style="width:300px;height: 50px;"></textarea>
										</td>
									</tr>
								</table>
						        </form>
							</div>
	
	
		</div>
	</div>
	
</body>
</html>