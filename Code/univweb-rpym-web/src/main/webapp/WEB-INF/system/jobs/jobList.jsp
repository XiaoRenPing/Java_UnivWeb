<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<jsp:include page="/common/head.jsp"></jsp:include>
</head>
	
<body class="fixed-sidebar full-height-layout gray-bg">
    <div class="row wrapper border-bottom white-bg page-heading">
                <div class="col-lg-10">
                    <h2>任务列表</h2>
                    <ol class="breadcrumb">
                        <li>
                            <a href="home/index">主页</a>
                        </li>
                        <li>
                            <a>任务管理</a>
                        </li>
                    </ol>
                </div>
                <div class="col-lg-2">

                </div>
            </div>
            
        <div class="gray-bg dashbard-1">
            <div class="wrapper wrapper-content animated fadeInRight">
                <div class="row">
                    <div class="col-lg-12 clearfix" >
                        <div class="ibox float-e-margins">
                        	<div class="operation-btn pull-left">
                        	<a href="javascript:void(0)" class="btn btn-primary" id="add_btn" >新增定时任务</a> 
                        	</div>
                            <div class="pull-right">
                                <div class="ibox-tools">
		                            <form role="form" class="form-inline" id="searchForm">
		                                <div class="form-group">
		                                    <label>定时任务名称：</label>
		                                    <input type="text" name="name" placeholder="请输入定时任务" class="form-control input-middle">
		                                </div>
		                                <a class="btn btn-primary"  role="button" id="searchBtn">查询</a>
		                                <a href="javascript:void(0)" class="btn btn-primary" id="refresh_btn">重置</a>
		                            </form>
                                </div>
                            </div>
                             <div class="ibox-content">
	                            <div id="vue-jobList">
									<table class="table table-striped table-bordered table-hover">
										<tr>
											<td><div class="checkbox-inline i-checks"><label><input type="checkbox" name="ids"><i></i></label></div></td>
											<td>定时任务名称</td>
											<td>执行类</td>
											<td>参数</td>
											<td>描述</td>
											<td>运行状态</td>
											<td>创建时间</td>
											<td>操作</td>
										</tr>
										<tr v-for="job in jobList">
											<td><input type="checkbox" name="ids"></td>
											<td><a v-bind:href="'http://127.0.0.1:8081/univweb-rpym-web/jobs/toview?id='+job.id">{{job.jobname}}</a></td>
											<td>{{job.jobclass}}</td>
											<td>{{job.jobargs}}</td>
											<td>{{job.jobdesc}}</td>
											<td>{{job.jobstatus}}</td>
											<td>{{job.creationtime}}</td>
											<td>
												<!-- 带查询参数，下面的结果为 /register?plan=private -->
												<a v-bind:href="'http://127.0.0.1:8081/univweb-rpym-web/jobs/toedit?id='+job.id">编辑</a>
												<a v-bind:href="'http://127.0.0.1:8081/univweb-rpym-web/jobs/delete?id='+job.id">禁用</a>
												<a v-bind:href="'http://127.0.0.1:8081/univweb-rpym-web/jobs/start?id='+job.id">启动</a>
												<a v-bind:href="'http://127.0.0.1:8081/univweb-rpym-web/jobs/stop?id='+job.id">停止</a>
											</td>
										</tr>
									</table>
								</div>
	                        </div>
                        </div>
                    </div>
                </div>
                
            </div>

        </div>  
	<jsp:include page="/common/footer.jsp"></jsp:include>
	<script>
    Vue.use(VueResource);      //这个一定要加上，指的是调用vue-resource.js
    new Vue({
        el: '#vue-jobList',      //div的id
        data: {
        	jobList: ""    //数据，名称自定
        },
        created: function () { //created方法，页面初始调用   
            var url = "http://127.0.0.1:8081/univweb-rpym-web/jobs/list"//?page="+page+"&rows="+rows;
            this.$http.get(url).then(function (data) {   //ajax请求封装
                var json = data.bodyText;
                var resultData = JSON.parse(json);
                //我的json数据参考下面
                this.jobList = resultData["list"];
            }, function (response) {     //返回失败方法调用，暂不处理
                console.info(response);
            })
        }
    });
</script>
<script type="text/javascript">
	$(function(){
		$("#add_btn").click(function(){
			 window.location.href="http://127.0.0.1:8081/univweb-rpym-web/jobs/toadd";
		});
	});
</script>
</body>
</html>