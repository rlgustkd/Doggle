package com.doggle.controller;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.doggle.service.ReplyService;
import com.doggle.vo.ReplyVO;

import net.sf.json.JSONArray;

@Controller
@RequestMapping(value = "/detail/*")
public class InfoDetailController {
	
	@Inject
	ReplyService replyService;
	
	private static final Logger logger = LoggerFactory.getLogger(InfoDetailController.class);
	@RequestMapping(value = "/hospital", method = RequestMethod.POST)
	public @ResponseBody Object hospitalput (Model model, HttpServletRequest request) throws Exception {
		
		logger.info("hospitalput");
		
		String image = request.getParameter("image");
		logger.info(image);
		int p_no = Integer.parseInt(request.getParameter("image"));
		ReplyVO replyVO = new ReplyVO();
		replyVO.setP_no(p_no);
		List<ReplyVO> h_replyinfo = replyService.h_replyinfo(replyVO);
		model.addAttribute(h_replyinfo);
		JSONArray jsonArray = JSONArray.fromObject(h_replyinfo);
		for (int i = 0; i < h_replyinfo.size(); i++) {
			logger.info(h_replyinfo.get(i).getR_content());
		}
		
		return jsonArray;
	}
	
	@RequestMapping(value = "/hotel", method = RequestMethod.POST)
	public @ResponseBody Object hotelput (Model model, HttpServletRequest request) throws Exception {
		
		logger.info("hotelput");
		
		String image = request.getParameter("image");
		logger.info(image);
		int p_no = Integer.parseInt(request.getParameter("image"));
		ReplyVO replyVO = new ReplyVO();
		replyVO.setP_no(p_no);
		List<ReplyVO> ht_replyinfo = replyService.ht_replyinfo(replyVO);
		model.addAttribute(ht_replyinfo);
		JSONArray jsonArray = JSONArray.fromObject(ht_replyinfo);
		for (int i = 0; i < ht_replyinfo.size(); i++) {
			logger.info(ht_replyinfo.get(i).getR_content());
		}
		
		return jsonArray;
	}
	
	@RequestMapping(value = "/walk", method = RequestMethod.POST)
	public @ResponseBody Object walkput (Model model, HttpServletRequest request) throws Exception {
		
		logger.info("walkput");
		
		String image = request.getParameter("image");
		logger.info(image);
		int p_no = Integer.parseInt(request.getParameter("image"));
		ReplyVO replyVO = new ReplyVO();
		replyVO.setP_no(p_no);
		List<ReplyVO> w_replyinfo = replyService.w_replyinfo(replyVO);
		model.addAttribute(w_replyinfo);
		JSONArray jsonArray = JSONArray.fromObject(w_replyinfo);
		for (int i = 0; i < w_replyinfo.size(); i++) {
			logger.info(w_replyinfo.get(i).getR_content());
		}
		
		return jsonArray;
	}
	
	@RequestMapping(value = "/petshop", method = RequestMethod.POST)
	public @ResponseBody Object petshopput (Model model, HttpServletRequest request) throws Exception {
		
		logger.info("petshopput");
		
		String image = request.getParameter("image");
		logger.info(image);
		int p_no = Integer.parseInt(request.getParameter("image"));
		ReplyVO replyVO = new ReplyVO();
		replyVO.setP_no(p_no);
		List<ReplyVO> p_replyinfo = replyService.p_replyinfo(replyVO);
		model.addAttribute(p_replyinfo);
		JSONArray jsonArray = JSONArray.fromObject(p_replyinfo);
		for (int i = 0; i < p_replyinfo.size(); i++) {
			logger.info(p_replyinfo.get(i).getR_content());
		}
		
		return jsonArray;
	}
	
	
	@RequestMapping(value = "/hospitalreply", method = RequestMethod.POST)
	public @ResponseBody Object hospitalreply (Model model, HttpServletRequest request) throws Exception {
		
		logger.info("hospitalreply");
		
		String p_num = request.getParameter("p_no");
		String replycontent = request.getParameter("replycontent");
		String user_id = request.getParameter("user_id");
		logger.info(p_num);
		logger.info(replycontent);
		logger.info(user_id);
		int p_no = Integer.parseInt(request.getParameter("p_no"));
		ReplyVO replyVO = new ReplyVO();
		replyVO.setP_no(p_no);
		replyVO.setR_content(replycontent);
		replyVO.setUser_id(user_id);
		replyService.h_replywrite(replyVO);
		
		String smsg = "sucess";
		
		return smsg;
	}
	
	@RequestMapping(value = "/hotelreply", method = RequestMethod.POST)
	public @ResponseBody Object hotelreply (Model model, HttpServletRequest request) throws Exception {
		
		logger.info("hotelreply");
		
		String p_num = request.getParameter("p_no");
		String replycontent = request.getParameter("replycontent");
		String user_id = request.getParameter("user_id");
		logger.info(p_num);
		logger.info(replycontent);
		logger.info(user_id);
		int p_no = Integer.parseInt(request.getParameter("p_no"));
		ReplyVO replyVO = new ReplyVO();
		replyVO.setP_no(p_no);
		replyVO.setR_content(replycontent);
		replyVO.setUser_id(user_id);
		replyService.ht_replywrite(replyVO);
		
		String smsg = "sucess";
		
		return smsg;
	}
	
	@RequestMapping(value = "/walkreply", method = RequestMethod.POST)
	public @ResponseBody Object walkreply (Model model, HttpServletRequest request) throws Exception {
		
		logger.info("walkreply");
		
		String p_num = request.getParameter("p_no");
		String replycontent = request.getParameter("replycontent");
		String user_id = request.getParameter("user_id");
		logger.info(p_num);
		logger.info(replycontent);
		logger.info(user_id);
		int p_no = Integer.parseInt(request.getParameter("p_no"));
		ReplyVO replyVO = new ReplyVO();
		replyVO.setP_no(p_no);
		replyVO.setR_content(replycontent);
		replyVO.setUser_id(user_id);
		replyService.w_replywrite(replyVO);
		
		String smsg = "sucess";
		
		return smsg;
	}
	
	@RequestMapping(value = "/petshopreply", method = RequestMethod.POST)
	public @ResponseBody Object petshopreply (Model model, HttpServletRequest request) throws Exception {
		
		logger.info("petshopreply");
		
		String p_num = request.getParameter("p_no");
		String replycontent = request.getParameter("replycontent");
		String user_id = request.getParameter("user_id");
		logger.info(p_num);
		logger.info(replycontent);
		logger.info(user_id);
		int p_no = Integer.parseInt(request.getParameter("p_no"));
		ReplyVO replyVO = new ReplyVO();
		replyVO.setP_no(p_no);
		replyVO.setR_content(replycontent);
		replyVO.setUser_id(user_id);
		replyService.p_replywrite(replyVO);
		
		String smsg = "sucess";
		
		return smsg;
	}
	
	@RequestMapping(value = "/hospitaldelete", method = RequestMethod.POST)
	public @ResponseBody Object hospitaldelete (Model model, HttpServletRequest req) throws Exception {
		logger.info("hospitaldelete");
		logger.info(req.getParameter("r_num"));
		String r_num = req.getParameter("r_num");
		logger.info(r_num);
		
		int r_no = Integer.parseInt(req.getParameter("r_num"));
		ReplyVO replyVO = new ReplyVO();
		replyVO.setR_no(r_no);
		
		replyService.h_replydelete(replyVO);
		
		String smsg = "sucess";
		
		return smsg;
	}
	
	@RequestMapping(value = "/hoteldelete", method = RequestMethod.POST)
	public @ResponseBody Object hoteldelete (Model model, HttpServletRequest req) throws Exception {
		logger.info("hoteldelete");
		logger.info(req.getParameter("r_num"));
		String r_num = req.getParameter("r_num");
		logger.info(r_num);
		
		int r_no = Integer.parseInt(req.getParameter("r_num"));
		ReplyVO replyVO = new ReplyVO();
		replyVO.setR_no(r_no);
		
		replyService.ht_replydelete(replyVO);
		
		String smsg = "sucess";
		
		return smsg;
	}
	
	@RequestMapping(value = "/walkdelete", method = RequestMethod.POST)
	public @ResponseBody Object walkdelete (Model model, HttpServletRequest req) throws Exception {
		logger.info("walkdelete");
		logger.info(req.getParameter("r_num"));
		String r_num = req.getParameter("r_num");
		logger.info(r_num);
		
		int r_no = Integer.parseInt(req.getParameter("r_num"));
		ReplyVO replyVO = new ReplyVO();
		replyVO.setR_no(r_no);
		
		replyService.w_replydelete(replyVO);
		
		String smsg = "sucess";
		
		return smsg;
	}
	

	
	
	//기현이형 합 마지막
	
}