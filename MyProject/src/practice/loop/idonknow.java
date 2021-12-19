package practice.loop;

import java.util.Arrays;
import java.util.Scanner;

public class idonknow {


	public void practice1() {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = i + 1;

			System.out.print(arr[i] + " ");
		}
	}

	public void practice2() {

		int[] arr = new int[11];
		for (int i = 0; i < arr.length; i++) {

			arr[i] = arr.length - i;

			System.out.print(arr[i] + " ");
		}

	}

	public void practice3() {

		Scanner sc = new Scanner(System.in);

		System.out.println("양의 정수 : ");
		int num = sc.nextInt();

		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}

	}

	public void practice4() {

		String[] arr = { "사과", "귤", "포도", "복숭아", "참외" };

		System.out.println(arr[1]);

	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);

		System.out.println("문자열 : ");
		String str = sc.nextLine();

		System.out.println("문자 :");
		char ch = sc.nextLine().charAt(0);

		char[] arr = new char[str.length()];

		for (int i = 0; i < arr.length; i++) {// 문자열을 배열에 넣는 첫번째 for문

			arr[i] = str.charAt(i);

		}

		int i = 0;
		int count = 0;

		System.out.print(str + "에 " + i + "가 존재하는 위치(인덱스) :");

		for (; i < arr.length; i++) {// 지정된 문자의 인덱스를 추출하는 두번째 for문

			if (arr[i] == ch) {
				System.out.print(i + " ");
				++count;
			}
		}
		System.out.println();
		System.out.println("i 개수 : " + count);

	}

	public void practice6() {

		String[] arr = { "월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일" };

		Scanner sc = new Scanner(System.in);
		System.out.println("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();

		if (num < arr.length) {

			System.out.println(arr[num]);
		} else {
			System.out.println("잘못 입력하였습니다.");
		}

	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 : ");
		int num = sc.nextInt();

		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			int user = sc.nextInt();

			arr[i] = user;
		} // 입력한 숫자로 배열을 초기화하는 for문
		int j = arr[0];

		for (int i = 1; i < arr.length; i++) {

			j += arr[i];

		} // 변수에 총합을 담는 for문

		System.out.println();
		System.out.println(Arrays.toString(arr));
		System.out.println("총 합 : " + j);
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		int user;

		do {
			System.out.println("정수 : ");
			user = sc.nextInt();

			if (user < 3 || user % 2 == 0) {
				System.out.println("다시 입력하세요.");
				continue;
			} // 잘못 입력했을 때 다시 돌아가는 if문 ->조건식으로 가나..?

			int[] arr = new int[user];
			int point = user / 2 + 1;

			for (int i = 0; i < arr.length; i++) {
				
				while(i < point) {
					arr[i] = i + 1;
					i++;
					}
				
				while (i >= point && i < arr.length) {
				
					arr[i] = --point;
					i++;
					}
			}
			
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+", ");
			}
			
		} while (user < 3 || user %2 == 0);
	
	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		String[] arr = {"파닭", "뿌링클", "간장", "양념", "후라이드"};
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String menu = sc.nextLine();
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i].equals(menu)) {
				System.out.println(menu + "치킨 배달 가능");
				return;
			}
			
		}
		
		System.out.println(menu+"치킨은 없는 메뉴입니다");
		
		
		
	}

	public void practice10() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			
			arr[i] = random;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		
	}

	public void practice11() {

		int[] arr = new int [0];
		
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			
			arr[i] = random;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		
		for(int i = 1; i < arr.length; i++) {
			
			for(int j = 0; j < i; j++) {
				
				if(arr[j] > arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
			
		}
		
		
		System.out.println();
		System.out.println("최대값 : "+ arr[9]);
		System.out.println("최소값 : "+ arr[0]);
	
		
		
	}

	public void practice12() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			arr[i]= random;
			
			for(int j = 0; j < i; j++ ) {
				
//				for(;arr[j] == arr[i];) {
//					arr[i] = (int)(Math.random()*+1); // 아.. 일부러 랜덤값 또 수식 넣을 필요는 없었어..
                                                     // 근데 왜 무한루프 돌았는지는 아직도 모르겠음 				
//					}
				
				if(arr[j]== arr[i]) {
					i--;
					break;
				}
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		
	}

	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호(-포함) : ");
		String user = sc.nextLine();
		
		char arr[] = new char[14];
				
		
		for(int i = 0; i < arr.length; i++) {
			
			if(i <= 7) {
				arr[i] = user.charAt(i);
			}else {
				arr[i] = '*';
			}
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
	}

	public void practice14() {
		int arr[] = new int[6];
		
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random()*100+1);
			arr[i] = random;
			
			for(int j = 0; j < i ; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i = 1; i<arr.length; i++) {
			
			for(int j = 0; j < i; j++) {
				
				if(arr[j] > arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}



}
