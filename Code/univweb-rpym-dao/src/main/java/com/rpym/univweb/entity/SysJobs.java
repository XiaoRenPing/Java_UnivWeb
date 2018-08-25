package com.rpym.univweb.entity;

import java.io.Serializable;
import java.util.Date;

public class SysJobs implements Serializable {
    private Long id;

    private String jobname;

    private String jobclass;

    private String jobdesc;

    private String jobargs;

    private String jobstatus;

    private String jobcron;

    private String nodestatus;

    private String nodeip;

    private Short trycount;

    private Date nexttrytime;

    private Date lasttrytime;

    private Boolean isabandoned;

    private Date creationtime;

    private Long creatoruserid;

    private String exceptionmessage;

    private static final long serialVersionUID = 1L;

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
        this.jobname = jobname == null ? null : jobname.trim();
    }

    public String getJobclass() {
        return jobclass;
    }

    public void setJobclass(String jobclass) {
        this.jobclass = jobclass == null ? null : jobclass.trim();
    }

    public String getJobdesc() {
        return jobdesc;
    }

    public void setJobdesc(String jobdesc) {
        this.jobdesc = jobdesc == null ? null : jobdesc.trim();
    }

    public String getJobargs() {
        return jobargs;
    }

    public void setJobargs(String jobargs) {
        this.jobargs = jobargs == null ? null : jobargs.trim();
    }

    public String getJobstatus() {
        return jobstatus;
    }

    public void setJobstatus(String jobstatus) {
        this.jobstatus = jobstatus == null ? null : jobstatus.trim();
    }

    public String getJobcron() {
        return jobcron;
    }

    public void setJobcron(String jobcron) {
        this.jobcron = jobcron == null ? null : jobcron.trim();
    }

    public String getNodestatus() {
        return nodestatus;
    }

    public void setNodestatus(String nodestatus) {
        this.nodestatus = nodestatus == null ? null : nodestatus.trim();
    }

    public String getNodeip() {
        return nodeip;
    }

    public void setNodeip(String nodeip) {
        this.nodeip = nodeip == null ? null : nodeip.trim();
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

    public Date getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    public Long getCreatoruserid() {
        return creatoruserid;
    }

    public void setCreatoruserid(Long creatoruserid) {
        this.creatoruserid = creatoruserid;
    }

    public String getExceptionmessage() {
        return exceptionmessage;
    }

    public void setExceptionmessage(String exceptionmessage) {
        this.exceptionmessage = exceptionmessage == null ? null : exceptionmessage.trim();
    }

	@Override
	public String toString() {
		return "SysJobs [id=" + id + ", jobname=" + jobname + ", jobclass=" + jobclass + ", jobdesc=" + jobdesc
				+ ", jobargs=" + jobargs + ", jobstatus=" + jobstatus + ", jobcron=" + jobcron + ", nodestatus="
				+ nodestatus + ", nodeip=" + nodeip + ", trycount=" + trycount + ", nexttrytime=" + nexttrytime
				+ ", lasttrytime=" + lasttrytime + ", isabandoned=" + isabandoned + ", creationtime=" + creationtime
				+ ", creatoruserid=" + creatoruserid + ", exceptionmessage=" + exceptionmessage + "]";
	}
    
    
}