package exam;

import java.util.Scanner;

public class Degrees {

	public static void main(String[] args) {
		// ȭ���µ� => �����µ�
		
		//����
		//ȭ���µ� �Է¹ޱ�(����)
		//���� ȭ���µ� =>�����µ��� ��ȯ �� ����ϱ�
		// (F-32)*5/9=C
		
		Scanner k = new Scanner(System.in);
		
		int f = k.nextInt();
		System.out.print("Fahrenheit : ");
		
		int c = (f-32)*5/9;
		System.out.printf("Celsius : %d", c );

	}

}
