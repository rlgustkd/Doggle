package com.doggle.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.doggle.vo.Photoboard_ReplyVO;


@Repository
public class Photoboard_ReplyDaoImpl implements Photoboard_ReplyDao {
	@Inject
	private SqlSession sqlSession;

	@Override
	public List<Photoboard_ReplyVO> loadReplies(int p_no) throws Exception {
		return sqlSession.selectList("photoboard_replyMapper.loadReplies", p_no);
	}


}
