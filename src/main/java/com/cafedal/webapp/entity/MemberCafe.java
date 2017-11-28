package com.cafedal.webapp.entity;

public class MemberCafe {

	private String num;
	private String memberid;
	private String cafecode;
	
	public MemberCafe() {
	}

	public MemberCafe(String num, String memberid, String cafecode) {
		super();
		this.num = num;
		this.memberid = memberid;
		this.cafecode = cafecode;
	}
	
	public MemberCafe(String memberid, String cafecode) {
		super();
		this.memberid = memberid;
		this.cafecode = cafecode;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getMemberid() {
		return memberid;
	}

	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}

	public String getCafecode() {
		return cafecode;
	}

	public void setCafecode(String cafecode) {
		this.cafecode = cafecode;
	}

	
}
