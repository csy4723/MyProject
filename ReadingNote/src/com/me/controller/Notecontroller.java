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
		System.out.println("내용 : \n (종료 : EXIT)");
		
		String str = "";
		while (true) {

			str = sc.nextLine();
			if(!str.equalsIgnoreCase("exit")) {
				sb.append(str);
			}else {
				break;
			}
			
			
		}
	}

}
