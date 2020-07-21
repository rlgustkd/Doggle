package com.doggle.vo;

import java.util.Date;

public class Photoboard_ReplyVO {
	private int b_no;
	private int p_no;
	private String user_id;
	private String r_content;
	private Date regdate;
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
	public String getR_content() {
		return r_content;
	}
	public void setR_content(String r_content) {
		this.r_content = r_content;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getUse_flag() {
		return use_flag;
	}
	public void setUse_flag(int use_flag) {
		this.use_flag = use_flag;
	}
	@Override
	public String toString() {
		return "ReplyVO [b_no=" + b_no + ", p_no=" + p_no + ", user_id=" + user_id + ", r_content=" + r_content
				+ ", regdate=" + regdate + ", use_flag=" + use_flag + "]";
	}
}
