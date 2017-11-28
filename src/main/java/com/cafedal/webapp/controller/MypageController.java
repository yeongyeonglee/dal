package com.cafedal.webapp.controller;


import java.io.IOException;
import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafedal.webapp.dao.MemberDao;
import com.cafedal.webapp.dao.MypageDao;
import com.cafedal.webapp.entity.Member;
import com.cafedal.webapp.entity.Mypage;
import com.cafedal.webapp.entity.UseNotice;


@Controller
@RequestMapping("/mypage/*")
public class MypageController {
   
   @Autowired
   private MypageDao mypageDao;
   
   @Autowired
   private MemberDao memberDao;

   @RequestMapping("edit")
   public String edit(Mypage mypage, Principal principal, Model model, HttpServletRequest request) throws IOException {
      
     String id = principal.getName();
     
     List<Member> list = memberDao.getUseList(id);
     List<Mypage> listcafe = mypageDao.getUseListCafe(id);

     model.addAttribute("list", list);
     model.addAttribute("listcafe", listcafe);
     
         return "mypage.edit";
   }
   
   @RequestMapping("edit2")
   public String edit2(){

      return "mypage.edit2";
   
   }
}