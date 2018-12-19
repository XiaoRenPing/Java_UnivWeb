<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" href="https://unpkg.com/element-ui@2.0.5/lib/theme-chalk/index.css">
	<script src="https://unpkg.com/vue/dist/vue.js"></script>
	<script src="http://cdn.bootcss.com/vue-resource/1.3.4/vue-resource.js"></script>
	<script src="https://unpkg.com/element-ui@2.0.5/lib/index.js"></script>
	
	<style>      
      #top {
	      background:#20A0FF;
	      padding:5px;
	      overflow:hidden
      }
	</style>
</head>
	
<body>
    <div id="test">		        

		<div id="top">			
				<el-button type="text" @click="search" style="color:white">查询</el-button>	
				<el-button type="text" @click="handleadd" style="color:white">添加</el-button>	
			</span>						
		</div>	
				
		<br/>
                </div>
            </div>
            
        <div class="gray-bg dashbard-1">
            <div class="wrapper wrapper-content animated fadeInRight">
                <div class="row">
                    <div class="col-lg-12 clearfix" >
                        <div class="ibox float-e-margins">
                        	<div class="operation-btn pull-left">
                        	<a v-on:click="toAdd" class="btn btn-primary" id="add_btn" >新增菜单</a> 
                        	</div>
                            <div class="pull-right">
                                <div class="ibox-tools">
		                            <form role="form" class="form-inline" id="searchForm">
		                                <div class="form-group">
		                                    <label>菜单名：</label>
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
										<tr v-for="menu in menuList">
											<td><input type="checkbox" name="ids"></td>
											<td><a v-bind:href="'${pageContext.request.contextPath}/menus/toview?id='+menu.id">{{menu.displayname}}</a></td>
											<td>{{menu.permissionname}}</td>
											<td>{{menu.menuurl}}</td>
											<td>{{menu.parents}}</td>
											<td>{{menu.menuorder}}</td>
											<td>{{menu.menuicon}}</td>
											<td>
												<button class="btn btn-sm btn-primary" type="button" v-on:click="toEdit(menu.id)">
							                        <span class="bold">编辑</span>
							                    </button>
							                    <button class="btn btn-sm btn-warning" type="button" v-on:click="del(menu.id)">
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

        <div style="margin-top:15px">	

		  <el-table
		    ref="testTable"		  
		    :data="tableData"
		    style="width:100%"
		    border
		    >
		    <el-table-column
		      prop="permissionname"
		      label="名称"
		      sortable
		      show-overflow-tooltip>
		    </el-table-column>
		    
		    <el-table-column
		      prop="displayname"
		      label="显示名称"
		      sortable>
		    </el-table-column>
		    
   		    <el-table-column
		      prop="menuurl"
		      label="路径"
		      sortable>
		    </el-table-column>
		    
   		    <el-table-column
		      prop="menuorder"
		      label="排序"
		      sortable>
		    </el-table-column>
		    
		    <el-table-column
		      prop="menuicon"
		      label="菜单图标"
		      sortable>
		    </el-table-column>
		    
		    <el-table-column
		      prop="menutype"
		      label="菜单类型"
		      sortable>
		    </el-table-column>
		    
		    <el-table-column
		      prop="remark"
		      label="描述"
		      sortable>
		    </el-table-column>
		    
	        <el-table-column label="操作" width="300">
		      <template scope="scope">
		      	<el-button
		          size="small"
		          type="warning"
		          @click="handlePause(scope.$index, scope.row)">暂停</el-button>
		          
		        <el-button
		          size="small"
		          type="info"
		          @click="handleResume(scope.$index, scope.row)">恢复</el-button>
		          
		        <el-button
		          size="small"
		          type="danger"
		          @click="handleDelete(scope.$index, scope.row)">删除</el-button>
		          
		        <el-button
		          size="small"
		          type="success"
		          @click="handleUpdate(scope.$index, scope.row)">修改</el-button>
		      </template>
		    </el-table-column>
		  </el-table>
		  
		  <div align="center">
			  <el-pagination
			      @size-change="handleSizeChange"
			      @current-change="handleCurrentChange"
			      :current-page="pageNum"
			      :page-sizes="[10, 20, 30, 40]"
			      :page-size="pageSize"
			      layout="total, sizes, prev, pager, next, jumper"
			      :total="totalCount">
			  </el-pagination>
		  </div>
		</div> 
		
		<el-dialog title="添加菜单" :visible.sync="dialogFormVisible">
		  <el-form :model="form">
		    <el-form-item label="菜单名称" label-width="120px" style="width:35%">
		      <el-input v-model="form.permissionname" auto-complete="off"></el-input>
		    </el-form-item>	    
		  </el-form>
		  <div slot="footer" class="dialog-footer">
		    <el-button @click="dialogFormVisible = false">取 消</el-button>
		    <el-button type="primary" @click="add">确 定</el-button>
		  </div>
		</el-dialog>
		
		<el-dialog title="修改菜单" :visible.sync="updateFormVisible">
		  <el-form :model="updateform">
		    <el-form-item label="表达式" label-width="120px" style="width:35%">
		      <el-input v-model="updateform.permissionname" auto-complete="off"></el-input>
		    </el-form-item>
		  </el-form>
		  <div slot="footer" class="dialog-footer">
		    <el-button @click="updateFormVisible = false">取 消</el-button>
		    <el-button type="primary" @click="update">确 定</el-button>
		  </div>
		</el-dialog>
		
    </div>
	
    <footer align="center">
        <p>&copy;菜单管理</p>
    </footer>

	<script>
	var vue = new Vue({			
			el:"#test",
		    data: {		  
		    	//表格当前页数据
		    	tableData: [],
		        
		        //请求的URL
		        url:'http://localhost:8081/univweb-rpym-web/menus/list',
		        
		        //默认每页数据量
		        pageSize: 10,		        
		        
		        //当前页码
		        pageNum: 1,
		        
		        //查询的页码
		        startPage: 1,
		        
		        //默认数据总数
		        totalCount: 1000,
		        
		        //添加对话框默认可见性
		        dialogFormVisible: false,
		        
		        //修改对话框默认可见性
		        updateFormVisible: false,
		        
		        //提交的表单
		        form: {
		        	permissionname: '',
		        	displayname: '',
		        	remark: '',
		          },
		          
		        updateform: {
		        	permissionname: '',
		        	displayname: '',
		        	remark: '',
		        },
		    },

		    methods: {
		        //从服务器读取数据
				loadData: function(pageNum, pageSize){					
					this.$http.get('http://localhost:8081/univweb-rpym-web/menus/list?' + 'pageNum=' +  pageNum + '&pageSize=' + pageSize).then(function(res){
						console.log(res)
                		this.tableData = res.body.list;
                		this.totalCount = res.body.pageSize;
                	},function(){
                  		console.log('failed');
                	});					
				},			    		        
				      
		        //单行删除
			    handleDelete: function(index, row) {
					this.$http.post('http://localhost:8081/univweb-rpym-web/menus/deletejob',{"jobClassName":row.job_NAME,"jobGroupName":row.job_GROUP},{emulateJSON: true}).then(function(res){
						this.loadData( this.currentPage, this.pagesize);
		            },function(){
		                console.log('failed');
		            });
		        },
		        
		        //暂停菜单
		        handlePause: function(index, row){
		        	this.$http.post('http://localhost:8081/univweb-rpym-web/menus/pausejob',{"jobClassName":row.job_NAME,"jobGroupName":row.job_GROUP},{emulateJSON: true}).then(function(res){
						this.loadData( this.currentPage, this.pagesize);
		            },function(){
		                console.log('failed');
		            });
		        },
		        
		        //恢复菜单
		        handleResume: function(index, row){
		        	this.$http.post('http://localhost:8081/univweb-rpym-web/menus/resumejob',{"jobClassName":row.job_NAME,"jobGroupName":row.job_GROUP},{emulateJSON: true}).then(function(res){
						this.loadData( this.currentPage, this.pagesize);
		            },function(){
		                console.log('failed');
		            });
		        },
		        
		        //搜索
		        search: function(){
		        	this.loadData(this.currentPage, this.pagesize);
		        },
		        
		        //弹出对话框
		        handleadd: function(){		                
		            this.dialogFormVisible = true;	              
		        },
		        
		        //添加
		        add: function(){
		        	this.$http.post('http://localhost:8081/univweb-rpym-web/menus/addjob',{"jobClassName":this.form.jobName,"jobGroupName":this.form.jobGroup,"cronExpression":this.form.cronExpression},{emulateJSON: true}).then(function(res){
        				this.loadData(this.currentPage, this.pagesize);
        				this.dialogFormVisible = false;
                    },function(){
                        console.log('failed');
                    });
		        },
		        
		        //更新
		        handleUpdate: function(index, row){
		        	console.log(row)
		        	this.updateFormVisible = true;
		        	this.updateform.jobName = row.job_CLASS_NAME;
		        	this.updateform.jobGroup = row.job_GROUP;
		        },
		        
		        //更新菜单
		        update: function(){
		        	this.$http.post
		        	('menus/reschedulejob',
		        			{"jobClassName":this.updateform.jobName,
		        			 "jobGroupName":this.updateform.jobGroup,
		        			 "cronExpression":this.updateform.cronExpression
		        			 },{emulateJSON: true}
		        	).then(function(res){
		        		this.loadData(this.currentPage, this.pagesize);
        				this.updateFormVisible = false;
		        	},function(){
                        console.log('failed');
                    });
		    
		        },
		      
		        //每页显示数据量变更
		        handleSizeChange: function(val) {
		            this.pagesize = val;
		            this.loadData(this.currentPage, this.pagesize);
		        },
		        
		        //页码变更
		        handleCurrentChange: function(val) {
		            this.currentPage = val;
		            this.loadData(this.currentPage, this.pagesize);
		        },	      
		        		        
		    },	    
		    
		    
		  });
	
		  //载入数据
    	  vue.loadData(vue.currentPage, vue.pagesize);
	</script>  
	
    Vue.use(VueResource);      //这个一定要加上，指的是调用vue-resource.js
	    new Vue({
	        el: '#vue-menuList',      //div的id
	        data: {
	        	menuList: ""    //数据，名称自定
	        },
	        created: function () { //created方法，页面初始调用   
	            var url = "${pageContext.request.contextPath}/menus/list"//?page="+page+"&rows="+rows;
	            this.$http.get(url).then(function (data) {   //ajax请求封装
	                var json = data.bodyText;
	                var resultData = JSON.parse(json);
	                //我的json数据参考下面
	                this.menuList = resultData["list"];
	            }, function (response) {     //返回失败方法调用，暂不处理
	                console.info(response);
	            })
	        },
	        //定义操作方法
	        methods:{
		        toEdit: function(id){
		        	location.href="${pageContext.request.contextPath}/menus/toedit?id="+id;
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
		        	    			"${pageContext.request.contextPath}/menus/delete",
		        	    			{id:id},
		        	    			function(msg){
		        	    				swal("删除成功！", "【"+msg.message+"】", "success");
		        	    				location.href="${pageContext.request.contextPath}/menus/index";
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
			location.href="${pageContext.request.contextPath}/menus/toadd";
		});
	</script>
</body>
</html>