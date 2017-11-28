package com.cafedal.webapp.dao;

import java.util.List;

import com.cafedal.webapp.entity.UseCom;



public interface UseComDao {


	List<UseCom> getComList(int num);
	   
	int insert(int noticenum, String content, String writerid);
	int insert(UseCom dccom);

	int update(UseCom dccom);

	UseCom get(UseCom dccom);

	UseCom get(int noticenum, int nnum);

	int delete(int num);

	
}
