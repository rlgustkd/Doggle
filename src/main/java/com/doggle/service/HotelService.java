package com.doggle.service;

import java.util.List;

import com.doggle.vo.HotelVO;

public interface HotelService {
	
	public void saveImage(String saveFileName) throws Exception;
	
	public List<HotelVO> getByteImage() throws Exception;
	
	public HotelVO detailImage(HotelVO hotelVO) throws Exception;
}
