package com.me.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import com.me.model.vo.Note;
import com.me.view.openMenu;

public class Notecontroller {
	Scanner sc = new Scanner(System.in);
	StringBuffer sb = new StringBuffer();
	static ArrayList<Note> note = new ArrayList<>();
	Note n = new Note();

	public Notecontroller() {
		// TODO Auto-generated constructor stub
	}

	public void writeNote() {
		System.out.println("제목 : ");
		String title = sc.nextLine();
		System.out.println("내용 : \n (종료 : EXIT)");

		String str = "";
		while (true) {

			str = sc.nextLine();
			if (!str.equalsIgnoreCase("exit")) {
				sb.append(str);
				sb.append("\n");

			} else {
				System.out.println("글쓰기를 종료합니다.");
				break;
			}

		}

		String id = openMenu.ID;

		Calendar date = Calendar.getInstance();

		note.add(new Note(title, sb, date, id));// 리스트에 담아줌

		System.out.println(note.get(0).toString());

		sb.delete(0, sb.length());

	}

	public void saveNote() {

		File ex = new File("Reading Note.ser");

		if (ex.exists()) {
			ex.delete();
		}

		File f = new File("Reading Note.ser");

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f.getName()));) {

			oos.writeObject(note);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

		}

	}

	public void readNote() {

		File f = new File("Reading Note.ser");

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f.getName()))) {

			note = (ArrayList<Note>) ois.readObject();

		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void viewNote() {

		int i = 1;
		for (Note n : note) {

			System.out.println("=======" + i + "번째 작성글=======");
			System.out.println(n.toString());
			System.out.println("===========================");
			i++;

			System.out.println("다음 글을 보려면 Y를 누르세요");
			String yn = sc.nextLine();
			if (yn.equalsIgnoreCase("Y")) {
				continue;
			} else {
				return;
			}

		}

		System.out.println("다음 글이 없습니다 \n메인 메뉴로 돌아갑니다.");

	}

	public void searchNote() {
		System.out.println("검색할 글의 단어를 입력하세요.");
		String str = sc.nextLine();

	}

	public void searchNoteIndex() {

		while (true) {

			System.out.println("검색할 글의 인덱스를 입력하세요.");
			int index = sc.nextInt();
			sc.nextLine();

			index--;

			if(index > note.size()) {
				System.out.println("잘못 눌렀습니다.");
			}else {
				String result = note.get(index).toString();
				
			}

			System.out.println("1. 검색 계속 하기 \n2.해당 글 수정\n3.해당 글 삭제");
			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				break;
			case 2:
				modifyNote(index);
				return;
			case 3:
				deleteNote(index);
				return;
			case 9: 
				System.out.println("메인메뉴로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 눌렀습니다.");
				break;
			}

		}

	}

	private void deleteNote(int index) {

		note.remove(index);
		System.out.println("해당 글이 삭제되었습니다.");
		System.out.println();

	}

	private void modifyNote(int index) {

		System.out.println("수정할 데이터 \n1.제목\n2.내용");
		int num = sc.nextInt();
		sc.nextLine();

		System.out.println();
		switch (num) {
		case 1:
			System.out.print("수정할 제목 : ");
			String title = sc.nextLine();
			note.get(index).setTitle(title);
			System.out.println("\n제목이 수정되었습니다.");
			System.out.println("\n" + "=============\n" + note.get(index).toString() + "\n=============");
			System.out.println();
			break;
		case 2:
			System.out.println("수정할 내용을 입력하세요(종료 : exit)");

			while (true) {
				String content = sc.nextLine();
				if (!content.equalsIgnoreCase("exit")) {
					sb.append(content);
					sb.append("\n");

				} else {
					System.out.println("글쓰기를 종료합니다.");
					System.out.println();
					break;
				}

			}

			note.get(index).setContent(sb);
			sb.delete(0, sb.length());
			System.out.println("내용을 수정했습니다.");
			System.out.println("\n" + "=============\n" + note.get(index).toString() + "\n=============");
			System.out.println();

			break;
		default:
			System.out.println("잘못 눌렀습니다.");
			break;
		}

	}

}
