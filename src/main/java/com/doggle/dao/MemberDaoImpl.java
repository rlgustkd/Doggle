package com.doggle.dao;

import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.doggle.vo.MemberVO;

@Repository
public class MemberDaoImpl implements MemberDao {

	@Inject SqlSession sqlSession;
	
	@Override
	public void signup(MemberVO memberVO) throws Exception{
		sqlSession.insert("memberMapper.signup", memberVO);
	}
	
	//아이디 중복 확인
	@Override
	public int idChk(String user_id) throws Exception{
		int result = sqlSession.selectOne("memberMapper.idChk", user_id);
		return result;
	}

	@Override
	public int nameChk(String nickname) throws Exception {
		int result = sqlSession.selectOne("memberMapper.nameChk", nickname);
		return result;
	}

	@Override
	public int emailChk(String email) throws Exception {
		int result = sqlSession.selectOne("memberMapper.emailChk", email);

		return result;
	}

	@Override
	public MemberVO logincheck(MemberVO membervo) throws Exception {
		return sqlSession.selectOne("memberMapper.logincheck", membervo);
	}
}