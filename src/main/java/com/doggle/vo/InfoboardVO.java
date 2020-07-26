package com.doggle.vo;


public class InfoboardVO {
	private int b_no;
	private int p_no;
	private String user_id;
	private String info_title;
	private String regdate;
	private int viewcnt;
	private int recommend;
	private int reportcnt;
	private int use_flag;
	private String info_content;
	
	
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


	public String getInfo_title() {
		return info_title;
	}


	public void setInfo_title(String info_title) {
		this.info_title = info_title;
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


	public String getInfo_content() {
		return info_content;
	}


	public void setInfo_content(String info_content) {
		this.info_content = info_content;
	}


	
	
	@Override
	public String toString() {
		return "InfoboardVO [b_no=" + b_no + ", p_no=" + p_no + ", user_id=" + user_id + ", info_title=" + info_title
				+ ", info_content=" + info_content + ", regdate=" + regdate + ", recommend=" + recommend + ", reportcnt="
				+ reportcnt + ", use_flag=" + use_flag + "]";
	}
	
}
