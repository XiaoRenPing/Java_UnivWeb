	<!-- Mainly scripts -->
	<script src="${pageContext.request.contextPath }/style/js/jquery-2.1.1.min.js"></script>
	<script src="${pageContext.request.contextPath }/style/js/bootstrap.min.js?v=3.4.0"></script>
	<script src="${pageContext.request.contextPath }/style/js/plugins/metisMenu/jquery.metisMenu.js"></script>
	<script src="${pageContext.request.contextPath }/style/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>

	<!-- Custom and plugin javascript -->
	<script src="${pageContext.request.contextPath }/style/js/hplus.js?v=2.2.0"></script>
	<script src="${pageContext.request.contextPath }/style/js/plugins/pace/pace.min.js"></script>

	<!-- jQuery Validation plugin javascript-->
	<script src="${pageContext.request.contextPath }/style/js/plugins/validate/jquery.validate.min.js"></script>
	<script src="${pageContext.request.contextPath }/style/js/plugins/validate/messages_zh.min.js"></script>
	<script src="${pageContext.request.contextPath }/style/js/plugins/toaster/jquery.toaster.js"></script>
	<script type="text/javascript" src="login-style/js/tool.js"></script>
	
	<script src="${pageContext.request.contextPath }/style/js/plugins/layer/laydate/laydate.js"></script>
	<script src="${pageContext.request.contextPath }/style/js/plugins/iCheck/icheck.min.js"></script>
	<script>
        laydate({elem:"#start",event:"focus"});var start={elem:"#start",format:"YYYY/MM/DD hh:mm:ss",min:laydate.now(),max:"2099-06-16 23:59:59",istime:true,istoday:false,choose:function(datas){end.min=datas;end.start=datas}};var end={elem:"#end",format:"YYYY/MM/DD hh:mm:ss",min:laydate.now(),max:"2099-06-16 23:59:59",istime:true,istoday:false,choose:function(datas){start.max=datas}};laydate(start);laydate(end);
    	laydate({elem:"#end",event:"focus"});var start={elem:"#start",format:"YYYY/MM/DD hh:mm:ss",min:laydate.now(),max:"2099-06-16 23:59:59",istime:true,istoday:false,choose:function(datas){end.min=datas;end.start=datas}};var end={elem:"#end",format:"YYYY/MM/DD hh:mm:ss",min:laydate.now(),max:"2099-06-16 23:59:59",istime:true,istoday:false,choose:function(datas){start.max=datas}};laydate(start);laydate(end);
    </script>
