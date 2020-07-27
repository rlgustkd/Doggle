package com.doggle.service;

import java.util.List;

import com.doggle.vo.FreeboardVO;

public interface FreeboardService {

	public void upload(FreeboardVO freeboardVO) throws Exception;

	public void registClobData(FreeboardVO freeboardVO) throws Exception;

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

	// 추천
	public void updateRecommend(FreeboardVO fvo) throws Exception;

	// 조회수 증가
	public void increaseViewCount(int p_no) throws Exception;

	// 신고 
	public void updateReport(FreeboardVO fvo) throws Exception;
}