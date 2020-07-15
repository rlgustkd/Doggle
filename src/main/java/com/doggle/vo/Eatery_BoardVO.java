package com.doggle.vo;

import java.sql.Date;

public class Eatery_BoardVO {
	private int b_no;
	private int p_no;
	private String id;
	private String eb_title;
	private String eb_content;
	private Date date;
	private String eb_photo;
	private int recommend;
	private int report;
	private int use_flag;
	@Override
	public String toString() {
		return "Eatery_BoardVO [b_no=" + b_no + ", p_no=" + p_no + ", id=" + id + ", eb_title=" + eb_title
				+ ", eb_content=" + eb_content + ", date=" + date + ", eb_photo=" + eb_photo + ", recommend="
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
	public String getEb_title() {
		return eb_title;
	}
	public void setEb_title(String eb_title) {
		this.eb_title = eb_title;
	}
	public String getEb_content() {
		return eb_content;
	}
	public void setEb_content(String eb_content) {
		this.eb_content = eb_content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getEb_photo() {
		return eb_photo;
	}
	public void setEb_photo(String eb_photo) {
		this.eb_photo = eb_photo;
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
