package com.doggle.service;

import com.doggle.vo.MemberVO;
import com.doggle.vo.overlapCheckVO;

public interface SignupService {

	public void signup(MemberVO memberVO) throws Exception;
	
	public overlapCheckVO overlapcheck(overlapCheckVO ovlcVO) throws Exception;
	
	//아이디 중복체크
	public int idChk(MemberVO memberVO) throws Exception;
}
