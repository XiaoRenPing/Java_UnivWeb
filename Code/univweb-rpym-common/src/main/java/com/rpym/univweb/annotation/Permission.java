package com.rpym.univweb.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE}) //表示该注解可以使用在类和方法上。
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Permission {
	
	int SUPERMAUN = 1; // 超管
	int MANAGER = 2; // 管理员
	int REVIEWER = 3; // 复核员
	int OPERATOR = 4; // 经办员
	
	String[] code() default {};
	
	int [] role() default {};
}