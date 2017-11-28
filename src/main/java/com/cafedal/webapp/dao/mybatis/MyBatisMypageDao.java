package com.cafedal.webapp.dao.mybatis;


import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.cafedal.webapp.dao.CalendarDao;
import com.cafedal.webapp.dao.DcInfoDao;
import com.cafedal.webapp.dao.MemberDao;
import com.cafedal.webapp.dao.MypageDao;
import com.cafedal.webapp.dao.UseNoticeDao;
import com.cafedal.webapp.entity.CalendarView;
import com.cafedal.webapp.entity.DcInfo;
import com.cafedal.webapp.entity.Member;
import com.cafedal.webapp.entity.Mypage;


public class MyBatisMypageDao implements MypageDao {

    @Autowired
    private SqlSessionTemplate sqlSession;


   @Override
   public Mypage get(String id) {
      MypageDao mypageDao = sqlSession.getMapper(MypageDao.class);
      Mypage result = mypageDao.get(id);

      return result;
   }

   @Override
   public Mypage getCafe(String id) {
      MypageDao mypageDao = sqlSession.getMapper(MypageDao.class);
      Mypage result = mypageDao.getCafe(id);

      return result;
   }


   @Override
   public List<Mypage> getUseListCafe(String id) {
      MypageDao mypageDao = sqlSession.getMapper(MypageDao.class);
      List<Mypage> listcafe = mypageDao.getUseListCafe(id);
   
      return listcafe;
   }


	

}

   