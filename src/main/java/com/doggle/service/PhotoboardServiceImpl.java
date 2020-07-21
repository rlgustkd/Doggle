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

}
