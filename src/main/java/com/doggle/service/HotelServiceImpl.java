package com.doggle.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.doggle.dao.HotelDao;
import com.doggle.vo.HotelVO;

@Service
public class HotelServiceImpl implements HotelService {
	
	@Inject
	private HotelDao dao;

	@Override
	public List<HotelVO> getByteImage() throws Exception {
		return dao.getByteImage();
	}
	@Override
	public void saveImage(String saveFileName) throws Exception {
		dao.saveImage(saveFileName);
	}
	@Override
	public HotelVO detailImage(HotelVO hotelVO) throws Exception {
		return dao.detailImage(hotelVO);
	}

}