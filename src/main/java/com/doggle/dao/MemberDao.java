package com.doggle.dao;

import com.doggle.vo.MemberVO;

public interface MemberDao {
	
	public void signup(MemberVO memberVO) throws Exception;
	//아이디 중복체크
	public int idChk(String user_id) throws Exception;
	//닉네임 중복체크
	public int nameChk(String nickname) throws Exception;
	//아이디 중복체크
	public int emailChk(String email) throws Exception;
	
	public MemberVO logincheck(MemberVO membervo) throws Exception;
}
