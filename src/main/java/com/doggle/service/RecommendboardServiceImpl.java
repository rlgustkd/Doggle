package com.doggle.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.doggle.dao.RecommendboardDao;
import com.doggle.vo.RecommendboardVO;

@Service
public class RecommendboardServiceImpl implements RecommendboardService {
	@Inject
	private RecommendboardDao dao;
	@Override
	public void addRec(RecommendboardVO rvo) throws Exception {
		dao.addRec(rvo);
	}
	@Override
	public int checkRec(RecommendboardVO rvo) throws Exception {
		return dao.checkRec(rvo);
	}
	@Override
	public int loadRec(int b_no, int p_no) throws Exception {
		return dao.loadRec(b_no, p_no);
	}

}
