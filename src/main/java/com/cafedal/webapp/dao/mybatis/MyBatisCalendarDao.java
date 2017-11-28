package com.cafedal.webapp.dao.mybatis;


import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;


import com.cafedal.webapp.dao.CalendarDao;
import com.cafedal.webapp.dao.DcInfoDao;
import com.cafedal.webapp.entity.CalendarView;
import com.cafedal.webapp.entity.DcInfo;



public class MyBatisCalendarDao implements CalendarDao {

   @Autowired
   private SqlSessionTemplate sqlSession;

   
   @Override
   public CalendarView get(String id) {
	   
		CalendarDao calendarDao = sqlSession.getMapper(CalendarDao.class);
		CalendarView result = calendarDao.get(id);

		return result;
   }


	@Override
	public List<CalendarView> getUseList(String id) {
		
		CalendarDao calendarDao = sqlSession.getMapper(CalendarDao.class);
		List<CalendarView> list = calendarDao.getUseList(id);
	
		return list;
	}


   
}

	
