package com.doggle.vo;


public class HotelVO {
	private int b_no;
	private int p_no;
	private String ht_title;
	private String ht_content;
	private String lng;
	private String lat;
	private String phone;
	private String ht_photo;
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
	public String getHt_title() {
		return ht_title;
	}
	public void setHt_title(String ht_title) {
		this.ht_title = ht_title;
	}
	public String getHt_content() {
		return ht_content;
	}
	public void setHt_content(String ht_content) {
		this.ht_content = ht_content;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getHt_photo() {
		return ht_photo;
	}
	public void setHt_photo(String ht_photo) {
		this.ht_photo = ht_photo;
	}
	public int getUse_flag() {
		return use_flag;
	}
	public void setUse_flag(int use_flag) {
		this.use_flag = use_flag;
	}
	@Override
	public String toString() {
		return "HotelVO [b_no=" + b_no + ", p_no=" + p_no + ", ht_title=" + ht_title + ", ht_content=" + ht_content
				+ ", lng=" + lng + ", lat=" + lat + ", phone=" + phone + ", ht_photo=" + ht_photo + ", use_flag="
				+ use_flag + "]";
	}
	
	
	
}