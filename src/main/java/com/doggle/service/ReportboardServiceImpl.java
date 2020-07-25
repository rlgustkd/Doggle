package com.doggle.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.doggle.dao.ReportboardDao;
import com.doggle.vo.ReportboardVO;

@Service
public class ReportboardServiceImpl implements ReportboardService {
	@Inject
	private ReportboardDao dao;
	@Override
	public int checkRep(ReportboardVO rvo) throws Exception {
		return dao.checkRep(rvo);
	}

	@Override
	public int loadRep(int b_no, int p_no) throws Exception {
		return dao.loadRep(b_no, p_no);
	}

	@Override
	public void addRep(ReportboardVO rvo) throws Exception {
		dao.addRep(rvo);
	}

}