package com.doggle.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.doggle.service.HospitalService;
import com.doggle.service.PhotoboardService;
import com.doggle.service.Photoboard_ReplyService;
import com.doggle.vo.MemberVO;
import com.doggle.vo.PhotoboardVO;
import com.doggle.vo.Photoboard_ReplyVO;

import net.sf.json.JSONArray;

@Controller
@RequestMapping(value = "/story/*")
public class StoryController {
	
	@Inject
	PhotoboardService photoboardservice;
	@Inject
	Photoboard_ReplyService photoboardreplyservice;
	
	private static final Logger logger = LoggerFactory.getLogger(StoryController.class);
	
	@RequestMapping(value = "/story", method = RequestMethod.GET)
	public String story(HttpServletRequest req) throws Exception {
		HttpSession session = req.getSession();
		MemberVO userinfo = (MemberVO) session.getAttribute("user");
		
		logger.info("story");
		return "story/story";
	}
	
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
		
		return "story/gallery";
	}
		
	@RequestMapping(value = "/galleryUpload", method = RequestMethod.GET)
	public String galuploadget() throws Exception {
		logger.info("galleryUploadGet");
		
		return "story/gallery_upload";
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
		
		logger.info(pno + "~~" + r_content + "~~" + user_id);
		
		

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
	
}
