package com.doggle.service;

import java.util.List;

import com.doggle.vo.PetshopVO;

public interface PetshopService {

	public void saveImage(String saveFileName) throws Exception;
	
	public List<PetshopVO> getByteImage() throws Exception;
	
	public PetshopVO detailImage(PetshopVO petshopVO) throws Exception;

}
