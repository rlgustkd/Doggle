package com.doggle.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.doggle.vo.RecommendboardVO;

@Repository
public class RecommendboardDaoImpl implements RecommendboardDao {
	@Inject
	private SqlSession sqlSession;
	
	@Override
	public void addRec(RecommendboardVO rvo) {
		sqlSession.insert("recommendboardMapper.addRec", rvo);
	}

	@Override
	public int checkRec(RecommendboardVO rvo) {
		return sqlSession.selectOne("recommendboardMapper.checkRec", rvo);
	}

	@Override
	public int loadRec(int b_no, int p_no) {
		return sqlSession.selectOne("recommendboardMapper.loadRec", p_no);
	}

}
