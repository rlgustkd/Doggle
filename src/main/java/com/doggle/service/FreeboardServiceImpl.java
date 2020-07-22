package com.doggle.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.doggle.dao.FreeboardDao;
import com.doggle.vo.FreeboardVO;

@Service
public class FreeboardServiceImpl implements FreeboardService {

	@Inject
	private FreeboardDao dao;
	
		//작성
	@Override
	public void write(FreeboardVO vo) throws Exception {
		dao.write(vo);
	}
		//조회
	@Override
	public FreeboardVO read(int p_no) throws Exception {
		return dao.read(p_no);
	}
		//수정
	@Override
	public void update(FreeboardVO vo) throws Exception {
		dao.update(vo);
	}
		//삭제
	@Override
	public void delete(int p_no) throws Exception {
		dao.delete(p_no);
	}
		//목록
	@Override
	public List<FreeboardVO> list() throws Exception {
		return dao.list();
	}
	}
