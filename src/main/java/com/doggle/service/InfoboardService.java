package com.doggle.service;

import java.util.List;

import com.doggle.vo.FreeboardVO;
import com.doggle.vo.InfoboardVO;

public interface InfoboardService {

	public void registClobData(InfoboardVO infoboardVO) throws Exception;

	// 조회
	public InfoboardVO read(int p_no) throws Exception;

	// 목록
	public List<InfoboardVO> list(int b_no) throws Exception;

	// 삭제
	public int delete(InfoboardVO infoboardVO) throws Exception;
}