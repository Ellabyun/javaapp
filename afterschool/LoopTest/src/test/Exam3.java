package test;

import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("*******************************");
			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("*******************************");
			System.out.println("����>>>");
			
			// 1 ���� : ��������� ���ݾ� �Է¹ޱ� => balance �߰�
			// 2 ���� : ��������� ��ݾ� �Է¹ޱ� => balance ����
			// 3 ���� : balance���
			// 4 ���� : run = false���� �� ���α׷� ����
			String selection = sc.next();
			
			switch (selection) {
			case "1":
				int saving = sc.nextInt();
				System.out.printf("�Աݾ� : %d\n", saving);
				System.out.printf("�ܾ� : %d\n", balance+saving);
				break;
			case "2":
				int withdaw = sc.nextInt();
				System.out.printf("��ݾ� : %d\n", withdaw);
				System.out.printf("�ܾ� : %d\n", balance-withdaw);
				break;
			case "3":
				System.out.printf("�ܾ� : %d\n", balance);
				break;
			case "4":
				run = false;
				break;

			}
	

		}
	}

}
