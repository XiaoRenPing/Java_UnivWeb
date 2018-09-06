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
			<h1>创建定时任务</h1>
		</div>
<!-- head end -->
		<div class="row">
			<div class="col-xs-12">
<!-- content start -->			
				<form class="form-horizontal" role="form" id="dataForm" action="http://127.0.0.1:8081/univweb-rpym-web/jobs/add" method="post">
						<div class="form-group">
							<label class="col-sm-3 control-label no-padding-right" for="form-field-1">任务名称</label>
							<div class="col-sm-9">
								<input type="text" id="form-field-1" class="col-xs-10 col-sm-5" name="jobname" value="${job.jobname }"/>
							</div>
						</div>
						<div class="form-group">	
							<label class="col-sm-3 control-label no-padding-right" for="form-field-1">执行类</label>
							<div class="col-sm-9">
								<input type="text" id="form-field-1" class="col-xs-10 col-sm-5 form-control" name="jobclass" value="${job.jobclass }"/>
							</div>
						</div>
			
						<div class="form-group">
							<label class="col-sm-3 control-label no-padding-right" for="form-field-1">描述</label>
							<div class="col-sm-9">
								<input type="text" id="form-field-1" class="col-xs-10 col-sm-5" name="jobdesc" value="${job.jobdesc }"/>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-3 control-label no-padding-right" for="form-field-1">参数</label>
							<div class="col-sm-9">
								<input type="text" id="form-field-1" class="col-xs-10 col-sm-5" name="jobargs" value="${job.jobargs }"/>
							</div>
						</div>
			
						<div class="form-group">
							<label class="col-sm-3 control-label no-padding-right" for="form-field-1">间隔表达式</label>
							<div class="col-sm-9">
								<input type="text" id="form-field-1" class="col-xs-10 col-sm-5" name="jobcron" value="${job.jobcron }"/>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-3 control-label no-padding-right" for="form-field-1">是否禁用</label>
							<div class="col-sm-9">
								<label align="center">
									<input name="isabandoned" class="ace ace-switch ace-switch-2" type="checkbox" value="${job.isabandoned }"/>
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
</body>
</html>