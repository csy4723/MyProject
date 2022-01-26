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
	private String content; 
	private Calendar date;
	private String userId;
	private int noteKey;//랜덤키 부여
	//private String bookTitle;
	//독서기록과 책을 연결할 키를 고안 
	//오라클이었으면 이거 외래키로 손쉽게 했을텐데 이거 아쉽네. 
	//인덱스로 하면.. 중간에 데이터가 지워질때 인덱스가 변해서 또 꼬이니까... 고민쓰
	
	public Note() {
		// TODO Auto-generated constructor stub
	}

	public Note(String title, String content, Calendar date2, String userId) {
		super();
		this.title = title;
		this.content = content;
		this.date = date2;
		this.userId = userId;
	}

	public int getBookKey() {
		return noteKey;
	}

	public void setBookKey(int bookKey) {
		this.noteKey = bookKey;
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
