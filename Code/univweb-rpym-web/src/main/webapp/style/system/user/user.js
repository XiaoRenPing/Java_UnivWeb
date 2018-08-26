var searchObj = {};

$(function(){
	// loadData();
	searchTable();
	$("#searchBtn").click(searchTable);
	$("#refresh_btn").click(refreshTable);
	$("#add_btn").click(addUser);
});

/**
 * 初始化表格
 */
function initDataTable(sObj){
	$('#dataTables').dataTable({
		"bDestroy" : true,
		"sAjaxSource" : "http://127.0.0.1:8081/univweb-rpym-web/users/list",  //contextUrl()+
		"bServerSide" : true,
		'bStateSave' : false,
		"bAutoWidth" : false,
		"async":false,
		"ordering":false,
		"bPaginate" : true,
		"bProcessing" : true,
		"bFilter" : false,
		"fnServerParams" : function(aoData) {
			aoData.push({   
				"name" : "username",
				"value" : sObj['username']
			});
		},
		"aoColumns" : [ {
			"mData" : "username",
			"bSortable" : false,
			"sTitle" : "账号"
		},{
			"mData" : "name",
			"bSortable" : false,
			"sTitle" : "姓名"
		}, {
			"mData" : "emailaddress",
			"bSortable" : false,
			"sTitle" : "邮箱"
		},{
			"mData" : "phone",
			"bSortable" : false,
			"sTitle" : "联系方式"
		},{
			"mData":"id",
			"bSortable":false,
			"sTitle":"操作",
			"mRender" : function(data, type, full) { /*id=>data, type=》display, full=>{=---}*/
				console.info(data);
				var str = '<button type="button" class="btn btn-primary btn-xs" onclick="editUser(\''+data+'\')">修改</button>&nbsp;';
				str+='<button type="button" class="btn btn-primary btn-xs" onclick="delUser(\''+data+'\',\''+full.userName+'\')">删除</button>';
				return str;
			}
		} ]
	});
}


function searchTable(){
	searchObj = marshalForm($("#searchForm"));
	initDataTable(searchObj);
}

function refreshTable(){
	$("#searchForm")[0].reset();
	searchTable();
}

function marshalForm($form){
	var obj = {};
	$.each($form.serializeArray(),function(){
		obj[this.name] = this.value;
	});
	return obj;
}



function editUser(id){
	location.href=contextUrl()+"/user/executeUpdate?id="+id;
}

function delUser(id,username){
	parent.easyDialog.open({
		  container : {
		    header : '系统提示',
		    content : '确定要删除用户【'+username+"】吗？",
		    yesFn : function(){
		    	 $.get(contextUrl()+"/user/del",{id:id},function(msg){
		    	     	$.toaster({ priority : msg.priority, title : "系统消息", message : msg.message,removeCollback:function(){
		    	     		searchTable();
		    	     	}});
		    	     },'json');
		    },
		    noFn : true
		  }
	});
}

function addUser(){
	location.href=contextUrl()+"/user/executeAdd";
}