package com.cafedal.webapp.dao;


import java.util.List;

import com.cafedal.webapp.entity.Manage;


public interface ManageDao  {

   Manage get(String id);
   
   Manage getCafe(String id);

   List<Manage> getUseListCafe(String id);


}
