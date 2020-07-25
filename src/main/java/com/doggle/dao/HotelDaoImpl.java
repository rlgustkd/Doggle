package com.doggle.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.doggle.vo.HotelVO;

@Repository
public class HotelDaoImpl implements HotelDao {
	
	@Inject
	private SqlSession sqlSession;
	
	@Override
	public void saveImage (String saveFileName) throws Exception {
		sqlSession.insert("hotelMapper.saveImage", saveFileName);
	}

	@Override
	public List<HotelVO> getByteImage() throws Exception {
		return sqlSession.selectList("hotelMapper.getByteImage");
	}

	@Override
	public HotelVO detailImage(HotelVO hotelVO) throws Exception {
		return sqlSession.selectOne("hotelMapper.detailImage", hotelVO);
	}

}