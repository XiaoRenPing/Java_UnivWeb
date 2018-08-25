package com.rpym.univweb.constants;

public class ResponseConsts {

	public static final String STATUS_OK = "200";   //请求成功
	
	public static final String STATUS_ERROR = "201";   //  请求失败
	
	public static final String STATUS_ENTERPRISE_NOAUDIT = "0";      // 企业待认证
	
	public static final String STATUS_ENTERPRISE_SUBMIT = "3";   // 企业信息正在审核中
	
	public static final String STATUS_ENTERPRISE_INVALIDATE = "2";   // 企业审核未通过
	
	public static final String STATUS_ENTERPRISE_VALIDATE = "1";   // 企业审核通过
	
	public static final String STATUS_LACKOF_PERMISSION = "4005";  //权限不足
	
	public static final String STATUS_INVALID_TOKEN = "4006";  //已经在其他地方重新登入过
	
	public static final String STATUS_NO_TOKEN = "4007";   //没有token 
}

