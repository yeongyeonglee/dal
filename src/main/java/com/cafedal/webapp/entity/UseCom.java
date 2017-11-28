package com.cafedal.webapp.entity;

import java.util.Date;

public class UseCom {
	private int num;
	private int nnum;
	private String writerid;
	private String content;
	private int noticenum;
	private Date date;
	
	
	public UseCom() {}


	

	public UseCom(int num, int nnum, String writerid, String content, int noticenum, Date date) {
		this.num = num;
		this.nnum = nnum;
		this.writerid = writerid;
		this.content = content;
		this.noticenum = noticenum;
		this.date = date;
	}




	public UseCom(int noticenum, String content, String writerid) {
	
		this.writerid = writerid;
		this.content = content;
		this.noticenum = noticenum;

	}




	public int getNum() {
		return num;
	}




	public void setNum(int num) {
		this.num = num;
	}




	public int getNnum() {
		return nnum;
	}




	public void setNnum(int nnum) {
		this.nnum = nnum;
	}




	public String getWriterid() {
		return writerid;
	}




	public void setWriterid(String writerid) {
		this.writerid = writerid;
	}




	public String getContent() {
		return content;
	}




	public void setContent(String content) {
		this.content = content;
	}




	public int getNoticenum() {
		return noticenum;
	}




	public void setNoticenum(int noticenum) {
		this.noticenum = noticenum;
	}




	public Date getDate() {
		return date;
	}




	public void setDate(Date date) {
		this.date = date;
	}


	
	
	
}