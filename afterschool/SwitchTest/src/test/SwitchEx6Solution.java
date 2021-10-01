package test;

import java.util.Scanner;

public class SwitchEx6Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int computer = (int)(Math.random()*3)+1;
		
		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요");
		int user = sc.nextInt();
		
		System.out.println("나 : "+user+", 컴퓨터 : "+computer);
		
		switch (user - computer) {
		case 1: case -2:
			System.out.println("당신이 이겼습니다.");			
			break;
		case 2: case -1:
			System.out.println("당신이 졌습니다.");
			break;
		case 0:
			System.out.println("비겼습니다.");
			break;
		}
	}

}
