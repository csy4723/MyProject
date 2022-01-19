package com.me.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import com.me.model.vo.Note;
import com.me.view.openMenu;


public class Notecontroller {
	Scanner sc = new Scanner(System.in);
	StringBuffer sb = new StringBuffer();
	ArrayList<Note> note = new ArrayList<>();
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
				
				
			}else {
				System.out.println("글쓰기를 종료합니다.");
				break;
			}
			
			String id = openMenu.ID;
			
			System.out.println(id);
		Calendar date = Calendar.getInstance();
			
			note.add(new Note(title, sb, date, id ));// 리스트에 담아줌 
			
			System.out.println(note.get(0).toString());
			
		}
		
		
		
	}
	
	
	public void saveNote() {
		
		File ex = new File("Reading Note.txt");
		
		if(ex.exists()) {
			ex.delete();
		}
		
		File f = new File("Reading Note.txt");
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(f.getName()));
		
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	

	
	
	

}
