package com.doggle.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.doggle.vo.FreeboardVO;

@Repository
public class FreeboardDaoImpl implements FreeboardDao {
	
	@Inject
	SqlSession sqlSession;
	
	@Override
	public void upload(FreeboardVO freeboardVO) throws Exception{
		sqlSession.insert("freeboardMapper.upload", freeboardVO);
	}
}
