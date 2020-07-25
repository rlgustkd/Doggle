package com.doggle.dao;

import com.doggle.vo.ReportboardVO;

public interface ReportboardDao {

	public int checkRep(ReportboardVO rvo) throws Exception;

	public int loadRep(int b_no, int p_no) throws Exception;

	public void addRep(ReportboardVO rvo) throws Exception;

}
