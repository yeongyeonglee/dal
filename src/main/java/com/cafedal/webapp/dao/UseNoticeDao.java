package com.cafedal.webapp.dao;

import java.util.List;


import com.cafedal.webapp.entity.UseNotice;

public interface UseNoticeDao {

	List<UseNotice> getUseList(int page, String field, String query);

	int getCount();

	UseNotice get(int num);

	UseNotice getPrev(int num);

	UseNotice getNext(int num);

	int insert(String utitle, String ucontent, String cname, String cafecode);

	int insert(UseNotice usenotice);

	String getNextNum();

	int update(UseNotice usenotice);

	int delete(int num);
	
	int updateHit(int num);

}
