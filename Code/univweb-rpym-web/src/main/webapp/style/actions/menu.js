$(function(){
	$("#searchBtn").click(searchTable);
	$("#add_btn").click(addMenu);
	$("#submit_Btn").click(addMenu);
});

function addMenu(){
	location.href= ctx + "/menus/toadd";
}

function toEdit(id){
	location.href= ctx + "/menus/toadd";
}

function addSubmit(){
	var fm = $(form).serialize();
    $.post(contextUrl()+"/menus/add",fm,function(msg){
    	$.toaster({
    		priority : msg.priority,
    		title : "系统消息", 
    		message : msg.message,
    		removeCollback:function(){
    			location.href = ctx + "/menus/list";
    		}
    	});
    },'json');
}


function editSubmit(){
	var fm = $(form).serialize();
    $.post(contextUrl()+"/menus/edit",fm,function(msg){
    	$.toaster({
    		priority : msg.priority,
    		title : "系统消息", 
    		message : msg.message,
    		removeCollback:function(){
    			location.href = ctx + "/menus/list";
    		}
    	});
    },'json');
}
