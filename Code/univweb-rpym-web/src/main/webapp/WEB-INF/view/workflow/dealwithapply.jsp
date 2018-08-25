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
		<form action="http://127.0.0.1:8081/univweb-rpym-web/workflow/complete" method="POST">
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
			             <div class="form-group">
			                 <label class="col-sm-2 control-label"><spring:message code="workflow.leave.name"/>:</label>
							<div class="col-sm-4">
								{{name}}
							</div>
			                <label class="col-sm-2 control-label"><spring:message code="workflow.leave.description"/>:</label>
							<div class="col-sm-4">
								{{description}}
							</div>	
			             </div>
			             
			             <div class="form-group">
			                <label class="col-sm-2 control-label"><spring:message code="system.common.creationtime"/>:</label>
							<div class="col-sm-4">
								{{creationtime}}
							</div>	
							<label class="col-sm-2 control-label"><spring:message code="workflow.leave.applyer"/>:</label>
							<div class="col-sm-4">
								{{applyusername}}
							</div>	
			             </div>
			             
			             <div class="form-group">
			             <label class="col-sm-2 control-label"><spring:message code="workflow.leave.content"/>:</label>
							<div class="col-sm-4">
								{{content}}
							</div>
						</div>
                </div>
                <!-- 审批 -->
                 <div class="hr-line-dashed"></div>
                <div class="ibox-content">
                	<spring:message code="workflow.main.flowinfo.lebal"/>
					     <table id="vue-pathList">
							<tr v-for="path in pathList">
								<td>{{path.name}}{{path.path}}</td>
							</tr>
							<tr>
						</table>  
	                 <div class="form-group">
		                 <div class="col-sm-4 col-sm-offset-3">
		                     <button class="btn btn-primary" v-on:click="check" type="submit">提交</button>
		                 </div>
		             </div>
                </div>
            </div>
        </div>
        
        
        </form>
        
        
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