package com.cafedal.webapp.dao.mybatis;


import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.cafedal.webapp.dao.CmtDao2;
import com.cafedal.webapp.dao.DcInfoDao;
import com.cafedal.webapp.entity.CmtView2;
import com.cafedal.webapp.entity.DcInfo;


public class MyBatisCmtDao2 implements CmtDao2 {

   @Autowired
   private SqlSessionTemplate sqlSession;

@Override
public CmtView2 get(int noticenum) {
	CmtDao2 cmtDao2 = sqlSession.getMapper(CmtDao2.class);
	CmtView2 result = cmtDao2.get(noticenum);

	return result;
}

@Override
public List<CmtView2> getCList(int num) {
	CmtDao2 cmtDao2 = sqlSession.getMapper(CmtDao2.class);
	List<CmtView2> clist = cmtDao2.getCList(num);

	return clist;
}

/*@Override
public List<CmtView2> getCmtList(int page, String field, String query) {
	// TODO Auto-generated method stub
	return null;
}
*/


 
   
}

	
