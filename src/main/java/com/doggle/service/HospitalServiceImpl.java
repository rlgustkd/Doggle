package com.doggle.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.doggle.dao.HospitalDao;
import com.doggle.vo.HospitalVO;

@Service
public class HospitalServiceImpl implements HospitalService {

	@Inject
	private HospitalDao dao;

	@Override
	public List<HospitalVO> getByteImage() throws Exception {
		return dao.getByteImage();
	}
	@Override
	public void saveImage(String saveFileName) throws Exception {
		dao.saveImage(saveFileName);
	}
	@Override
	public HospitalVO detailImage(HospitalVO hospitalVO) throws Exception {
		return dao.detailImage(hospitalVO);
	}



}
