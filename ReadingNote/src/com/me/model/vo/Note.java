package com.me.model.vo;

import java.util.Calendar;

public class Note {
	private String title;
	private StringBuffer content; 
	private Calendar date;
	private String userId;
	
	public Note() {
		// TODO Auto-generated constructor stub
	}

	public Note(String title, StringBuffer content, Calendar date, String userId) {
		super();
		this.title = title;
		this.content = content;
		this.date = date;
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

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	

}
