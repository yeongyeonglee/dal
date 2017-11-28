package com.cafedal.webapp.entity;

public class Manage extends Member {
	String role;
	String code;
	String cafename;

	public Manage() {
	}

	public Manage(String role, String code, String cafename) {
		super();
		this.role = role;
		this.code = code;
		this.cafename = cafename;
	}

	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCafename() {
		return cafename;
	}

	public void setCafename(String cafename) {
		this.cafename = cafename;
	}

}