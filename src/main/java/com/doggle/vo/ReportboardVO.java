package com.doggle.vo;

public class ReportboardVO {
	private int b_no;
	private int p_no;
	private String user_id;
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
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public int getUse_flag() {
		return use_flag;
	}
	public void setUse_flag(int use_flag) {
		this.use_flag = use_flag;
	}
	@Override
	public String toString() {
		return "ReportboardVO [b_no=" + b_no + ", p_no=" + p_no + ", user_id=" + user_id + ", use_flag=" + use_flag
				+ "]";
	}
}