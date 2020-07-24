package com.doggle.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.doggle.vo.WalkVO;

@Repository
public class WalkDaoImpl implements WalkDao {
	
	@Inject
	private SqlSession sqlSession;
	
	@Override
	public void saveImage (String saveFileName) throws Exception {
		sqlSession.insert("walkMapper.saveImage", saveFileName);
	}

	@Override
	public List<WalkVO> getByteImage() throws Exception {
		return sqlSession.selectList("walkMapper.getByteImage");
	}

	@Override
	public WalkVO detailImage(WalkVO walkVO) throws Exception {
		return sqlSession.selectOne("walkMapper.detailImage", walkVO);
	}


}
