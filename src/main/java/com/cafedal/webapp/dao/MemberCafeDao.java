package com.cafedal.webapp.dao;


import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cafedal.webapp.entity.Member;
import com.cafedal.webapp.entity.MemberCafe;



public interface MemberCafeDao  {

	List<MemberCafe> getListByMemberId(String memberid);

	int insert(MemberCafe memberCafe);
	
	int insert(String num, String memberid, String cafecode);

	int insert(String memberid, String cafecode);

}

