package com.doggle.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.doggle.vo.ReportboardVO;

@Repository
public class ReportboardDaoImpl implements ReportboardDao {
	@Inject
	private SqlSession sqlSession;
	
	@Override
	public int checkRep(ReportboardVO rvo) throws Exception {
		return sqlSession.selectOne("reportboardMapper.checkRep", rvo);
	}

	@Override
	public int loadRep(int b_no, int p_no) throws Exception {
		return sqlSession.selectOne("reportboardMapper.loadRep", p_no);
	}

	@Override
	public void addRep(ReportboardVO rvo) throws Exception {
		sqlSession.insert("reportboardMapper.addRep", rvo);
	}

}
