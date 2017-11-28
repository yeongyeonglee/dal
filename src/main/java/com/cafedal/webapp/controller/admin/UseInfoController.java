package com.cafedal.webapp.controller.admin;

import java.io.IOException;
import java.security.Principal;
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
import com.cafedal.webapp.dao.CmtDao2;
import com.cafedal.webapp.dao.UseComDao;
import com.cafedal.webapp.dao.UseNoticeDao;
import com.cafedal.webapp.entity.CmtView1;
import com.cafedal.webapp.entity.CmtView2;
import com.cafedal.webapp.entity.UseCom;
import com.cafedal.webapp.entity.UseNotice;

@Controller
@RequestMapping("/admin/useinfo/*")
public class UseInfoController {

	@Autowired
	private UseNoticeDao usenoticeDao;
	
	@Autowired
	private UseComDao usecomDao;
	
	@Autowired
	private CmtDao2 cmtDao2;


	@RequestMapping("notice")
	public String notice(@RequestParam(value = "p", defaultValue = "1") Integer page,
			@RequestParam(value = "f", defaultValue = "utitle") String field,
			@RequestParam(value = "q", defaultValue = "") String query, Model model ,Principal principal) {

		//String id = principal.getName();
		
		//System.out.println("아이디1:"+id);
		
		
		List<UseNotice> list = usenoticeDao.getUseList(page, field, query);

		model.addAttribute("list", list);

		return "admin.useinfo.notice.list";
	}

	@RequestMapping(value = "notice/{num}", method = RequestMethod.GET)
	public String noticeDetail(@PathVariable("num") int num, Model model, UseCom usecom,Principal principal) {

		//String id = principal.getName();
		//System.out.println("아이디 디테일:"+id);
		
		model.addAttribute("n", usenoticeDao.get(num));
		model.addAttribute("prev", usenoticeDao.getPrev(num));
		model.addAttribute("next", usenoticeDao.getNext(num));

		
		int row =usenoticeDao.updateHit(num);
		
		
		System.out.print(num);


		model.addAttribute("comnum", usecomDao.get(usecom));
		
		 List<CmtView2> clist = cmtDao2.getCList(num);
	     model.addAttribute("clist", clist);
	     
		return "admin.useinfo.notice.detail";
	}

	@RequestMapping(value = "notice/{num}", method = RequestMethod.POST)
	public String noticeDetail(@PathVariable("num") int num, UseCom usecom, Model model, HttpServletRequest request,Principal principal) {
		// dccom.setWriterid(principal.getName());


		String id = principal.getName();
		System.out.println("아이디2:"+id);
		
		
		
		System.out.print(num);
		
		usecom.setWriterid(id);

		List<UseCom> comlist = usecomDao.getComList(num);

		int row = usecomDao.insert(usecom);

		// int row3 = dccomDao.update(usecom);

		return "redirect:../notice/{num}";
	}

	@RequestMapping(value = "notice/reg", method = RequestMethod.POST)
	/* public String noticeReg(String title, String content) */
	public String noticeReg(UseNotice usenotice, HttpServletRequest request,Principal principal) throws IOException {

		String id = principal.getName();
		
		
		int row = usenoticeDao.insert(usenotice);

		return "redirect:../notice";
	}
	
	
	@RequestMapping(value = "notice/edit", method = RequestMethod.GET)
	public String noticeEdit(@RequestParam("num") int num, Model model,Principal principal) {
		
		String id = principal.getName();

		model.addAttribute("n", usenoticeDao.get(num));
		
		return "admin.useinfo.notice.edit";
	}

	@RequestMapping(value = "notice/edit", method = RequestMethod.POST)
	public String noticeEdit(@RequestParam("num") int num,UseNotice usenotice,HttpServletRequest request,Principal principal) throws IOException {

		String id = principal.getName();
		
		
		
		int row = usenoticeDao.update(usenotice);

		 return "redirect:../notice";
		
	}
	
	@RequestMapping("notice/delete")
	public String noticeDel(@RequestParam("num") int num,Principal principal ){
		String id = principal.getName();
	
		usenoticeDao.delete(num);
		
		return "redirect:../notice";
	}
	
	
	@RequestMapping(value = "notice/comedit", method = RequestMethod.GET)
	public String noticeComedit(@RequestParam("num") int num, @RequestParam("nnum") int comnum, Model model,Principal principal,
			UseCom usecom, HttpServletRequest request) {
		
		String id = principal.getName();

		System.out.println("아이디 댓글 수정:"+id);
		
		
		model.addAttribute("n", usenoticeDao.get(num));
		model.addAttribute("prev", usenoticeDao.getPrev(num));
		model.addAttribute("next", usenoticeDao.getNext(num));

		
	/*	 String id = principal.getName();
		 System.out.println(id);*/

		model.addAttribute("comnum", usecomDao.get(usecom));

		return "admin.useinfo.notice.comedit";
	}

	@RequestMapping(value = "notice/comedit", method = RequestMethod.POST)
	public String noticeComedit(@RequestParam("num") int num, @RequestParam("nnum") int nnum,UseCom usecom, Model model,
			Principal principal,HttpServletRequest request) {

		String id = principal.getName();
		
		int row = usecomDao.update(usecom);

		return "redirect:../notice/" + nnum;

	}
	
	@RequestMapping("notice/comdelete")
	public String noticeComDel(@RequestParam("num") int num, @RequestParam("nnum") int nnum,Principal principal) {

		

		
		usecomDao.delete(nnum);

		return "redirect:../notice/" +num;
	}



}
