package com.doggle.dao;

import java.util.List;
import java.util.Map;

import com.doggle.vo.FreeboardVO;
import com.doggle.vo.InfoboardVO;

public interface FreeboardDao {

	public void upload(FreeboardVO freeboardVO) throws Exception;

	public void insertClobTable(Map<String, String> reqMap);

	// 작성
	public void write(FreeboardVO vo) throws Exception;

	// 조회
	public FreeboardVO read(int p_no) throws Exception;

	// 수정
	public void update(FreeboardVO vo) throws Exception;

	// 삭제
	public void delete(int p_no) throws Exception;

	// 목록
	public List<FreeboardVO> list() throws Exception;

	public void updateRecommend(FreeboardVO fvo) throws Exception;

	public void increaseViewCount(int p_no) throws Exception;

	public void updateReport(FreeboardVO fvo) throws Exception;
	// 추천하기 넣어야함.

}