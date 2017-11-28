package com.cafedal.webapp.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cafedal.webapp.dao.MemberCafeDao;
import com.cafedal.webapp.dao.MemberDao;
import com.cafedal.webapp.dao.UseNoticeDao;
import com.cafedal.webapp.entity.Member;
import com.cafedal.webapp.entity.MemberCafe;
import com.cafedal.webapp.entity.ResultMessage;
import com.cafedal.webapp.entity.UseNotice;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	@Autowired
	private MemberDao memberDao;
	
	@Autowired
	private MemberCafeDao memberCafeDao;
	
	@RequestMapping(value="login")
	public String login() { 
		
		return "member.login";
	}
	
	@RequestMapping(value="login2")
	public String login2() { 
		
		return "member.login2";
	}
	

	
	@RequestMapping(value="join", method=RequestMethod.POST)
	public String join( Member member, MemberCafe memberCafe, HttpServletRequest request) throws IOException {

		/*int row = memberDao.insert(member);*/
		
		/*String cafes = "1,2,3,4,5,6";*/
		String cafes = member.getCafes();
		String[] cafecode = cafes.split(",");
		
		memberDao.insert(member);
		
		for(int i=0; i<cafecode.length; i++)
			memberCafeDao.insert(member.getId(), cafecode[i]);
		
		return "redirect:login";

	}
	
	@RequestMapping(value = "join", method = RequestMethod.GET)
	public String join() {

		return "member.join";
	}
	
	@RequestMapping(value="sameCheckId", method=RequestMethod.POST)
	@ResponseBody
	public ResultMessage sameCheckId(Member member) {
		
		ResultMessage resultMsg = null;
		int selectCnt = 0;
		
		try {
			selectCnt = memberDao.sameCheckId(member);
			if(selectCnt == 0)
				resultMsg = new ResultMessage("false");
			else
				resultMsg = new ResultMessage("true");
		} catch (Exception e) {
			e.printStackTrace();
			resultMsg = new ResultMessage("Fail");
		}
		return resultMsg;
	}	
	
}
