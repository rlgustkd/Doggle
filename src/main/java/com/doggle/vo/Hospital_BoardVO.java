package com.doggle.vo;

import java.sql.Date;

public class Hospital_BoardVO {
	private int b_no;
	private int p_no;
	private String id;
	private String hb_title;
	private String hb_content;
	private Date date;
	private String hb_photo;
	@Override
	public String toString() {
		return "Hospital_BoardVO [b_no=" + b_no + ", p_no=" + p_no + ", id=" + id + ", hb_title=" + hb_title
				+ ", hb_content=" + hb_content + ", date=" + date + ", hb_photo=" + hb_photo + ", recommend="
				+ recommend + ", report=" + report + ", use_flag=" + use_flag + "]";
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
	public String getHb_title() {
		return hb_title;
	}
	public void setHb_title(String hb_title) {
		this.hb_title = hb_title;
	}
	public String getHb_content() {
		return hb_content;
	}
	public void setHb_content(String hb_content) {
		this.hb_content = hb_content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getHb_photo() {
		return hb_photo;
	}
	public void setHb_photo(String hb_photo) {
		this.hb_photo = hb_photo;
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
