package com.doggle.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.doggle.dao.PetshopDao;
import com.doggle.vo.PetshopVO;

@Service
public class PetshopServiceImpl implements PetshopService {
	
	@Inject
	private PetshopDao dao;

	@Override
	public List<PetshopVO> getByteImage() throws Exception {
		return dao.getByteImage();
	}
	@Override
	public void saveImage(String saveFileName) throws Exception {
		dao.saveImage(saveFileName);
	}
	@Override
	public PetshopVO detailImage(PetshopVO petshopVO) throws Exception {
		return dao.detailImage(petshopVO);
	}

}