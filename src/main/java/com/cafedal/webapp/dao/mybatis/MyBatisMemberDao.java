package com.cafedal.webapp.dao.mybatis;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.cafedal.webapp.dao.MemberDao;
import com.cafedal.webapp.dao.NoticeFileDao;
import com.cafedal.webapp.dao.UseNoticeDao;
import com.cafedal.webapp.entity.DcInfo;
import com.cafedal.webapp.entity.Member;

public class MyBatisMemberDao implements MemberDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public int insert(String id, String name, String pwd, String mail, String birth, String role, String cafes) {
		int result = insert(new Member(id, name, pwd, mail, birth, role, cafes));
		return result;
	}

	@Override
	public int insert(Member member) {
		MemberDao memberDao = sqlSession.getMapper(MemberDao.class);
		int result = memberDao.insert(member);
		return result;
	}

	@Override
	public Member get(String id) {
		MemberDao memberDao = sqlSession.getMapper(MemberDao.class);
		
		return memberDao.get(id);
	}

	@Override
	public Member login(String id, String pwd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int sameCheckId(Member member) throws Exception {
		MemberDao memberDao = sqlSession.getMapper(MemberDao.class);
		return memberDao.sameCheckId(member);
	}
	
	@Override
	public boolean checkPw(String id, String pwd) {
		MemberDao memberDao = sqlSession.getMapper(MemberDao.class);
		return memberDao.checkPw(id, pwd);
	}

	@Override
	public int update(Member member) {
		MemberDao memberDao = sqlSession.getMapper(MemberDao.class);
        int result = memberDao.update(member);
      
        return result;
	}

	@Override
	public Member getc(String id) {
	   MemberDao memberDao = sqlSession.getMapper(MemberDao.class);
       Member member = memberDao.getc(id);
      
       return member;
	}

	@Override
	public List<Member> getUseList(String id) {
		MemberDao memberDao = sqlSession.getMapper(MemberDao.class);
		List<Member> list = memberDao.getUseList(id);

        return list;
	}

	@Override
	public Member getib(String id) {
		MemberDao memberDao = sqlSession.getMapper(MemberDao.class);
	    Member member = memberDao.getib(id);
	      
	    return member;
	}

	@Override
	public List<Member> getUseListRole(String id) {
		MemberDao memberDao = sqlSession.getMapper(MemberDao.class);
		List<Member> list = memberDao.getUseListRole(id);
	      
	    return list;
	}


}
