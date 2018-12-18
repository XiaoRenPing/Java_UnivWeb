<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" href="${pageContext.request.contextPath }/style/vuejs/elementui.css">
	<script src="${pageContext.request.contextPath }/style/vuejs/vue.js"></script>
	<script src="${pageContext.request.contextPath }/style/vuejs/vue-resource.js"></script>
	<script src="${pageContext.request.contextPath }/style/vuejs/elementui.js"></script>
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

        <div style="margin-top:15px">	

		  <el-table
		    ref="testTable"		  
		    :data="tableData"
		    style="width:100%"
		    border
		    >
		    <el-table-column
		      prop="name"
		      label="姓名"
		      sortable
		      show-overflow-tooltip>
		    </el-table-column>
		    
		    <el-table-column
		      prop="username"
		      label="用户名"
		      sortable>
		    </el-table-column>
		    
   		    <el-table-column
		      prop="emailaddress"
		      label="邮箱"
		      sortable>
		    </el-table-column>
		    
   		    <el-table-column
		      prop="phonenumber"
		      label="手机号码"
		      sortable>
		    </el-table-column>
		    
		    <el-table-column
		      prop="idcardnumber"
		      label="身份证"
		      sortable>
		    </el-table-column>
		    
		    <el-table-column
		      prop="isactivetext"
		      label="状态"
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
			      :current-page="currentPage"
			      :page-sizes="[10, 20, 30, 40]"
			      :page-size="pagesize"
			      layout="total, sizes, prev, pager, next, jumper"
			      :total="totalCount">
			  </el-pagination>
		  </div>
		</div> 
		
		<el-dialog title="添加用户" :visible.sync="dialogFormVisible">
		  <el-form :model="form">
		    <el-form-item label="姓名" label-width="120px" style="width:35%">
		      <el-input v-model="form.name" auto-complete="off"></el-input>
		    </el-form-item>	    
		    <el-form-item label="用户名" label-width="120px" style="width:35%">
		      <el-input v-model="form.username" auto-complete="off"></el-input>
		    </el-form-item>
		    <el-form-item label="邮箱" label-width="120px" style="width:35%">
		      <el-input v-model="form.emailaddress" auto-complete="off"></el-input>
		    </el-form-item>
		    <el-form-item label="手机号" label-width="120px" style="width:35%">
		      <el-input v-model="form.phonenumber" auto-complete="off"></el-input>
		    </el-form-item>
		    <el-form-item label="身份证" label-width="120px" style="width:35%">
		      <el-input v-model="form.idcardnumber" auto-complete="off"></el-input>
		    </el-form-item>
		  </el-form>
		  <div slot="footer" class="dialog-footer">
		    <el-button @click="dialogFormVisible = false">取 消</el-button>
		    <el-button type="primary" @click="add">确 定</el-button>
		  </div>
		</el-dialog>
		
		<el-dialog title="修改用户" :visible.sync="updateFormVisible">
		  <el-form :model="updateform">
		    <el-form-item label="用户名" label-width="120px" style="width:35%">
		      <el-input v-model="updateform.username" auto-complete="off"></el-input>
		    </el-form-item>
		    <el-form-item label="邮箱" label-width="120px" style="width:35%">
		      <el-input v-model="updateform.emailaddress" auto-complete="off"></el-input>
		    </el-form-item>
		    <el-form-item label="手机号码" label-width="120px" style="width:35%">
		      <el-input v-model="updateform.phonenumber" auto-complete="off"></el-input>
		    </el-form-item>
		  </el-form>
		  <div slot="footer" class="dialog-footer">
		    <el-button @click="updateFormVisible = false">取 消</el-button>
		    <el-button type="primary" @click="update">确 定</el-button>
		  </div>
		</el-dialog>
		
    </div>
	
    <footer align="center">
        <p>&copy; Quartz 用户管理管理</p>
    </footer>

	<script>
	var vue = new Vue({			
			el:"#test",
		    data: {		  
		    	//表格当前页数据
		    	tableData: [],
		        
		        //请求的URL
		        url:'users/list',
		        
		        //默认每页数据量
		        pagesize: 10,		        
		        
		        //当前页码
		        currentPage: 1,
		        
		        //查询的页码
		        start: 1,
		        
		        //默认数据总数
		        totalCount: 1000,
		        
		        //添加对话框默认可见性
		        dialogFormVisible: false,
		        
		        //修改对话框默认可见性
		        updateFormVisible: false,
		        
		        //提交的表单
		        form: {
		        	name: '',
		        	username: '',
		        	emailaddress: '',
		        	phonenumber: '',
		        	idcardnumber: ''
		          },
		          
		        updateform: {
		        	username: '',
		        	emailaddress: '',
		        	phonenumber: ''
		        },
		    },

		    methods: {
		    	
		        //从服务器读取数据
				loadData: function(pageNum, pageSize){					
					 this.$http.get('users/list?' + 'pageNum=' +  pageNum + '&pageSize=' + pageSize).then(function(res){
						console.log(res)
                		this.tableData = res.body.data.list;
                		this.totalCount = res.body.total;
                	},function(){
                  		console.log('failed');
                	});		
					/* this.$http.post(
							'http://127.0.0.1:8081/univweb-rpym-web/users/list',
							'pageNum':1,
							'pageSize':10,
							'username':'',
							'name':'',
							{emulateJSON:true}
							).then(function(res){
						console.log(res)
                		this.tableData = res.body.data.list;
                		this.totalCount = res.body.total;
                	},function(){
                  		console.log('failed');
                	}); */
				},			    		        
				      
		        //单行删除
			    handleDelete: function(index, row) {
					this.$http.post('job/deletejob',{"jobClassName":row.job_NAME,"jobGroupName":row.job_GROUP},{emulateJSON: true}).then(function(res){
						this.loadData( this.currentPage, this.pagesize);
		            },function(){
		                console.log('failed');
		            });
		        },
		        
		        //暂停用户管理
		        handlePause: function(index, row){
		        	this.$http.post('job/pausejob',{"jobClassName":row.job_NAME,"jobGroupName":row.job_GROUP},{emulateJSON: true}).then(function(res){
						this.loadData( this.currentPage, this.pagesize);
		            },function(){
		                console.log('failed');
		            });
		        },
		        
		        //恢复用户管理
		        handleResume: function(index, row){
		        	this.$http.post('job/resumejob',{"jobClassName":row.job_NAME,"jobGroupName":row.job_GROUP},{emulateJSON: true}).then(function(res){
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
		        	this.$http.post('job/addjob',{"jobClassName":this.form.jobName,"jobGroupName":this.form.jobGroup,"cronExpression":this.form.cronExpression},{emulateJSON: true}).then(function(res){
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
		        
		        //更新用户管理
		        update: function(){
		        	this.$http.post
		        	('job/reschedulejob',
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
</html>