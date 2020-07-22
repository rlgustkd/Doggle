package com.doggle.service;

import java.util.List;

import com.doggle.vo.FreeboardVO;

public interface FreeboardService {

		// 작성
		public void write(FreeboardVO vo) throws Exception;
		
		// 조회
		public FreeboardVO read(int p_no) throws Exception;
		
		// 수정
		public void update(FreeboardVO vo) throws Exception;
		
		//삭제
		public void delete(int p_no) throws Exception;
		
		//목록
		public List<FreeboardVO> list() throws Exception;
}
