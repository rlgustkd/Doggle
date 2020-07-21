package com.doggle.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.doggle.dao.FreeboardDao;
import com.doggle.vo.FreeboardVO;

@Service
public class FreeboardServiceImpl implements FreeboardService {
	
	@Inject
	FreeboardDao dao;
	
	public void upload(FreeboardVO freeboardVO) throws Exception{
		dao.upload(freeboardVO);
	}

}
