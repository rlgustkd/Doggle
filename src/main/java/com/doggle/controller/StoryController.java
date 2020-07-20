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
		
		
		//select 커리로 하는데  갑들을 화면에 넘기 기 
		
		
		return "story/story";
	}
	
	
	
	@RequestMapping("/detailStoryWriter")
	public String writer() throws Exception {
		
		// insert sql문 구현된 함수 불러오기 
	
		return "story/detailStoryWriter";
	}
	
	
	
	
	
}
