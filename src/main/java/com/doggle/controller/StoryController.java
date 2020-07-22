package com.doggle.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.doggle.service.FreeboardService;
import com.doggle.vo.FreeboardVO;

@Controller
@RequestMapping(value = "/story/*")
public class StoryController {
	
	@Inject
	FreeboardService freeboardservice;
	
	private static final Logger logger = LoggerFactory.getLogger(StoryController.class);
	
		//기존에 작성되어 있던 코드
	@RequestMapping(value = "/story", method = RequestMethod.GET)
	public String story(Model model) throws Exception {
		logger.info("story");
		
		//select 커리로 하는데  갑들을 화면에 넘기 기
		
		//insert에 해당되는 부분이 필요함 - King of Java
		
		List<FreeboardVO> FreeboardStory = freeboardservice.list();
		logger.info("hi");
		for(int i = 0; i < FreeboardStory.size(); i++) {
			logger.info(FreeboardStory.get(i).getFb_title());
		}
		
		model.addAttribute("FreeboardStory", FreeboardStory);
		
		
		return "story/story";
	}
	
		//데이터를 작성해야 하는 코드?
	@RequestMapping(value = "/detailStoryWriter", method = RequestMethod.GET)
	public String writer() throws Exception {
		
		// insert sql문 구현된 함수 불러오기 
	
		return "story/detailStoryWriter";
	}
		
		// 글 조회
	@RequestMapping(value = "/detailStoryView", method = RequestMethod.GET)
	public String getRead(@RequestParam("p_no") int p_no, Model model) throws Exception {
		logger.info("get read");
		
		FreeboardVO vo = freeboardservice.read(p_no);
		model.addAttribute("read", vo);
		
		return "story/detailStoryView";
	}
	
		// 글 수정
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public void getModity(@RequestParam("p_no") int p_no, Model model) throws Exception {
		logger.info("get modify");
		
		FreeboardVO vo = freeboardservice.read(p_no);
		
		model.addAttribute("modify", vo);
	}
	
		// 글 삭제
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public void getDelete(@RequestParam("p_no") int p_no, Model model) throws Exception {
		logger.info("get delete");
		
		model.addAttribute("delete", p_no);
	}
	
		// 글 수정 POST
	@RequestMapping(value ="/modify", method = RequestMethod.POST)
	public String postModify(FreeboardVO vo) throws Exception {
		logger.info("post modify");
		
		freeboardservice.update(vo);
		
		return "redirect:/story/detailStoryView";
	}
	
		//글 삭제 POST
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String postDelete(@RequestParam("p_no") int p_no) throws Exception {
		logger.info("post delete");
		
		freeboardservice.delete(p_no);
		
		return "redirect:story/detailStoryView";
	}
	
	
	
		
		
	
	//내가 작성한 코드
//	@Inject
//	FreeboardService service;
	
	//글 작성 get
//	@RequestMapping(value = "/detailStoryWriter", method = RequestMethod.GET)
//	public void getWrite() throws Exception {
//		Logger.info("get write");
//	}
	
	// 글 작성 post
//	@RequestMapping(value = "/detailStoryWriter", method = RequestMethod.POST)
//	public String postWrite(FreeboardVO vo) throws Exception {
//		Logger.info("post write");
		
//		service.write(vo);
		
//		return "story/story";
	
}