package test;

import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("*******************************");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("*******************************");
			System.out.println("선택>>>");
			
			// 1 선택 : 사용자한테 예금액 입력받기 => balance 추가
			// 2 선택 : 사용자한테 출금액 입력받기 => balance 차감
			// 3 선택 : balance출력
			// 4 선택 : run = false변경 후 프로그램 종료
			String selection = sc.next();
			
			switch (selection) {
			case "1":
				int saving = sc.nextInt();
				System.out.printf("입금액 : %d\n", saving);
				System.out.printf("잔액 : %d\n", balance+saving);
				break;
			case "2":
				int withdaw = sc.nextInt();
				System.out.printf("출금액 : %d\n", withdaw);
				System.out.printf("잔액 : %d\n", balance-withdaw);
				break;
			case "3":
				System.out.printf("잔액 : %d\n", balance);
				break;
			case "4":
				run = false;
				break;

			}
	

		}
	}

}
