package com.rpym.univweb.utils;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.rpym.univweb.dto.common.ResponseDto;

@Provider
public class ExceptionFilter implements ExceptionMapper<Exception>{

	Log logger = LogFactory.getLog(this.getClass());
	
	public Response toResponse(Exception e) {
		Response.ResponseBuilder responseBuilder = null;
		if(e instanceof UWException) {
			UWException exp = (UWException) e;
			//声明返回对象
			ResponseDto entity = null;
			if(exp.getErrorCode() != null) {
				entity = ResponseDto.error(exp.getErrorCode(), exp.getMessage());
			}else {
				entity = ResponseDto.error(exp.getMessage()); 
			}
			responseBuilder = Response.ok(entity, MediaType.APPLICATION_JSON);
		}else {
			logger.error("系统错误：", e);
			ResponseDto entity = ResponseDto.error("服务器内部出现异常，请您联系技术人员(" + e.getMessage() + ")!");
			responseBuilder = Response.ok(entity, MediaType.APPLICATION_JSON);
		}
		return responseBuilder.build();
	}

}
