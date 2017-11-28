package com.cafedal.webapp.controller.customer;


import java.io.IOException;


import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafedal.webapp.dao.CmtDao1;
import com.cafedal.webapp.dao.DcInfoDao;
import com.cafedal.webapp.entity.CmtView1;
import com.cafedal.webapp.entity.DcInfo;


@Controller
@RequestMapping("/customer/dcinfo/*")
public class CustomerDcInfoController  {

	  @Autowired
	   private DcInfoDao dcinfoDao;
	  
	  @Autowired
	   private CmtDao1 cmtDao1;
	  
	   @RequestMapping("notice")
	   public String notice(
	         @RequestParam(value="p", defaultValue="1") Integer page,
	         @RequestParam(value="f", defaultValue="dtitle") String field,
	         @RequestParam(value="q", defaultValue="") String query, Model model
	         ){
	      
	      List<DcInfo> list = dcinfoDao.getUseList(page, field, query);
	      
	      model.addAttribute("list", list);
	      
	      return "customer.dcinfo.notice.list";
	   }
	   
	   @RequestMapping("notice/{num}")
	   public String noticeDetail(@PathVariable("num") int num, Model model) {
	      
		  int row = dcinfoDao.updateHit(num);
	      model.addAttribute("n", dcinfoDao.get(num));
	      model.addAttribute("prev", dcinfoDao.getPrev(num));
	      model.addAttribute("next", dcinfoDao.getNext(num));
	      
	      List<CmtView1> clist = cmtDao1.getCList(num);
	      model.addAttribute("clist", clist);

	      return "customer.dcinfo.notice.detail";
	   }
	   



}
