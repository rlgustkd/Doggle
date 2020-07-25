package com.doggle.service;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.doggle.dao.FreeboardDao;
import com.doggle.vo.FreeboardVO;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class FreeboardServiceImpl implements FreeboardService {

	@Inject
	private FreeboardDao dao;

	@Override
	public void upload(FreeboardVO freeboardVO) throws Exception {
		dao.upload(freeboardVO);
	}

	@Override
	public void registClobData(FreeboardVO freeboardVO) throws Exception {

		ObjectMapper om = new ObjectMapper();
		HashMap<String, String> map = om.convertValue(freeboardVO, HashMap.class);

		dao.insertClobTable(map);

	}

	// 작성
	@Override
	public void write(FreeboardVO vo) throws Exception {
		dao.write(vo);
	}

	// 조회
	@Override
	public FreeboardVO read(int p_no) throws Exception {
		return dao.read(p_no);
	}

	// 수정
	@Override
	public void update(FreeboardVO vo) throws Exception {
		dao.update(vo);
	}

	// 삭제
	@Override
	public void delete(int p_no) throws Exception {
		dao.delete(p_no);
	}

	// 목록
	@Override
	public List<FreeboardVO> list() throws Exception {
		return dao.list();
	}

}