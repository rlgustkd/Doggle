package com.doggle.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.doggle.dao.PhotoboardDao;
import com.doggle.vo.PhotoboardVO;

@Service
public class PhotoboardServiceImpl implements PhotoboardService {

	@Inject
	private PhotoboardDao dao;
	
	
	@Override
	public List<PhotoboardVO> loadPosts() throws Exception {
		
		return dao.loadPosts();
	}


	@Override
	public void uploadPost(PhotoboardVO pvo) throws Exception {
		dao.uploadPost(pvo);
	}


	@Override
	public void updateRecommend(PhotoboardVO pvo) throws Exception {
		dao.updateRecommend(pvo);
	}


	@Override
	public void updateReport(PhotoboardVO pvo) throws Exception {
		dao.updateReport(pvo);
	}


	@Override
	public void deletePost(PhotoboardVO pvo) throws Exception {
		dao.deletePost(pvo);
	}


	@Override
	public int loadViewCount(int p_no) throws Exception {
		return dao.loadViewCount(p_no);
	}


	@Override
	public void increaseViewCount(int p_no) throws Exception {
		dao.increaseViewCount(p_no);
	}

}
