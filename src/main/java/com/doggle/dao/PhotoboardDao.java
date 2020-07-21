package com.doggle.dao;

import java.util.List;

import com.doggle.vo.PhotoboardVO;

public interface PhotoboardDao {

	public List<PhotoboardVO> loadPosts() throws Exception;

	public void uploadPost(PhotoboardVO pvo) throws Exception;
}
