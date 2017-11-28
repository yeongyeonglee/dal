package com.cafedal.webapp.dao;

import java.util.List;

import com.cafedal.webapp.entity.AdminCafe;

public interface CafeDao {

	List<AdminCafe> getUseList(Integer page, String field, String query);

	int insert(String code, String name);

	int insert(AdminCafe adminCafe);

	int delete(String deleteArticleIds);

	

}
