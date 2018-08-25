package com.rpym.univweb.service.system.job.context;

import java.lang.reflect.Field;

import org.quartz.Job;
import org.quartz.Scheduler;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

import com.rpym.univweb.annotation.ScheduleJob;
import com.rpym.univweb.dto.job.SysJobsDto;
import com.rpym.univweb.service.system.job.ISysJobsService;
import com.rpym.univweb.utils.QuartzManager;
import com.rpym.univweb.utils.SpringContextUtils;

@Service("springContextHolder")
public class SpringContextHolder implements ApplicationListener<ContextRefreshedEvent>{
	
	private static ApplicationContext applicationContext; // Spring应用上下文环境

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		SpringContextHolder.applicationContext = applicationContext;
		SpringContextUtils.setApplicationContext(applicationContext);
		Scheduler scheduler = (Scheduler) SpringContextHolder.getBean("schedulerFactory");
		QuartzManager.setScheduler(scheduler);
		initJobToDB();
	}

	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	@SuppressWarnings("unchecked")
	public static <T> T getBean(String name) throws BeansException {
		return (T) applicationContext.getBean(name);
	}
	
	/**
	 * Spring 容器初始化的时候将所有带@ScheduleJob 注解的job全量写入数据库,实现自动化
	 */
	public void initJobToDB() {
		System.out.println("Init:开始扫描JOB，同步刷新到数据库...");
		ISysJobsService sysJobsService = (ISysJobsService)applicationContext.getBean("sysJobsService");
		String names[] = applicationContext.getBeanNamesForAnnotation(ScheduleJob.class);
		for(String name : names) {
			
			Job jobImpl = getBeanFromProxy((Job)applicationContext.getBean(name));
			ScheduleJob job = jobImpl.getClass().getAnnotation(ScheduleJob.class);
			
			if (null != job) {
				//插入到数据中
				SysJobsDto dto = new SysJobsDto();
				dto.setJobname(job.name());
				dto.setJobclass(jobImpl.getClass().getName());
				dto.setJobdesc(job.desc());
				dto.setJobargs(job.args());
				dto.setJobcron(job.cron());
				try {
					sysJobsService.saveSysJobs(dto);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		System.out.println("扫描JOB完成.");
	}
	
	 public static final <T> T getBeanFromProxy(T proxyObject) {
        Class<?> clazz = proxyObject.getClass();
        if(clazz.getName().contains("$Proxy")) {
            try {
                clazz = clazz.getSuperclass();
                Field hField = clazz.getDeclaredField("h");
                hField.setAccessible(true);
                Object hObject = hField.get(proxyObject);
 
                Class<?> dynamicProxyClass = hObject.getClass();
                Field advisedField = dynamicProxyClass.getDeclaredField("advised");
                advisedField.setAccessible(true);
                Object advisedObject = advisedField.get(hObject);
 
                Class<?> advisedSupportClass = advisedObject.getClass().getSuperclass().getSuperclass();
                Field targetField = advisedSupportClass.getDeclaredField("targetSource");
                targetField.setAccessible(true);
                Object targetObject = targetField.get(advisedObject);
 
                Class<?> targetSourceClass = targetObject.getClass();
                Field targetClassField = targetSourceClass.getDeclaredField("target");
                targetClassField.setAccessible(true);
                return (T) targetClassField.get(targetObject);
            } catch (SecurityException e) {
                e.printStackTrace();
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return proxyObject;
    }

	 
	/**
	 * 初始化Spring容器，获取上下文
	 * <p>Title: onApplicationEvent</p>   
	 * <p>Description: </p>  
	 * @author 肖仁枰 
	 * @param event   
	 * @see org.springframework.context.ApplicationListener#onApplicationEvent(org.springframework.context.ApplicationEvent)
	 */
	public void onApplicationEvent(ContextRefreshedEvent event) {
		ApplicationContext applicationContextParam = event.getApplicationContext();
		this.setApplicationContext(applicationContextParam);
	}
}