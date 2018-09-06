<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<jsp:include page="/common/head.jsp"></jsp:include>
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
			
				<div class="row">
					<div class="col-xs-12">
						<ul class="list-unstyled spaced">
							<li>
								<i class="icon-bell bigger-110 purple"></i>
								${job.name }
							</li>

							<li>
								<i class="icon-ok bigger-110 green"></i>
								${job.jobclass }
							</li>

							<li>
								<i class="icon-remove bigger-110 red"></i>
								${job.jobdesc }
							</li>
						</ul>

						<ul class="list-unstyled spaced2">
							<li>
								<i class="icon-circle green"></i>
								${job.jobargs }
							</li>

							<li class="text-warning bigger-110 orange">
								<i class="icon-warning-sign"></i>
								${job.jobstatus }
							</li>

							<li class="muted">
								<i class="icon-angle-right bigger-110"></i>
								${job.jobcron }
							</li>

							<li class="muted">
								<i class="icon-angle-right bigger-110"></i>
								${job.creationtime }
							</li>
						</ul>
					</div>
				</div>
				
<!-- content end -->			
			</div>
		</div>
</body>
</html>