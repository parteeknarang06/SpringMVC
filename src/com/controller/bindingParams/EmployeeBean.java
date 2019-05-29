package com.controller.bindingParams;

import java.util.LinkedHashMap;

public class EmployeeBean {
	private String ename;
	private String ecode;
	private String controller;
	private String country;
	private LinkedHashMap<String, String> countries;
	private String progLang;
	private LinkedHashMap<String, String> progLangList;
	private String[] operatingSystem;
	private LinkedHashMap<String, String> operatingSystemList;
	
	public EmployeeBean() {
		countries=new LinkedHashMap<String, String>();
		countries.put("IN", "India");
		countries.put("UK", "United Kingdom");
		countries.put("SL", "Sri lanka");
		countries.put("SZR", "Swizerland");
		progLangList=new LinkedHashMap<String, String>();
		progLangList.put("c#", "C-Sharp");
		progLangList.put("ruby", "Ruby");
		
		operatingSystemList=new LinkedHashMap<String, String>();
		operatingSystemList.put("Kali", "Kali Linux");
		operatingSystemList.put("Fedora", "Fedora Linux");
		operatingSystemList.put("Backtrack", "Backtrack Linux");
		operatingSystemList.put("Ubuntu", "Ubuntu Linux");
	}
	public String getController() {
		return controller;
	}
	public void setController(String controller) {
		this.controller = controller;
	}
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public LinkedHashMap<String, String> getCountries() {
		return countries;
	}
	public String getProgLang() {
		return progLang;
	}
	public void setProgLang(String progLang) {
		this.progLang = progLang;
	}
	public LinkedHashMap<String, String> getProgLangList() {
		return progLangList;
	}
	public String[] getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public LinkedHashMap<String, String> getOperatingSystemList() {
		return operatingSystemList;
	}
	
}
