package com.doggle.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.doggle.service.SignupService;
import com.doggle.vo.MemberVO;
import com.doggle.vo.overlapCheckVO;

@Controller
//@RequestMapping("/member/*")
public class SignupController {

	private static final Logger logger = LoggerFactory.getLogger(SignupController.class);

	@Inject
	SignupService signupService;

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public void signupget() throws Exception {
		logger.info("signup");

//		HttpSession session = request.getSession();
//		logger.info((String) session.getAttribute("type"));
		
//		return "signup";
		
	}

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
//	public String regcenterpost(UsersVO usersVO, Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {
	public String signuppost(MemberVO usersVO) throws Exception {
		logger.info("usersVO");

//		logger.info(request.getParameter("id"));
//		logger.info(request.getParameter("nickname"));

//		int id = Integer.parseInt(request.getParameter("id"));
//		int nickname = Integer.parseInt(request.getParameter("nickname"));

//		overlapCheckVO ovlpcVO = new overlapCheckVO();
//		ovlpcVO.setId(usersVO.getId());

//		overlapCheckVO realckVO = signupService.overlapcheck(ovlpcVO);

//		if(realckVO == null) {
//			logger.info(usersVO.getId());
		signupService.signup(usersVO);

//			return "signup";
//		} else {

//			model.addAttribute("msg", "회원가입 실패!");
//			model.addAttribute("url", "/user/regcenter");

		return null;
//	        return "redirect";	
	}
}

//		logger.info(usersVO.getId());
//		signupService.signup(usersVO);

//		logger.info(request.getParameter("p_no"));
//		logger.info(request.getParameter("e_no"));

//		int p_no = Integer.parseInt(request.getParameter("p_no"));
//		int e_no = Integer.parseInt(request.getParameter("e_no"));

//		ManagerVO managerVO = new ManagerVO();
//		managerVO.setId(regVO.getId());

//		ManagerVO regchkVO = managerService.regchk(managerVO);
//		if (regchkVO == null) {
//			
//			if(e_no==0) {
//				
//				empService.register(regVO);
//				managerService.register(regVO);
//
//			} else {
//
//				managerService.hasEnoReg(regVO);
//				
//			}
//
//			return "center/logincenter";
//
//		} else {
//
//			model.addAttribute("msg", "회원가입 실패!");
//			model.addAttribute("url", "/user/regcenter");
//
//			return "redirect";
//		}
