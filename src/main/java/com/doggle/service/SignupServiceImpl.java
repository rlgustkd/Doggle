package com.doggle.service;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.doggle.dao.SignupDAO;
import com.doggle.vo.MemberVO;
import com.doggle.vo.overlapCheckVO;

@Service
public class SignupServiceImpl implements SignupService {

	@Inject SignupDAO dao;
	@Inject SqlSession sql;
	
	@Override
	public void signup(MemberVO usersVO) throws Exception{
		dao.signup(usersVO);
	}
	
	@Override
	public overlapCheckVO overlapcheck(overlapCheckVO ovlcVO) throws Exception{
		return dao.overlapcheck(ovlcVO);
	}
	
	//아이디 중복 체크
	public int idChk(MemberVO memberVO) throws Exception{
		int result = sql.selectOne("signupMapper.idChk");
		return result;
	}
	
}
