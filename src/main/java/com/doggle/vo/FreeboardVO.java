package com.doggle.vo;

import java.sql.Clob;
import java.sql.Date;

public class FreeboardVO {
	private int b_no;	//게시판번호
	private int p_no;	//글 번호
	private String user_id;	
	private String fb_title;	
	private String regdate;
	private int viewcnt;	//조회수
	private int recommend;	//추천수
	private int reportcnt;	//신고 수
	private int use_flag;	
	private String fb_content;
	

	public String getFb_content() {
		return fb_content;
	}
	public void setFb_content(String fb_content) {
		this.fb_content = fb_content;
	}
	/*
	 * private Clob fb_content;
	 * 
	 * 
	 * 
	 * public Clob getFb_content() { return fb_content; } public void
	 * setFb_content(Clob fb_content) { this.fb_content = fb_content; }
	 */
	public int getB_no() {
		return b_no;
	}
	public void setB_no(int b_no) {
		this.b_no = b_no;
	}
	public int getP_no() {
		return p_no;
	}
	public void setP_no(int p_no) {
		this.p_no = p_no;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getFb_title() {
		return fb_title;
	}
	public void setFb_title(String fb_title) {
		this.fb_title = fb_title;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public int getViewcnt() {
		return viewcnt;
	}
	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}
	public int getRecommend() {
		return recommend;
	}
	public void setRecommend(int recommend) {
		this.recommend = recommend;
	}
	public int getReportcnt() {
		return reportcnt;
	}
	public void setReportcnt(int reportcnt) {
		this.reportcnt = reportcnt;
	}
	public int getUse_flag() {
		return use_flag;
	}
	public void setUse_flag(int use_flag) {
		this.use_flag = use_flag;
	}

	
	
}