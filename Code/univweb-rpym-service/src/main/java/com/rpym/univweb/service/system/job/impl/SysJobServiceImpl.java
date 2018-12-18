package com.rpym.univweb.service.system.job.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.TriggerBuilder;
import org.quartz.TriggerKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.rpym.univweb.constants.CommonConst;
import com.rpym.univweb.dao.SysJobsMapper;
import com.rpym.univweb.dao.ext.SysJobsExtMapper;
import com.rpym.univweb.dto.job.SysJobsDto;
import com.rpym.univweb.dto.job.SysJobsQueryDto;
import com.rpym.univweb.entity.SysJobs;
import com.rpym.univweb.entity.SysJobsExample;
import com.rpym.univweb.service.base.BaseService;
import com.rpym.univweb.service.system.job.ISysJobsService;
import com.rpym.univweb.service.system.job.busjobs.BaseJob;
import com.rpym.univweb.utils.ResponseResult;
import com.rpym.univweb.utils.UWException;

@Service("sysJobsService")
public class SysJobServiceImpl extends BaseService implements ISysJobsService{
	private static Logger log = LoggerFactory.getLogger(SysJobServiceImpl.class);  

	@Autowired
	SysJobsMapper sysJobsDao;
	
	@Autowired
	SysJobsExtMapper sysJobsExtDao;
	
	
	//加入Qulifier注解，通过名称注入bean
	@Autowired @Qualifier("Scheduler")
	private Scheduler scheduler;
	
	
	
	/**
	 * 删除
	 * @param id
	 * @return   
	 */
	public Integer deleteSysJobs(Long id) {
		SysJobs sysJobs = sysJobsDao.selectByPrimaryKey(id);
		sysJobs.setIsabandoned(Boolean.valueOf(true));
		try {
			scheduler.pauseTrigger(TriggerKey.triggerKey(sysJobs.getJobname(), null));
			scheduler.unscheduleJob(TriggerKey.triggerKey(sysJobs.getClass().getName(), null));
			scheduler.deleteJob(JobKey.jobKey(sysJobs.getClass().getName(), null));				
			sysJobsDao.updateByPrimaryKeySelective(sysJobs);
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
		return 1;
	}

	/**
	 * 修改
	 * @param id
	 * @return   
	 */
	public Integer updateSysJobsInfo(SysJobsDto sysJobsDto) {
		if(sysJobsDto == null || sysJobsDto.getId() == null) {
			throw new UWException("参数id不能为空");
		}
		SysJobs sysJobs = sysJobsDao.selectByPrimaryKey(sysJobsDto.getId());
		try {
			jobreschedule(sysJobs.getJobclass(), null, sysJobs.getJobcron());
			BeanUtils.copyProperties(sysJobsDto, sysJobs);
			sysJobsDao.updateByPrimaryKeySelective(sysJobs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 1;
	}
	public void jobreschedule(String jobClassName, String jobGroupName, String cronExpression) throws Exception
	{				
		try {
			TriggerKey triggerKey = TriggerKey.triggerKey(jobClassName, jobGroupName);
			// 表达式调度构建器
			CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(cronExpression);

			CronTrigger trigger = (CronTrigger) scheduler.getTrigger(triggerKey);

			// 按新的cronExpression表达式重新构建trigger
			trigger = trigger.getTriggerBuilder().withIdentity(triggerKey).withSchedule(scheduleBuilder).build();

			// 按新的trigger重新设置job执行
			scheduler.rescheduleJob(triggerKey, trigger);
		} catch (SchedulerException e) {
			System.out.println("更新定时任务失败"+e);
			throw new Exception("更新定时任务失败");
		}
	}
	
	/**
	 * 根据id查询显示详情
	 * @param id
	 * @return   
	 */
	public SysJobs getSysJobsById(Long id) {
		return sysJobsDao.selectByPrimaryKey(id);
	}

	/**
	 * 分页列表显示任务信息
	 * @param id
	 * @return   
	 */
	public PageInfo<SysJobs> findSysJobsInfoPage(SysJobsQueryDto sysJobsQueryDto) {
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		if(StringUtils.isNotBlank(sysJobsQueryDto.getJobname())) {
			paramMap.put("jobName", sysJobsQueryDto.getJobname());
		}
		if(StringUtils.isNotBlank(sysJobsQueryDto.getJobclass())) {
			paramMap.put("jobClass", sysJobsQueryDto.getJobclass());
		}
		PageHelper.startPage(sysJobsQueryDto.getPageNum(), sysJobsQueryDto.getPageSize());
		List<SysJobs> list = sysJobsExtDao.findSysJobs(paramMap);
		return new PageInfo<SysJobs>(list);
	}

	
	/**
	 * 保存
	 * @param id
	 * @return   
	 */
	public Integer saveSysJobs(SysJobsDto sysJobsDto) {
		SysJobsExample example = new SysJobsExample();
		Integer count = null;
		if(sysJobsDto.getJobclass() != null) {
			example.createCriteria().andJobclassEqualTo(sysJobsDto.getJobclass());
			count = sysJobsDao.countByExample(example);
		}
		if((count != null) && (count >= CommonConst.NUM_1)) {
			throw new UWException("定时任务:" + sysJobsDto.getJobclass() +  "已存在,忽略!");
		}
		SysJobs sysJobsWithBlobs = new SysJobs();
		BeanUtils.copyProperties(sysJobsDto, sysJobsWithBlobs);
		sysJobsWithBlobs.setCreationtime(new Date());
		return sysJobsDao.insertSelective(sysJobsWithBlobs);
	}

	/**
	 * 启动
	 * @throws Exception 
	 */
	public ResponseResult startSingleSysJob(Long id) throws Exception {
		SysJobs job = sysJobsDao.selectByPrimaryKey(id);
		
		// 启动调度器  
		scheduler.start(); 
				
		//构建job信息
		JobDetail jobDetail = JobBuilder.newJob(getClass(job.getJobclass()).getClass()).withIdentity(job.getJobclass(), null).build();
		
		//表达式调度构建器(即任务执行的时间)
        CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(job.getJobcron());

        //按新的cronExpression表达式构建一个新的trigger
        CronTrigger trigger = TriggerBuilder.newTrigger().withIdentity(job.getClass().getName(), null).withSchedule(scheduleBuilder).build();
        
        try {
        	scheduler.scheduleJob(jobDetail, trigger);
            
        } catch (SchedulerException e) {
            System.out.println("创建定时任务失败"+e);
            throw new Exception("创建定时任务失败");
        }
		return ResponseResult.ok();
	}
	
	public ResponseResult stopSingleSysJob(Long id) {
		SysJobs job = sysJobsDao.selectByPrimaryKey(id);
		if(job != null) {
			//QuartzManager.pauseJob(job.getJobname(), QuartzManager.JOB_GROUP_NAME, "univweb_"+job.getJobname(), QuartzManager.TRIGGER_GROUP_NAME);
			try {
				this.jobPause(job.getJobname(), null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return ResponseResult.ok();
	}
	public void jobPause(String jobClassName, String jobGroupName) throws Exception
	{	
		scheduler.pauseJob(JobKey.jobKey(jobClassName, jobGroupName));
	}
	
	public Integer stopJobs(String ids) {
		return null;
	}

	public Integer startSysJob(String ids) {
		// TODO Auto-generated method stub
		return null;
	}

	public PageInfo<SysJobs> findSysJobs(Integer pageNum, Integer pageSize) {
		SysJobsExample jobsExample = new SysJobsExample();
		SysJobsExample.Criteria jobsCriteria = jobsExample.createCriteria();
		jobsCriteria.andJobnameIsNotNull().andJobclassIsNotNull();
		PageHelper.startPage(pageNum, pageSize);
		List<SysJobs> list = sysJobsDao.selectByExample(jobsExample);
		return new PageInfo<SysJobs>(list);
	}

	public static BaseJob getClass(String classname) throws Exception 
	{
		Class<?> class1 = Class.forName(classname);
		return (BaseJob)class1.newInstance();
	}
}
