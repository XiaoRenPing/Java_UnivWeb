package com.rpym.univweb.service.system.notification;

import javax.servlet.http.HttpServletRequest;

import com.github.pagehelper.PageInfo;
import com.rpym.univweb.dto.notification.NotificationsQueryDto;
import com.rpym.univweb.entity.SysUserNotifications;

public interface INotificationService {

	void addSysUserNotifications(Long id, String message);

	PageInfo<SysUserNotifications> findNotificationsInfoPage(NotificationsQueryDto jobQueryDto);

	Integer saveNotifications(SysUserNotifications sysUserNotifications);

	Integer updateNotificationsInfo(SysUserNotifications sysUserNotifications);

	Integer deleteNotifications(Long id);

	PageInfo<SysUserNotifications> findNotificationByUser(NotificationsQueryDto jobQueryDto, HttpServletRequest request);

}
