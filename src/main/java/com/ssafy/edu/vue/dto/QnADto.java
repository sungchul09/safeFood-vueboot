package com.ssafy.edu.vue.dto;

import java.io.Serializable;

public class QnADto implements Serializable {
	
    
    private int isbn;
	private String title;
	private String content;
	private String writer;
	private int views;
	private String write_date;
	public QnADto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QnADto(int isbn, String title, String content, String writer, int views, String write_date) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.content = content;
		this.writer = writer;
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
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
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
		return "QnADto [isbn=" + isbn + ", title=" + title + ", content=" + content + ", writer=" + writer + ", views="
				+ views + ", write_date=" + write_date + "]";
	}
	
	
	
}
