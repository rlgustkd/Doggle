package com.doggle.service;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.doggle.dao.MemberDao;
import com.doggle.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Inject MemberDao dao;
	@Inject SqlSession sql;
	
	@Override
	public void signup(MemberVO memberVO) throws Exception{
		dao.signup(memberVO);
	}
	
	//아이디 중복 체크
	public int idChk(String user_id) throws Exception{
		return dao.idChk(user_id);
	}

	@Override
	public int nameChk(String nickname) throws Exception {
		return dao.nameChk(nickname);
	}

	@Override
	public int emailChk(String email) throws Exception {
		return dao.emailChk(email);
	}

	@Override
	public MemberVO logincheck(MemberVO membervo) throws Exception {
		return dao.logincheck(membervo);
	}
	
}
