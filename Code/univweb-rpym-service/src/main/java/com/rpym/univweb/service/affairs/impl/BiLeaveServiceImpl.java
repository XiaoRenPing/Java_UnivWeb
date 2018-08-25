package com.rpym.univweb.service.affairs.impl;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.activiti.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rpym.univweb.constants.CommonConst;
import com.rpym.univweb.dao.BiLeaveMapper;
import com.rpym.univweb.dao.SysUsersMapper;
import com.rpym.univweb.entity.BiLeave;
import com.rpym.univweb.entity.SysUsers;
import com.rpym.univweb.service.affairs.IBiLeaveService;
import com.rpym.univweb.service.base.BaseService;
import com.rpym.univweb.utils.ResponseResult;
import com.rpym.univweb.utils.UWException;


@Service("biLeaveService")
public class BiLeaveServiceImpl extends BaseService implements IBiLeaveService {

	@Autowired
	private SysUsersMapper userDao;
	
	@Autowired
	private BiLeaveMapper leaveDao;
	
	/**
	 * 启动请假流程
	 */
	public ResponseResult addLeaveRestInfo(BiLeave leave, HttpServletRequest request) {
		
		SysUsers sessionUser = (SysUsers) request.getSession().getAttribute("sessionUser");
		SysUsers user = userDao.selectByPrimaryKey(sessionUser.getId());
		
		if(leave != null) {
			leaveDao.insertSelective(leave);
		}else {
			throw new UWException("请填写请假信息！");
		}

		if(isHavingUncompleteTask(String.valueOf(leave.getId()), "process-restapply")) {
			throw new UWException("您已经有同样的审批且等待对方处理中！");
		}
		
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("applyer", leave.getApplyusername());  //this.getSessionUser().getUser().getName()
		param.put("operator", leave.getReceiveusername());  //this.getSessionUser().getUser().getName()
		
		Map<String, Object> formdata = new HashMap<String, Object>();
		formdata.put("dto", leave);
		param.put("formdata", CommonConst.GSON.toJson(formdata));
		
		Map<String, Object> root = new HashMap<String, Object>();
		root.put("context", param);
		identityService.setAuthenticatedUserId(user.getName());  //this.getSessionUser().getUser().getName()
		identityService.setUserInfo(user.getId().toString(), user.getName(), user.getPhonenumber());
		ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("process-restapply", String.valueOf(leave.getId()), root);

		logger.info("请假流程启动成功，流程实例：" + processInstance.getId() + ", 流程参数:" + CommonConst.GSON.toJson(root));
		
		ResponseResult result = new ResponseResult();
		result.setData(root);
		result.setMsg("请求成功");
		result.setStatus(200);
		return result;
		}
}

