package com.doggle.vo;

import java.sql.Date;

public class EateryVO {
	private int b_no;
	private int p_no;
	private String e_title;
	private String e_content;
	private String lng;
	private String lat;
	private Date date;
	private String e_photo;
	private int use_flag;
	@Override
	public String toString() {
		return "eatery [b_no=" + b_no + ", p_no=" + p_no + ", e_title=" + e_title + ", e_content=" + e_content
				+ ", lng=" + lng + ", lat=" + lat + ", date=" + date + ", e_photo=" + e_photo + ", use_flag=" + use_flag
				+ "]";
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
	public String getE_title() {
		return e_title;
	}
	public void setE_title(String e_title) {
		this.e_title = e_title;
	}
	public String getE_content() {
		return e_content;
	}
	public void setE_content(String e_content) {
		this.e_content = e_content;
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
	public String getE_photo() {
		return e_photo;
	}
	public void setE_photo(String e_photo) {
		this.e_photo = e_photo;
	}
	public int getUse_flag() {
		return use_flag;
	}
	public void setUse_flag(int use_flag) {
		this.use_flag = use_flag;
	}
}
