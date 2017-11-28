package com.cafedal.webapp.dao;


import java.util.List;

import com.cafedal.webapp.entity.DcCom;



public interface DcComDao {

	List<DcCom> getComList(int num);
	   
	int insert(int noticenum, String content, String writerid);
	int insert(DcCom dccom);

	int update(DcCom dccom);

	DcCom get(DcCom dccom);

	DcCom get(int noticenum, int nnum);

	int delete(int num);

}
