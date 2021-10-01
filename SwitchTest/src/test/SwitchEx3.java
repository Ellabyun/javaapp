package test;

import java.util.Scanner;

public class SwitchEx3 {
	public static void main(String[] args) {
		//String position = "Manager";
		
		// position 입력 받은 후 금액 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("input position : ");
		String position = sc.next();
		
		// position director 700만원, manager 500만원, 나머지 300만원
		switch (position) {
		case "Director":
			System.out.println("$7000");
			break;
		case "Manager":
			System.out.println("$5000");
			break;
		default:
			System.out.println("$3000");
			break;
		}
	}
}
