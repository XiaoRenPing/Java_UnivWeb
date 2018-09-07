<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<jsp:include page="/common/head.jsp"></jsp:include>
</head>
	
<body class="fixed-sidebar full-height-layout gray-bg">
    <div class="row wrapper border-bottom white-bg page-heading">
                <div class="col-lg-10">
                    <h2>配置列表</h2>
                    <ol class="breadcrumb">
                        <li>
                            <a href="home/index">主页</a>
                        </li>
                        <li>
                            <a>配置管理</a>
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
                        	<a href="javascript:void(0)" class="btn btn-primary" id="add_btn" >新增配置</a> 
                        	</div>
                            <div class="pull-right">
                                <div class="ibox-tools">
		                            <form role="form" class="form-inline" id="searchForm">
		                                <div class="form-group">
		                                    <label>配置名称：</label>
		                                    <input type="text" name="displayname" placeholder="请输入菜单" class="form-control input-middle">
		                                </div>
		                                <a class="btn btn-primary"  role="button" id="searchBtn">查询</a>
		                                <a href="javascript:void(0)" class="btn btn-primary" id="refresh_btn">重置</a>
		                            </form>
                                </div>
                            </div>
                             <div class="ibox-content">
	                            <div id="vue-menuList">
									<table class="table table-striped table-bordered table-hover">
										<tr>
											<td><input type="checkbox" name="ids">全选</td>
											<td>名称</td>
											<td>对应授权</td>
											<td>链接</td>
											<td>上级菜单</td>
											<td>菜单排序</td>
											<td>菜单图标</td>
											<td>操作</td>
										</tr>
										<tr v-for="group in groupList">
											<td><input type="checkbox" name="ids"></td>
											<td>{{group.displayname}}</td>
											<td>{{group.permissionname}}</td>
											<td>{{group.menuurl}}</td>
											<td>{{group.parents}}</td>
											<td>{{group.menuorder}}</td>
											<td>{{group.menuicon}}</td>
											<td>
												<button class="btn btn-sm btn-primary" type="button" v-on:click="toEdit(group.id)">
							                        <span class="bold">编辑</span>
							                    </button>
							                    <button class="btn btn-sm btn-warning" type="button" v-on:click="del(group.id)">
							                        <span class="bold">删除</span>
							                    </button>
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
        el: '#vue-groupList',      //div的id
        data: {
        	menuList: ""    //数据，名称自定
        },
        created: function () { //created方法，页面初始调用   
            var url = "${pageContext.request.contextPath}/groups/list"//?page="+page+"&rows="+rows;
            this.$http.get(url).then(function (data) {   //ajax请求封装
                var json = data.bodyText;
                var resultData = JSON.parse(json);
                //我的json数据参考下面
                this.groupList = resultData["list"];
            }, function (response) {     //返回失败方法调用，暂不处理
                console.info(response);
            })
        }
      //定义操作方法
        methods:{
	        toEdit: function(id){
	        	location.href="${pageContext.request.contextPath}/groups/toedit?id="+id;
	        },
	        del: function(id){
	        	swal({
	                title: "您确定要删除吗",
	                text: "删除后将无法恢复，请谨慎操作！",
	                type: "warning",
	                showCancelButton: true,
	                confirmButtonColor: "#DD6B55",
	                confirmButtonText: "删除",
	                cancelButtonText: "考虑一下",
	                closeOnConfirm: false,
	                closeOnCancel: false
	            },
	            function (isConfirm) {
	                if (isConfirm) {
	                	$.get(
	        	    			"${pageContext.request.contextPath}/groups/delete",
	        	    			{id:id},
	        	    			function(msg){
	        	    				swal("删除成功！", "【"+msg.message+"】", "success");
	        	    				location.href="${pageContext.request.contextPath}/groups/index";
	        	    	});
	                } else {
	                    swal("已取消", "您取消了删除操作！", "error");
	                }
	            });
	        }
        }
    });
</script>
	<script type="text/javascript">
		$("#add_btn").click(function(){
			location.href="${pageContext.request.contextPath}/groups/toadd";
		});
	</script>
</body>
</html>