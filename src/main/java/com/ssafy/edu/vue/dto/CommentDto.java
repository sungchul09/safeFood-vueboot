package com.ssafy.edu.vue.dto;

import java.io.Serializable;

public class CommentDto implements Serializable{

    private int isbn;   
    private int qnaisbn;
    private String content; 
    private String write_date;
	public CommentDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CommentDto(int isbn, int qnaisbn, String content, String write_date) {
		super();
		this.isbn = isbn;
		this.qnaisbn = qnaisbn;
		this.content = content;
		this.write_date = write_date;
	}

	public int getQnaisbn() {
		return qnaisbn;
	}

	public void setQnaisbn(int qnaisbn) {
		this.qnaisbn = qnaisbn;
	}

	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWrite_date() {
		return write_date;
	}
	public void setWrite_date(String write_date) {
		this.write_date = write_date;
	}

	@Override
	public String toString() {
		return "CommentDto [isbn=" + isbn + ", qnaisbn=" + qnaisbn + ", content=" + content + ", write_date="
				+ write_date + "]";
	}
	
    
}
