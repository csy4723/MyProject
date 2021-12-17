package practice.loop;

import java.util.Scanner;

public class Loop {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num >= 1) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("잘못 입력하셨습니다");
		}

	}

	public void practice2() {

		Scanner sc = new Scanner(System.in);
		int num = 0;

		System.out.print("1 이상의 숫자를 입력하세요 : ");
		num = sc.nextInt();

		for (; num <= 0;) {
			System.out.println();
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
		}

		for (int i = 1; i <= num; i++) {

			System.out.print(i + " ");

		}

	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num >= 1) {
			for (; num > 0; num--) {
				System.out.print(num + " ");
			}
		} else {
			System.out.println("잘못 입력하셨습니다");
		}

	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);

		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		for (; num < 1;) {
			System.out.println();
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
		}

		for (; num > 0; num--) {
			System.out.print(num + " ");
		}

	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
			System.out.print(i + (i < num ? " + " : ""));
		}
		System.out.print(" = " + sum);

	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();

		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();

		if (num1 > 0 && num2 > 0) {
			if (num1 <= num2) {
				for (; num1 <= num2; num1++) {
					System.out.print(num1 + " ");
				}
			} else {
				for (; num1 >= num2; num2++) {
					System.out.print(num2 + " ");
				}
			}

		} else {
			System.out.println("1 이상의 숫자 만을 입력해주세요.");
		}
	}

	public void practice7() {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();

		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();

		for (; num1 < 1 || num2 < 1;) {
			System.out.println("1 이상의 숫자 만을 입력해주세요.");
			System.out.print("첫 번째 숫자 : ");
			num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			num2 = sc.nextInt();
		}

		System.out.println();

		if (num1 <= num2) {
			for (; num1 <= num2; num1++) {
				System.out.print(num1 + " ");
			}
		} else {
			for (; num1 >= num2; num2++) {
				System.out.print(num2 + " ");
			}
		}

	}

	public void practice8() {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int num = sc.nextInt();

		System.out.println("===== " + num + "단 ======");

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d + %d = %d\n", num, i, (num * i));
		}

	}

	public void practice9() {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int num = sc.nextInt();

		if ((2 <= num) && (num <= 9)) {

			for (; num < 10; num++) {
				System.out.println("===== " + num + "단 =====");
				for (int i = 1; i <= 9; i++) {
					System.out.printf("%d + %d = %d\n", num, i, (num * i));
				}
				System.out.println();

			}

		} else {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
		}

	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int num = sc.nextInt();

		for (; num < 2 || num > 9;) {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
			System.out.print("숫자 : ");
			num = sc.nextInt();
		}

		for (; num < 10; num++) {
			System.out.println("===== " + num + "단 =====");
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d + %d = %d\n", num, i, (num * i));
			}
			System.out.println();

		}

	}

	public void practice11() {
		Scanner sc = new Scanner(System.in);

		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();

		System.out.print("공차 : ");
		int num2 = sc.nextInt();

		for (int i = 1; i < 11; i++) {
			System.out.print(num1 + " ");
			num1 += num2;
		}

	}

	public void practice12() {
		Scanner sc = new Scanner(System.in);
		String cal = "";

		for (; !cal.equals("exit");) {

			System.out.print("연산자(+, -, *, /, %) : ");
			cal = sc.nextLine();

			if (!cal.equals("exit")) {

				System.out.print("정수 1 : ");
				int num1 = sc.nextInt();

				System.out.print("정수 2 : ");
				int num2 = sc.nextInt();
				sc.nextLine();

				switch (cal) {
				case "+":
					System.out.printf("%d %s %d = %d\n", num1, cal, num2, (num1 + num2));
					System.out.println();
					break;
				case "-":
					System.out.printf("%d %s %d = %d\n", num1, cal, num2, (num1 - num2));
					System.out.println();
					break;
				case "*":
					System.out.printf("%d %s %d = %d\n", num1, cal, num2, (num1 * num2));
					System.out.println();
					break;
				case "%":
					System.out.printf("%d %s %d = %d\n", num1, cal, num2, (num1 % num2));
					System.out.println();
					break;
				case "/":
					if (num2 != 0) {
						System.out.printf("%d %s %d = %d\n", num1, cal, num2, (num1 / num2));
						System.out.println();
					} else {
						System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
						System.out.println();
					}
					break;
				default:
					System.out.println("없는 연산자 입니다.");
					System.out.println();
					break;
				}

			}
		}

		System.out.println("프로그램을 종료합니다.");

	}

	public void practice015() {

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 : ");
		int num = sc.nextInt();

		if (num >= 2) {
			for (int i = 2; i < num; i++) {
				if (num % i != 0) {
					continue;
				} else {
					System.out.println("소수가 아닙니다.");
					return;
				}
			}
			System.out.println("소수입니다.");
			return;

		}
		System.out.println("잘못 입력하셨습니다.");

	}

	public void practice016() {
		Scanner sc = new Scanner(System.in);
		int num = 0;

		for (; num < 2;) {
			System.out.println("숫자 : ");
			num = sc.nextInt();

			if (num >= 2) {
				for (int i = 2; i < num; i++) {
					if (num % i != 0) {
						continue;
					} else {
						System.out.println("소수가 아닙니다.");
						return;
					}
				}
				System.out.println("소수입니다.");
				return;

			}

			System.out.println("잘못 입력하셨습니다");
			System.out.println();

		}

	}

	public void practice017() {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 : ");
		int num = sc.nextInt();

		boolean prime = true;

		int count = 0;

		if (num >= 2) {

			for (int j = 2; j <= num; j++) {

				for (int i = 2; i < j; i++) {

					if (j % i == 0) {
						prime = false;
						break;
					}
				}
				if (prime) {
					System.out.print(j + " ");
					count++;
				}
				prime = true;
			}
			System.out.println("\n2부터 " + num + "까지 소수의 개수는 " + count + "개입니다.");

		} else {

			System.out.println("잘못 입력하셨습니다");

		}

	}

	public void practice018() {
		Scanner sc = new Scanner(System.in);

		System.out.println("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();

		int count = 0;

		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				if ((i % 2 == 0) || (i % 3 == 0)) {

					System.out.print(i + " ");
					if ((i % 2 == 0) && (i % 3 == 0)) {
						count++;
					}
				}
			}

			System.out.println("\ncount : " + count);
		}

	}

	public void practice019() {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			for (int k = num; k > i; k--) {
				System.out.print(" ");

			}

			for (int j = 1; j <= i; j++) {

				System.out.print('*');
			}
			System.out.println();
		}

	}

	public void practice20() {

		Scanner sc = new Scanner(System.in);

		System.out.println("정수 입력 : ");
		int num = sc.nextInt();

		int i = 0;
		int j = 0;

		for (i = 1; i <= num; i++) {

			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

		i -= 2;
		j -= 2;

		for (; i > 0; i--) {

			for (j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void practice21() {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 1; j <= (num + (num - 1)); j++) {

				int k = num;

				if(j >= k-i && j <= k+i) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

	public void practice22() {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num; j++) {
				
				if(i ==1 || i == num) {
				System.out.print("*");
				}else if(j == 1 || j == num) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
	}

}