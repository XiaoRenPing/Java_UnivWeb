package com.rpym.univweb.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE}) //表示该注解可以使用在类上。
@Retention(value = RetentionPolicy.RUNTIME)
public @interface ScheduleJob {
	
	/**
	 * 中文名称
	 * @return
	 */
	String name(); // 必填
	
	/**
	 * 描述
	 * @return
	 */
	String desc(); // 必填
	
	/**
	 * 参数
	 * @return
	 */
	String args(); // 非必填
	
	/**
	 * 时间表达式
	 * @return
	 */
	String cron(); // 必填
	
	/**
	 * 是否作废，1是，0否
	 * @return
	 */
	String isabandoned(); // 必填
}