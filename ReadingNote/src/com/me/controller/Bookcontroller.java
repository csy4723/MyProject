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

	String[] genre = { "소설", "시", "인문", "장르소설" };

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

		String synopsis = sb.toString();

		System.out.println("작가 : ");
		String author = sc.nextLine();
		System.out.println();
		System.out.println("==장르를 선택하세요==");
		System.out.println("1.소설 \n2.시\n3.인문\n4.장르소설 ");
		int gerne = sc.nextInt();
		sc.nextLine();

		Book b = new Book(title, synopsis, author, gerne);

		book.add(b);

		System.out.println();
		System.out.println("책이 추가되었습니다. ");

	}    

	public void randomKey() {
		

		while (true) {
 
			int rn = (int) (Math.random() * 100) + 1;

			for (Book b : book) {

				if (b.getBookKey() == rn) {
					break;// 한번이라도 같으면 다시 while문을 돌아야 되는데... 
				} 
				
			}
		}

	}

	public void delete() {
		System.out.println("삭제할 책을 검색하세요.");
		String str = sc.nextLine();

		int i = 0;
		for (Book b : book) {

			if (str.equals(b.getBookTitle())) {
				System.out.println((i + 1) + "번. " + b.toString());

			} else if (str.equals((i + 1) + "번. " + b.getSynopsis())) {
				System.out.println((i + 1) + "번. " + b.toString());
			} else if (str.equals((i + 1) + "번. " + b.getAuthor())) {
				System.out.println(b.toString());
			} else if (str.equals((i + 1) + "번. " + b.getGenre())) {
				System.out.println(b.toString());
			}
			i++;
		}

	}

	public void modifyBook() {

		System.out.println("수정할 책의 인덱스를 입력하세요");
		int bindex = sc.nextInt();
		sc.nextLine();

		System.out.println("수정할 내용을 선택해주세요.");
		System.out.println("1. 제목 : ");
		System.out.println("2. 줄거리 : ");
		System.out.println("3. 저자 :");
		System.out.println("4. 장르 :");
		System.out.println("9. 이전 메뉴로 돌아가기 ");
		int menu = sc.nextInt();
		sc.nextLine();

		System.out.println("수정할 내용을 입력하세요 : ");
		String str = sc.nextLine();

		while (true) {

			switch (menu) {
			case 1:
				book.get(bindex).setBookTitle(str);
				System.out.println(book.get(bindex).toString());
				System.out.println();
				System.out.println("책의 내용이 수정되었습니다.");
				System.out.println();
				return;
			case 2:
				book.get(bindex).setSynopsis(str);
				System.out.println(book.get(bindex).toString());
				System.out.println();
				System.out.println("책의 내용이 수정되었습니다.");
				System.out.println();

				break;
			case 3:
				book.get(bindex).setAuthor(str);
				System.out.println(book.get(bindex).toString());
				System.out.println();
				System.out.println("책의 내용이 수정되었습니다.");
				System.out.println();
				break;
			case 4:
				System.out.println("장르를 선택하세요");
				System.out.println("1. 소설 \n2.시\n3.인문\n4.장르소설");
				int i = sc.nextInt();
				sc.nextLine();

				book.get(bindex).setGenre(i);
				System.out.println();
				System.out.println(book.get(bindex).toString());
				System.out.println();
				System.out.println("책의 내용이 수정되었습니다.");
				System.out.println();
				break;
			case 9:
				System.out.println("이전 메뉴로 돌아갑니다.");
				return;
			default:
				System.out.println("메뉴를 잘못 입력했습니다.");
				break;
			}
		}

	}

	public void searchBook(int menu, String str) {

		switch (menu) {
		case 1:
			int j = 0;
			for (int i = 0; i < book.size(); i++) {

				if (book.get(i).getBookTitle().equals(str)) {
					System.out.println(book.get(i).toString());
					j++;
				}

			}
			System.out.println("총 " + j + "건의 검색결과가 있습니다.");

			break;
		case 2:
			int k = 0;
			for (int i = 0; i < book.size(); i++) {
				if (book.get(i).getAuthor().equals(str)) {
					System.out.println(book.get(i).toString());
					k++;

				}
			}
			System.out.println("총 " + k + "건의 검색결과가 있습니다.");

			break;
		case 3:
			int i = 0;
			for (String s : genre) {

				if (s.equals(str)) {
					break;
				}
				i++;
			}
			int d = 0;
			for (Book b : book) {
				if (b.getGenre() == i) {
					System.out.println(b.toString());
					d++;
				}

			}

			System.out.println("총 " + d + "건의 검색결과가 있습니다.");
			break;

		}

	}

}
