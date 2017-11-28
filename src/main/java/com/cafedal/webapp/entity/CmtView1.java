package com.cafedal.webapp.entity;

import java.util.List;

public class CmtView1 {
	int noticenum;
	int count;
	String dtitle;
	
	public CmtView1(){}

	public CmtView1(int noticenum, int count, String dtitle) {
		this.noticenum = noticenum;
		this.count = count;
		this.dtitle = dtitle;
	}
	public int getNoticenum() {
		return noticenum;
	}
	public void setNoticenum(int noticenum) {
		this.noticenum = noticenum;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	public String getDtitle() {
		return dtitle;
	}

	public void setDtitle(String dtitle) {
		this.dtitle = dtitle;
	}


	

	
}
