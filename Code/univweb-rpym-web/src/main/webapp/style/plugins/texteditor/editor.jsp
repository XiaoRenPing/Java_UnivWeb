    <link href="${pageContext.request.contextPath }/style/plugins/texteditor/themes/default/default.css" rel="stylesheet" />
	<style>
		h3{
			text-align:center;
		}
		textarea {
			display: block;
		}
		form .ke-container {
			margin: 0 auto;
		}
	</style>
    <textarea name="content" style="width:700px;height:200px;visibility:hidden;"></textarea>
    <script src="${pageContext.request.contextPath }/style/plugins/js/kindeditor-min.js"></script>
	<script src="${pageContext.request.contextPath }/style/plugins/js/emoticons.js"></script>
	<script src="${pageContext.request.contextPath }/style/plugins/js/zh_CN.js"></script>
	<script>
		var editor;
		KindEditor.ready(function(K) {
			editor = K.create('textarea[name="content"]', {
				resizeType : 1,
				allowPreviewEmoticons : false,
				allowImageUpload : false,
				items : [
					'fontname', 'fontsize', '|', 'forecolor', 'hilitecolor', 'bold', 'italic', 'underline',
					'removeformat', '|', 'justifyleft', 'justifycenter', 'justifyright', 'insertorderedlist',
					'insertunorderedlist', '|', 'emoticons', 'image', 'link']
			});
		});
</script>