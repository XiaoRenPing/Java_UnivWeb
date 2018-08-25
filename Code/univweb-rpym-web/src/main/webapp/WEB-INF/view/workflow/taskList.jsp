<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<jsp:include page="/common/header.jsp"></jsp:include>
</head>
<body>
<div id="vue-taskList">
	<table class="table table-bordered table-striped">
		<tr>
			<td>ID值</td>
			<td>流程名称</td>
			<td>审批人</td>
			<td>申请日期</td>
			<td>申请人</td>
			<td>备注信息</td>
			<td>下一审批</td>
			<td>下一审批人</td>
			<td>操作</td>
		</tr>
		<tr v-for="task in taskList">
			<td>{{task.id}}</td>
			<td><a v-bind:href="'http://127.0.0.1:8081/univweb-rpym-web/workflow/detail?taskId='+task.id">{{task.name}}</a></td>
			<td>{{task.assignee}}</td>
			<td>{{task.createTime}}</td>
			<td>{{task.createUser}}</td>
			<td>{{task.comment}}</td>
			<td>{{task.nextNodeName}}</td>
			<td>{{task.nextAssignee}}</td>
			<td id="dealwith">
				<a v-bind:href="'http://127.0.0.1:8081/univweb-rpym-web/workflow/detail?taskId='+task.id">详情</a>
				<a v-bind:href="'http://127.0.0.1:8081/univweb-rpym-web/workflow/todealwith?taskId='+task.id">审批</a>
			</td>
		</tr>
	</table>
</div>
	<jsp:include page="/common/footer.jsp"></jsp:include>
<script>
    Vue.use(VueResource);      //这个一定要加上，指的是调用vue-resource.js
   var f1=  new Vue({
        el: '#vue-taskList',      //div的id
        data: {
        	taskList: ""    //数据，名称自定
        },
        created:function () { //created方法，页面初始调用   
        	var page = 1;
        	var rows = 1;
            var url = "http://127.0.0.1:8081/univweb-rpym-web/workflow/tasklist?page="+page+"&rows="+rows;
            this.$http.get(url).then(function (data) {   //ajax请求封装
                var json = data.bodyText;
                var resultData = JSON.parse(json);
                //我的json数据参考下面
                this.taskList = resultData["list"];
            }, function (response) {     //返回失败方法调用，暂不处理
                console.info(response);
            });
        }
    });
    
</script>

<script>
var f= new Vue({
    el: '#dealwith',      //div的id
    data: {
    	taskid: ""    //数据，名称自定
    },
    fuck:function (id) { //created方法，页面初始调用   
            var url = "http://127.0.0.1:8081/univweb-rpym-web/workflow/todealwith"+id;
            this.$http.get(url).then(function (data) {   //ajax请求封装
                var json = data.bodyText;
                var resultData = JSON.parse(json);
            }, function (response) {     //返回失败方法调用，暂不处理
                console.info(response);
            });
   }
});
</script>
</body>
</html>