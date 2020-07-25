package com.doggle.dao;

import com.doggle.vo.RecommendboardVO;

public interface RecommendboardDao {

	public void addRec(RecommendboardVO rvo);

	public int checkRec(RecommendboardVO rvo);

	public int loadRec(int b_no, int p_no);

}
