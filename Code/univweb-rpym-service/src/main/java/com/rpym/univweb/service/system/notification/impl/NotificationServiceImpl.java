package com.rpym.univweb.service.system.notification.impl;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.rpym.univweb.constants.CommonConst;
import com.rpym.univweb.dao.SysUserNotificationsMapper;
import com.rpym.univweb.dto.notification.NotificationsQueryDto;
import com.rpym.univweb.entity.SysUserNotifications;
import com.rpym.univweb.entity.SysUserNotificationsExample;
import com.rpym.univweb.entity.SysUsers;
import com.rpym.univweb.service.base.BaseService;
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
public class NotificationServiceImpl extends BaseService implements INotificationService {

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

	public PageInfo<SysUserNotifications> findNotificationsInfoPage(NotificationsQueryDto jobQueryDto) {
		SysUserNotificationsExample sysUserNotificationsExample = new SysUserNotificationsExample();
		SysUserNotificationsExample.Criteria sysUserNotificationsCriteria = sysUserNotificationsExample.createCriteria();
		if(jobQueryDto.getContent() != null) {
			sysUserNotificationsCriteria.andMessageLike(this.fullLike(jobQueryDto.getContent()));
		}
		//initPage(jobQueryDto);
		List<SysUserNotifications> sysUserNotificationsList = notificationDao.selectByExample(sysUserNotificationsExample); 
		return new PageInfo<SysUserNotifications>(sysUserNotificationsList);
	}

	public Integer saveNotifications(SysUserNotifications sysUserNotifications) {
		return notificationDao.insertSelective(sysUserNotifications);
	}

	public Integer updateNotificationsInfo(SysUserNotifications sysUserNotifications) {
		return notificationDao.updateByPrimaryKeySelective(sysUserNotifications);
	}

	public Integer deleteNotifications(Long id) {
		return notificationDao.deleteByPrimaryKey(id);
	}

	/**
	 * 我的消息
	 */
	public PageInfo<SysUserNotifications> findNotificationByUser(NotificationsQueryDto jobQueryDto, HttpServletRequest request) {
		//接收人
		SysUsers sessionUser = (SysUsers) request.getSession().getAttribute("sessionUser");
		SysUserNotificationsExample sysUserNotificationsExample = new SysUserNotificationsExample();
		SysUserNotificationsExample.Criteria sysUserNotificationsCriteria = sysUserNotificationsExample.createCriteria();
		sysUserNotificationsCriteria.andCreatoruseridEqualTo(sessionUser.getId());
		if(jobQueryDto.getContent() != null) {
			sysUserNotificationsCriteria.andMessageLike(this.fullLike(jobQueryDto.getContent()));
		}
		//initPage(jobQueryDto);
		List<SysUserNotifications> sysUserNotificationsList = notificationDao.selectByExample(sysUserNotificationsExample); 
		return new PageInfo<SysUserNotifications>(sysUserNotificationsList);
	}

	

	
}
