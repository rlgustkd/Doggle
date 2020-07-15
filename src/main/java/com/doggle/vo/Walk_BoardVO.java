package com.doggle.vo;

import java.sql.Date;

public class Walk_BoardVO {
	private int b_no;
	private int p_no;
	private String id;
	private String wb_title;
	private String wb_content;
	private Date date;
	private String wb_photo;
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getWb_title() {
		return wb_title;
	}
	public void setWb_title(String wb_title) {
		this.wb_title = wb_title;
	}
	public String getWb_content() {
		return wb_content;
	}
	public void setWb_content(String wb_content) {
		this.wb_content = wb_content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getWb_photo() {
		return wb_photo;
	}
	public void setWb_photo(String wb_photo) {
		this.wb_photo = wb_photo;
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
		return "Walk_BoardVO [b_no=" + b_no + ", p_no=" + p_no + ", id=" + id + ", wb_title=" + wb_title
				+ ", wb_content=" + wb_content + ", date=" + date + ", wb_photo=" + wb_photo + ", recommend="
				+ recommend + ", report=" + report + ", use_flag=" + use_flag + "]";
	}
	
	
}
