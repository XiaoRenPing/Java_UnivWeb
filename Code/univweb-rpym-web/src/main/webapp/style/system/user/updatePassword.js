$(function(){
	initDataForm();
	$("#reset_btn").click(function(){
		initDataForm();
	});
	
	//以下为修改jQuery Validation插件兼容Bootstrap的方法，没有直接写在插件中是为了便于插件升级
	$.validator.setDefaults({
		highlight : function(element) {
			$(element).closest('.form-group').removeClass('has-success').addClass('has-error');
		},
		success : function(element) {
			element.closest('.form-group').removeClass('has-error').addClass('has-success');
		},
		errorElement : "span",
		errorClass : "help-block m-b-none",
		validClass : "help-block m-b-none"
	});
	
	$("#dataForm").validate({
		rules : {
			userName : {
				required : true,
				minlength : 3
			},
			description : {
				required : true,
				minlength : 3
			}
		},
		messages : {
			roleName : {
				required : "输入用户名称",
				minlength : "用户名称必须两个字符以上"
			}
		},
		submitHandler:function(form){
            $.post(contextUrl()+"/user/resetPassword",$("#dataForm").serialize(),function(msg){
            	$.toaster({ 
            		priority : msg.priority, 
            		title : "系统消息",
            		message : msg.message,
            		removeCollback:function(){
            		location.href = contextUrl()+"/user/execute";
            	}});
            },'json'); 	
        } 
	});

});


function initDataForm(){
	var initDa = initData();
	for(var f in initDa){
		$("#dataForm [name='"+f+"']").val(initDa[f]); 
	}	
}
