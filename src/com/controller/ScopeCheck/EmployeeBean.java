package com.controller.ScopeCheck;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("empBean")
public class EmployeeBean {
	private String ename;
	private String ecode;
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEcode() {
		return ecode;
	}
	public void setEcode(String ecode) {
		this.ecode = ecode;
	}
	
}
