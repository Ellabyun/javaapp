package afterschool;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		// ������ �Է��ϰ� �������� 0�� �Է��ϼ���
		// 10 30 -20 40 0
		// �Է��� ���� ������ 4���̸� ����� 15.0�Դϴ�.
		

//		Scanner sc = new Scanner(System.in);
//		System.out.println("������ �Է��ϰ� �������� 0�� �Է��ϼ���");
		
//		int input;
		
//		while((input = sc.nextInt())!=0) {
//			System.out.println(input+" ");

//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϰ� �������� 0�� �Է��ϼ���");
		
		int num;
		int count = 0;	
		int sum = 0;
		// ��������� int���� �Է¹ް�, num�̶�� ������ ���,
		// num�� 0�� �ƴϾ�� �Ѵ�.
		while((num = sc.nextInt())!=0) {
			count++;
			sum += num;
		}
		System.out.printf("�Է��� ���� ������ %d�̸� ����� %.1f�Դϴ�.",count,(double)sum/count);
	}

}
