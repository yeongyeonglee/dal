package com.cafedal.webapp.controller.admin;


import java.io.IOException;
import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafedal.webapp.dao.ManageDao;
import com.cafedal.webapp.dao.MemberCafeDao;
import com.cafedal.webapp.dao.MemberDao;
import com.cafedal.webapp.dao.MypageDao;
import com.cafedal.webapp.entity.DcCom;
import com.cafedal.webapp.entity.DcInfo;
import com.cafedal.webapp.entity.Manage;
import com.cafedal.webapp.entity.Member;
import com.cafedal.webapp.entity.MemberCafe;
import com.cafedal.webapp.entity.Mypage;

@Controller
@RequestMapping("/admin/manage/*")
public class ManageController {
   
   @Autowired
   private ManageDao manageDao;
   
   @Autowired
   private MemberDao memberDao;
      
   @RequestMapping(value="list", method = RequestMethod.GET)
   public String edit(String id, Manage manage, Model model, HttpServletRequest request) throws IOException {
      
	   
	   /*String memberid = principal.getName();
	   
	   System.out.println("¸â¹ö¾ÆÀÌµð : " +memberid);*/
	   
	   List<Member> list = memberDao.getUseListRole(id);
	   //List<Manage> listcafe = manageDao.getUseListCafe(id);
	   
	   model.addAttribute("list", list);
	   //model.addAttribute("listcafe", listcafe);
	   
       return "admin.manage.list";
   }
   
   /*@RequestMapping(value="list", method = RequestMethod.POST)
   public String edit(@RequestParam("id") String id, Model model, HttpServletRequest request) {
         
	   return "redirect:../edit2";
   }*/
   
}