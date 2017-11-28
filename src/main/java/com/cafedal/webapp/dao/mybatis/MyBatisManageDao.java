package com.cafedal.webapp.dao.mybatis;


import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import com.cafedal.webapp.dao.ManageDao;
import com.cafedal.webapp.entity.Manage;



public class MyBatisManageDao implements ManageDao {

    @Autowired
    private SqlSessionTemplate sqlSession;

	@Override
	public Manage get(String id) {
		 ManageDao manageDao = sqlSession.getMapper(ManageDao.class);
	     Manage result = manageDao.get(id);

	     return result;
	}

	@Override
	public Manage getCafe(String id) {
		 ManageDao manageDao = sqlSession.getMapper(ManageDao.class);
		 Manage result = manageDao.getCafe(id);

	     return result;
	}

	@Override
	public List<Manage> getUseListCafe(String id) {
		 ManageDao manageDao = sqlSession.getMapper(ManageDao.class);
	     List<Manage> listcafe = manageDao.getUseListCafe(id);
	   
	     return listcafe;
	}



}

   