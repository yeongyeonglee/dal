package com.cafedal.webapp.entity;

public class UseNotice {
private int num;
private String cname;
private String utitle;
private String ucontent;
private String cafecode;
private String hit;


public UseNotice() {
	
}


public UseNotice(int num, String cname, String utitle, String ucontent, String cafecode, String hit) {
	this.num = num;
	this.cname = cname;
	this.utitle = utitle;
	this.ucontent = ucontent;
	this.cafecode = cafecode;
	this.hit = hit;
}


public UseNotice(String utitle, String ucontent, String cname, String cafecode) {
	this.cname = cname;
	this.utitle = utitle;
	this.ucontent = ucontent;
	this.cafecode = cafecode;
}


public String getHit() {
	return hit;
}


public void setHit(String hit) {
	this.hit = hit;
}


public int getNum() {
	return num;
}


public void setNum(int num) {
	this.num = num;
}


public String getCname() {
	return cname;
}


public void setCname(String cname) {
	this.cname = cname;
}


public String getUtitle() {
	return utitle;
}


public void setUtitle(String utitle) {
	this.utitle = utitle;
}


public String getUcontent() {
	return ucontent;
}


public void setUcontent(String ucontent) {
	this.ucontent = ucontent;
}


public String getCafecode() {
	return cafecode;
}


public void setCafecode(String cafecode) {
	this.cafecode = cafecode;
}






}
