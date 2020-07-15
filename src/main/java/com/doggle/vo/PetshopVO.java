package com.doggle.vo;

import java.sql.Date;

public class PetshopVO {
	private int b_no;
	private int p_no;
	private String p_title;
	private String p_content;
	private String lng;
	private String lat;
	private Date date;
	private String p_photo;
	private int use_flag;
	@Override
	public String toString() {
		return "PetshopVO [b_no=" + b_no + ", p_no=" + p_no + ", p_title=" + p_title + ", p_content=" + p_content
				+ ", lng=" + lng + ", lat=" + lat + ", date=" + date + ", p_photo=" + p_photo + ", use_flag=" + use_flag
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
	public String getP_title() {
		return p_title;
	}
	public void setP_title(String p_title) {
		this.p_title = p_title;
	}
	public String getP_content() {
		return p_content;
	}
	public void setP_content(String p_content) {
		this.p_content = p_content;
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
	public String getP_photo() {
		return p_photo;
	}
	public void setP_photo(String p_photo) {
		this.p_photo = p_photo;
	}
	public int getUse_flag() {
		return use_flag;
	}
	public void setUse_flag(int use_flag) {
		this.use_flag = use_flag;
	}
}
