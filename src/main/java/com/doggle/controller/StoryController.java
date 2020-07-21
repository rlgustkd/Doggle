package com.doggle.controller;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.doggle.service.HospitalService;
import com.doggle.service.PhotoboardService;
import com.doggle.vo.PhotoboardVO;

@Controller
@RequestMapping(value = "/story/*")
public class StoryController {
	
	@Inject
	PhotoboardService photoboardservice;
	private static final Logger logger = LoggerFactory.getLogger(StoryController.class);
	
	@RequestMapping(value = "/story", method = RequestMethod.GET)
	public String story() throws Exception {
		logger.info("story");
		
		return "story/story";
	}
	
	
	@RequestMapping(value = "/gallery", method = RequestMethod.GET)
	public String galget(Model model) throws Exception {
		logger.info("gallery");
		List<PhotoboardVO> pbposts = photoboardservice.loadPosts();
		
		for(int i = 0; i < pbposts.size(); i++) {
			logger.info(pbposts.get(i).getPb_content());
		}
		model.addAttribute("pbposts", pbposts);
		
		return "story/gallery";
	}
		
	@RequestMapping(value = "/galleryUpload", method = RequestMethod.GET)
	public String galuploadget() throws Exception {
		logger.info("galleryUploadGet");
		
		return "story/gallery_upload";
	}
	
	@RequestMapping(value = "/gallery", method = RequestMethod.POST)
	public String galuploadpost(MultipartHttpServletRequest mtfRequest, HttpServletRequest req, HttpServletResponse rep) throws Exception {
		logger.info("galleryUploadPost");
		List<MultipartFile> fileList = mtfRequest.getFiles("file");
		String mylist = fileList.get(0).toString();
		String src = mtfRequest.getParameter("src");
        String path = req.getRealPath("resources/images");
        logger.info("fileList: " + mylist + " src: " + src + " path: " + path);
		return "redirect:gallery";
	}
	/*
	@RequestMapping(value = "saveImage")
    public String requestupload2(MultipartHttpServletRequest mtfRequest, HttpServletRequest req, HttpServletResponse rep) throws Exception {
        List<MultipartFile> fileList = mtfRequest.getFiles("file");
        String src = mtfRequest.getParameter("src");
        System.out.println("src value : " + src);
        String path = req.getRealPath("resources/images");

        for (MultipartFile mf : fileList) {
            String originName = mf.getOriginalFilename(); // 원본 파일 명
            logger.info(originName);
            
            
            String ext = originName.substring(originName.lastIndexOf('.')); // 확장자
            String saveFileName = getUuid() + ext;
            hospitalService.saveImage(saveFileName);
            logger.info(saveFileName);
            
            String safeFile = path + "/" + saveFileName;
            logger.info(safeFile);
            try {
                mf.transferTo(new File(safeFile));
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return "redirect:hospital";
    }
    */
}
