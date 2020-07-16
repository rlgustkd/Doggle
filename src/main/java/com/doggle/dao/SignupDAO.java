package com.doggle.dao;

import com.doggle.vo.MemberVO;
import com.doggle.vo.overlapCheckVO;

public interface SignupDAO {

	public void signup(MemberVO usersVO) throws Exception;
	
	public overlapCheckVO overlapcheck(overlapCheckVO ovlcVO) throws Exception;
	
	//아이디 중복 확인
	public int idChk(MemberVO memberVO) throws Exception;
}
