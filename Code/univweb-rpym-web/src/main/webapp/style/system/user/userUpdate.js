$(function(){
	$.post(contextUrl()+"/user/findRoleAndDepartment",{},function(result){
		var str = ""; 
		//[{id:'bdsabfa',roleName:''}]
		var roles = result.roles;
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
		initDataForm();
		initSelector();
		$("[name='ids'],[name='departmentId']").trigger('chosen:updated');
	},'json');
	
	$("#reset_btn").click(function(){
		initDataForm();
		$("[name='ids'],[name='departmentId']").trigger('chosen:updated');
	});
	
	
	//以下为修改jQuery Validation插件兼容Bootstrap的方法，没有直接写在插件中是为了便于插件升级
	$.validator.setDefaults({
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
		validClass : "help-block m-b-none"
	});
	
	$("#dataForm").validate({
		rules : {
			username : {
				required : true,
				minlength : 2
			},
			email : {
				required : true,
				email : true
			},
			age : {
				number:true
			}
		},
		messages : {
			username : {
				required : "请输入您的用户名",
				minlength : "用户名必须两个字符以上"
			},
			email : "请输入您的E-mail",
			age :"年龄必须是数字"
		},
		submitHandler:function(form){
			var fm = $("#dataForm").serialize();
            $.post(contextUrl()+"/user/UpdateAndAdd",fm,function(msg){
            	$.toaster({ priority : msg.priority, title : "系统消息", message : msg.message,removeCollback:function(){
            		location.href = contextUrl()+"/user/execute";
            	}});
            },'json'); 	
        } 
	});

});


function initDataForm(){
	var initDa = initData();
	if(initDa.sex){
		$("#dataForm [value='"+initDa.sex+"']").attr("checked","checked");
	}
	if(initDa.roles&&initDa.roles.length>0){
		var roles = initDa.roles;
		for(var r in roles){
			$("[name='ids'] option[value="+roles[r].id+"]").attr('selected','selected');
		}
	}
	
	/*用户部门下拉列表*/
	if(initDa.department&&initDa.department.length>0){
		$("[name='departmentId'] option[value="+department.id+"]").attr('selected','selected');
	}
	
	for(var f in initDa){
		$("#dataForm [name='"+f+"']").val(initDa[f]);
	}	
}


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
            $("[name='ids'],[name='departmentId']").chosen(config[selector]);
        }
}
