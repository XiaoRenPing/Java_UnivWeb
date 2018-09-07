<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@	taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>

<head>
	<base href="${pageContext.request.contextPath }/"/>
    <link rel="shortcut icon" href="favicon.ico"> 
    <meta charset="${site.charset }">
    <meta name="viewport" content="">
    <meta name="keyword" content="${site.keyword }">
    <meta name="renderer" content="webkit">
    <title>${site.title }</title>
    <style type="text/css">
    	table{
    		table-layout:fixed;/* 只有定义了表格的布局算法为fixed，下面td的定义才能起作用。 */
		}
		td{
		    width:100%;
		    word-break:keep-all;/* 不换行 */
		    white-space:nowrap;/* 不换行 */
		    overflow:hidden;/* 内容超出宽度时隐藏超出部分的内容 */
		    text-overflow:ellipsis;/* 当对象内文本溢出时显示省略标记(...) ；需与overflow:hidden;一起使用。*/
		}
    </style>
	<jsp:include page="/common/mainheader.jsp"></jsp:include>
</head>