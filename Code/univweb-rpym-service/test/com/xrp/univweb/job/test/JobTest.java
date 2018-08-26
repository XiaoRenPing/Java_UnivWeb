package com.xrp.univweb.job.test;

import com.rpym.univweb.service.system.job.busjobs.AdvertisementJob;
import com.rpym.univweb.utils.QuartzManager;

public class JobTest {

	/**
	 * 测试启动定时任务
	 *    【测试通过】
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			String job_name = "动态任务调度";
			System.out.println("【系统启动】开始(每1秒输出一次)...");  
			//QuartzManager.addJob(job_name, job_name, job_name, job_name, QuartzJob.class, "0/1 * * * * ?");  
			QuartzManager.addJob("广告倒计时", "EXTJWEB_JOBGROUP_NAME", "abc", "EXTJWEB_TRIGGERGROUP_NAME", AdvertisementJob.class, "0/1 * * * * ?");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

