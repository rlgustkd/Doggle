package com.doggle.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.doggle.dao.Photoboard_ReplyDao;
import com.doggle.vo.Photoboard_ReplyVO;


@Service
public class Photoboard_ReplyServiceImpl implements Photoboard_ReplyService {
	@Inject Photoboard_ReplyDao dao;
	@Override
	public List<Photoboard_ReplyVO> loadReplies(int p_no) throws Exception {
		return dao.loadReplies(p_no);
	}


}
