package com.me.model.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Note implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3776214811505345618L;
	private String title;
	private StringBuffer content; 
	private Calendar date;
	private String userId;
	
	public Note() {
		// TODO Auto-generated constructor stub
	}

	public Note(String title, StringBuffer content, Calendar date2, String userId) {
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

	@Override
	public String toString() {
		SimpleDateFormat f = new SimpleDateFormat("yyyy년 MM월 dd일");
		String d = f.format(date.getTime());
		
		return "\n제목 : "+ title + "\n내용 : " + content + "\n작성일 : " + d + "\n작성자 : " + userId ;
	}
	
	

}
