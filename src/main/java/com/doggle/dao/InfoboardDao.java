package com.doggle.dao;

import java.util.List;
import java.util.Map;

import com.doggle.vo.InfoboardVO;

public interface InfoboardDao {


	public void insertClobTable(Map<String, String> reqMap);


	// 조회
	public InfoboardVO read(int p_no) throws Exception;



	// 목록
	public List<InfoboardVO> list(int b_no) throws Exception;

	// 추천하기 넣어야함.

}