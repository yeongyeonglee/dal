package com.cafedal.webapp.entity;

import java.sql.Date;

public class CalendarView {
	String id;
	String cafecode;
	String name;
	String dtitle;
	String content;
	Date startdate;
	Date finishdate;
	

	public CalendarView() {
	}
	
	public CalendarView(String id, String cafecode, String name, String dtitle, String content, Date startdate,
			Date finishdate) {
		super();
		this.id = id;
		this.cafecode = cafecode;
		this.name = name;
		this.dtitle = dtitle;
		this.content = content;
		this.startdate = startdate;
		this.finishdate = finishdate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCafecode() {
		return cafecode;
	}

	public void setCafecode(String cafecode) {
		this.cafecode = cafecode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDtitle() {
		return dtitle;
	}

	public void setDtitle(String dtitle) {
		this.dtitle = dtitle;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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

	
	
}
