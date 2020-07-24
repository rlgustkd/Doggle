package com.doggle.dao;

import java.util.List;
import java.util.Map;


import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.doggle.vo.HospitalVO;

@Repository
public class HospitalDaoImpl implements HospitalDao {

	@Inject
	private SqlSession sqlSession;
	
	@Override
	public void saveImage (String saveFileName) throws Exception {
		sqlSession.insert("hospitalMapper.saveImage", saveFileName);
	}

	@Override
	public List<HospitalVO> getByteImage() throws Exception {
		return sqlSession.selectList("hospitalMapper.getByteImage");
	}

	@Override
	public HospitalVO detailImage(HospitalVO hospitalVO) throws Exception {
		return sqlSession.selectOne("hospitalMapper.detailImage", hospitalVO);
	}


}
