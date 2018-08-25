package com.rpym.univweb.service.system.notification.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rpym.univweb.constants.CommonConst;
import com.rpym.univweb.dao.SysUserNotificationsMapper;
import com.rpym.univweb.entity.SysUserNotifications;
import com.rpym.univweb.service.system.notification.INotificationService;

/**
 * 系统消息业务服务
 * 
 * @ClassName: NotificationServiceImpl
 * @Description:
 * @author 肖仁枰
 * @date 2018年8月13日
 */
@Service("notificationService")
public class NotificationServiceImpl implements INotificationService {

	@Autowired
	SysUserNotificationsMapper notificationDao;
	
	/**
	 * 给用户添加消息提醒
	 * <p>Title: addSysUserNotifications</p>   
	 * <p>Description: </p>   
	 * @param id
	 * @param message   
	 * @see com.rpym.univweb.service.system.notification.INotificationService#addSysUserNotifications(java.lang.Long, java.lang.String)
	 */
	public void addSysUserNotifications(Long userId, String message) {
		SysUserNotifications sysUserNotifications = new SysUserNotifications();
		sysUserNotifications.setUserid(userId);
		sysUserNotifications.setMessage(message);
		sysUserNotifications.setCreationtime(new Date());
		sysUserNotifications.setState(CommonConst.NUM_0);
		notificationDao.insertSelective(sysUserNotifications);
	}

	
}
