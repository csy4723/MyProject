package com.me.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.me.model.vo.Note;

public class Notecontroller {
	Scanner sc = new Scanner(System.in);
	StringBuffer sb = new StringBuffer();
	ArrayList<StringBuffer> note = new ArrayList<StringBuffer>();
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
			
			
//			note = new Note(title, sb, null, str)
			
		}
	}

}
