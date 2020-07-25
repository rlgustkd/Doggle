package com.doggle.service;

import com.doggle.vo.ReportboardVO;

public interface ReportboardService {

	public int checkRep(ReportboardVO rvo) throws Exception;

	public int loadRep(int b_no, int p_no) throws Exception;

	public void addRep(ReportboardVO rvo) throws Exception;

}