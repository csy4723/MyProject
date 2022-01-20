package com.me.model.vo;

public class Book {
	private String bookTitle;
	private String synopsis;
	private String author;
	private String genre;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String bookTitle, String synopsis, String author, String genre) {
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

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	
	@Override
	public String toString() {
		return "책 제목 : " + bookTitle + "\n 작가 :" + author + "\n장르 : " + genre + "\n 줄거리 : " + synopsis ;
	}
	
	
	
	

}
