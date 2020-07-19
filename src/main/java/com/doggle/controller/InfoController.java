package com.doggle.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

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
import com.doggle.vo.HospitalVO;

@Controller
@RequestMapping(value = "/info/*")
public class InfoController {
	
	@Inject
	HospitalService hospitalService;

	
	private static final Logger logger = LoggerFactory.getLogger(InfoController.class);
	
	@RequestMapping(value = "/hospital", method = RequestMethod.GET)
	public String hospital(Model model) throws Exception {
		logger.info("hospital");
		
		List<HospitalVO> hospitalinfo = hospitalService.getByteImage();
		model.addAttribute("hospitalinfo", hospitalinfo);
		for (int i = 0; i < hospitalinfo.size(); i++) {
			logger.info(hospitalinfo.get(i).getH_photo());
		}
		
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
	
	//이미지 업로드
//	@RequestMapping(value="/saveImage" )
//	public String saveImage(HospitalVO hospitalvo) {
//		logger.info("saveImage");
//	    try {
//	        Map<String, Object> hmap = new HashMap<String, Object>();
//			hmap.put("h_photo", hospitalvo.getH_photo().getBytes());
//	        hospitalService.saveImage(hmap); 
//	    } catch (Exception e) {
//	        e.printStackTrace();
//	    }
//	    return "redirect:hospital";
//	}
	
	@RequestMapping(value="/getByteImage")
	public String getByteImage(Model model) throws Exception {
		
		return null;
	}
	
	
	
//	@RequestMapping(value = "/saveImage", method = RequestMethod.POST)
//    public String fileUpload(HttpServletRequest req, HttpServletResponse rep) throws Exception { 
//
//	String path = "C:/Users/gihyeon/Documents/workspace-spring-tool-suite-4-4.6.1.RELEASE/Doggle/src/main/webapp/resources/images";
//    System.out.println("path : " + path);
//    
//    Map returnObject = new HashMap(); 
//    try { 
//        // MultipartHttpServletRequest 생성 
//        MultipartHttpServletRequest mhsr = (MultipartHttpServletRequest) req; 
//        Iterator iter = mhsr.getFileNames(); 
//        MultipartFile mfile = null; 
//        String fieldName = ""; 
//        List resultList = new ArrayList(); 
//        
//        // 디레토리가 없다면 생성 
//        File dir = new File(path); 
//        if (!dir.isDirectory()) { 
//            dir.mkdirs(); 
//        } 
//        
//        // 값이 나올때까지 
//        while (iter.hasNext()) { 
//            fieldName = (String) iter.next(); // 내용을 가져와서 
//            mfile = mhsr.getFile(fieldName); 
//            String origName; 
//            origName = new String(mfile.getOriginalFilename().getBytes("8859_1"), "UTF-8"); //한글꺠짐 방지 
//            
//            System.out.println("origName: " + origName);
//            // 파일명이 없다면 
//            if ("".equals(origName)) {
//                continue; 
//            } 
//            
//            // 파일 명 변경(uuid로 암호화) 
//            String ext = origName.substring(origName.lastIndexOf('.')); // 확장자 
//            String saveFileName = getUuid() + ext;
//            
//            System.out.println("saveFileName : " + saveFileName);
//            hospitalService.saveImage(saveFileName);
//            // 설정한 path에 파일저장 
//            File serverFile = new File(path + File.separator + saveFileName);
//            mfile.transferTo(serverFile);
//            
//            Map file = new HashMap();
//            file.put("origName", origName); file.put("sfile", serverFile);
//            resultList.add(file);
//        }
//        
//        returnObject.put("files", resultList); 
//        returnObject.put("params", mhsr.getParameterMap()); 
//        } catch (UnsupportedEncodingException e) { 
//            // TODO Auto-generated catch block 
//            e.printStackTrace(); 
//        }catch (IllegalStateException e) { // TODO Auto-generated catch block 
//            e.printStackTrace();
//        } catch (IOException e) { // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//    
//        return "redirect:hospital";
//		}

	public static String getUuid() { 
	
		return UUID.randomUUID().toString().replaceAll("-", "");
		
	}

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

	
}




