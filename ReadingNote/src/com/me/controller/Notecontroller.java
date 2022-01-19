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
			if(!str.equalsIgnoreCase("exit")) {
				sb.append(str);
				sb.append("\n");
				
				
			}else {
				System.out.println("글쓰기를 종료합니다.");
				break;
			}
			
		
		}
		
		
		String id = openMenu.ID;
		
		Calendar date = Calendar.getInstance();
		
		note.add(new Note(title, sb, date, id ));// 리스트에 담아줌 
		
		System.out.println(note.get(0).toString());
		
		
		
	}
	
	
	public void saveNote() {
		
		File ex = new File("Reading Note.ser");
		
		if(ex.exists()) {
			ex.delete();
		}
		
		File f = new File("Reading Note.ser");
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f.getName()));){
			
				oos.writeObject(note);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
		
		
	}
	
	
	public void readNote() {
		
		File f = new File("Reading Note.ser");
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f.getName()))){
			
			note = (ArrayList<Note>)ois.readObject();
			
			
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
		for(Note n :note) {
			
			System.out.println("======="+i+"번째 작성글=======");
			System.out.println(n.toString());
			System.out.println("===========================");
			i++;
			
			System.out.println("다음 글을 보려면 Y를 누르세요");
			String yn = sc.nextLine();
			if(yn.equalsIgnoreCase("Y")) {
				continue;
			}else {
				return;
			}
			
		}
		
		System.out.println("다음 글이 없습니다 \n메인 메뉴로 돌아갑니다.");
		
		
	}
	
	

	
	
	

}
