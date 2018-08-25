package com.rpym.univweb.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;

public class SpringContextUtils {

	// Spring应用上下文环境
	private static ApplicationContext applicationContext;

	/**
	 * 设置上下文环境
	 * 
	 * @param applicationContext
	 */
	public static void setApplicationContext(ApplicationContext applicationContext) {
		SpringContextUtils.applicationContext = applicationContext;

		// 初始化权限
		// initPermission();
	}

	/**
	 * @return ApplicationContext
	 */
	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	/**
	 * 获取对象
	 * 
	 * @param name
	 * @return Object
	 * @throws BeansException
	 */
	public static Object getBean(String name) {
		return applicationContext.getBean(name);
	}


}
