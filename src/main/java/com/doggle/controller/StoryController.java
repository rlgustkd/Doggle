package com.doggle.controller;

import java.io.File;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

@Controller
@RequestMapping(value = "/story/*")
public class StoryController {
	
	@Inject
	FreeboardService freeboardService;
	@Resource(name="uploadPath")
	private String uploadPath;
	
	private static final Logger logger = LoggerFactory.getLogger(StoryController.class);
	
	@RequestMapping(value ="/", method = RequestMethod.GET)
	public String story() throws Exception{
		logger.info("/story_main");
		
		return "/story/story";
	}
	
	@RequestMapping(value= "/freeboard/upload", method = RequestMethod.GET)
	public String freeboardUploadGet() throws Exception{
		logger.info("/freeboard/upload_get");
		
		return "/story/freeboard/upload";
	}
	
	@RequestMapping(value = "/freeboard/upload", method = RequestMethod.POST)
	public String freeboardUploadPost(FreeboardVO freeboardVO, MultipartFile file) throws Exception {
		logger.info("/freeboard/upload_post");
		
		
		String imgUploadPath = uploadPath + File.separator + "imgUpload";
		String ymdPath = UploadFileUtils.calcPath(imgUploadPath);
		String fileName = null;

		if(file.getOriginalFilename() != null && file.getOriginalFilename() != "") {
		 fileName =  UploadFileUtils.fileUpload(imgUploadPath, file.getOriginalFilename(), file.getBytes(), ymdPath); 
		} else {
		 fileName = uploadPath + File.separator + "images" + File.separator + "none.png";
		}

		freeboardVO.setFb_photo(File.separator + "imgUpload" + ymdPath + File.separator + fileName);
		freeboardVO.setThumbimg(File.separator + "imgUpload" + ymdPath + File.separator + "s" + File.separator + "s_" + fileName);
		
		
		
		freeboardService.upload(freeboardVO);

		return "/story/story";
		
	}
	
}
