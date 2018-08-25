package com.rpym.univweb.dto.workflow;

import java.util.Map;

public class BaseListenerDto {

	private String path;
	
	private String id;
	
	private Map<String, Object> vars;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Map<String, Object> getVars() {
		return vars;
	}

	public void setVars(Map<String, Object> vars) {
		this.vars = vars;
	}
	
}
