package com.me.view;

import java.util.Scanner;

public class openMenu {
	Scanner sc = new Scanner(System.in);

	public void mainMenu() {

		while (true) {

			System.out.println("===메뉴===");
			System.out.println();
			System.out.println("1. 독서 노트 작성하기");
			System.out.println("2. 작성글 보기");
			System.out.println("3. 작성글 검색하기");
			System.out.println("4. 책 보기");
			System.out.println("9. 프로그램 종료");
			System.out.println("메뉴 입력 :");
			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 9: 
				return;
			default:
				System.out.println("잘못 입력했습니다.");
				break;
			}
			

		}
	}

}
