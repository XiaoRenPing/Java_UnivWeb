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
    
	<jsp:include page="/common/mainheader.jsp"></jsp:include>
	<script type="text/javascript">
		var ctx = ${pageContext.request.contextPath };
	</script>
</head>