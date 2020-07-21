package com.doggle.vo;

public class MemberVO {
	
	private String user_id;
	private String pwd;
	private String nickname;
	private String email;
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "MemberVO [user_id=" + user_id + ", pwd=" + pwd + ", nickname=" + nickname + ", email=" + email + "]";
	}
	
}
