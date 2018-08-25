package com.rpym.univweb.delegate.workflow;

import java.util.List;
import java.util.Map;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.impl.el.FixedValue;
import org.apache.commons.lang3.StringUtils;

import com.rpym.univweb.constants.CommonConst;
import com.rpym.univweb.dto.workflow.BaseListenerDto;
import com.rpym.univweb.entity.BiDbDictDetail;
import com.rpym.univweb.entity.SysUsers;
import com.rpym.univweb.service.system.dbdict.IDbDictService;
import com.rpym.univweb.service.system.notification.INotificationService;
import com.rpym.univweb.service.system.user.IUserService;
import com.rpym.univweb.utils.SpringContextUtils;

/**
 * 消息提醒监听器 流程节点执行完成后，在路径上提醒下一个节点的审批人消息提示 提醒的内容：在数据字典中的消息提示模板
 * 提醒对象：流程中的${operation}
 * 
 * @ClassName: NotificationListener
 * @Description:
 * @author 肖仁枰
 * @date 2018年8月13日
 */
@SuppressWarnings("all")
public class NotificationListener extends BaseListener {

	// 注入数据字典
	IDbDictService dbDictService = (IDbDictService) SpringContextUtils.getBean("biDbDictService");
	// 注入消息
	INotificationService notificationService = (INotificationService) SpringContextUtils.getBean("notificationService");
	// 注入用户biz
	IUserService userServiceService = (IUserService) SpringContextUtils.getBean("userServiceService");

//activiti界面配置参数
	// 消息模板
	private FixedValue messageKey;
	// 消息接收对象
	private FixedValue userName;

	@Override
	public void hander(BaseListenerDto dto, DelegateExecution execution) {
		try {
			String name = getElValue(userName.getExpressionText(), dto.getVars());

			SysUsers user = userServiceService.getUserIdByUserName(name);

			notificationService.addSysUserNotifications(user.getId(), getMessage(messageKey.getExpressionText(), dto.getVars()));

		} catch (Exception e) {
			if (userName != null && StringUtils.isNoneBlank(userName.getExpressionText()) 
		   && messageKey != null && StringUtils.isNoneBlank(messageKey.getExpressionText())) {
				logger.info("参数配置异常" + "userName=" + userName.getExpressionText() + "messageKey=" + messageKey.getExpressionText());
			}
			logger.info("具体异常信息：" + e.getMessage());
		}
	}

	/**
	 * 从数据字典表中获取表达式
	* @Description: TODO
	* @param key
	* @param vars
	* @param  
	* @return String 
	* @throws 
	* @author 肖仁枰
	* @date 2018年8月13日
	 */
	public String getMessage(String key, Map<String, Object> vars) {
		List<BiDbDictDetail> messageDbDict = dbDictService.getDistinctDbDictDetailByCode(key);
		return getElValue(messageDbDict.get(CommonConst.NUM_0).getName(), vars);
	}

	public FixedValue getMessageKey() {
		return messageKey;
	}

	public void setMessageKey(FixedValue messageKey) {
		this.messageKey = messageKey;
	}

	public FixedValue getUserName() {
		return userName;
	}

	public void setUserName(FixedValue userName) {
		this.userName = userName;
	}
}
