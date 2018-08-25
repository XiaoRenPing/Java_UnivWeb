package com.rpym.univweb.service.affairs;

import javax.servlet.http.HttpServletRequest;

import com.rpym.univweb.entity.BiLeave;
import com.rpym.univweb.utils.ResponseResult;

public interface IBiLeaveService {

	//启动请假流程
	public ResponseResult addLeaveRestInfo(BiLeave leave, HttpServletRequest request);
}
