$(function(){
	$("#reset_btn").click(function(){
		$("#dataForm")[0].reset();
	});
	
	$.post(
		contextUrl()+"/user/findRoleAndDepartment",
		{},
		function(result){
			var str = ""; 
			//[{id:'bdsabfa',roleName:''}]
			var roles = result.roles;  //获取
			var departments = result.departments;
			$.each(roles,function(){
				str+='<option value="'+this.id+'">'+this.roleName+'<option/>'			
			});
			$('[name="ids"]').append(str);
			str='';
			$.each(departments,function(){
				str+='<option value="'+this.id+'">'+this.departmentName+'<option/>'			
			});	
			$('[name="departmentId"]').append(str);
			initSelector();
	},'json');
	
	// 手机号验证   
	jQuery.validator.addMethod("isPhone", function(value, element) {   
	    var tel = /^1[3|4|5|8][0-9]\d{4,8}$/;
	    return this.optional(element) || (tel.test(value));
	}, "请正确填写您的手机号");
	
	$("#dataForm").validate({
		highlight : function(element) {
			$(element).closest('.form-group').removeClass('has-success').addClass(
					'has-error');
		},
		success : function(element) {
			element.closest('.form-group').removeClass('has-error').addClass(
					'has-success');
		},
		errorElement : "span",
		errorClass : "help-block m-b-none",
		validClass : "help-block m-b-none",
		rules : {
			username : {
				required : true,
				minlength : 2
			},
			email : {
				required : true,
				email : true
			},
			fullName:{
				required : true
			},
			phone:{
				required : true,
				isPhone:true
			},
			age : {
				required : true,
				number:true
			},
			password: {
			    required: true,
			    minlength: 5
			   },
		   confirm_password: {
			    required: true,
			    minlength: 5,
			    equalTo: "[name='password']"
		   }
		},
		messages : {
			username : {
				required : "请输入您的用户名",
				minlength : "用户名必须两个字符以上"
			},
			fullName : "请输入姓名",
			email : "请输入您的E-mail",
			age :{
				required : "请输入您的年龄",
				number:"年龄必须是数字"
			},
			phone:{
				required : "联系方式不能为空",
				isPhone:"请输入正确的联系方式"
			},
			password: {
			    required: "请输入密码",
			    minlength: "密码不能小于5个字 符"
			   },
			   confirm_password: {
			    required: "请输入确认密码",
			    minlength: "确认密码不能小于5个字符",
			    equalTo: "两次输入密码不一致"
			   }
		},
		submitHandler:function(form){
			var fm = $(form).serialize();
            $.post(contextUrl()+"/user/UpdateAndAdd",fm,function(msg){
            	$.toaster({ priority : msg.priority, title : "系统消息", message : msg.message,removeCollback:function(){
            		location.href = contextUrl()+"/user/execute";
            	}});
            },'json');
        } 
	});
	
	
});

function initSelector() {
	var config = {
            '.chosen-select': {},
            '.chosen-select-deselect': {
                allow_single_deselect: true
            },
            '.chosen-select-no-single': {
                disable_search_threshold: 10
            },
            '.chosen-select-no-results': {
                no_results_text: '没有对应选项'
            }/*,
            '.chosen-select-width': {
                width: "95%"
            }*/
        }
        for (var selector in config) {
            $(selector).chosen(config[selector]);
        }
}

