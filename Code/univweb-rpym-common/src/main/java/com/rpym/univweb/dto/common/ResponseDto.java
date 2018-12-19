package com.rpym.univweb.dto.common;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.rpym.univweb.constants.ResponseConsts;

public class ResponseDto {

private boolean success;
	
	private String message;
	
	private Object data;

	private String code;
	
	public static ResponseDto ok(String msg) {
		ResponseDto res = new ResponseDto();
		res.success = true;
		res.message = msg;
		res.code = ResponseConsts.STATUS_OK;
		return res;
	}
	
	public ResponseDto build(Object data) {
		this.data = data;
		return this;
	}
	
	public static ResponseDto error(String msg) {
		ResponseDto res = new ResponseDto();
		res.success = false;
		res.message = msg;
		res.code = ResponseConsts.STATUS_ERROR;
		return res;
	}
	
	
	public static ResponseDto error(String code, String msg) {
		ResponseDto res = new ResponseDto();
		res.success = false;
		res.message = msg;
		res.code = code;
		return res;
	}
	
	
	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		Gson gson = new GsonBuilder().disableHtmlEscaping().create();
		return gson.toJson(this);
	}
	
	
}
