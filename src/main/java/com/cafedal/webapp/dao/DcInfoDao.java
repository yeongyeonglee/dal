package com.cafedal.webapp.dao;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.cafedal.webapp.entity.DcInfo;



public interface DcInfoDao {
	
	List<DcInfo> getUseList(int page, String field, String query);

	int getCount();

	DcInfo get(int num);
	
	//int update(int num, String dtitle, String dcontent);
	DcInfo getPrev(int num);
	DcInfo getNext(int num);
	
	int insert(int num, String cafecode, String cname, String dtitle, String dcontent, Date startdate, Date finishdate);
	int insert(DcInfo dcinfo);


	int update(DcInfo dcinfo);
	
	int updateHit(int num);
	
	int delete(int num);

	//int update(int num, String dtitle, String dcontent, Date startdate, Date finishdate);






	

}
