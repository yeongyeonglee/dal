package com.cafedal.webapp.dao.mybatis;


import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.cafedal.webapp.dao.CmtDao1;
import com.cafedal.webapp.dao.DcInfoDao;
import com.cafedal.webapp.entity.CmtView1;
import com.cafedal.webapp.entity.DcInfo;


public class MyBatisCmtDao1 implements CmtDao1 {

   @Autowired
   private SqlSessionTemplate sqlSession;

   
   @Override
   public CmtView1 get(int noticenum) {
	   
		CmtDao1 cmtDao1 = sqlSession.getMapper(CmtDao1.class);
		CmtView1 result = cmtDao1.get(noticenum);

		return result;
   }
   


	@Override
	public List<CmtView1> getCList(int num) {
		
		CmtDao1 cmtDao1 = sqlSession.getMapper(CmtDao1.class);
		List<CmtView1> clist = cmtDao1.getCList(num);

		return clist;
	}



	@Override
	public List<CmtView1> getCmtList(int page, String field, String query/*, int num*/) {
		CmtDao1 cmtDao1 = sqlSession.getMapper(CmtDao1.class);
		List<CmtView1> cmtlist = cmtDao1.getCmtList(page, field, query/*, num*/);

		return cmtlist;
	}


   
}

	
