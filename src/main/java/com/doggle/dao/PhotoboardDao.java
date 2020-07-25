package com.doggle.dao;

import java.util.List;

import com.doggle.vo.PhotoboardVO;

public interface PhotoboardDao {

	public List<PhotoboardVO> loadPosts() throws Exception;

	public void uploadPost(PhotoboardVO pvo) throws Exception;

	public void updateRecommend(PhotoboardVO pvo) throws Exception;

	public void updateReport(PhotoboardVO pvo) throws Exception;

	public void deletePost(PhotoboardVO pvo) throws Exception;

	public int loadViewCount(int p_no) throws Exception;

	public void increaseViewCount(int p_no) throws Exception;
}
