package com.doggle.service;

import java.util.List;

import com.doggle.vo.Photoboard_ReplyVO;

public interface Photoboard_ReplyService {
	public List<Photoboard_ReplyVO> loadReplies(int p_no) throws Exception;
}
