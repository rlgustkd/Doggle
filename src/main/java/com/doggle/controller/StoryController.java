package com.doggle.controller;

import java.io.File;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.doggle.service.FreeboardService;
import com.doggle.utils.UploadFileUtils;
import com.doggle.vo.FreeboardVO;
import com.doggle.vo.MemberVO;

@Controller
@RequestMapping(value = "/story/*")
public class StoryController {

	@Inject
	FreeboardService freeboardService;
	@Resource(name = "uploadPath")
	private String uploadPath;

	private static final Logger logger = LoggerFactory.getLogger(StoryController.class);

	@RequestMapping(value = "/freeboard", method = RequestMethod.GET)
	public String story(Model model) throws Exception {
		logger.info("freeboard");
		
		//select 커리로 하는데  갑들을 화면에 넘기 기
		
		//insert에 해당되는 부분이 필요함 - King of Java
		
		List<FreeboardVO> FreeboardStory = freeboardService.list();
		logger.info("hi");
		for(int i = 0; i < FreeboardStory.size(); i++) {
			logger.info(FreeboardStory.get(i).getFb_title());
		}
		
		model.addAttribute("FreeboardStory", FreeboardStory);
		
		
		return "story/freeboard/freeboard";
	}
	
	//데이터를 작성해야 하는 코드?
		@RequestMapping(value = "/detailStoryWriter", method = RequestMethod.GET)
		public String writer() throws Exception {
			
			// insert sql문 구현된 함수 불러오기 
		
			return "story/freeboard/detailStoryWriter";
		}
			
			// 글 조회
		@RequestMapping(value = "/detailStoryView", method = RequestMethod.GET)
		public String getRead(@RequestParam("p_no") int p_no, Model model) throws Exception {
			logger.info("get read");
			
			FreeboardVO vo = freeboardService.read(p_no);
			model.addAttribute("read", vo);
			
			return "story/freeboard/detailStoryView";
		}
		
			// 글 수정
		@RequestMapping(value = "/modify", method = RequestMethod.GET)
		public void getModity(@RequestParam("p_no") int p_no, Model model) throws Exception {
			logger.info("get modify");
			
			FreeboardVO vo = freeboardService.read(p_no);
			
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
			
			freeboardService.update(vo);
			
			return "redirect:/story/freeboard/detailStoryView";
		}
		
			//글 삭제 POST
		@RequestMapping(value = "/delete", method = RequestMethod.POST)
		public String postDelete(@RequestParam("p_no") int p_no) throws Exception {
			logger.info("post delete");
			
			freeboardService.delete(p_no);
			
			return "redirect:story/freeboard/detailStoryView";
		}
		
		

	@RequestMapping(value = "/freeboard/upload", method = RequestMethod.GET)
	public String freeboardUploadGet() throws Exception {
		logger.info("/freeboard/upload_get");

		return "/story/freeboard/upload";
	}

	@RequestMapping(value = "/freeboard/upload", method = RequestMethod.POST)
	public String freeboardUploadPost(FreeboardVO freeboardVO, MultipartFile file, HttpSession session) throws Exception {
		logger.info("/freeboard/upload_post");
		System.out.println("아래 내용복사");
		logger.info(freeboardVO.getFb_content());
		
		//세션에서 아이디받아옴.
		MemberVO memberVO = (MemberVO)session.getAttribute("user");
		String user_id = memberVO.getUser_id();
		
		System.out.println("로그인계정 : " + user_id);
		
		freeboardVO.setUser_id(user_id);
		freeboardService.registClobData(freeboardVO);
		
		return "redirect:/story/freeboard";
		
		/*
		 * 파일용 인풋박스에 등록된 파일의 정보를 가져오고, UploadFileUtils.java를 통해 폴더를 생성한 후 원본 파일과 썸네일을
		 * 저장한 뒤, 이 경로를 데이터 베이스에 전하기 위해 GoodsVO에 입력(set)합니다.
		 */
//
//		String imgUploadPath = uploadPath + File.separator + "imgUpload";
//		String ymdPath = UploadFileUtils.calcPath(imgUploadPath);
//		String fileName = null;
//
//		if (file.getOriginalFilename() != null && file.getOriginalFilename() != "") {
//			fileName = UploadFileUtils.fileUpload(imgUploadPath, file.getOriginalFilename(), file.getBytes(), ymdPath);
//		} else {
//			fileName = uploadPath + File.separator + "images" + File.separator + "none.png";
//		}
//
//		freeboardVO.setFb_photo(File.separator + "imgUpload" + ymdPath + File.separator + fileName);
//		freeboardVO.setThumbimg(
//				File.separator + "imgUpload" + ymdPath + File.separator + "s" + File.separator + "s_" + fileName);
//
		/* freeboardService.upload(freeboardVO); */

		
		

	}

}
