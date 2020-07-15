package com.doggle.vo;

import java.sql.Date;

public class Hotel_BoardVO {
	private int b_no;
	private int p_no;
	private String id;
	private String htb_title;
	private String htb_content;
	private Date date;
	private String htb_photo;
	private int recommend;
	private int report;
	private int use_flag;
	@Override
	public String toString() {
		return "Hotel_BoardVO [b_no=" + b_no + ", p_no=" + p_no + ", id=" + id + ", htb_title=" + htb_title
				+ ", htb_content=" + htb_content + ", date=" + date + ", htb_photo=" + htb_photo + ", recommend="
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
	public String getHtb_title() {
		return htb_title;
	}
	public void setHtb_title(String htb_title) {
		this.htb_title = htb_title;
	}
	public String getHtb_content() {
		return htb_content;
	}
	public void setHtb_content(String htb_content) {
		this.htb_content = htb_content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getHtb_photo() {
		return htb_photo;
	}
	public void setHtb_photo(String htb_photo) {
		this.htb_photo = htb_photo;
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
