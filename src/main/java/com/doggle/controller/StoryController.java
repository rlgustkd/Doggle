package com.doggle.controller;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.doggle.service.FreeboardService;
import com.doggle.service.PhotoboardService;
import com.doggle.service.Photoboard_ReplyService;
import com.doggle.service.RecommendboardService;
import com.doggle.service.ReportboardService;
import com.doggle.vo.FreeboardVO;
import com.doggle.vo.MemberVO;
import com.doggle.vo.PhotoboardVO;
import com.doggle.vo.Photoboard_ReplyVO;
import com.doggle.vo.RecommendboardVO;
import com.doggle.vo.ReportboardVO;

import net.sf.json.JSONArray;


@Controller
@RequestMapping(value = "/story/*")
public class StoryController {

	@Inject
	FreeboardService freeboardService;
	@Inject
	PhotoboardService photoboardservice;
	@Inject
	Photoboard_ReplyService photoboardreplyservice;
	@Inject
	RecommendboardService recommendboardservice;
	@Inject
	ReportboardService reportboardservice;
	
	
	@Resource(name = "uploadPath")
	private String uploadPath;

	private static final Logger logger = LoggerFactory.getLogger(StoryController.class);

	@RequestMapping(value = "/freeboard", method = RequestMethod.GET)
	public String story(Model model) throws Exception {
		logger.info("freeboard");
		
		List<FreeboardVO> FreeboardStory = freeboardService.list();
		logger.info("hi");
		for(int i = 0; i < FreeboardStory.size(); i++) {
			logger.info(FreeboardStory.get(i).getFb_title());
		}
		
		model.addAttribute("FreeboardStory", FreeboardStory);
		
		
		return "story/freeboard/freeboard";
	}
			
			// 글 조회
		@RequestMapping(value = "/detailStoryView", method = RequestMethod.GET)
		public String getRead(@RequestParam("p_no") int p_no, Model model, HttpSession session) throws Exception {
			logger.info("get read");
			
			FreeboardVO vo = freeboardService.read(p_no);
			model.addAttribute("read", vo);
			
			return "story/freeboard/detailStoryView";
			
			

//			MemberVO memberVO = (MemberVO)session.getAttribute("user"); 
//			String user_id = memberVO.getUser_id();  
			//		user_id 와 글작성자가 일치하면 버튼보이게 구현할것. (수정, 삭제)
			
//			
//			InfoboardVO vo = InfoboardService.read
//			
//			
			
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
		
		 //글 삭제 DELETE
	      @RequestMapping(value = "/delete", method = RequestMethod.DELETE, produces = "application/text; charset=utf8")
	      @ResponseBody
	      public String postDelete(HttpServletRequest request) throws Exception {
	         logger.info("post delete");
	         String resultMsg = "항목이 삭제 되었습니다.";
	         String pno = request.getParameter("p_no");
	         int p_no = Integer.parseInt(pno);
	         
	         freeboardService.delete(p_no);

	         return resultMsg;
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

	}
	
	
	//아래 세웅

	public static String getUuid() { 
		
		return UUID.randomUUID().toString().replaceAll("-", "");
		
	}
	@RequestMapping(value = "/gallery", method = RequestMethod.GET)
	public String galget(Model model, HttpServletRequest req) throws Exception {
		HttpSession session = req.getSession();
		MemberVO userinfo = (MemberVO) session.getAttribute("user");
		logger.info("gallery");
		
		List<PhotoboardVO> pbposts = photoboardservice.loadPosts();
		List<Photoboard_ReplyVO> loadAllreplies = photoboardreplyservice.loadAllReplies();
		
		model.addAttribute("pbposts", pbposts);
		model.addAttribute("replies", loadAllreplies);
		
		return "story/gallery/gallery";
	}
		
	@RequestMapping(value = "/galleryUpload", method = RequestMethod.GET)
	public String galuploadget() throws Exception {
		logger.info("galleryUploadGet");
		
		return "story/gallery/gallery_upload";
	}
	
	@RequestMapping(value = "/gallery", method = RequestMethod.POST)
	public String galuploadpost(MultipartHttpServletRequest mtfRequest, HttpServletRequest req, HttpServletResponse rep) throws Exception {
		HttpSession session = req.getSession();
		
		MemberVO userinfo = (MemberVO) session.getAttribute("user");
		
		logger.info("galleryUploadPost");
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		String userid = userinfo.getUser_id();
		
		List<MultipartFile> fileList = mtfRequest.getFiles("file");
		String mylist = fileList.get(0).toString();
		String src = mtfRequest.getParameter("src");
        String path = req.getRealPath("resources/images");

        String files = "";
        for (MultipartFile mf : fileList) {
            String originName = mf.getOriginalFilename(); // 원본 파일 명
            logger.info("originName: " + originName);
            
            String ext = originName.substring(originName.lastIndexOf('.')); // 확장자
            String saveFileName = getUuid() + ext;
            files = files + "," + saveFileName;
            //hospitalService.saveImage(saveFileName);
            logger.info("saveFileName: " + saveFileName);
            String saveFile = path + "/" + saveFileName;
            logger.info("savefile:" + saveFile);
            try {
                mf.transferTo(new File(saveFile));
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        logger.info(files);
        
        PhotoboardVO pvo = new PhotoboardVO();
        pvo.setUser_id(userid);
        pvo.setPb_title(title);
        pvo.setPb_content(content);
        pvo.setPb_photo(files);
        
        if (files.equals(null)) {
        	
        }
        else if (userid.equals(null)) {
        	
        } else {
        	photoboardservice.uploadPost(pvo);
        	logger.info("upload 성공~");
        }
        
		return "redirect:gallery";
	}

	@RequestMapping(value = "/gallery", method = RequestMethod.DELETE, produces = "application/text; charset=utf8")
	@ResponseBody
	public String galdel(HttpServletRequest request, HttpServletResponse response) throws Exception {
		logger.info("게시물삭제");
		String resultMsg = "항목이 삭제 되었습니다.";
		PhotoboardVO pvo = new PhotoboardVO();
		String pno = request.getParameter("p_no");
		int p_no = Integer.parseInt(pno);
		
		pvo.setP_no(p_no);
		photoboardservice.deletePost(pvo);
		
		logger.info("성공@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		return resultMsg;
	}
	
	@RequestMapping(value = "gallery", method = RequestMethod.PUT, produces = "application/json; charset=utf8")
	public @ResponseBody Object galput(Model model, HttpServletRequest request) throws Exception {
		logger.info("galleryPUT");
		
		String pno = request.getParameter("p_no");
		String r_content = request.getParameter("r_content");
		String user_id = request.getParameter("user_id");
		String rno = request.getParameter("r_no");
		int p_no = Integer.parseInt(pno);			
		
		
		if(rno != "") {
			int r_no = Integer.parseInt(rno);
			photoboardreplyservice.deleteComment(r_no);
		}
		
		if((r_content != "") && (user_id != "")) {
			logger.info("stop");
			Photoboard_ReplyVO newcomment = new Photoboard_ReplyVO();
			newcomment.setP_no(p_no);
			newcomment.setR_content(r_content);
			newcomment.setUser_id(user_id);
			
			photoboardreplyservice.addComment(newcomment);
		}
		
		
		List<Photoboard_ReplyVO> loadreplies = photoboardreplyservice.loadReplies(p_no);
		return loadreplies;
	}
	
	@RequestMapping(value = "gallery", method = RequestMethod.PATCH, produces = "application/json; charset=utf8")
	public @ResponseBody Object galpat(Model model, HttpServletRequest request) throws Exception {
		logger.info("galleryPAT");
		
		String pno = request.getParameter("p_no");
		String user_id = request.getParameter("user_id");
		int p_no = Integer.parseInt(pno);			
		int b_no = 2;
		String flag = request.getParameter("flag");
		
		if(flag.equals("rec")) {
			RecommendboardVO rvo = new RecommendboardVO();
			rvo.setB_no(b_no);
			rvo.setUser_id(user_id);
			rvo.setP_no(p_no);
			rvo.setUse_flag(0);
			int check = recommendboardservice.checkRec(rvo);
			
			if(check != 0) {
				return false;
			} else {
				recommendboardservice.addRec(rvo);
				int recommend = recommendboardservice.loadRec(b_no, p_no);
				PhotoboardVO pvo = new PhotoboardVO();
				pvo.setP_no(p_no);
				pvo.setRecommend(recommend);
				photoboardservice.updateRecommend(pvo);
				int viewcnt = photoboardservice.loadViewCount(p_no);
				int[] arr = new int[] {recommend, viewcnt};
				return arr;
			}
		}
		else if (flag.equals("view")) {
			int recommend = recommendboardservice.loadRec(b_no, p_no);
			
			
			photoboardservice.increaseViewCount(p_no);
			int viewcnt = photoboardservice.loadViewCount(p_no);
			int[] arr = new int[] {recommend, viewcnt};
			
			return arr;
		}
		else {
			ReportboardVO rvo = new ReportboardVO();
			rvo.setB_no(b_no);
			rvo.setUser_id(user_id);
			rvo.setP_no(p_no);
			rvo.setUse_flag(0);
			int check = reportboardservice.checkRep(rvo);
			
			if(check != 0) {
				return false;
			} else {
				reportboardservice.addRep(rvo);
				int rnum = reportboardservice.loadRep(b_no, p_no);
				PhotoboardVO pvo = new PhotoboardVO();
				pvo.setP_no(p_no);
				pvo.setReportcnt(rnum);
				photoboardservice.updateReport(pvo);
				
				return true;
			}
		}
		
		
	}

}