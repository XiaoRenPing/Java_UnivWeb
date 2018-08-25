<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="/common/addheader.jsp"></jsp:include>

<script src="${pageContext.request.contextPath }/style/js/jquery.js"></script>
<script src="${pageContext.request.contextPath }/style/js/vue.js"></script>
<script
	src="${pageContext.request.contextPath }/style/js/vue-resource.js"></script>
	<!-- 引入组件库 -->
	<script src="https://unpkg.com/element-ui/lib/index.js"></script>
</head>
<body class="gray-bg">
	<div class="wrapper wrapper-content animated fadeInRight">
		
		<!-- 流程预览 -->
		<div class="row">
            <div class="col-sm-12">
                <div class="ibox float-e-margins">
                    <div class="ibox-title">
                        <h5><spring:message code="workflow.main.lebal.title"/></h5>
                        <div class="ibox-tools">
                            <a class="collapse-link">
                                <i class="fa fa-chevron-up"></i>
                            </a>
                            <a class="dropdown-toggle" data-toggle="dropdown" href="tabs_panels.html#">
                                <i class="fa fa-wrench"></i>
                            </a>
                            <a class="close-link">
                                <i class="fa fa-times"></i>
                            </a>
                        </div>
                    </div>
                    <div class="ibox-content">
                        <p>审批流程：</p>
                        <ul>
                            <li>组长审批</li>
                            <li>经理审批</li>
                            <li>总经理审批</li>
                            <li>结束</li>
                        </ul>
                        <p>查看详情<a href="http://jqueryvalidation.org/" target="_blank">http://www.xiaorenping.com/</a>
                        </p>
                    </div>
                </div>
            </div>
        </div>
	
		<div class="row">
			 <div class="col-sm-12">
			 	<div class="ibox float-e-margins">
			 		 <div class="ibox-title">
                        <h5><spring:message code="workflow.form.filling.remind.title"/></h5>
                        <div class="ibox-tools">
                            <a class="collapse-link">
                                <i class="fa fa-chevron-up"></i>
                            </a>
                            <a class="dropdown-toggle" data-toggle="dropdown" href="tabs_panels.html#">
                                <i class="fa fa-wrench"></i>
                            </a>
                            <a class="close-link">
                                <i class="fa fa-times"></i>
                            </a>
                        </div>
                    </div>
                    <div class="ibox-content" id="app">
						<form class="form-horizontal m-t" id="commentForm" action="http://127.0.0.1:8081/univweb-rpym-web/leave/applyrest" method="POST">
						
				             <div class="form-group">
				                <label class="col-sm-2 control-label"><spring:message code="workflow.leave.title"/>:</label>
								<div class="col-sm-4">
									<input  name="name" v-model="title" minlength="2" type="text" class="form-control" >
								</div>	
				                <label class="col-sm-2 control-label"><spring:message code="workflow.leave.name"/>:</label>
								<div class="col-sm-4">
									<input type="text" v-model="name" class="form-control" name="name" >
								</div>	
				             </div>
				             
				             
				              <div class="form-group">
				                <label class="col-sm-2 control-label"><spring:message code="system.common.begintime"/>:</label>
								<div class="col-sm-4">
									<input name="beginTime" type="datetime" id="start" placeholder="<spring:message code="system.common.selecttime"/>"  class="laydate-icon form-control layer-date" textboxname="startTime" comboname="startTime">
								</div>	
				                <label class="col-sm-2 control-label"><spring:message code="system.common.endtime"/>:</label>
								<div class="col-sm-4">
									<input name="endTime" type="datetime" id="end" placeholder="<spring:message code="system.common.selecttime"/>"  class="laydate-icon form-control layer-date" textboxname="endTime" comboname="endTime">
								</div>	
				             </div>
				             
				             <div class="form-group">
				                 <label class="col-sm-3 control-label"><spring:message code="workflow.leave.description"/>:</label>
				                 <div class="col-sm-8">
				                     <textarea name="description" v-model="description" class="form-control" ></textarea>
				                 </div>
				             </div>
				             
				             <div class="form-group">
				                 <label class="col-sm-3 control-label"><spring:message code="workflow.leave.content"/>:</label>
				                 <div class="col-sm-8">
				                     <textarea name="content" v-model="content" class="form-control" ></textarea>
				                 </div>
				             </div>
				             
				             <div class="form-group">
				                 <label class="col-sm-3 control-label"><spring:message code="workflow.leave.remark"/>:</label>
				                 <div class="col-sm-8">
				                     <textarea name="remark" v-model="remark" class="form-control" ></textarea>
				                 </div>
				             </div>
				             
				             <!-- 审批人信息 -->
				             <spring:message code="workflow.leave.begintime"/>
				             <div class="hr-line-dashed"></div>
				             <div class="form-group">
				                 <label class="col-sm-3 control-label"><spring:message code="workflow.main.applyuser"/>:</label>
				                 <div class="col-sm-3">
				                     <input type="text" name="applyusername" v-model="applyusername" placeholder="" class="form-control">
				                 </div>
				                 
				                 <label class="col-sm-3 control-label"><spring:message code="workflow.main.handler"/>:</label>
				                 <div class="col-sm-3">
				                     <input type="text" name="receiveusername" v-model="receiveusername" placeholder="" class="form-control">
				                 </div>
				             </div>
				             
				             <div class="form-group">
				                 <div class="col-sm-4 col-sm-offset-3">
				                     <input class="btn btn-primary" v-on:click="check" type="submit"></input>
				                 </div>
				             </div>
				             
				             
				         </form>
				      </div>
				      
                </div>    
              </div>
              
              
              
		</div>
	</div>

	<jsp:include page="/common/addfooter.jsp"></jsp:include>
	<script type="text/javascript">
		new Vue(
				{
					el : '#app',
					data : {
						name : '',
						content : '',
						description : '',
						applyusername : '',
						receiveusername : ''
					},
					methods : {
						check : function(event) {
							//获取值
							var name = this.name;
							var content = this.content;
							var description = this.description;
							var applyusername = this.applyusername;
							var receiveusername = this.receiveusername;
							$.ajax({
										url : 'http://127.0.0.1:8081/univweb-rpym-web/leave/applyrest',
										type : 'POST',
										data : {
											name : name,
											content : content,
											description : description,
											applyusername : applyusername,
											receiveusername : receiveusername
										},
										success : function(data) {
											var result = data.status;
											if (result == '200'
													|| result == true) {
												location.href = "http://127.0.0.1:8081/univweb-rpym-web/workflow/myapply";
											} else {
												alert("添加失败");
											}
										},
										dataType : 'json',
									})
						}
					}
				})
	</script>
</body>
</html>