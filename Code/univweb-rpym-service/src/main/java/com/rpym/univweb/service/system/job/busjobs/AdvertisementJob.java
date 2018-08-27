package com.rpym.univweb.service.system.job.busjobs;

import java.util.Date;

import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.stereotype.Service;

import com.rpym.univweb.annotation.ScheduleJob;
import com.rpym.univweb.service.base.BaseService;

@Service("advertisementJob")
@ScheduleJob(name = "advertisementJob", desc = "advertisementJob", cron = "*/2 * * * * ?", args = "", isabandoned = "0")
public class AdvertisementJob implements Job{
	
	private static final Logger logger = Logger.getLogger(AdvertisementJob.class);
	
	public void execute(JobExecutionContext context) throws JobExecutionException {
		  System.out.println(String.format("%tF %<tT", new Date()) + ": 检查广告到期....");
	}

}
