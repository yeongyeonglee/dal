package com.cafedal.webapp.dao.mybatis;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;


import com.cafedal.webapp.dao.UseComDao;

import com.cafedal.webapp.entity.UseCom;


public class MyBatisUseComDao implements UseComDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<UseCom> getComList(int num) {
		
		UseComDao usecomDao = sqlSession.getMapper(UseComDao.class);
		List<UseCom> comlist = usecomDao.getComList(num);

		return comlist;
	}

	@Override
	public int insert(int noticenum, String content, String writerid) {
		int result = insert(new UseCom(noticenum, content,writerid));
		return result;
	}

	@Override
	public int insert(UseCom usecom) {
		UseComDao usecomDao = sqlSession.getMapper(UseComDao.class);
		return  usecomDao.insert(usecom);
	}

	@Override
	public int update(UseCom usecom) {
		UseComDao usecomDao = sqlSession.getMapper(UseComDao.class);
		return  usecomDao.update(usecom);
	}

	@Override
	public UseCom get(UseCom usecom) {
		UseComDao usecomDao = sqlSession.getMapper(UseComDao.class);
		return  usecomDao.get(usecom);
	}
	
	@Override
	public UseCom get(int noticenum, int nnum) {
		UseComDao usecomDao = sqlSession.getMapper(UseComDao.class);
		return  usecomDao.get( noticenum,  nnum);
	}

	@Override
	public int delete(int num) {
		UseComDao usecomDao = sqlSession.getMapper(UseComDao.class);
		return  usecomDao.delete(num);
	}




}
