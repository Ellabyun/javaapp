package test;

import java.util.Scanner;

public class SwitchEx6Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int computer = (int)(Math.random()*3)+1;
		
		System.out.println("����(1), ����(2), ��(3) �� �ϳ��� �Է��ϼ���");
		int user = sc.nextInt();
		
		System.out.println("�� : "+user+", ��ǻ�� : "+computer);
		
		switch (user - computer) {
		case 1: case -2:
			System.out.println("����� �̰���ϴ�.");			
			break;
		case 2: case -1:
			System.out.println("����� �����ϴ�.");
			break;
		case 0:
			System.out.println("�����ϴ�.");
			break;
		}
	}

}
