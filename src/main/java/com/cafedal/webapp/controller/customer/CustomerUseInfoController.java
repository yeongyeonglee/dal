package com.cafedal.webapp.controller.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

import com.cafedal.webapp.dao.CmtDao1;
import com.cafedal.webapp.dao.CmtDao2;
import com.cafedal.webapp.dao.UseNoticeDao;
import com.cafedal.webapp.entity.CmtView2;
import com.cafedal.webapp.entity.UseNotice;

@Controller
@RequestMapping("/customer/useinfo/*")
public class CustomerUseInfoController {

	@Autowired
	private UseNoticeDao usenoticeDao;
	
	  @Autowired
	   private CmtDao2 cmtDao2;
	  

	@RequestMapping("notice")
	public String notice(@RequestParam(value = "p", defaultValue = "1") Integer page,
			@RequestParam(value = "f", defaultValue = "utitle") String field,
			@RequestParam(value = "q", defaultValue = "") String query, Model model) {

		List<UseNotice> list = usenoticeDao.getUseList(page, field, query);

		model.addAttribute("list", list);

		return "customer.useinfo.notice.list";
	}

	@RequestMapping("notice/{num}")
	public String noticeDetail(@PathVariable("num") int num, Model model) {
		
		int row = usenoticeDao.updateHit(num);

		model.addAttribute("n", usenoticeDao.get(num));
		model.addAttribute("prev", usenoticeDao.getPrev(num));
		model.addAttribute("next", usenoticeDao.getNext(num));
		
		 List<CmtView2> clist = cmtDao2.getCList(num);
	     model.addAttribute("clist", clist);

		return "customer.useinfo.notice.detail";
	}

}
