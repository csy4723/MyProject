package com.me.model.vo;

public class Book {
	private String bookTitle;
	private String synopsis;
	private String author;
	private int genre;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String bookTitle, String synopsis, String author, int genre) {
		super();
		this.bookTitle = bookTitle;
		this.synopsis = synopsis;
		this.author = author;
		this.genre = genre;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getGenre() {
		return genre;
	}

	public void setGenre(int genre) {
		this.genre = genre;
	}

	
	@Override
	public String toString() {
		String gen = "";
		switch(genre) {
		case 1: 
			gen = "소설";
			break;
		case 2:
			gen = "시";
			break;
		case 3:
			gen = "인문";
			break;
		case 4: 
			gen = "장르소설";
			break;
			
		}
		
		return "책 제목 : " + bookTitle + "\n 작가 :" + author + "\n장르 : " + gen + "\n 줄거리 : " + synopsis ;
	}
	
	
	
	

}
