package com.cafedal.webapp.entity;

public class Cafe {

	private String num;
	private String cafecode;
	private String cafename;
	private String memberid;
	
	public Cafe() {
	}

	public Cafe(String num, String cafecode, String cafename, String memberid) {
		this.num = num;
		this.cafecode = cafecode;
		this.cafename = cafename;
		this.memberid = memberid;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getCafecode() {
		return cafecode;
	}

	public void setCafecode(String cafecode) {
		this.cafecode = cafecode;
	}

	public String getCafename() {
		return cafename;
	}

	public void setCafename(String cafename) {
		this.cafename = cafename;
	}

	public String getMemberid() {
		return memberid;
	}

	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}
	
	
	
}
