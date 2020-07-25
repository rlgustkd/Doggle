package com.doggle.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.doggle.dao.ReplyDao;
import com.doggle.vo.ReplyVO;

@Service
public class ReplyServiceImpl implements ReplyService {
	@Inject
	private ReplyDao dao;


	@Override
	public List<ReplyVO> h_replyinfo(ReplyVO replyVO) throws Exception {
		return dao.h_replyinfo(replyVO);
	}


	@Override
	public int h_replywrite(ReplyVO replyVO) throws Exception {
		dao.h_replywrite(replyVO);
		return 1;
	}


	@Override
	public int h_replydelete(ReplyVO replyVO) throws Exception {
		dao.h_replydelete(replyVO);
		return 1;
	}
	
	@Override
	public List<ReplyVO> ht_replyinfo(ReplyVO replyVO) throws Exception {
		return dao.ht_replyinfo(replyVO);
	}


	@Override
	public int ht_replywrite(ReplyVO replyVO) throws Exception {
		dao.ht_replywrite(replyVO);
		return 1;
	}


	@Override
	public int ht_replydelete(ReplyVO replyVO) throws Exception {
		dao.ht_replydelete(replyVO);
		return 1;
	}
	
	@Override
	public List<ReplyVO> w_replyinfo(ReplyVO replyVO) throws Exception {
		return dao.w_replyinfo(replyVO);
	}


	@Override
	public int w_replywrite(ReplyVO replyVO) throws Exception {
		dao.w_replywrite(replyVO);
		return 1;
	}


	@Override
	public int w_replydelete(ReplyVO replyVO) throws Exception {
		dao.w_replydelete(replyVO);
		return 1;
	}
	
	@Override
	public List<ReplyVO> p_replyinfo(ReplyVO replyVO) throws Exception {
		return dao.p_replyinfo(replyVO);
	}


	@Override
	public int p_replywrite(ReplyVO replyVO) throws Exception {
		dao.p_replywrite(replyVO);
		return 1;
	}


	@Override
	public int p_replydelete(ReplyVO replyVO) throws Exception {
		dao.p_replydelete(replyVO);
		return 1;
	}


	

}