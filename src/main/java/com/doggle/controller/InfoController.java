package com.doggle.controller;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.doggle.dao.HospitalDao;
import com.doggle.service.HospitalService;
import com.doggle.service.HotelService;
import com.doggle.service.InfoboardService;
import com.doggle.service.PetshopService;
import com.doggle.service.ReplyService;
import com.doggle.service.WalkService;
import com.doggle.vo.HospitalVO;
import com.doggle.vo.HotelVO;
import com.doggle.vo.InfoboardVO;
import com.doggle.vo.MemberVO;
import com.doggle.vo.PetshopVO;
import com.doggle.vo.ReplyVO;
import com.doggle.vo.WalkVO;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
@RequestMapping(value = "/info/*")
public class InfoController {

	@Inject
	HospitalService hospitalService;
	@Inject
	HotelService hotelService;
	@Inject
	WalkService walkService;
	@Inject
	PetshopService petshopService;
	@Inject
	ReplyService replyService;
	@Inject
	InfoboardService infoboardService;

	private static final Logger logger = LoggerFactory.getLogger(InfoController.class);

	@RequestMapping(value = "/hospital", method = RequestMethod.GET)
	public String hospital(Model model,  HttpServletRequest req) throws Exception {
		logger.info("hospital");
		HttpSession session = req.getSession();
		List<HospitalVO> hospitalinfo = hospitalService.getByteImage();
		model.addAttribute("hospitalinfo", hospitalinfo);
		for (int i = 0; i < hospitalinfo.size(); i++) {
			logger.info(hospitalinfo.get(i).getH_photo());
		}
		
		//병원 게시판만 뽑아오기위한 b_no 지정.
		int b_no = 6;
		List<InfoboardVO> infoboardStory = infoboardService.list(b_no);
		logger.info("infoboardService 접근. (게시판 뽑기)");
		for (int i = 0; i < infoboardStory.size(); i++) {
			logger.info(infoboardStory.get(i).getInfo_title());
		}

		model.addAttribute("infoboardStory", infoboardStory);

		return "info/hospital";
	}

	@RequestMapping(value = "/hotel", method = RequestMethod.GET)
	public String hotel(Model model, HttpServletRequest req) throws Exception {
		logger.info("hotel");
		HttpSession session = req.getSession();
		List<HotelVO> hotelinfo = hotelService.getByteImage();
		model.addAttribute("hotelinfo", hotelinfo);
		for (int i = 0; i < hotelinfo.size(); i++) {
			logger.info(hotelinfo.get(i).getHt_photo());
		}


		int b_no = 4;
		List<InfoboardVO> infoboardStory = infoboardService.list(b_no);
		logger.info("infoboardService 접근. (게시판 뽑기)");
		for (int i = 0; i < infoboardStory.size(); i++) {
			logger.info(infoboardStory.get(i).getInfo_title());
		}

		model.addAttribute("infoboardStory", infoboardStory);

		
		return "info/hotel";
	}

	@RequestMapping(value = "/walk", method = RequestMethod.GET)
	public String walk(Model model, HttpServletRequest req) throws Exception {
		logger.info("walk");
		HttpSession session = req.getSession();
		List<WalkVO> walkinfo = walkService.getByteImage();
		model.addAttribute("walkinfo", walkinfo);
		for (int i = 0; i < walkinfo.size(); i++) {
			logger.info(walkinfo.get(i).getW_photo());
		}
		
		

		int b_no = 10;
		List<InfoboardVO> infoboardStory = infoboardService.list(b_no);
		logger.info("infoboardService 접근. (게시판 뽑기)");
		for (int i = 0; i < infoboardStory.size(); i++) {
			logger.info(infoboardStory.get(i).getInfo_title());
		}

		model.addAttribute("infoboardStory", infoboardStory);

		
		
		
		return "info/walk";
	}

	@RequestMapping(value = "/petshop", method = RequestMethod.GET)
	public String petshop(Model model, HttpServletRequest req) throws Exception {
		logger.info("petshop");
		HttpSession session = req.getSession();
		List<PetshopVO> petshopinfo = petshopService.getByteImage();
		model.addAttribute("petshopinfo", petshopinfo);
		for (int i = 0; i < petshopinfo.size(); i++) {
			logger.info(petshopinfo.get(i).getP_photo());
		}
		

		int b_no = 8;
		List<InfoboardVO> infoboardStory = infoboardService.list(b_no);
		logger.info("infoboardService 접근. (게시판 뽑기)");
		for (int i = 0; i < infoboardStory.size(); i++) {
			logger.info(infoboardStory.get(i).getInfo_title());
		}

		model.addAttribute("infoboardStory", infoboardStory);

		
		return "info/petshop";
	}

	@RequestMapping(value = "/getByteImage")
	public String getByteImage(Model model) throws Exception {

		return null;
	}

	public static String getUuid() {

		return UUID.randomUUID().toString().replaceAll("-", "");

	}

	@RequestMapping(value = "hospitalsaveImage")
	public String requestupload(MultipartHttpServletRequest mtfRequest, HttpServletRequest req, HttpServletResponse rep)
			throws Exception {
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

	@RequestMapping(value = "hotelsaveImage")
	public String requestupload2(MultipartHttpServletRequest mtfRequest, HttpServletRequest req,
			HttpServletResponse rep) throws Exception {
		List<MultipartFile> fileList = mtfRequest.getFiles("file");
		String src = mtfRequest.getParameter("src");
		System.out.println("src value : " + src);
		String path = req.getRealPath("resources/images");

		for (MultipartFile mf : fileList) {
			String originName = mf.getOriginalFilename(); // 원본 파일 명
			logger.info(originName);

			String ext = originName.substring(originName.lastIndexOf('.')); // 확장자
			String saveFileName = getUuid() + ext;
			hotelService.saveImage(saveFileName);
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

		return "redirect:hotel";
	}

	@RequestMapping(value = "walksaveImage")
	public String requestupload3(MultipartHttpServletRequest mtfRequest, HttpServletRequest req,
			HttpServletResponse rep) throws Exception {
		List<MultipartFile> fileList = mtfRequest.getFiles("file");
		String src = mtfRequest.getParameter("src");
		System.out.println("src value : " + src);
		String path = req.getRealPath("resources/images");

		for (MultipartFile mf : fileList) {
			String originName = mf.getOriginalFilename(); // 원본 파일 명
			logger.info(originName);

			String ext = originName.substring(originName.lastIndexOf('.')); // 확장자
			String saveFileName = getUuid() + ext;
			walkService.saveImage(saveFileName);
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

		return "redirect:walk";
	}

	@RequestMapping(value = "petshopsaveImage")
	public String requestupload4(MultipartHttpServletRequest mtfRequest, HttpServletRequest req,
			HttpServletResponse rep) throws Exception {
		List<MultipartFile> fileList = mtfRequest.getFiles("file");
		String src = mtfRequest.getParameter("src");
		System.out.println("src value : " + src);
		String path = req.getRealPath("resources/images");

		for (MultipartFile mf : fileList) {
			String originName = mf.getOriginalFilename(); // 원본 파일 명
			logger.info(originName);

			String ext = originName.substring(originName.lastIndexOf('.')); // 확장자
			String saveFileName = getUuid() + ext;
			petshopService.saveImage(saveFileName);
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

		return "redirect:petshop";
	}

	@RequestMapping(value = "/hospital", method = RequestMethod.POST)
	public @ResponseBody Object hospitalpost(Model model, HttpServletRequest req) throws Exception {

		logger.info("hospitalpost");
		HttpSession session = req.getSession();
		String image = req.getParameter("image");
		logger.info(image);

		int p_no = Integer.parseInt(req.getParameter("image"));
		HospitalVO hospitalVO = new HospitalVO();
		hospitalVO.setP_no(p_no);
		HospitalVO detailinfo = hospitalService.detailImage(hospitalVO);
		model.addAttribute("detailinfo", detailinfo);

		logger.info(detailinfo.getH_photo());
		logger.info(Integer.toString(detailinfo.getP_no()));
		logger.info(detailinfo.getH_title());

		JSONObject obj = new JSONObject();

		obj.put("h_photo", detailinfo.getH_photo());
		obj.put("p_no", detailinfo.getP_no());
		obj.put("h_title", detailinfo.getH_title());
		obj.put("h_content", detailinfo.getH_content());
		obj.put("phone", detailinfo.getPhone());
		obj.put("lng", detailinfo.getLng());
		obj.put("lat", detailinfo.getLat());

		return obj;
	}

	@RequestMapping(value = "/hotel", method = RequestMethod.POST)
	public @ResponseBody Object hotelpost(Model model, HttpServletRequest req) throws Exception {

		logger.info("hotelpost");
		HttpSession session = req.getSession();
		String image = req.getParameter("image");
		logger.info(image);

		int p_no = Integer.parseInt(req.getParameter("image"));
		HotelVO hotelVO = new HotelVO();
		hotelVO.setP_no(p_no);
		HotelVO detailinfo = hotelService.detailImage(hotelVO);
		model.addAttribute("detailinfo", detailinfo);

		logger.info(detailinfo.getHt_photo());
		logger.info(Integer.toString(detailinfo.getP_no()));
		logger.info(detailinfo.getHt_title());

		JSONObject obj = new JSONObject();

		obj.put("ht_photo", detailinfo.getHt_photo());
		obj.put("p_no", detailinfo.getP_no());
		obj.put("ht_title", detailinfo.getHt_title());
		obj.put("ht_content", detailinfo.getHt_content());
		obj.put("phone", detailinfo.getPhone());
		obj.put("lng", detailinfo.getLng());
		obj.put("lat", detailinfo.getLat());

		return obj;
	}

	@RequestMapping(value = "/walk", method = RequestMethod.POST)
	public @ResponseBody Object walkppost(Model model, HttpServletRequest req) throws Exception {

		logger.info("walkpost");
		HttpSession session = req.getSession();
		String image = req.getParameter("image");
		logger.info(image);

		int p_no = Integer.parseInt(req.getParameter("image"));
		WalkVO walkVO = new WalkVO();
		walkVO.setP_no(p_no);
		WalkVO detailinfo = walkService.detailImage(walkVO);
		model.addAttribute("detailinfo", detailinfo);

		logger.info(detailinfo.getW_photo());
		logger.info(Integer.toString(detailinfo.getP_no()));
		logger.info(detailinfo.getW_title());

		JSONObject obj = new JSONObject();

		obj.put("w_photo", detailinfo.getW_photo());
		obj.put("p_no", detailinfo.getP_no());
		obj.put("w_title", detailinfo.getW_title());
		obj.put("w_content", detailinfo.getW_content());
		obj.put("phone", detailinfo.getPhone());
		obj.put("lng", detailinfo.getLng());
		obj.put("lat", detailinfo.getLat());

		return obj;
	}

	@RequestMapping(value = "/petshop", method = RequestMethod.POST)
	public @ResponseBody Object petshoppost(Model model, HttpServletRequest req) throws Exception {

		logger.info("petshoppost");
		HttpSession session = req.getSession();
		String image = req.getParameter("image");
		logger.info(image);

		int p_no = Integer.parseInt(req.getParameter("image"));
		PetshopVO petshopVO = new PetshopVO();
		petshopVO.setP_no(p_no);
		PetshopVO detailinfo = petshopService.detailImage(petshopVO);
		model.addAttribute("detailinfo", detailinfo);

		logger.info(detailinfo.getP_photo());
		logger.info(Integer.toString(detailinfo.getP_no()));
		logger.info(detailinfo.getP_title());

		JSONObject obj = new JSONObject();

		obj.put("p_photo", detailinfo.getP_photo());
		obj.put("p_no", detailinfo.getP_no());
		obj.put("p_title", detailinfo.getP_title());
		obj.put("p_content", detailinfo.getP_content());
		obj.put("phone", detailinfo.getPhone());
		obj.put("lng", detailinfo.getLng());
		obj.put("lat", detailinfo.getLat());

		return obj;
	}

	// 글 조회
	@RequestMapping(value = "/detailInfoView", method = RequestMethod.GET)
	public String getRead(@RequestParam("p_no") int p_no, Model model, HttpSession session) throws Exception {
		logger.info("get read");

		InfoboardVO vo = infoboardService.read(p_no);
		model.addAttribute("read", vo);
		
		return "info/detailInfoView";
	}
	
	//글 등록
	@RequestMapping(value = "/upload", method = RequestMethod.GET)
	public String InfoUploadGet(InfoboardVO infoboardVO, Model model) throws Exception {
		int b_no = infoboardVO.getB_no();
		System.out.println(b_no);

		model.addAttribute("b_no", b_no);
		
		logger.info("/upload_get");
		return "/info/upload";
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String InfoUploadPost(InfoboardVO infoboardVO, MultipartFile file, HttpSession session) throws Exception {
		logger.info("/upload_post");
		System.out.println("아래 내용복사");
		logger.info(infoboardVO.getInfo_content());
		
		//세션에서 아이디받아옴.
		MemberVO memberVO = (MemberVO)session.getAttribute("user");
		String user_id = memberVO.getUser_id();
		
		System.out.println("로그인계정 : " + user_id);
		
		infoboardVO.setUser_id(user_id);
		infoboardService.registClobData(infoboardVO);
		
		return "redirect:/main";

	}
	
	//글 삭제 DELETE
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, produces = "application/text; charset=utf8")
    @ResponseBody
    public String postDelete(HttpServletRequest request) throws Exception {
       logger.info("post delete");
       String resultMsg = "항목이 삭제 되었습니다.";
       String pno = request.getParameter("p_no");
       String bno = request.getParameter("b_no");
       int p_no = Integer.parseInt(pno);
       int b_no = Integer.parseInt(bno);
       InfoboardVO infoboardVO = new InfoboardVO();
       infoboardVO.setB_no(b_no);
       infoboardVO.setP_no(p_no);
       
       infoboardService.delete(infoboardVO);

       return resultMsg;
    }


}
