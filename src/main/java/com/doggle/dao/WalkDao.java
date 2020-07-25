package com.doggle.dao;

import java.util.List;

import com.doggle.vo.WalkVO;

public interface WalkDao {
	
	public void saveImage(String saveFileName) throws Exception;
	
	public List<WalkVO> getByteImage() throws Exception;
	
	public WalkVO detailImage(WalkVO walkVO) throws Exception;

}