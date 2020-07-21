package com.doggle.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.doggle.vo.PhotoboardVO;


@Repository
public class PhotoboardDaoImpl implements PhotoboardDao {
	@Inject
	private SqlSession sqlSession;
	
	@Override
	public List<PhotoboardVO> loadPosts() {
		return sqlSession.selectList("photoboardMapper.loadPosts");
	}

	@Override
	public void uploadPost(PhotoboardVO pvo) throws Exception {
		sqlSession.insert("photoboardMapper.uploadPost", pvo);
	}

}
