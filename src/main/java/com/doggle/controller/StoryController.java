package com.doggle.controller;

import java.io.File;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.doggle.service.FreeboardService;
import com.doggle.utils.UploadFileUtils;
import com.doggle.vo.FreeboardVO;
import com.doggle.vo.MemberVO;

@Controller
@RequestMapping(value = "/story/*")
public class StoryController {

	@Inject
	FreeboardService freeboardService;
	@Resource(name = "uploadPath")
	private String uploadPath;

	private static final Logger logger = LoggerFactory.getLogger(StoryController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String story() throws Exception {
		logger.info("/story_main");

		return "/story/story";
	}

	@RequestMapping(value = "/freeboard/upload", method = RequestMethod.GET)
	public String freeboardUploadGet() throws Exception {
		logger.info("/freeboard/upload_get");

		return "/story/freeboard/upload";
	}

	@RequestMapping(value = "/freeboard/upload", method = RequestMethod.POST)
	public String freeboardUploadPost(FreeboardVO freeboardVO, MultipartFile file, HttpSession session) throws Exception {
		logger.info("/freeboard/upload_post");
		System.out.println("이건 그냥 스트링");
		logger.info(freeboardVO.getFb_content());
		
		String user_id = String.valueOf(session.getAttribute("user_id"));
//		MemberVO memberVO = (MemberVO)session.getAttribute("user");
		
		freeboardVO.setUser_id(user_id);
		freeboardService.registClobData(freeboardVO);
		
		return "/story/story";
		
		/*
		 * 파일용 인풋박스에 등록된 파일의 정보를 가져오고, UploadFileUtils.java를 통해 폴더를 생성한 후 원본 파일과 썸네일을
		 * 저장한 뒤, 이 경로를 데이터 베이스에 전하기 위해 GoodsVO에 입력(set)합니다.
		 */
//
//		String imgUploadPath = uploadPath + File.separator + "imgUpload";
//		String ymdPath = UploadFileUtils.calcPath(imgUploadPath);
//		String fileName = null;
//
//		if (file.getOriginalFilename() != null && file.getOriginalFilename() != "") {
//			fileName = UploadFileUtils.fileUpload(imgUploadPath, file.getOriginalFilename(), file.getBytes(), ymdPath);
//		} else {
//			fileName = uploadPath + File.separator + "images" + File.separator + "none.png";
//		}
//
//		freeboardVO.setFb_photo(File.separator + "imgUpload" + ymdPath + File.separator + fileName);
//		freeboardVO.setThumbimg(
//				File.separator + "imgUpload" + ymdPath + File.separator + "s" + File.separator + "s_" + fileName);
//
		/* freeboardService.upload(freeboardVO); */

		
		

	}

}
