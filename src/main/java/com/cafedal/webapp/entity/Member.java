package com.cafedal.webapp.entity;

public class Member {

	protected String id;
	private String name;
	private String pwd;
	private String mail;
	private String birth;
	private String role;
	private String cafes;
	
	public Member() {
	}

	public Member(String id, String name, String pwd, String mail, String birth, String role, String cafes) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.mail = mail;
		this.birth = birth;
		this.role = role;
		this.cafes = cafes;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getCafes() {
		return cafes;
	}

	public void setCafes(String cafes) {
		this.cafes = cafes;
	}
}
