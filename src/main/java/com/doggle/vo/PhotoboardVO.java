package com.doggle.vo;

import java.sql.Date;

public class PhotoboardVO {
	private int b_no;
	private int p_no;
	private String id;
	private String pb_title;
	private String pb_content;
	private Date date;
	private String pb_photo;
	private int view;
	private int recommend;
	private int report;
	private int use_flag;
	
	
	@Override
	public String toString() {
		return "PhotoboardVO [b_no=" + b_no + ", p_no=" + p_no + ", id=" + id + ", pb_title=" + pb_title
				+ ", pb_content=" + pb_content + ", date=" + date + ", pb_photo=" + pb_photo + ", view=" + view
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getPb_photo() {
		return pb_photo;
	}
	public void setPb_photo(String pb_photo) {
		this.pb_photo = pb_photo;
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
	
}
