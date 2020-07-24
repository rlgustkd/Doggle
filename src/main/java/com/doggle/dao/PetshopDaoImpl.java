package com.doggle.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.doggle.vo.PetshopVO;

@Repository
public class PetshopDaoImpl implements PetshopDao {
	
	@Inject
	private SqlSession sqlSession;
	
	@Override
	public void saveImage (String saveFileName) throws Exception {
		sqlSession.insert("petshopMapper.saveImage", saveFileName);
	}

	@Override
	public List<PetshopVO> getByteImage() throws Exception {
		return sqlSession.selectList("petshopMapper.getByteImage");
	}

	@Override
	public PetshopVO detailImage(PetshopVO petshopVO) throws Exception {
		return sqlSession.selectOne("petshopMapper.detailImage", petshopVO);
	}


}
