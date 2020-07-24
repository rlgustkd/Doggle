package com.doggle.service;

import java.util.HashMap;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.doggle.dao.FreeboardDao;
import com.doggle.vo.FreeboardVO;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class FreeboardServiceImpl implements FreeboardService {

	@Inject
	FreeboardDao dao;

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

}
