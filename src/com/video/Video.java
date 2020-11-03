package com.video;

public class Video {
	private String ename;
	private String cname;
	private String title;
	private String link;
	
	public Video(String ename, String cname, String title, String link) {
		this.ename = ename;
		this.cname = cname;
		this.title = title;
		this.link = link;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setLink(String link) {
		this.link = link;
	}
	
	public String getEname() {
		return this.ename;
	}
	
	public String getCname() {
		return this.cname;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getLink() {
		return this.link;
	}
	
	public String toString() {
		return this.cname + " " + this.ename + " " + this.title + " " + this.link;
	}
}
