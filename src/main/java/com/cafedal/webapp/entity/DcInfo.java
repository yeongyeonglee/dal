package com.cafedal.webapp.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class DcInfo {
	private int num;
	private String cafecode;
	private String cname;
	private String dtitle;
	private String dcontent;
	@DateTimeFormat(pattern="yyyy-MM-dd")private Date startdate;
	@DateTimeFormat(pattern="yyyy-MM-dd")private Date finishdate;
	private String hit;
	
	public DcInfo() {}
	

	
	public DcInfo(int num, String cafecode, String cname, String dtitle, String dcontent, 
			Date startdate, Date finishdate, String hit) {
		this.num = num;
		this.cafecode = cafecode;
		this.cname = cname;
		this.dtitle = dtitle;
		this.dcontent = dcontent;
		this.startdate = startdate;
		this.finishdate = finishdate;
		this.hit = hit;
	}
	
	public DcInfo(int num, String cafecode, String cname, String dtitle, String dcontent, Date startdate,  Date finishdate) {
		this.num = num;
		this.cafecode = cafecode;
		this.cname = cname;
		this.dtitle = dtitle;
		this.dcontent = dcontent;
		this.startdate = startdate;
		this.finishdate = finishdate;
		
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getCafecode() {
		return cafecode;
	}
	public void setCafecode(String cafecode) {
		this.cafecode = cafecode;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getDtitle() {
		return dtitle;
	}
	public void setDtitle(String dtitle) {
		this.dtitle = dtitle;
	}
	public String getDcontent() {
		return dcontent;
	}
	public void setDcontent(String dcontent) {
		this.dcontent = dcontent;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getFinishdate() {
		return finishdate;
	}
	public void setFinishdate(Date finishdate) {
		this.finishdate = finishdate;
	}
	public String getHit() {
		return hit;
	}
	public void setHit(String hit) {
		this.hit = hit;
	}
	
	

}