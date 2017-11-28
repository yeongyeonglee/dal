
package com.cafedal.webapp.dao.mybatis;


import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.cafedal.webapp.dao.DcComDao;

import com.cafedal.webapp.entity.DcCom;





public class MyBatisDcComDao implements DcComDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<DcCom> getComList(int num) {
		
		DcComDao dccomDao = sqlSession.getMapper(DcComDao.class);
		List<DcCom> comlist = dccomDao.getComList(num);

		return comlist;
	}

	@Override
	public int insert(int noticenum, String content, String writerid) {
		int result = insert(new DcCom(noticenum, content,writerid));
		return result;
	}

	@Override
	public int insert(DcCom dccom) {
		DcComDao dccomDao = sqlSession.getMapper(DcComDao.class);
		return  dccomDao.insert(dccom);
	}

	@Override
	public int update(DcCom dccom) {
		DcComDao dccomDao = sqlSession.getMapper(DcComDao.class);
		return  dccomDao.update(dccom);
	}

	@Override
	public DcCom get(DcCom dccom) {
		DcComDao dccomDao = sqlSession.getMapper(DcComDao.class);
		return  dccomDao.get(dccom);
	}
	
	@Override
	public DcCom get(int noticenum, int nnum) {
		DcComDao dccomDao = sqlSession.getMapper(DcComDao.class);
		return  dccomDao.get( noticenum,  nnum);
	}

	@Override
	public int delete(int num) {
		DcComDao dccomDao = sqlSession.getMapper(DcComDao.class);
		return  dccomDao.delete(num);
	}



}
