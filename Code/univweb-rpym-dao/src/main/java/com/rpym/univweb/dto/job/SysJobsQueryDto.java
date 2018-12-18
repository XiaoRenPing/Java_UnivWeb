package com.rpym.univweb.dto.job;

import com.rpym.univweb.dto.PageDto;

public class SysJobsQueryDto extends PageDto{

	private String jobname;

	private String jobclass;

	public String getJobname() {
		return jobname;
	}

	public void setJobname(String jobname) {
		this.jobname = jobname;
	}

	public String getJobclass() {
		return jobclass;
	}

	public void setJobclass(String jobclass) {
		this.jobclass = jobclass;
	}
}
