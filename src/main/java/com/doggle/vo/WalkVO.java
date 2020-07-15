package com.doggle.vo;

import java.sql.Date;

public class WalkVO {
	private int b_no;
	private int p_no;
	private String w_title;
	private String w_content;
	private String lng;
	private String lat;
	private Date date;
	private String w_photo;
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
	public String getW_title() {
		return w_title;
	}
	public void setW_title(String w_title) {
		this.w_title = w_title;
	}
	public String getW_content() {
		return w_content;
	}
	public void setW_content(String w_content) {
		this.w_content = w_content;
	}
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getW_photo() {
		return w_photo;
	}
	public void setW_photo(String w_photo) {
		this.w_photo = w_photo;
	}
	public int getUse_flag() {
		return use_flag;
	}
	public void setUse_flag(int use_flag) {
		this.use_flag = use_flag;
	}
	@Override
	public String toString() {
		return "WalkVO [b_no=" + b_no + ", p_no=" + p_no + ", w_title=" + w_title + ", w_content=" + w_content
				+ ", lng=" + lng + ", lat=" + lat + ", date=" + date + ", w_photo=" + w_photo + ", use_flag=" + use_flag
				+ "]";
	}
	
	
}
