package com.cafedal.webapp.dao.mybatis;

import java.util.Date;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

/*import com.cafedal.webapp.controller.admin.BoardReplyVO;*/
import com.cafedal.webapp.dao.DcInfoDao;
import com.cafedal.webapp.entity.DcInfo;


public class MyBatisDcInfoDao implements DcInfoDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<DcInfo> getUseList(int page, String field, String query) {

		DcInfoDao dcinfoDao = sqlSession.getMapper(DcInfoDao.class);
		List<DcInfo> list = dcinfoDao.getUseList(page, field, query);

		return list;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DcInfo get(int num) {
		DcInfoDao dcinfoDao = sqlSession.getMapper(DcInfoDao.class);
		DcInfo dcinfo = dcinfoDao.get(num);

		return dcinfo;
	}


	@Override
	public DcInfo getPrev(int num) {
		DcInfoDao dcinfoDao = sqlSession.getMapper(DcInfoDao.class);		
		DcInfo result = dcinfoDao.getPrev(num);
		
		return result;
	}

	@Override
	public DcInfo getNext(int num) {
		DcInfoDao dcinfoDao = sqlSession.getMapper(DcInfoDao.class);		
		DcInfo result = dcinfoDao.getNext(num);

		return result;
	}

	@Override
	public int insert(int num, String cafecode, String cname, String dtitle, String dcontent, Date startdate, Date finishdate) {
		int result = insert(new DcInfo(num, cafecode, cname, dtitle, dcontent, startdate, finishdate));
		return result;
	}

	@Override
	public int insert(DcInfo dcinfo) {
		DcInfoDao dcinfoDao = sqlSession.getMapper(DcInfoDao.class);		
		return dcinfoDao.insert(dcinfo);
	}


	@Override
	public int update(DcInfo dcinfo) {
		DcInfoDao dcinfoDao = sqlSession.getMapper(DcInfoDao.class);
		 int result = dcinfoDao.update(dcinfo);
		return result;
	}

	@Override
	public int delete(int num) {
		DcInfoDao dcinfoDao = sqlSession.getMapper(DcInfoDao.class);
	      int result = dcinfoDao.delete(num);
	      return result;
	}

	@Override
	public int updateHit(int num) {
		DcInfoDao dcinfoDao = sqlSession.getMapper(DcInfoDao.class);
	      int result = dcinfoDao.updateHit(num);
	      return result;
	}


}
