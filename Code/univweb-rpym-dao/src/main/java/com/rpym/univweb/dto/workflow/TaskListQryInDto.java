package com.rpym.univweb.dto.workflow;

import com.rpym.univweb.dto.PageDto;

public class TaskListQryInDto extends PageDto{
	
	private String assigner;
	
	private String taskname;
	
	private String begindate;
	
	private String enddate;

	public String getAssigner() {
		return assigner;
	}

	public void setAssigner(String assigner) {
		this.assigner = assigner;
	}

	public String getTaskname() {
		return taskname;
	}

	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}

	public String getBegindate() {
		return begindate;
	}

	public void setBegindate(String begindate) {
		this.begindate = begindate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

}
