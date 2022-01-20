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

//	private int bCnt = 0;
	StringBuffer sb = new StringBuffer();
	ArrayList<Book> book = new ArrayList<Book>();
	Scanner sc = new Scanner(System.in);

	public void saveBook() {

		File ex = new File("Book.ser");

		if (ex.exists()) {
			ex.delete();
		}

		File f = new File("Book.ser");

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f.getName()))) {

			oos.writeObject(book);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void readBook() {

		File f = new File("Book.ser");

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f.getName()))) {

			book = (ArrayList<Book>) ois.readObject();

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

	public void addBook() {

		System.out.println("제목 : ");
		String title = sc.nextLine();

		System.out.println("줄거리 : ");
		String str = "";
		while (true) {

			str = sc.nextLine();
			if (!str.equalsIgnoreCase("exit")) {
				sb.append(str);
				sb.append("\n");
			} else {
				System.out.println("줄거리를 다 썼습니다.");
				break;
			}

		}
		
		
		System.out.println("작가 : ");
		String author = sc.nextLine();
		System.out.println();
		System.out.println("==장르를 선택하세요==");
		System.out.println("1.소설 \n2.시\n3.인문\n4.장르소설 ");
		int gerne = sc.nextInt();
		sc.nextLine();
		
		
		

	}

}
