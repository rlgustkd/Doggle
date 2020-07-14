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
@RequestMapping(value = "/user/*")
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() throws Exception {
		logger.info("login");
		
		return "user/login";
	}
	
	@RequestMapping(value = "/mypage", method = RequestMethod.GET)
	public String mypage() throws Exception {
		logger.info("mypage");
		
		return "user/mypage";
	}
	
}
