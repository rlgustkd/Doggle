package com.doggle.service;

import java.util.List;

import com.doggle.vo.FreeboardVO;
import com.doggle.vo.InfoBoardVO;

public interface InfoboardService {

	public void upload(InfoBoardVO infoboardVO) throws Exception;
}