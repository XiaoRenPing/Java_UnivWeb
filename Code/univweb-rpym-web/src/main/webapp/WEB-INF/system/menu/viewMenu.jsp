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
			<h1>定时任务详情</h1>
		</div>
<!-- head end -->
		<div class="row">
			<div class="col-xs-12">
<!-- content start -->			
			
				<div class="row">
					<div class="col-xs-12">
						
						<div class="form-group">
							<label class="icon-bell bigger-110 purple" >${menu.permissionname }</label>
							<div class="col-sm-5">
								功能名称
							</div>
						</div>
						<div class="form-group">
							<label class="icon-bell bigger-110 purple" >${menu.displayname }</label>
							<div class="col-sm-5">
								显示名称
							</div>
						</div>
						<div class="form-group">
							<label class="icon-bell bigger-110 purple" >${menu.menuurl }</label>
							<div class="col-sm-5">
								功能路径
							</div>
						</div>
						
						<div class="form-group">
							<label class="icon-bell bigger-110 purple" >${menu.menutype }</label>
							<div class="col-sm-5">
								菜单类型
							</div>
						</div>
						
						<div class="form-group">
							<label class="icon-bell bigger-110 purple" >${menu.remark }</label>
							<div class="col-sm-5">
								描述
							</div>
						</div>
						
						
						<%-- <div class="form-group">
							<label class="icon-bell bigger-110 purple" >${menu.isdeleted }</label>
							<div class="col-sm-5">
								状态
							</div>
						</div> --%>
						
						
						<div class="form-group">
							<label class="icon-bell bigger-110 purple" >${menu.jobcron }</label>
							<div class="col-sm-5">
								显示位置
							</div>
						</div>
						
						<div class="form-group">
							<label class="icon-bell bigger-110 purple" >${menu.creationtime }</label>
							<div class="col-sm-5">
								创建时间
							</div>
						</div>
					
					</div>
				</div>
				
<!-- content end -->			
			</div>
		</div>
</body>
</html>