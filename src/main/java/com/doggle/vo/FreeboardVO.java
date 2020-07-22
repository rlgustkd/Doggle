package com.doggle.vo;

import java.sql.Date;

public class FreeboardVO {
	
	/*
	 B_NO NUMBER
	 P_NO NUMBER
	 USER_ID VARCHAR2(30)
	 FB_TITLE VARCHAR2(100)
	 FB_CONTENT VARCHAR2(500)
	 REGDATE DATE
	 FB_PHOTO VATCHAR2(500)
	 VIEWCNT NUMBER
	 RECOMMEND NUMBER
	 REPORTCNT NUMBER
	 USE_FLA NUMBER
	 REPLY VARCHAR2(100)
	 */
	
	private int b_no;
	private int p_no;
	private String user_id;
	private String fb_title;
	private String fb_content;
	private Date regdate;
	private String fb_photo;
	private int viewcnt;
	
	private int recommend;
	private int report;
	private int use_flag;
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
	public String getFb_content() {
		return fb_content;
	}
	public void setFb_content(String fb_content) {
		this.fb_content = fb_content;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public String getFb_photo() {
		return fb_photo;
	}
	public void setFb_photo(String fb_photo) {
		this.fb_photo = fb_photo;
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
	public int getReport() {
		return report;
	}
	public void setReport(int report) {
		this.report = report;
	}
	public int getUse_flag() {
		return use_flag;
	}
	public void setUse_flag(int use_flag) {
		this.use_flag = use_flag;
	}
	@Override
	public String toString() {
		return "FreeboardVO [b_no=" + b_no + ", p_no=" + p_no + ", user_id=" + user_id + ", fb_title=" + fb_title
				+ ", fb_content=" + fb_content + ", regdate=" + regdate + ", fb_photo=" + fb_photo + ", viewcnt="
				+ viewcnt + ", recommend=" + recommend + ", report=" + report + ", use_flag=" + use_flag + "]";
	}
	
	
	
}
