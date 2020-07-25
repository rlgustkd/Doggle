package com.doggle.dao;

import java.util.List;

import com.doggle.vo.ReplyVO;

public interface ReplyDao {
	public List<ReplyVO> h_replyinfo(ReplyVO replyVO) throws Exception;
	
	public int h_replywrite(ReplyVO replyVO) throws Exception;
	
	public int h_replydelete(ReplyVO replyVO) throws Exception;
	
	public List<ReplyVO> ht_replyinfo(ReplyVO replyVO) throws Exception;
	
	public int ht_replywrite(ReplyVO replyVO) throws Exception;
	
	public int ht_replydelete(ReplyVO replyVO) throws Exception;
	
	public List<ReplyVO> w_replyinfo(ReplyVO replyVO) throws Exception;
	
	public int w_replywrite(ReplyVO replyVO) throws Exception;
	
	public int w_replydelete(ReplyVO replyVO) throws Exception;
	
	public List<ReplyVO> p_replyinfo(ReplyVO replyVO) throws Exception;
	
	public int p_replywrite(ReplyVO replyVO) throws Exception;
	
	public int p_replydelete(ReplyVO replyVO) throws Exception;
}