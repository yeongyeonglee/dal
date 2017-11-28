package com.cafedal.webapp.dao;

import java.util.List;

import com.cafedal.webapp.entity.CmtView1;




public interface CmtDao1  {

	CmtView1 get(int noticenum);

	List<CmtView1> getCList(int num);
	
	List<CmtView1> getCmtList(int page, String field, String query/*, int noticenum*/);


}

