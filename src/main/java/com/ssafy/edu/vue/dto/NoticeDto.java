package com.ssafy.edu.vue.dto;

import java.io.Serializable;

public class NoticeDto implements Serializable {
	
    private int isbn;
	private String title;
	private String content;
	private int views;
	private String write_date;
	public NoticeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NoticeDto(int isbn, String title, String content, int views, String write_date) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.content = content;
		this.views = views;
		this.write_date = write_date;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public String getWrite_date() {
		return write_date;
	}
	public void setWrite_date(String write_date) {
		this.write_date = write_date;
	}
	@Override
	public String toString() {
		return "NoticeDto [isbn=" + isbn + ", title=" + title + ", content=" + content + ", views=" + views
				+ ", write_date=" + write_date + "]";
	}
	
	
}
