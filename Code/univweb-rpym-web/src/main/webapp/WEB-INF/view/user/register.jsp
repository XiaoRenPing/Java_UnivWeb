<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>注册</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/style/css/user/rs1.css"/>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/style/css/user/rs2.css"/>
	<script type="text/javascript" src="${pageContext.request.contextPath }/style/js/jquery-2.1.1.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/style/oa/user/register.js"></script>
</head>

<body class="su_body">


<div class="wrap">
  
    <div class="header">
        <a class="back" href="${pageContext.request.contextPath }/home/index" >&lt;&lt; 返回系统首页</a>
    </div>
    
    <div class="container container_test">

   
        <div class="container_con">
            
            <div class="signup_main signup">
      
                <div class="container_hd">
                    <ul>
                        <li class="cur it2"><em><spring:message code="system.register.title"/></em></li>
                    </ul>
                    <label id="ListMsg" style="color:#ff0000;font-size:20px;">&nbsp;&nbsp;</label>
                </div>
                <div class="tab_con">
                    <div class="col_main">
                        <form id="signup_form_phone" id="dataForm" onsubmit="return submitRegForm();" action="${pageContext.request.contextPath }/users/register" method="POST">
                        <div class="su_form">
                            <div class="suf_w" id="suf_phone">
                                <label class="suf_wl" for="phone"><spring:message code="system.username"/></label>
                                <div class="suf_wr">
                                    <input type="text" name="username" id="username" class="si1 si_cur" tabindex="10" maxlength="11">
                                <div class="suf_tips" style="display:none;"><em></em><div class="suf_tipsc"></div></div></div>
                            </div>
                            <div class="suf_w" id="suf_password_phone">
                                <label class="suf_wl" for="password_phone"><spring:message code="system.password"/></label>
                                <div class="suf_wr">
                                    <input type="password" name="password" id="password" class="si1 si_cur" tabindex="11" value="">
                                <div class="suf_tips" style="display:none;"><em></em><div class="suf_tipsc"></div></div></div>
                            </div>
                            <div class="suf_w" id="suf_password2_phone">
                                <label class="suf_wl" for="password2_phone"><spring:message code="system.confirmpassword"/></label>
                                <div class="suf_wr">
                                    <input type="password" name="confirm_password" id="confirm_password" class="si1 si_cur" tabindex="12" value="">
                                <div class="suf_tips" style="display:none;"><em></em><div class="suf_tipsc"></div></div></div>
                            </div>
                            <div class="suf_w" id="suf_nick_phone">
                                <label class="suf_wl" for="nick_phone"><spring:message code="system.email"/></label>
                                <div class="suf_wr">
                                    <input type="text" name="email" id="email" class="si1" tabindex="13" value="">
                                </div>
                            </div>
                            
                            <div class="suf_w" id="suf_auth_code_phone">
                                <label class="suf_wl" for="auth_code_phone"><spring:message code="system.phone"/></label>
                                <div class="suf_wr">
                                    <input type="text" maxlength="11" name="phone" id="phone" class="si1" tabindex="13" value="">
                                </div>
                            </div>
                            
                            <div class="suf_w show_morep" id="suf_auth_codep">
                                <label class="suf_wl" for="auth_codep"><spring:message code="system.verifycode"/></label>
                                <div class="suf_wr">
                                    <input type="text" name="vCode" id="auth_codep" maxlength="4" class="si2" tabindex="17" value="">
                                    <div class="code_img">
                                    	<a href="javascript:_hyz();" title="<spring:message code="system.change"/>" id="hyz"><img title="<spring:message code="system.change"/>" id="vCode" src="servlet/VerifyCodeServlet"></a>
                                    </div>
                                </div>
                            </div>
                            
                            
                            <div class="suf_submitw">
                                <input class="suf_reg" type="submit" />
                                <span>已注册过了？<a href="${pageContext.request.contextPath }/users/tologin" ><spring:message code="system.tologin"/></a></span></div>
                       		</div>
                        </form>
                      
                    </div>
                </div>
               
            </div>

      
           <div class="col_side">
            <div class="cs_con">
                <h5>High-galaxyteamlog</h5>
                <ul>
                    <li>欢迎注册</li>
                    <li>成为系统成员</li>
                </ul>
                <h5>High-galaxyteamlog管理系统</h5>
                <ul>
                    <li>1、方便管理</li>
                    <li>2、实时查看 </li>
                    <li>3、OA系统</li>
                    <li>4、界面清晰</li>
                </ul>
            </div>
           
        </div>
    </div>
   
</div>

</body>
</html>
