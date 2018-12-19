<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<jsp:include page="/common/head.jsp"></jsp:include>
	
	<link rel="stylesheet" href="style/aceui/css/ace.min.css" />
	<link rel="stylesheet" href="style/aceui/css/ace-rtl.min.css" />
	<link rel="stylesheet" href="style/aceui/css/ace-skins.min.css" />
</head>
<body>
<!-- head start -->
	<div class="page-content">
		<div class="page-header">
			<h1>定时任务列表</h1>
		</div>
<!-- head end -->
		<div class="row">
			<div class="col-xs-12">
<!-- content start -->			
				<form class="form-horizontal" role="form" id="dataForm" action="http://127.0.0.1:8081/univweb-rpym-web/menus/edit" method="post">
						<input type="hidden" name="id" value="${menu.id }"/>
						<div class="form-group">
							<label class="col-sm-3 control-label no-padding-right" for="form-field-1">关键词</label>
							<div class="col-sm-9">
								<input type="text" id="form-field-1" class="col-xs-10 col-sm-5" name="permissionname" value="${menu.permissionname }"/>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-3 control-label no-padding-right" for="form-field-1">显示名称</label>
							<div class="col-sm-9">
								<input type="text" id="form-field-1" class="col-xs-10 col-sm-5" name="displayname" value="${menu.displayname }"/>
							</div>
						</div>
						<div class="form-group">	
							<label class="col-sm-3 control-label no-padding-right" for="form-field-1">接口路径</label>
							<div class="col-sm-9">
								<input type="text" id="form-field-1" class="col-xs-10 col-sm-5 form-control" name="menuurl" value="${menu.menuurl }"/>
							</div>
						</div>
			
						<div class="form-group">
							<label class="col-sm-3 control-label no-padding-right" for="form-field-1">上级菜单</label>
							<div class="col-sm-9">
								<input type="text" id="form-field-1" class="col-xs-10 col-sm-5" name="parentid" value="${menu.parentid }"/>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-3 control-label no-padding-right" for="form-field-1">图标</label>
							<div class="col-sm-9">
								<input type="text" id="form-field-1" class="col-xs-10 col-sm-5" name="menuicon" value="${menu.menuicon }"/>
							</div>
						</div>
			
						<div class="form-group">
							<label class="col-sm-3 control-label no-padding-right" for="form-field-1">菜单类型</label>
							<div class="col-sm-9">
								<input type="text" id="form-field-1" class="col-xs-10 col-sm-5" name="menutype" value="${menu.menutype }"/>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-3 control-label no-padding-right" for="form-field-1">备注</label>
							<div class="col-sm-9">
								<input type="text" id="form-field-1" class="col-xs-10 col-sm-5" name="remark" value="${menu.remark }"/>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-3 control-label no-padding-right" for="form-field-1">是否启用</label>
							<div class="col-sm-9">
								<label align="center">
									<input name="isdeleted" class="ace ace-switch ace-switch-2" type="checkbox" value=""/>
									<span class="lbl"></span>
								</label>
							</div>
						</div>
						<div class="clearfix form-actions">
							<div class="col-md-offset-3 col-md-9">
								<input id="submit_Btn" class="btn btn-info" type="submit" value="提交"/>
								&nbsp; &nbsp; &nbsp;
								<button class="btn" type="reset"><i class="icon-undo bigger-110"></i>重填</button>
							</div>
						</div>
<!-- content end -->			
			</div>
		</div>
	<script type="text/javascript">
		$(function(){
			$("#submit_Btn").click(function(){
				$("#dataForm").submit();
			});
		});
	</script>
</body>
</html>