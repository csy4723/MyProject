package com.me.model.vo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Note {
	private String title;
	private StringBuffer content; 
	private Date date;
	private String userId;
	
	public Note() {
		// TODO Auto-generated constructor stub
	}

	public Note(String title, StringBuffer content, Date date2, String userId) {
		super();
		this.title = title;
		this.content = content;
		this.date = date2;
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public StringBuffer getContent() {
		return content;
	}

	public void setContent(StringBuffer content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		SimpleDateFormat f = new SimpleDateFormat("yyyy년 MM월 dd일");
		f.format(date);
		
		return "제목 : "+ title + "\n 내용 : " + content + "\n 작성일 : " + date + " 작성자 : " + userId ;
	}
	
	

}
