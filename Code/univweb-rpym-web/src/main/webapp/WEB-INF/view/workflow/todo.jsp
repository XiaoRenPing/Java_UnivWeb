<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<jsp:include page="/common/header.jsp"></jsp:include>
	<style type="text/css">
		td{
			width:100px;
			heigth:30px;
			border:1px solid #ff2233;
		}
	</style>
</head>
<body>
<div id="vue-userList">
	流程列表<br/>
	<a href="http://127.0.0.1:8081/workflow/startrestapply">启动请假流程</a><br/>
	<a href="http://127.0.0.1:8081/workflow/tasklist">查看我的待办</a><br/>
</div>
<script>
    Vue.use(VueResource);      //这个一定要加上，指的是调用vue-resource.js
    new Vue({
        el: '#vue-userList',      //div的id
        data: {
        	userList: ""    //数据，名称自定
        },
        created: function () { //created方法，页面初始调用   
        	var page = 1;
        	var rows = 1;
            var url = "http://127.0.0.1:8081/users/list?page="+page+"&rows="+rows;
            this.$http.get(url).then(function (data) {   //ajax请求封装
                var json = data.bodyText;
                var resultData = JSON.parse(json);
                //我的json数据参考下面
                this.userList = resultData["dataList"];
            }, function (response) {     //返回失败方法调用，暂不处理
                console.info(response);
            })
        }
    });
</script>
</body>
</html>