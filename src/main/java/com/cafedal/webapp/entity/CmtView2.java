package com.cafedal.webapp.entity;


public class CmtView2 {
	int noticenum;
	int count;
	//String utitle;
	
	public CmtView2(){}

	public CmtView2(int noticenum, int count, String dtitle) {
		this.noticenum = noticenum;
		this.count = count;
		
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

}
