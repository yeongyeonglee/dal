package com.cafedal.webapp.dao;


import java.util.List;

import com.cafedal.webapp.entity.Mypage;


public interface MypageDao  {

   Mypage get(String id);
   
   Mypage getCafe(String id);

   List<Mypage> getUseListCafe(String id);

}
