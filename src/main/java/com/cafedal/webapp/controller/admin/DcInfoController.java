

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
import com.cafedal.webapp.dao.DcComDao;
import com.cafedal.webapp.dao.DcInfoDao;
import com.cafedal.webapp.entity.CmtView1;
import com.cafedal.webapp.entity.DcCom;
import com.cafedal.webapp.entity.DcInfo;


@Controller
@RequestMapping("/admin/dcinfo/*")
public class DcInfoController {

   @Autowired
   private DcInfoDao dcinfoDao;
   @Autowired
   private DcComDao dccomDao;
   @Autowired
   private CmtDao1 cmtDao1;

   @RequestMapping("notice")
   public String notice(@RequestParam(value = "p", defaultValue = "1") Integer page,
         @RequestParam(value = "f", defaultValue = "dtitle") String field,
         @RequestParam(value = "q", defaultValue = "") String query, Model model, Principal principal
         /*, @RequestParam(value="num", defaultValue="") int num*/ /*, @PathVariable("noticenum")int noticenum*/) {

      //String id = principal.getName();
         
      List<DcInfo> list = dcinfoDao.getUseList(page, field, query);
      model.addAttribute("list", list);

      
      /*List<CmtView1> cmtlist = cmtDao1.getCmtList(page, field, query);
      model.addAttribute("cmtlist", cmtlist);*/
      
    /*  List<CmtView1> clist = cmtDao1.getCList(noticenum);
      model.addAttribute("clist", clist);*/
      
      return "admin.dcinfo.notice.list";
   }

   @RequestMapping(value = "notice/{num}", method = RequestMethod.GET)
   public String noticeDetail(@PathVariable("num") int num, Model model, DcCom dccom,Principal principal) {

      
      //String id = principal.getName();
      
      model.addAttribute("n", dcinfoDao.get(num));
      model.addAttribute("prev", dcinfoDao.getPrev(num));
      model.addAttribute("next", dcinfoDao.getNext(num));

      
      int row = dcinfoDao.updateHit(num);
      
      
      System.out.print(num);

      List<DcCom> comlist = dccomDao.getComList(num);
      model.addAttribute("comlist", comlist);

      model.addAttribute("comnum", dccomDao.get(dccom));
      
      List<CmtView1> clist = cmtDao1.getCList(num);
      model.addAttribute("clist", clist);

      return "admin.dcinfo.notice.detail";
      
   }

   @RequestMapping(value = "notice/{num}", method = RequestMethod.POST)
   public String noticeDetail(@PathVariable("num") int num, DcCom dccom, Model model, HttpServletRequest request,Principal principal) {
      // dccom.setWriterid(principal.getName());

      
      String id = principal.getName();
      
      System.out.print(num);
      
      dccom.setWriterid(id);

      List<DcCom> comlist = dccomDao.getComList(num);

      int row = dccomDao.insert(dccom);

      // int row3 = dccomDao.update(dccom);

      return "redirect:../notice/{num}";
   }

   @RequestMapping(value = "notice/reg", method = RequestMethod.GET)
   public String noticeReg() {

      return "admin.dcinfo.notice.reg";
   }

   @RequestMapping(value = "notice/reg", method = RequestMethod.POST)
   public String noticeReg(DcInfo dcinfo, HttpServletRequest request) throws IOException {
      int row = dcinfoDao.insert(dcinfo);

      return "redirect:../notice";
   }

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
   }

   @RequestMapping(value = "notice/comedit", method = RequestMethod.GET)
   public String noticeComedit(@RequestParam("num") int num, @RequestParam("nnum") int comnum, Model model,Principal principal,
         DcCom dccom, HttpServletRequest request) {

      
      String id = principal.getName();
      model.addAttribute("n", dcinfoDao.get(num));
      model.addAttribute("prev", dcinfoDao.getPrev(num));
      model.addAttribute("next", dcinfoDao.getNext(num));


      model.addAttribute("comnum", dccomDao.get(dccom));

      return "admin.dcinfo.notice.comedit";
   }

   @RequestMapping(value = "notice/comedit", method = RequestMethod.POST)
   public String noticeComedit(@RequestParam("num") int num, @RequestParam("nnum") int nnum, DcCom dccom, Model model,
         HttpServletRequest request) {

      int row = dccomDao.update(dccom);

      return "redirect:../notice/" + nnum;

   }
   
   @RequestMapping("notice/comdelete")
   public String noticeComDel(@RequestParam("num") int num, @RequestParam("nnum") int nnum) {

      dccomDao.delete(nnum);

      return "redirect:../notice/" +num;
   }

}