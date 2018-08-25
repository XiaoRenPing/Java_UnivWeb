<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>天擎科技后天管理系统--定时任务</title>
	<script src="${pageContext.request.contextPath }/style/js//jquery-2.1.1.min.js"></script>
<script src="${pageContext.request.contextPath }/style/js/bootstrap.min.js?v=3.4.0"></script>
<script src="${pageContext.request.contextPath }/style/js/plugins/metisMenu/jquery.metisMenu.js"></script>
<script src="${pageContext.request.contextPath }/style/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>

 <script type="text/javascript" src="${pageContext.request.contextPath }/style/js/jqgrid/jquery.jqGrid.src.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/style/js/jqgrid/grid.locale-cn.js"></script>
 
 <link rel="stylesheet" href="${pageContext.request.contextPath }/style/js/jqgrid/ui.jqgrid.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/style/js/jqgrid/jquery-ui-1.8.16.custom.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/style/js/jqgrid/common.css">
 
</head>
<body>
		<table id=table_list_2></table>
		<div id="pager_list_2">
		</div>
		<script type="text/javascript">
		$(function(){
			pageInit();
		});
		function pageInit(){
			  jQuery("#table_list_2").jqGrid({
				    url : "http://127.0.0.1:8081/univweb-rpym-web/workflow/tasklist",
			        datatype : "json",
			        height: 'auto',
			        autowidth:true,
			        colNames : [ 'id', '流程名称', '申请人', '申请日期', '审批人', '审批状态', '下一审批', '下一审批人', '操作'],//jqGrid的列显示名字
						colModel:[
							{name:'id',index:'id', hidden:true},
					   		{name:'name',index:'name', width:200},
					   		{name:'assignee',index:'assignee', width:100},
					   		{name:'createTime',index:'createTime', width:100},
					   		{name:'createUser',index:'createUser', width:100},
					   		{name:'comment',index:'comment', width:100},		
					 	  	{name:'nextNodeName',index:'nextNodeName', width:170},		
					   		{name:'nextAssignee',index:'nextAssignee', width:80},
					   		{name: '', width:70,formatter: function (cellvalue, options, rowObject) {
					   			console.info(rowObject);
					   			var operation = "<a title=\"编辑\" class=\"ui-icon ui-icon-pencil\" style='height:22px;width:20px;' onclick=\"editJob(" + rowObject.id + ");\"</a>";
					   			if(rowObject.isabandoned == false){
					   				operation += "<a title=\"启动\"  style='height:22px;width:20px;' onclick=\"startJob(" + rowObject.id + ");\">启动</a>";
					   			}else{
					   				operation += "<a title=\"停止\"  style='height:22px;width:20px;' onclick=\"stopJob(" + rowObject.id + ");\">停止</a>";
					   			}
		                   return operation;
		                  }
					   		},
					   	],
					  	rowNum : 10,
					  	pager: "#pager_list_2",
					   	multiselect: true,
					    mtype :"get",
					    viewrecords:true,
					    hidegrid:false,
					   	jsonReader : { /*重写方法*/
					   		root: "data.list",
					   		page : "data.pageNum",  //当前页码
					   		total : "data.pages",  //总共页数
					   		records: "data.total",   
					   		repeatitems:false,
					   	},
						caption : "我的待办"//表格的标题名字
			      });
			  	jQuery("#table_list_2").jqGrid('navGrid', '#pager_list_2', {edit : false,add : false,del : false});
			}
		</script>
</body>
</html>