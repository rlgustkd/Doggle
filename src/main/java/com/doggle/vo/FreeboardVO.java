package com.doggle.vo;

import java.sql.Date;

public class FreeboardVO {
	private int b_no;
	private int p_no;
	private String id;
	private String fb_title;
	private String fb_content;
	private Date date;
	private String fb_photo;
	private int view;
	@Override
	public String toString() {
		return "FreeboardVO [b_no=" + b_no + ", p_no=" + p_no + ", id=" + id + ", fb_title=" + fb_title
				+ ", fb_content=" + fb_content + ", date=" + date + ", fb_photo=" + fb_photo + ", view=" + view
				+ ", recommend=" + recommend + ", report=" + report + ", use_flag=" + use_flag + "]";
	}
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getFb_photo() {
		return fb_photo;
	}
	public void setFb_photo(String fb_photo) {
		this.fb_photo = fb_photo;
	}
	public int getView() {
		return view;
	}
	public void setView(int view) {
		this.view = view;
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
	private int recommend;
	private int report;
	private int use_flag;
}
