package com.doggle.vo;

import java.sql.Date;

public class PhotoboardVO {
	int b_no;
	int p_no;
	String user_id;
	String pb_title;
	String pb_content;
	Date regdate;
	String pb_photo;
	int viewcnt;
	int recommend;
	int reportcnt;
	int use_flag;
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
	public String getPb_title() {
		return pb_title;
	}
	public void setPb_title(String pb_title) {
		this.pb_title = pb_title;
	}
	public String getPb_content() {
		return pb_content;
	}
	public void setPb_content(String pb_content) {
		this.pb_content = pb_content;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public String getPb_photo() {
		return pb_photo;
	}
	public void setPb_photo(String pb_photo) {
		this.pb_photo = pb_photo;
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
	@Override
	public String toString() {
		return "PhotoboardVO [b_no=" + b_no + ", p_no=" + p_no + ", user_id=" + user_id + ", pb_title=" + pb_title
				+ ", pb_content=" + pb_content + ", regdate=" + regdate + ", pb_photo=" + pb_photo + ", viewcnt="
				+ viewcnt + ", recommend=" + recommend + ", reportcnt=" + reportcnt + ", use_flag=" + use_flag + "]";
	}
	
	
	
}
