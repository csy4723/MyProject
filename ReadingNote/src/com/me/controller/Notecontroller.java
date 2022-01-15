package com.me.controller;

import java.util.Scanner;

public class Notecontroller {
	Scanner sc = new Scanner(System.in);
	StringBuffer sb = new StringBuffer();
	public Notecontroller() {
		// TODO Auto-generated constructor stub
	}
	public void writeNote() {
		System.out.println("제목 : ");
		String title = sc.nextLine();
		System.out.println("내용 : ");
		sb.append(sc.nextLine());
		
	}
	
	

}
