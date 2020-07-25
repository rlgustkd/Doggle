package com.doggle.dao;

import java.util.List;

import com.doggle.vo.PetshopVO;

public interface PetshopDao {
	
	public void saveImage(String saveFileName) throws Exception;
	
	public List<PetshopVO> getByteImage() throws Exception;
	
	public PetshopVO detailImage(PetshopVO petshopVO) throws Exception;

}