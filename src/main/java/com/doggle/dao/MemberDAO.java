package com.doggle.dao;

import com.doggle.vo.MemberVO;

public interface MemberDAO {

	public void signup(MemberVO memberVO) throws Exception;
	
	//아이디 중복 확인
	public int idChk(String user_id) throws Exception;
	//닉네임 중복 확인
	public int nameChk(String nickname) throws Exception;
	//이메일 중복 확인
	public int emailChk(String email) throws Exception;
	
	//로그인
	public MemberVO logincheck(MemberVO membervo) throws Exception;
}
