package com.rpym.univweb.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 忽略业务日志记录
 * @author 王杰
 *
 */
@Target({ElementType.TYPE}) //表示该注解可以使用在类上。
@Retention(value = RetentionPolicy.RUNTIME)
public @interface SqlBizLogIgnore {
	
}