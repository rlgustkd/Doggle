package com.doggle.dao;

import java.util.Map;

import com.doggle.vo.FreeboardVO;

public interface FreeboardDao {

	public void upload(FreeboardVO freeboardVO) throws Exception;
	
	public void insertClobTable(Map<String, String> reqMap);
}
