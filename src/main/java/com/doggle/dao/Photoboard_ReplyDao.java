package com.doggle.dao;

import java.util.List;

import com.doggle.vo.Photoboard_ReplyVO;

public interface Photoboard_ReplyDao {

	public List<Photoboard_ReplyVO> loadReplies(int p_no) throws Exception;
}
