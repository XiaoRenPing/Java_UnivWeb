package com.rpym.univweb.web.controller.system;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.rpym.univweb.dto.notification.NotificationsQueryDto;
import com.rpym.univweb.entity.SysUserNotifications;
import com.rpym.univweb.service.system.notification.INotificationService;

@Controller
@RequestMapping("/notifications/*")
public class NotificationController {

	@Autowired
	INotificationService notificationsService;
	
	@RequestMapping(method=RequestMethod.GET, value="/toadd")
	public String toAddNotification() {
		return "system/notifications/addNotification";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/toedit")
	public String toEditNotification() {
		return "system/notifications/editNotification";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/index")
	public String pageListNotification() {
		return "system/notifications/notificationList";
	}
	
	//------------------------------- 定时器管理 -------------------------------------
	
	@RequestMapping(method=RequestMethod.GET, value="/list")
	@ResponseBody
	public PageInfo<SysUserNotifications> listNotification(NotificationsQueryDto notificationQueryDto) {
		return notificationsService.findNotificationsInfoPage(notificationQueryDto);
	}
	
	
	@RequestMapping(method=RequestMethod.POST, value="/add")
	@ResponseBody
	public Integer addNotification(SysUserNotifications sysUserNotifications) {
		return notificationsService.saveNotifications(sysUserNotifications);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/edit")
	@ResponseBody
	public Integer editNotification(SysUserNotifications sysUserNotifications) {
		return notificationsService.updateNotificationsInfo(sysUserNotifications);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/delete")
	@ResponseBody
	public Integer deleteNotification(@RequestParam("id") Long id) {
		return notificationsService.deleteNotifications(id);
	}
	
	/**
	 * 我的消息
	 * @param notificationQueryDto
	 * @param request
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET, value="/listbyuser")
	@ResponseBody
	public PageInfo<SysUserNotifications> listNotificationByUser(NotificationsQueryDto notificationQueryDto, HttpServletRequest request) {
		return notificationsService.findNotificationByUser(notificationQueryDto, request);
	}
}
