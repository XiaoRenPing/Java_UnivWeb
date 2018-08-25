package com.rpym.univweb.dto.job;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "sysjobs")
public class SysJobsDto {

	private Long id;
    private String jobname;

    private String jobclass;
	
	private String jobargs;
	

    private String jobdesc;

    private String jobstatus;

    private String jobcron;

    private String nodestatus;

    private String nodeip;

	private Short trycount;

    private Date nexttrytime;
    private Date lasttrytime;

    private Boolean isabandoned;
    
    private String exceptionmessage;

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public String getJobdesc() {
		return jobdesc;
	}

	public void setJobdesc(String jobdesc) {
		this.jobdesc = jobdesc;
	}

	public String getJobstatus() {
		return jobstatus;
	}

	public void setJobstatus(String jobstatus) {
		this.jobstatus = jobstatus;
	}

	public String getJobcron() {
		return jobcron;
	}

	public void setJobcron(String jobcron) {
		this.jobcron = jobcron;
	}

	public String getNodestatus() {
		return nodestatus;
	}

	public void setNodestatus(String nodestatus) {
		this.nodestatus = nodestatus;
	}

	public String getNodeip() {
		return nodeip;
	}

	public void setNodeip(String nodeip) {
		this.nodeip = nodeip;
	}

	public Short getTrycount() {
		return trycount;
	}

	public void setTrycount(Short trycount) {
		this.trycount = trycount;
	}

	public Date getNexttrytime() {
		return nexttrytime;
	}

	public void setNexttrytime(Date nexttrytime) {
		this.nexttrytime = nexttrytime;
	}

	public Date getLasttrytime() {
		return lasttrytime;
	}

	public void setLasttrytime(Date lasttrytime) {
		this.lasttrytime = lasttrytime;
	}

	public Boolean getIsabandoned() {
		return isabandoned;
	}

	public void setIsabandoned(Boolean isabandoned) {
		this.isabandoned = isabandoned;
	}

	public String getJobargs() {
		return jobargs;
	}

	public void setJobargs(String jobargs) {
		this.jobargs = jobargs;
	}

	public String getExceptionmessage() {
		return exceptionmessage;
	}

	public void setExceptionmessage(String exceptionmessage) {
		this.exceptionmessage = exceptionmessage;
	}

	
    
}
