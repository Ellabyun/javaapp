package test;

import java.util.Scanner;

public class SwitchEx3 {
	public static void main(String[] args) {
		//String position = "Manager";
		
		// position �Է� ���� �� �ݾ� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("input position : ");
		String position = sc.next();
		
		// position director 700����, manager 500����, ������ 300����
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
