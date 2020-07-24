package com.doggle.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.doggle.vo.ReplyVO;

@Repository
public class ReplyDaoImpl implements ReplyDao {

	@Inject
	private SqlSession sqlSession;

	@Override
	public List<ReplyVO> h_replyinfo(ReplyVO replyVO) throws Exception {
		return sqlSession.selectList("replyMapper.h_replyinfo", replyVO);
	}

	@Override
	public int h_replywrite(ReplyVO replyVO) throws Exception {
		sqlSession.insert("replyMapper.h_replywrite", replyVO);
		return 1;
				
	}

	@Override
	public int h_replydelete(ReplyVO replyVO) throws Exception {
		sqlSession.delete("replyMapper.h_replydelete", replyVO);
		return 1;
	}
	
	@Override
	public List<ReplyVO> ht_replyinfo(ReplyVO replyVO) throws Exception {
		return sqlSession.selectList("replyMapper.ht_replyinfo", replyVO);
	}

	@Override
	public int ht_replywrite(ReplyVO replyVO) throws Exception {
		sqlSession.insert("replyMapper.ht_replywrite", replyVO);
		return 1;
				
	}

	@Override
	public int ht_replydelete(ReplyVO replyVO) throws Exception {
		sqlSession.delete("replyMapper.ht_replydelete", replyVO);
		return 1;
	}
	
	@Override
	public List<ReplyVO> w_replyinfo(ReplyVO replyVO) throws Exception {
		return sqlSession.selectList("replyMapper.w_replyinfo", replyVO);
	}

	@Override
	public int w_replywrite(ReplyVO replyVO) throws Exception {
		sqlSession.insert("replyMapper.w_replywrite", replyVO);
		return 1;
				
	}

	@Override
	public int w_replydelete(ReplyVO replyVO) throws Exception {
		sqlSession.delete("replyMapper.w_replydelete", replyVO);
		return 1;
	}
	
	@Override
	public List<ReplyVO> p_replyinfo(ReplyVO replyVO) throws Exception {
		return sqlSession.selectList("replyMapper.p_replyinfo", replyVO);
	}

	@Override
	public int p_replywrite(ReplyVO replyVO) throws Exception {
		sqlSession.insert("replyMapper.p_replywrite", replyVO);
		return 1;
				
	}

	@Override
	public int p_replydelete(ReplyVO replyVO) throws Exception {
		sqlSession.delete("replyMapper.p_replydelete", replyVO);
		return 1;
	}

}
