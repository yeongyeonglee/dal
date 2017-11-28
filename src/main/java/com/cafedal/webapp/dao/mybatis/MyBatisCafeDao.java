package com.cafedal.webapp.dao.mybatis;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.cafedal.webapp.dao.CafeDao;
import com.cafedal.webapp.entity.AdminCafe;
/*import com.cafedal.webapp.controller.admin.BoardReplyVO;*/
import com.cafedal.webapp.entity.Cafe;
import com.cafedal.webapp.entity.DcInfo;


public class MyBatisCafeDao implements CafeDao {

	@Autowired
	private SqlSessionTemplate sqlSession;




	@Override
	public List<AdminCafe> getUseList(Integer page, String field, String query) {
		CafeDao cafeDao = sqlSession.getMapper(CafeDao.class);
		List<AdminCafe> list = cafeDao.getUseList( page, field,  query);
		return list;
	}




	@Override
	public int insert(String code, String name) {
		CafeDao cafeDao = sqlSession.getMapper(CafeDao.class);
		int result = insert(new AdminCafe(code,name));
		return result;
	}




	@Override
	public int insert(AdminCafe adminCafe) {
		CafeDao cafeDao = sqlSession.getMapper(CafeDao.class);
		return cafeDao .insert(adminCafe);
	}




	@Override
	public int delete(String code) {
		CafeDao cafeDao = sqlSession.getMapper(CafeDao.class);
		return cafeDao.delete(code);
	}

	/*
	 * @Override public int getCount() { // TODO Auto-generated method stub return
	 * 0; }
	 * 
	 * @Override public DcInfo get(int num) { DcInfoDao dcinfoDao =
	 * sqlSession.getMapper(DcInfoDao.class); DcInfo dcinfo = dcinfoDao.get(num);
	 * 
	 * return dcinfo; }
	 * 
	 * 
	 * @Override public DcInfo getPrev(int num) { DcInfoDao dcinfoDao =
	 * sqlSession.getMapper(DcInfoDao.class); DcInfo result =
	 * dcinfoDao.getPrev(num);
	 * 
	 * return result; }
	 * 
	 * @Override public DcInfo getNext(int num) { DcInfoDao dcinfoDao =
	 * sqlSession.getMapper(DcInfoDao.class); DcInfo result =
	 * dcinfoDao.getNext(num);
	 * 
	 * return result; }
	 * 
	 * @Override public int insert(int num, String cafecode, String cname, String
	 * dtitle, String dcontent, Date startdate, Date finishdate) { int result =
	 * insert(new DcInfo(num, cafecode, cname, dtitle, dcontent, startdate,
	 * finishdate)); return result; }
	 * 
	 * @Override public int insert(DcInfo dcinfo) { DcInfoDao dcinfoDao =
	 * sqlSession.getMapper(DcInfoDao.class); return dcinfoDao.insert(dcinfo); }
	 * 
	 * 
	 * @Override public int update(DcInfo dcinfo) { DcInfoDao dcinfoDao =
	 * sqlSession.getMapper(DcInfoDao.class); int result = dcinfoDao.update(dcinfo);
	 * return result; }
	 * 
	 * @Override public int delete(int num) { DcInfoDao dcinfoDao =
	 * sqlSession.getMapper(DcInfoDao.class); int result = dcinfoDao.delete(num);
	 * return result; }
	 * 
	 * @Override public int updateHit(int num) { DcInfoDao dcinfoDao =
	 * sqlSession.getMapper(DcInfoDao.class); int result = dcinfoDao.updateHit(num);
	 * return result; }
	 */

}
