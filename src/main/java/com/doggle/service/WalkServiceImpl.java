package com.doggle.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.doggle.dao.WalkDao;
import com.doggle.vo.WalkVO;

@Service
public class WalkServiceImpl implements WalkService {
	@Inject
	private WalkDao dao;

	@Override
	public List<WalkVO> getByteImage() throws Exception {
		return dao.getByteImage();
	}
	@Override
	public void saveImage(String saveFileName) throws Exception {
		dao.saveImage(saveFileName);
	}
	@Override
	public WalkVO detailImage(WalkVO walkVO) throws Exception {
		return dao.detailImage(walkVO);
	}

}