package com.cafedal.webapp.dao.mybatis;


import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.cafedal.webapp.dao.MemberCafeDao;
import com.cafedal.webapp.dao.MemberDao;
import com.cafedal.webapp.dao.NoticeFileDao;
import com.cafedal.webapp.entity.Member;
import com.cafedal.webapp.entity.MemberCafe;
import com.cafedal.webapp.entity.NoticeFile;


public class MyBatisMemberCafeDao implements MemberCafeDao {

   @Autowired
   private SqlSessionTemplate sqlSession;

	@Override
	public List<MemberCafe> getListByMemberId(String memberid) {
		
		MemberCafeDao memberCafeDao = sqlSession.getMapper(MemberCafeDao.class);
		
		List<MemberCafe> list = memberCafeDao.getListByMemberId(memberid);
	      
	    return list;
	}
	
	@Override
	public List<MemberCafe> getListByMemberId2(String memberid) {
		
		MemberCafeDao memberCafeDao = sqlSession.getMapper(MemberCafeDao.class);
		
		List<MemberCafe> list = memberCafeDao.getListByMemberId(memberid);
	      
	    return list;
	}
	
	@Override
	public int insert(MemberCafe memberCafe) {
		
		MemberCafeDao memberCafeDao = sqlSession.getMapper(MemberCafeDao.class);
		
	    int result = memberCafeDao.insert(memberCafe);
	      
	    return result;
	}

	@Override
	public int insert(String num, String memberid, String cafecode) {
		
		int result = insert(new MemberCafe(num, memberid, cafecode));
		
	    return result;
	}

	@Override
	public int insert(String memberid, String cafecode) {
		
		int result = insert(new MemberCafe(memberid, cafecode));
		
		return result;
	}
	
	@Override
	public int delete(MemberCafe memberCafe) {
		
		MemberCafeDao memberCafeDao = sqlSession.getMapper(MemberCafeDao.class);
		
	    int result = memberCafeDao.delete(memberCafe);
	      
	    return result;
	}

	@Override
	public int delete(String num, String memberid, String cafecode) {
		
		int result = delete(new MemberCafe(num, memberid, cafecode));
		
	    return result;
	}
	
	@Override
	public int delete(String memberid, String cafecode) {
		
		int result = delete(new MemberCafe(memberid, cafecode));
		
		return result;
	}


}

	
