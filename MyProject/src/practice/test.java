package practice;

import java.util.Scanner;

public class test {

	public void method1() {

		Scanner sc = new Scanner(System.in);

		// 1차원 배열로 중복이 제거된 25개의 값을 구해놓고 이차원 배열로 대입
		
		int[] arr = new int[25];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() *25 +1);

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--; // 중복된 값이 나오면 back!! - 했다가 다시 i+로 감
					break;
				}
			}
		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		
		
		
	int [][] newArr = new int[5][5];
		
		int index = 0; 
		
		for(int i = 0; i < newArr.length; i++) { // 행
			for(int j = 0; j < newArr[i].length; j++) { // 열
				newArr[i][j] = arr[index++]; //arr[]는 0부터 1씩 증가하면서 하나씩 넣게 됨
			}
		}
		
		for(int i = 0; i < newArr.length; i++) {
			for(int j = 0; j < newArr[i].length; j++) {
				System.out.printf("%d\t",newArr[i][j]);
			}
			System.out.println();
		}
		
		int count = 0;
		System.out.println("==========빙고게임 시작======");
		while(true) {
			
			System.out.println("정수를 입력하세요");
			int num = sc.nextInt();
			sc.nextLine();
			
			count++;
			
			
			for(int i = 0; i<5; i++) {
				for(int j = 0; j<5; j++) {
					
					if(newArr[i][j] == num) {
						
						newArr[i][j] = 0;
						
					}
					
					System.out.printf("%4d", newArr[i][j]);
				}
				System.out.println();
			}
			
			System.out.println("게임을 끝내시겠습니까? (y/n): ");
			char ch = sc.nextLine().toUpperCase().charAt(0);
			
			if(ch == 'Y') {
				break;
			}
			
		}
		
		System.out.println(count +"번 입력 하였습니다.");
		

	
		
	}

}
