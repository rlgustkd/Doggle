package com.doggle.vo;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

public class HospitalVO {
	private int b_no;
	private int p_no;
	private String h_title;
	private String h_content;
	private String lng;
	private String lat;
	private Date date;
	private String h_photo;
	
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
	public String getH_title() {
		return h_title;
	}
	public void setH_title(String h_title) {
		this.h_title = h_title;
	}
	public String getH_content() {
		return h_content;
	}
	public void setH_content(String h_content) {
		this.h_content = h_content;
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
	public String getH_photo() {
		return h_photo;
	}
	public void setH_photo(String h_photo) {
		this.h_photo = h_photo;
	}
	@Override
	public String toString() {
		return "HospitalVO [b_no=" + b_no + ", p_no=" + p_no + ", h_title=" + h_title + ", h_content=" + h_content
				+ ", lng=" + lng + ", lat=" + lat + ", date=" + date + ", h_photo=" + h_photo + "]";
	}
	
}
