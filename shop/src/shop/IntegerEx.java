package shop;

import java.util.Scanner;

public class IntegerEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��� �ּ���");
		
		String input = sc.next();
		System.out.println(input+5); //+ :����
		
		// "5"=>5 "��"=> �Ұ�
		int num = Integer.parseInt(input);
		System.out.println(num+5);

	}

}