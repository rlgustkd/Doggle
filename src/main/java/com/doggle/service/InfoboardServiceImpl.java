package com.doggle.service;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.doggle.dao.InfoboardDao;
import com.doggle.vo.InfoboardVO;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class InfoboardServiceImpl implements InfoboardService {

	@Inject
	private InfoboardDao dao;

	@Override
	public void registClobData(InfoboardVO infoboardVO) throws Exception {

		ObjectMapper om = new ObjectMapper();
		HashMap<String, String> map = om.convertValue(infoboardVO, HashMap.class);

		dao.insertClobTable(map);

	}

	// 조회
	@Override
	public InfoboardVO read(int p_no) throws Exception {
		return dao.read(p_no);
	}

	// 목록
	@Override
	public List<InfoboardVO> list(int b_no) throws Exception {
		return dao.list(b_no);
	}

	@Override
	public int delete(InfoboardVO infoboardVO) throws Exception {
		dao.delete(infoboardVO);
		return 0;
	}

}