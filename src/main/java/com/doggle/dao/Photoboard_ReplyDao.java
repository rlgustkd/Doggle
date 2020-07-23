package com.doggle.dao;

import java.util.List;

import com.doggle.vo.Photoboard_ReplyVO;

public interface Photoboard_ReplyDao {

	public List<Photoboard_ReplyVO> loadReplies(int p_no) throws Exception;
	
	public void addComment(Photoboard_ReplyVO newcomment) throws Exception;
	
	public void deleteComment(int r_no) throws Exception;
}
