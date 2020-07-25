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

	@Override
	public void updateRecommend(PhotoboardVO pvo) {
		sqlSession.update("photoboardMapper.updateRecommend", pvo);
	}

	@Override
	public void updateReport(PhotoboardVO pvo) {
		sqlSession.update("photoboardMapper.updateReport", pvo);
	}

	@Override
	public void deletePost(PhotoboardVO pvo) throws Exception {
		sqlSession.update("photoboardMapper.deletePost", pvo);
	}

	@Override
	public int loadViewCount(int p_no) throws Exception {
		return sqlSession.selectOne("photoboardMapper.loadViewCount", p_no);
	}

	@Override
	public void increaseViewCount(int p_no) throws Exception {
		sqlSession.update("photoboardMapper.increaseViewCount", p_no);
	}

}