package com.doggle.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.doggle.service.HospitalService;
import com.doggle.service.PhotoboardService;
import com.doggle.vo.PhotoboardVO;

@Controller
@RequestMapping(value = "/story/*")
public class StoryController {
	
	@Inject
	PhotoboardService photoboardservice;
	private static final Logger logger = LoggerFactory.getLogger(StoryController.class);
	
	@RequestMapping(value = "/story", method = RequestMethod.GET)
	public String story() throws Exception {
		logger.info("story");
		
		return "story/story";
	}
	
	
	@RequestMapping(value = "/gallery", method = RequestMethod.GET)
	public String galget(Model model) throws Exception {
		logger.info("gallery");
		List<PhotoboardVO> pbposts = photoboardservice.loadPosts();
		
		for(int i = 0; i < pbposts.size(); i++) {
			logger.info(pbposts.get(i).getPb_content());
		}
		model.addAttribute("pbposts", pbposts);
		
		return "story/gallery";
	}
	
	@RequestMapping(value = "/gallery", method = RequestMethod.POST)
	public String galpost() throws Exception {
		logger.info("gallery");
		
		return "story/gallery";
	}
	
	@RequestMapping(value = "/galleryUpload", method = RequestMethod.GET)
	public String galuploadget() throws Exception {
		logger.info("galleryUploadGet");
		
		return "story/gallery_upload";
	}
	
	@RequestMapping(value = "/galUploadComplete", method = RequestMethod.GET)
	public String galuploadcompget() throws Exception {
		logger.info("galleryUploadCompleteGet");
		
		return "story/gallery";
	}
	
}
