package com.rpym.univweb.service.system.job.busjobs;

import java.util.Date;

import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.stereotype.Service;

import com.rpym.univweb.annotation.ScheduleJob;
import com.rpym.univweb.service.base.BaseService;

@Service("userOnlineTimeJob")
@ScheduleJob(name = "userOnlineTimeJob", desc = "userOnlineTimeJob", cron = "*/2 * * * * ?", args = "", isabandoned = "0")
public class UserOnlineTimeJob implements Job {

	private static final Logger logger = Logger.getLogger(UserOnlineTimeJob.class);
	
	public void execute(JobExecutionContext context) throws JobExecutionException {
		System.out.println(String.format("%tF %<tT", new Date()) + ": 检查用户登录任务....");
	}

}
