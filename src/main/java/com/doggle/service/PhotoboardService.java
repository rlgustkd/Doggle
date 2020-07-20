package com.doggle.service;

import java.util.List;

import com.doggle.vo.PhotoboardVO;

public interface PhotoboardService {

	public List<PhotoboardVO> loadPosts() throws Exception;

}
