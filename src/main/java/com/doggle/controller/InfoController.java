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
@RequestMapping(value = "/info/*")
public class InfoController {
	
	private static final Logger logger = LoggerFactory.getLogger(InfoController.class);
	
	@RequestMapping(value = "/hospital", method = RequestMethod.GET)
	public String hospital() throws Exception {
		logger.info("hospital");
		
		return "info/hospital";
	}
	
	@RequestMapping(value = "/hotel", method = RequestMethod.GET)
	public String hotel() throws Exception {
		logger.info("hotel");
		
		return "info/hotel";
	}
	
	@RequestMapping(value = "/outdoor", method = RequestMethod.GET)
	public String outdoor() throws Exception {
		logger.info("outdoor");
		
		return "info/outdoor";
	}
	
	@RequestMapping(value = "/petshop", method = RequestMethod.GET)
	public String petshop() throws Exception {
		logger.info("petshop");
		
		return "info/petshop";
	}
	
}
