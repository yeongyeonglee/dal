

package com.cafedal.webapp.controller.admin;


import java.io.IOException;
import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafedal.webapp.dao.CafeDao;
import com.cafedal.webapp.entity.AdminCafe;
import com.cafedal.webapp.entity.Cafe;




@Controller
@RequestMapping("/admin/cafe/*")
public class CafeController {

	@Autowired
	private CafeDao cafedao;

	

	@RequestMapping("manage")
	public String Manage(@RequestParam(value = "p", defaultValue = "1") Integer page,
			@RequestParam(value = "f", defaultValue = "name") String field,
			@RequestParam(value = "q", defaultValue = "") String query, Model model ,Principal principal) {

		//String id = principal.getName();
		
		List<AdminCafe> list = cafedao.getUseList(page, field, query);

		model.addAttribute("list", list);


		return "admin.cafe.manage.list";
	}
	


	@RequestMapping(value = "manage/reg", method = RequestMethod.GET)
	public String noticeReg() {

		return "admin.cafe.manage.reg";
	}

	@RequestMapping(value = "manage/reg", method = RequestMethod.POST)
	public String noticeReg(AdminCafe cafe, HttpServletRequest request) throws IOException {
		int row = cafedao.insert(cafe);

		return "redirect:../manage";
	 }
	
	
	@RequestMapping("manage/delete")
	public String noticeDel(HttpServletRequest request) {

		  String deleteArticleIds = request.getParameter("deleteArticleId");

		
		
		cafedao.delete(deleteArticleIds);

		return "redirect:../manage" ;
	}

	}
/*
	@RequestMapping(value = "notice/edit", method = RequestMethod.GET)
	public String noticeEdit(@RequestParam("num") int num, Model model) {

		model.addAttribute("n", dcinfoDao.get(num));

		return "admin.dcinfo.notice.edit";
	}

	@RequestMapping(value = "notice/edit", method = RequestMethod.POST)
	public String noticeEdit(@RequestParam("num") int num, DcInfo dcinfo, HttpServletRequest request)
			throws IOException {

		int row = dcinfoDao.update(dcinfo);

		return "redirect:../notice/" + num;

	}

	@RequestMapping("notice/delete")
	public String noticeDel(@RequestParam("num") int num) {

		dcinfoDao.delete(num);

		return "redirect:../notice";
	}*/



