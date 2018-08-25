<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@	taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<jsp:include page="/common/addheader.jsp"></jsp:include>
	
	<link rel="stylesheet" href="//unpkg.com/element-ui@1.3.6/lib/theme-default/index.css" rel="external nofollow" >

    <script src="${pageContext.request.contextPath }/style/js/jquery.js"></script>
    <script src="${pageContext.request.contextPath }/style/js/vue.js"></script>
    <script src="${pageContext.request.contextPath }/style/js/vue-resource.js"></script>
	<!-- 引入组件库 -->
	<script src="https://unpkg.com/element-ui/lib/index.js"></script>
</head>
<body class="gray-bg">
	<div class="wrapper wrapper-content animated fadeInRight">
		
		<div class="row">
            <div class="col-sm-12">
                <div class="ibox float-e-margins">
                    <div class="ibox-title">
                        <h5>请假审批流程预览</h5>
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
                    	<form class="form-horizontal m-t" id="commentForm" action="http://127.0.0.1:8081/univweb-rpym-web/workflow/complete" method="POST">
							<input  name="taskId" type="hidden" v-model="taskId" value="${formData.taskId }"/><br/>
							
				             <div class="form-group">
				                <label class="col-sm-2 control-label"><spring:message code="workflow.leave.title"/>:</label>
								<div class="col-sm-4">
									{{title}}<input  name="name" v-model="title" minlength="2" type="hidden" class="form-control">
								</div>	
				                <label class="col-sm-2 control-label"><spring:message code="workflow.leave.name"/>:</label>
								<div class="col-sm-4">
									{{name}}<input type="hidden" v-model="name" class="form-control" name="name" >
								</div>	
				             </div>
				             
				             
				              <div class="form-group">
				                <label class="col-sm-2 control-label">起始日期：</label>
								<div class="col-sm-4">
									{{beginTime}}<input name="beginTime" type="hidden" id="start" v-model="beginTime"/>
								</div>	
				                <label class="col-sm-2 control-label">结束日期：</label>
								<div class="col-sm-4">
									{{endTime}}<input name="endTime" type="hidden" id="end" v-model="endTime"/>
								</div>	
				             </div>
				             
				             <div class="form-group">
				                 <label class="col-sm-3 control-label"><spring:message code="workflow.leave.description"/>:</label>
				                 <div class="col-sm-8">
				                     {{description}}<input name="description" v-model="description" class="form-control" type="hidden"/>
				                 </div>
				             </div>
				             
				             <div class="form-group">
				                 <label class="col-sm-3 control-label"><spring:message code="workflow.leave.content"/>:</label>
				                 <div class="col-sm-8">
				                     {{content}}<input name="content" v-model="content" class="form-control" type="hidden"/>
				                 </div>
				             </div>
				             
				             <div class="form-group">
				                 <label class="col-sm-3 control-label"><spring:message code="workflow.leave.remark"/>:</label>
				                 <div class="col-sm-8">
				                     {{remark}}<input name="remark" v-model="remark" class="form-control" type="hidden"/>
				                 </div>
				             </div>
				             
				             审批人信息
				             <spring:message code="workflow.leave.title"/>
				             <div class="hr-line-dashed"></div>
				             <div class="form-group">
				                 <label class="col-sm-3 control-label"><spring:message code="workflow.main.applyuser"/>:</label>
				                 <div class="col-sm-3">
				                     {{applyusername}}<input type="hidden" name="applyusername" v-model="applyusername" class="form-control">
				                 </div>
				             </div>
				             
				             审批操作:
				             <div class="hr-line-dashed"></div>
				             <div class="form-group">
				                 <label class="col-sm-3 control-label"></label>
				                 <div class="col-sm-3">
				                    <div id="vue-pathList">
										
				                 	</div>
				                 </div>
				             </div>
				             
				             <div class="form-group">
				                 <label class="col-sm-3 control-label"><spring:message code="workflow.main.applyuser"/>:</label>
				                 <div class="col-sm-3">
				                    <textarea name="comment" v-model="comment" class="form-control" ></textarea>
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
        {{applyusername}}
	 {{receiveusername}}
 	</div>
请假信息
<hr/>
 <div id="app">
	
 	 {{applyusername}}
	 {{receiveusername}}
	
	<table>
		<tr v-for="task in pathList">
			<td><{{task.name}}{{task.path}}</td>
		</tr>
		<tr>
	</table>
	</div>
<jsp:include page="/common/footer.jsp"></jsp:include>
<script type="text/javascript">
    //加载审批路径数据
    Vue.use(VueResource);      //这个一定要加上，指的是调用vue-resource.js
    new Vue({
        el: '#vue-pathList',      //div的id
        data: {
        	pathList: ""    //数据，名称自定
        },
        created: function () { //created方法，页面初始调用   
            var url = "http://127.0.0.1:8081/univweb-rpym-web/workflow/taskpath?taskId="+${taskId};
        	this.$http.get(url).then(function (data) {   //ajax请求封装
                var pathList = data.bodyText;
                this.pathList = JSON.parse(pathList);
            }, function (response) {     //返回失败方法调用，暂不处理
                console.info(response);
            })
        }
    });
    
    
    //
    new Vue({
        el : '#app',
        data : {
   		 	name : '',
            content : '',
            description:'',
            applyusername:'',
            receiveusername:'',
            creationtime:'',
            taskId:''
        },
        created: function () { //created方法，页面初始调用   
            var url = "http://127.0.0.1:8081/univweb-rpym-web/workflow/taskform?taskId="+${taskId};
        	this.$http.get(url).then(function (data) {   //ajax请求封装
        		var leaveobj = data.bodyText;
                this.leave = JSON.parse(leaveobj);
                var formdata =  JSON.parse(this.leave.context.formdata);
                this.name = formdata.dto.name;
                this.content = formdata.dto.content;
                this.description = formdata.dto.description;
                this.applyusername = formdata.dto.applyusername;
                this.receiveusername = formdata.dto.receiveusername;
                this.taskId = ${taskId};
            }, function (response) {     //返回失败方法调用，暂不处理
                console.info(response);
            })
        }
    });
  
    
</script>
<script type="text/javascript">
var formData = ${formData};
</script>
</body>


</html>