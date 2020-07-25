package com.doggle.service;

import com.doggle.vo.RecommendboardVO;
import com.doggle.vo.ReportboardVO;

public interface RecommendboardService {
	
	public int checkRec(RecommendboardVO rvo) throws Exception;
	public void addRec(RecommendboardVO rvo) throws Exception;
	public int loadRec(int b_no, int p_no) throws Exception;
}