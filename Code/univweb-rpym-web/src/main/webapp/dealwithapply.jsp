<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" href="//unpkg.com/element-ui@1.3.6/lib/theme-default/index.css" rel="external nofollow" >

    <script src="${pageContext.request.contextPath }/style/js/jquery.js"></script>
    <script src="${pageContext.request.contextPath }/style/js/vue.js"></script>
    <script src="${pageContext.request.contextPath }/style/js/vue-resource.js"></script>
	<!-- 引入组件库 -->
	<script src="https://unpkg.com/element-ui/lib/index.js"></script>
</head>
<body>
<!-- <form action="" method="POST">
	请假名称：<input id="name" v-model="name"> <br/>
	请假事由：<input id="content" v-model="content"><br/>
	备注信息：<input id="description" v-model="description" type="text"><br/>
	申请人：<input id="applyusername" v-model="applyusername" type="text"><br/>
	审批人：<input id="applyusername" v-model="applyusername" type="text"><br/>
	<input type="submit" value="提交">
</form> -->
请假信息
<hr/>
<form action="http://127.0.0.1:8081/univweb-rpym-web/workflow/complete" method="POST">
<div class="login-box" id="app" >
	<div>
	 <el-row v-show="name">
	    <el-col :span="8">请假名称： {{name}}</el-col>
	    <input  name="name" v-model="name" value="name"/>
	 </el-row>
	 <el-row v-show="content">
	    <el-col :span="8">请假内容：{{content}} </el-col>
	    <input  name="content" v-model="content"/>
	 </el-row>
	 <el-row v-show="description">
	    <el-col :span="8">备注     {{description}}</el-col>
	    <input  name="description" v-model="description"/>
	 </el-row>
	 <el-row v-show="creationtime">
	    <el-col :span="8"> 申请日期：  {{creationtime}}</el-col>
	    <input  name="creationtime" v-model="creationtime"/>
	 </el-row>
	 <el-row v-show="applyusername">申请人： {{applyusername}}</el-row>
	 <input  name="applyusername" v-model="applyusername"/>
	 
	 <el-row v-show="receiveusername"> 当前审批人： {{receiveusername}}</el-row>
	 <input  name="receiveusername" v-model="receiveusername"/>
</div> </div>

<hr/>
审批操作
	<div id="vue-pathList">
		<table>
			<tr>
				<td>审批选项</td>
			</tr>
			<tr v-for="task in pathList">
				<td>{{task.name}}{{task.path}}</td>
			</tr>
			<tr>
			<input  name="taskId" value="2509"/><br/>
			<input name="path" value="">
				<td>审批意见：<textarea name="message"></textarea></td>
			</tr>
		</table>
	</div>
	<input type="submit" value="提交">
</form>
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
            var url = "http://127.0.0.1:8081/univweb-rpym-web/workflow/taskpath?taskId=2509";
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
            creationtime:''
        },
        created: function () { //created方法，页面初始调用   
            var url = "http://127.0.0.1:8081/univweb-rpym-web/workflow/taskform?taskId=2509";
        	this.$http.get(url).then(function (data) {   //ajax请求封装
        		var leaveobj = data.bodyText;
                this.leave = JSON.parse(leaveobj);
                var formdata =  JSON.parse(this.leave.context.formdata);
                this.name = formdata.dto.name;
                this.content = formdata.dto.content;
                this.description = formdata.dto.description;
                this.applyusername = formdata.dto.applyusername;
                this.receiveusername = formdata.dto.receiveusername;
            }, function (response) {     //返回失败方法调用，暂不处理
                console.info(response);
            })
        }
    });
  
</script>
</body>


</html>