package com.doggle.vo;

public class BoardnameVO {
	private int b_no;
	private String b_name;
	@Override
	public String toString() {
		return "BoardnameVO [b_no=" + b_no + ", b_name=" + b_name + "]";
	}
	public int getB_no() {
		return b_no;
	}
	public void setB_no(int b_no) {
		this.b_no = b_no;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
}
