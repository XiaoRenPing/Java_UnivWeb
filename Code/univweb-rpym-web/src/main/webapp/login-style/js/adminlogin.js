// JavaScript Document
//支持Enter键登录
		document.onkeydown = function(e){
			if($(".bac").length==0)
			{
				if(!e) e = window.event;
				if((e.keyCode || e.which) == 13){
					var obtnLogin=document.getElementById("submit_btn")
					obtnLogin.focus();
				}
			}
		}

    	$(function(){
    		$("#captcha_img").click(function(){
    			this.src=contextUrl()+"/servlet/VerifyCodeServlet?aa="+Math.random();
    		});
    		
			//提交表单
			$('#submit_btn').click(function(){
//				var myReg = /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/; //邮件正则
				if(!$('[name="adminName"]').val()){
					show_err_msg('用户名不能为空！');	
					$('[name="loginpass"]').focus();
				}else if(!$('[name="loginpass"]').val()){
					show_err_msg('不能为空！');
					$('[name="loginpass"]').focus();
				}else{
					//ajax提交表单，#login_form为表单的ID。 如：$('#login_form').ajaxSubmit(function(data) { ... });
					$('#login_form').ajaxSubmit({
						dataType:'json',
						success:function(data) {
							if(data.result){
								show_msg('登录成功！正在跳转...',contextUrl()+"/home/index");
							}else{
								show_err_msg(data.msg);	
								$("#captcha_img")[0].src=contextUrl()+"/servlet/VerifyCodeServlet?aa="+Math.random();
							}
						}
					});
				}
			});
		});