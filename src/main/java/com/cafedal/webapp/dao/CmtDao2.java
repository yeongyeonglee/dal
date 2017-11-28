package com.cafedal.webapp.dao;

import java.util.List;

import com.cafedal.webapp.entity.CmtView1;
import com.cafedal.webapp.entity.CmtView2;




public interface CmtDao2  {

	CmtView2 get(int noticenum);

	List<CmtView2> getCList(int num);
	
	//List<CmtView2> getCmtList(int page, String field, String query);


}

