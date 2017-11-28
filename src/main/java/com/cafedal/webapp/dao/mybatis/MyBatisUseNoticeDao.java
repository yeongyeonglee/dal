package com.cafedal.webapp.dao.mybatis;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.cafedal.webapp.dao.DcInfoDao;
import com.cafedal.webapp.dao.UseNoticeDao;

import com.cafedal.webapp.entity.UseNotice;

public class MyBatisUseNoticeDao implements UseNoticeDao {
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<UseNotice> getUseList(int page, String field, String query) {

		UseNoticeDao usenoticeDao = sqlSession.getMapper(UseNoticeDao.class);
		List<UseNotice> list = usenoticeDao.getUseList(page, field, query);

		return list;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UseNotice get(int num) {
		UseNoticeDao usenoticeDao = sqlSession.getMapper(UseNoticeDao.class);
		UseNotice usenotice = usenoticeDao.get(num);

		return usenotice;
	}

	@Override
	public UseNotice getPrev(int num) {
		  UseNoticeDao usenoticeDao = sqlSession.getMapper(UseNoticeDao.class);
	      UseNotice result = usenoticeDao.getPrev(num);
	      return result;
		
	}

	@Override
	public UseNotice getNext(int num) {
		  UseNoticeDao usenoticeDao = sqlSession.getMapper(UseNoticeDao.class);
	      UseNotice result = usenoticeDao.getNext(num);
	      return result;
	}


	@Override
	public int insert(String utitle, String ucontent, String cname, String cafecode) {
	    return insert(new UseNotice(utitle, ucontent, cname, cafecode));
	}

	@Override
	public int insert(UseNotice usenotice) {
		UseNoticeDao usenoticeDao = sqlSession.getMapper(UseNoticeDao.class);
		 int result = usenoticeDao.insert(usenotice);
	      return result;
	}

	@Override
	public String getNextNum() {
		UseNoticeDao usenoticeDao = sqlSession.getMapper(UseNoticeDao.class);
		  return usenoticeDao.getNextNum();
	}

	@Override
	public int update(UseNotice usenotice) {
		UseNoticeDao usenoticeDao = sqlSession.getMapper(UseNoticeDao.class);
		 int result = usenoticeDao.update(usenotice);
		return result;
	}

	@Override
	public int delete(int num) {
		UseNoticeDao usenoticeDao = sqlSession.getMapper(UseNoticeDao.class);
	      int result = usenoticeDao.delete(num);
	      return result;
	}

	@Override
	public int updateHit(int num) {
		UseNoticeDao usenoticeDao = sqlSession.getMapper(UseNoticeDao.class);
	      int result = usenoticeDao.updateHit(num);
	      return result;
	}



	

}
