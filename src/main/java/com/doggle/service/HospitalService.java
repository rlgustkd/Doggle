package com.doggle.service;

import java.util.List;
import java.util.Map;

import com.doggle.vo.HospitalVO;

public interface HospitalService {

	public void saveImage(String saveFileName) throws Exception;
	
	public List<HospitalVO> getByteImage() throws Exception;
	
	public HospitalVO detailImage(HospitalVO hospitalVO) throws Exception;

}