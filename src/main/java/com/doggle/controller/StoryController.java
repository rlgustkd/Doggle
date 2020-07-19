package com.doggle.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/story/*")
public class StoryController {
	
	private static final Logger logger = LoggerFactory.getLogger(StoryController.class);
	
	@RequestMapping(value = "/story", method = RequestMethod.GET)
	public String story() throws Exception {
		logger.info("story");
		
		return "story/story";
	}
	
	
	@RequestMapping(value = "/gallery", method = RequestMethod.GET)
	public String galget() throws Exception {
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
