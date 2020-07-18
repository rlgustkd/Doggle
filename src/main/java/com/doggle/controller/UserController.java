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

import com.doggle.service.MemberService;
import com.doggle.vo.MemberVO;

@Controller
@RequestMapping(value = "/user/*")
public class UserController {
	
	@Inject
	MemberService memberService;
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	
	@RequestMapping(value = "/mypage", method = RequestMethod.GET)
	public String mypage() throws Exception {
		logger.info("mypage");
		
		return "user/mypage";
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String signupget() throws Exception {
		logger.info("user");
		return "user/login";
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String signuppost(MemberVO memberVO, HttpServletRequest request, Model model) throws Exception {
		logger.info("signupPost");

		MemberVO membervo = new MemberVO();

		String user_id = request.getParameter("userid");
		String nickname = request.getParameter("nickname");
		String email = request.getParameter("email");
		String pwd = request.getParameter("password");

		membervo.setUser_id(user_id);
		membervo.setPwd(pwd);
		membervo.setNickname(nickname);
		membervo.setEmail(email);

		int idChk = memberService.idChk(user_id);
		int nameChk = memberService.nameChk(nickname);
		int emailChk = memberService.emailChk(email);

		if (idChk != 0) {
			logger.info("id");
			model.addAttribute("msg", "회원가입 실패! id가 중복되었습니다.");
			model.addAttribute("url","/user/user");
		} else if (nameChk != 0) {
			logger.info("name");
			model.addAttribute("msg", "회원가입 실패! 닉네임이 중복되었습니다.");
			model.addAttribute("url","/user/user");
		} else if (emailChk != 0) {
			logger.info("mail");
			model.addAttribute("msg", "회원가입 실패! 이메일이 중복되었습니다.");
            model.addAttribute("url","/user/user");

		} else {
			logger.info("success");
			model.addAttribute("msg", "회원가입 성공!");
			memberService.signup(membervo);
		}
		return "user/login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginput(MemberVO memberVO, HttpServletRequest request, Model model) throws Exception {
		HttpSession session = request.getSession();

		MemberVO membervo = new MemberVO();
		logger.info("loginput");
		logger.info(request.getParameter("loginId"));
		logger.info(request.getParameter("loginPwd"));
		String user_id = request.getParameter("loginId");
		String pwd = request.getParameter("loginPwd");
		
		membervo.setUser_id(user_id);
		membervo.setPwd(pwd);
		MemberVO check = memberService.logincheck(membervo);

		if (check == null) {
			logger.info("id");
			model.addAttribute("msg", "로그인 실패! id와 패스워드를 확인해 주세요.");
			model.addAttribute("url", "/user/user");
			
			return "redirect";
		} 
		else {
			logger.info("login success");
			session.setAttribute("user", check);
			logger.info("1");
			model.addAttribute("msg", "로그인 성공!");
			model.addAttribute("url","/main");

			return "redirect";
		}
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public void logoutget(HttpServletRequest request, HttpServletResponse response) throws Exception {
		logger.info("logoutget");
		
		HttpSession session = request.getSession();
		
		session.invalidate();
		
		String url = "/doggle/main";
		response.sendRedirect(url);
	}
	
}
