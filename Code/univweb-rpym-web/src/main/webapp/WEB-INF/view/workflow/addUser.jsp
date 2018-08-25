<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" href="//unpkg.com/element-ui@1.3.6/lib/theme-default/index.css" rel="external nofollow" >

    <script src="${pageContext.request.contextPath }/jquery.js"></script>
    <script src="${pageContext.request.contextPath }/vue.js"></script>
    <script src="${pageContext.request.contextPath }/vue-resource.js"></script>
	<!-- 引入组件库 -->
	<script src="https://unpkg.com/element-ui/lib/index.js"></script>
</head>
<body>
<div class="login-box" id="app" >
 <el-row>
    <el-col :span="8">
        <el-input id="loginname" v-model="loginname" placeholder="请输入帐号">
            <template slot="prepend">帐号</template>
        </el-input> 
    </el-col>
 </el-row>
 <el-row>
    <el-col :span="8">
        <el-input id="loginpass" v-model="loginpass" type="password" placeholder="请输入密码">
            <template slot="prepend">密码</template>
        </el-input>
    </el-col>
 </el-row>
 <el-row>
    <el-col :span="8">
        <el-input id="loginpass" v-model="loginpass" type="password" placeholder="请输入姓名">
            <template slot="prepend">姓名</template>
        </el-input>
    </el-col>
 </el-row>
 <el-row>
    <el-col :span="8">
        <el-button id="login" v-on:click="check" style="width:100%" type="primary">提交</el-button>
    </el-col>
 </el-row>
</div> 
</body>
<script type="text/javascript">
    new Vue({
        el : '#app',
        data : {
            name : '',
            password : ''
        },
        methods : {
            check : function(event){
                //获取值
                var loginname = this.loginname;
                var loginpass = this.loginpass;
                var realname = this.realname;
                $.ajax({
                    url : 'http://127.0.0.1:8080/users/add',
                    type : 'post',
                    data : {
                    	loginname : loginname,
                    	loginpass : loginpass,
                    	realname : realname
                    },
                    success : function(data) {
                        var result = data.status;
                        if(result == '200' || result == true){
                           	location.href="http://127.0.0.1:8080/users/list";
                        }else {
                            alert("添加失败");
                        }
                    },
                    dataType : 'json',
                })
            }
        }
    })
     
</script>
</html>