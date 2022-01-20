package com.me.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.me.model.vo.Book;

public class Bookcontroller {
	private int bCnt = 0;
	
	ArrayList<Book> book = new ArrayList<Book>();
	Scanner sc = new Scanner(System.in);
	
	
	public void saveBook() {
		
		File ex = new File("Book.ser");
		
		if(ex.exists()) {
			ex.delete();
		}
		
		
		File f = new File("Book.ser");
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f.getName()))){
			
			oos.writeObject(book);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public void readBook() {
		
		
		File f = new File("Book.ser");
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f.getName()))){
			
			
			book = (ArrayList<Book>)ois.readObject();
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("읽은 책 파일이 존재 하지 않습니다. ");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
