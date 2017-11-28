package com.cafedal.webapp.dao;

import java.util.List;

import com.cafedal.webapp.entity.CalendarView;



public interface CalendarDao  {

	CalendarView get(String id);

	List<CalendarView> getUseList(String id);


}

