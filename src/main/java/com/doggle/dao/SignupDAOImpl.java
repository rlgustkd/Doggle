package com.doggle.dao;

import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.doggle.vo.MemberVO;
import com.doggle.vo.overlapCheckVO;

@Repository
public class SignupDAOImpl implements SignupDAO {

	@Inject SqlSession sqlSession;
	
	@Override
	public void signup(MemberVO usersVO) throws Exception{
		sqlSession.insert("signupMapper.signup", usersVO);
	}
	
	@Override
	public overlapCheckVO overlapcheck(overlapCheckVO ovlcVO) throws Exception{
		return sqlSession.selectOne("signupMapper.overlapcheck", ovlcVO);
	}
	
	//아이디 중복 확인
	@Override
	public int idChk(MemberVO memberVO) throws Exception{
		int result = sqlSession.selectOne("signupMapper.idChk", memberVO);
		return result;
	}
}
