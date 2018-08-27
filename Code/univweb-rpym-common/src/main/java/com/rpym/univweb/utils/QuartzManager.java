package com.rpym.univweb.utils;


import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.TriggerKey;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.triggers.SimpleTriggerImpl;

public class QuartzManager {
	
	public static String JOB_GROUP_NAME = "EXTJWEB_JOBGROUP_NAME";
	public static String TRIGGER_GROUP_NAME = "EXTJWEB_TRIGGERGROUP_NAME";

	
	private static Scheduler scheduler = null;
	private static SchedulerFactory gSchedulerFactory = new StdSchedulerFactory();
	public static Scheduler getScheduler() {
		try {
			scheduler = gSchedulerFactory.getScheduler();
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
        return scheduler;
    }
	
	public static void setScheduler(Scheduler factory) {
		scheduler = factory;
	}
	
    /** 
     * @Description: 添加一个定时任务 
     * @param jobName 任务名 
     * @param jobGroupName  任务组名 
     * @param triggerName 触发器名 
     * @param triggerGroupName 触发器组名 
     * @param jobClass  任务 
     * @param cron   时间设置，参考quartz说明文档  
     */  
    @SuppressWarnings({ "unchecked", "rawtypes" })  
    public static void addJob(String jobName, String jobGroupName, String triggerName, String triggerGroupName, Class jobClass, String cron) {  
        try {  
            // 任务名，任务组，任务执行类
            JobDetail jobDetail= JobBuilder.newJob(jobClass).withIdentity(jobName, jobGroupName).build();

            // 触发器  
            TriggerBuilder<Trigger> triggerBuilder = TriggerBuilder.newTrigger();
            // 触发器名,触发器组  
            triggerBuilder.withIdentity(triggerName, triggerGroupName);
            triggerBuilder.startNow();
            // 触发器时间设定  
            triggerBuilder.withSchedule(CronScheduleBuilder.cronSchedule(cron));
            // 创建Trigger对象
            CronTrigger trigger = (CronTrigger) triggerBuilder.build();
            
            //scheduler = (Scheduler) SpringContextUtils.getBean("schedulerFactory");
            // 调度容器设置JobDetail和Trigger
            //scheduler = getScheduler();
            if(scheduler != null) {
            	scheduler.scheduleJob(jobDetail, trigger);  
            	// 启动  
            	if (!scheduler.isShutdown()) {  
            		scheduler.start();  
            	}  
            }
        } catch (Exception e) {  
            throw new RuntimeException(e);  
        }  
    }  

	/** 
     * @Description: 修改一个任务的触发时间
     *  
     * @param jobName 
     * @param jobGroupName
     * @param triggerName 触发器名
     * @param triggerGroupName 触发器组名 
     * @param cron   时间设置，参考quartz说明文档   
     */  
    public static void modifyJobTime(String jobName, String jobGroupName, String triggerName, String triggerGroupName, String cron) {  
        try {  
            TriggerKey triggerKey = TriggerKey.triggerKey(triggerName, triggerGroupName);
            CronTrigger trigger = (CronTrigger) scheduler.getTrigger(triggerKey);  
            if (trigger == null) {  
                return;  
            }  

            String oldTime = trigger.getCronExpression();  
            if (!oldTime.equalsIgnoreCase(cron)) { 
                /** 方式一 ：调用 rescheduleJob 开始 */
                // 触发器  
                TriggerBuilder<Trigger> triggerBuilder = TriggerBuilder.newTrigger();
                // 触发器名,触发器组  
                triggerBuilder.withIdentity(triggerName, triggerGroupName);
                triggerBuilder.startNow();
                // 触发器时间设定  
                triggerBuilder.withSchedule(CronScheduleBuilder.cronSchedule(cron));
                // 创建Trigger对象
                trigger = (CronTrigger) triggerBuilder.build();
                // 方式一 ：修改一个任务的触发时间
                scheduler.rescheduleJob(triggerKey, trigger);
                /** 方式一 ：调用 rescheduleJob 结束 */

                /** 方式二：先删除，然后在创建一个新的Job  */
                //JobDetail jobDetail = scheduler.getJobDetail(JobKey.jobKey(jobName, jobGroupName));  
                //Class<? extends Job> jobClass = jobDetail.getJobClass();  
                //removeJob(jobName, jobGroupName, triggerName, triggerGroupName);  
                //addJob(jobName, jobGroupName, triggerName, triggerGroupName, jobClass, cron); 
                /** 方式二 ：先删除，然后在创建一个新的Job */
            }  
        } catch (Exception e) {  
            throw new RuntimeException(e);  
        }  
    }  

    /** 
     * @Description: 停止任务
     *  
     * @param jobName 
     * @param jobGroupName 
     * @param triggerName 
     * @param triggerGroupName 
     */  
    public static void pauseJob(String jobName, String jobGroupName, String triggerName, String triggerGroupName) {  
        try {  
            TriggerKey triggerKey = TriggerKey.triggerKey(triggerName, triggerGroupName);
            scheduler.pauseTrigger(triggerKey);// 停止触发器  
            
            JobKey jobKey = JobKey.jobKey(jobName, jobGroupName);
            scheduler.pauseJob(jobKey); // 停止任务
            
        } catch (Exception e) {  
            throw new RuntimeException(e);  
        }  
    }  
    

    /** 
     * @Description: 恢复任务
     *  
     * @param jobName 
     * @param jobGroupName 
     * @param triggerName 
     * @param triggerGroupName 
     */  
    public static void resumeJob(String jobName, String jobGroupName,  
            String triggerName, String triggerGroupName) {  
        try {  
            TriggerKey triggerKey = TriggerKey.triggerKey(triggerName, triggerGroupName);
            scheduler.resumeTrigger(triggerKey);// 恢复触发器  
            
            JobKey jobKey = JobKey.jobKey(jobName, jobGroupName);
            scheduler.resumeJob(jobKey); // 恢复任务
        } catch (Exception e) {  
            throw new RuntimeException(e);  
        }  
    }
    
    /** 
     * @Description: 立即运行一次
     *  这里的立即运行，只会运行一次，方便测试时用。quartz是通过临时生成一个trigger的方式来实现的，这个trigger将在本次任务运行完成之后自动删除。trigger的key是随机生成的
     * @param jobName 
     * @param jobGroupName 
     * @param triggerName 
     * @param triggerGroupName 
     */  
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public static void triggerJob(String jobName, String jobGroupName, String triggerName, String triggerGroupName, Class jobClass) {
    	try {
    		TriggerKey triggerKey = TriggerKey.triggerKey(triggerName, triggerGroupName);
    		Trigger trigger = scheduler.getTrigger(triggerKey);  
            if (trigger == null) {
            	// 触发器  
                TriggerBuilder<Trigger> triggerBuilder = TriggerBuilder.newTrigger();
                // 触发器名,触发器组  
                triggerBuilder.withIdentity(triggerName, triggerGroupName);
                triggerBuilder.startNow();
                // 触发器时间设定  
                //triggerBuilder.withSchedule(CronScheduleBuilder.cronSchedule("0/5 * * * * ?")); // 此处不用设置
                // 任务名，任务组，任务执行类
                JobDetail jobDetail= JobBuilder.newJob(jobClass).withIdentity(jobName, jobGroupName).build();
                // 创建Trigger对象
                SimpleTriggerImpl simple = (SimpleTriggerImpl) triggerBuilder.build();

                // 调度容器设置JobDetail和Trigger
                scheduler.scheduleJob(jobDetail, simple); 
            } else {
            	JobKey jobKey = JobKey.jobKey(jobName, jobGroupName);
            	scheduler.triggerJob(jobKey);
            }
            
            // 启动  
            if (!scheduler.isShutdown()) {  
                scheduler.start();  
            } 
    	} catch (Exception e) {  
    		throw new RuntimeException(e);  
    	}  
    }
    
    /** 
     * @Description: 移除一个任务 
     *  
     * @param jobName 
     * @param jobGroupName 
     * @param triggerName 
     * @param triggerGroupName 
     */  
    public static void removeJob(String jobName, String jobGroupName,  
            String triggerName, String triggerGroupName) {  
        try {  
            TriggerKey triggerKey = TriggerKey.triggerKey(triggerName, triggerGroupName);

            scheduler.pauseTrigger(triggerKey);// 停止触发器  
            scheduler.unscheduleJob(triggerKey);// 移除触发器  
            scheduler.deleteJob(JobKey.jobKey(jobName, jobGroupName));// 删除任务  
        } catch (Exception e) {  
            throw new RuntimeException(e);  
        }  
    }  

    /** 
     * @Description:启动所有定时任务 
     */  
    public static void startAllJobs() {  
        try {  
            scheduler.start();  
        } catch (Exception e) {  
            throw new RuntimeException(e);  
        }  
    }  
    
    /** 
     * @Description:暂停所有定时任务 
     */  
    public static void stopAllJobs() {  
    	try {  
    		scheduler.pauseAll();  
    	} catch (Exception e) {  
    		throw new RuntimeException(e);  
    	}  
    }  

    /** 
     * @Description:关闭所有定时任务 
     */  
    public static void shutdownJobs() {  
        try {  
            if (!scheduler.isShutdown()) {  
                scheduler.shutdown();  
            }  
        } catch (Exception e) {  
            throw new RuntimeException(e);  
        }  
    }

    
}