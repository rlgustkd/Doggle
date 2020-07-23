package com.doggle.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.doggle.controller.StoryController;
import com.doggle.vo.Photoboard_ReplyVO;


@Repository
public class Photoboard_ReplyDaoImpl implements Photoboard_ReplyDao {
	@Inject
	private SqlSession sqlSession;
	private static final Logger logger = LoggerFactory.getLogger(Photoboard_ReplyDaoImpl.class);

	@Override
	public List<Photoboard_ReplyVO> loadReplies(int p_no) throws Exception {
		logger.info(Integer.toString(p_no));
		return sqlSession.selectList("photoboard_replyMapper.loadReplies", p_no);
	}

	@Override
	public void addComment(Photoboard_ReplyVO newcomment) throws Exception {
		sqlSession.insert("photoboard_replyMapper.addComment", newcomment);
	}

	@Override
	public void deleteComment(int r_no) throws Exception {
		sqlSession.update("photoboard_replyMapper.deleteComment", r_no);
	}


}
