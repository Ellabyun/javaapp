package test;

import java.util.Scanner;

public class Exam3Solution {

	public static void main(String[] args) {
		
		boolean run = true;
		
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("*******************************");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("*******************************");
			System.out.println("선택>>>");
			
		int menu = sc.nextInt();
		
		switch (menu) {
		case 1:
			System.out.print("예금액>>");
			balance+=sc.nextInt();
//			int money = sc.nextInt();
	//		balance = balance +=money; // balance+=money;
			
			break;
		case 2:
			System.out.print("출금액>>");
			balance-=sc.nextInt();
			break;
		case 3:
			System.out.println("잔액>>"+balance);
			break;
		case 4:
			run = false;
			break;
		default:
			System.out.println("메뉴 확인");
			break;
		}

	 }
  }
}
